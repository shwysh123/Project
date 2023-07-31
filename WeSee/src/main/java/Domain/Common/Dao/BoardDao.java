package Domain.Common.Dao;

public interface BoardDao {

	// 내가 쓴 글 삭제
	boolean boardDelete(String id) throws Exception;

}