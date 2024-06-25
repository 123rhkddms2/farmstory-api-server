package kr.co.chhak.farmstoryapi.repository;

import kr.co.chhak.farmstoryapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


}
