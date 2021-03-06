package com.wonsikpf.service;

import java.util.List;

import com.wonsikpf.domain.BoardVO;
import com.wonsikpf.domain.Criteria;

public interface BoardService {

	public void register(BoardVO board);

	public BoardVO get(Long bno);

	public boolean modify(BoardVO board);

	public boolean remove(Long bno);

	public List<BoardVO> getList(Criteria cri);

	public int getTotal(Criteria cri);

}
