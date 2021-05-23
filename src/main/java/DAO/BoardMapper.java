package DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import VO.Board;
import VO.Comment;

public interface BoardMapper {
	public int insertBoard(Board board);
	public ArrayList<Board> selectBoardList(RowBounds rb,String search);
	public Board selectBoardDetail(String boardSeq);
	public void updateBoard(Board board);
	public int deleteBoard(String boardSeq);
	public void increaseHitCount(String boardSeq); // 조회수 (hitCount)증가
	public int totalCount(String search);
	public int insertComment(Comment comment);
	public ArrayList<Comment> selectComment(String boardSeq);
	public void deleteComment(String commentSeq);
}
