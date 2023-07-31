package Domain.Common.Service;

public class BoardServiceImpl implements BoardService{

	// 싱글톤
	public static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = (BoardService) new BoardServiceImpl();
		return instance;
	}
	// 글 삭제하기

	public boolean boardDelete(String id) throws Exception {
		System.out.println("BoardService's boardDelete()");

		return false;
	}
	}