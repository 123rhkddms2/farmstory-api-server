package kr.co.chhak.farmstoryapi.service;

import kr.co.chhak.farmstoryapi.dto.ArticleDTO;
import kr.co.chhak.farmstoryapi.dto.PageRequestDTO;
import kr.co.chhak.farmstoryapi.dto.PageResponseDTO;

import java.util.List;

public interface ArticleService {

    public int register(ArticleDTO articleDTO);

    public PageResponseDTO<ArticleDTO> list(PageRequestDTO pageRequestDTO);
    public ArticleDTO get(int no);
    public void modify(ArticleDTO articleDTO);
    public void remove(int no);

}
