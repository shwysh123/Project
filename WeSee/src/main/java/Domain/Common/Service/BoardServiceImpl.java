package Domain.Common.Service;

import Domain.Common.Dao.BoardDao;

public class BoardServiceImpl implements BoardService {

	private BoardDao dao;
	
	// 싱글톤
	public static BoardService instance;
	
	private BoardServiceImpl() {
		
	}

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardServiceImpl();
		return instance;
	}
	// 글 삭제하기

	public boolean boardDelete(String id) throws Exception {
		System.out.println("BoardService's boardDelete()");

		if (id.equals("id")) {

			boolean result = dao.boardDelete(id);
			if (result == true)
				return true;
		}
		return false;
	}
}