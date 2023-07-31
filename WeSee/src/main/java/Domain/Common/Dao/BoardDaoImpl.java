package Domain.Common.Dao;

public class BoardDaoImpl extends ConnectionPool implements BoardDao {

	// 싱글톤 패턴
	private static BoardDao instance;

	public static BoardDao getInstance() {
		if (instance == null)
			instance = new BoardDaoImpl();
		return instance;
	}

	private BoardDaoImpl() {

	}

//	내가 쓴 글 삭제
	@Override
	public int delete(String id) throws Exception {
		pstmt = conn.prepareStatement("delete from tbl_board where id = ?");
		pstmt.setString(1, id);
		int result = pstmt.executeUpdate();
		pstmt.close();

		return result;
	}

}