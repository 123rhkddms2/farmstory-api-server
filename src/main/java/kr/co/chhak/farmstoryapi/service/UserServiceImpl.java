package kr.co.chhak.farmstoryapi.service;

import kr.co.chhak.farmstoryapi.dto.UserDTO;
import kr.co.chhak.farmstoryapi.entity.User;
import kr.co.chhak.farmstoryapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public String register(UserDTO userDTO) {
        String encoded = passwordEncoder.encode(userDTO.getPass());
        userDTO.setPass(encoded);

        User user = modelMapper.map(userDTO, User.class);
        User savedUser = userRepository.save(user);

        return savedUser.getUid();
    }
}
