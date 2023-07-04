package Domain.Common.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Domain.Common.Dao.BoardDao;
import Domain.Common.Dao.CommentDao;
import Domain.Common.Dto.BoardDto;
import Domain.Common.Dto.CommentDto;
import Domain.Common.Service.Auth.Session;

public class BoardService {

	private BoardDao Bdao;
	private CommentDao Cdao;
	
	// �̱���
	public static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}

	private MemberService memberService;

	private BoardService() {
		Bdao = BoardDao.getInstance();
		memberService = MemberService.getInstance();
	}

	// �� ��� ��ȸ�ϱ�(��ȸ��,ȸ��,������ ���)
	public List<BoardDto> getAllBoard() throws Exception {
		System.out.println("BoardService's getAllBoard()");
		return Bdao.select();
	}

	// �� �ϳ� ��ȸ
	public BoardDto getBoard(int number) throws Exception {
		System.out.println("BoardService's getBoard()");
		return Bdao.select(number);
	}

	// �� ����ϱ�(ȸ��)
	public boolean boardAdd(BoardDto dto) throws Exception {
		System.out.println("BoardService's boardAdd()");

		// ������񽺿��� role(����-ȸ�������ƴ���) ������ ������
		Map<String,Object>results =  memberService.login("id","pw");
		String role = (String)results.get("result");

		if (role.equals("ROLE_MEMBER")) {
			int result = Bdao.insert(dto, role);
			if (result > 0)
				return true;
		}

		return false;
	}

	// �� �����ϱ�
	public boolean boardUpdate(BoardDto dto, String sid,int number) throws Exception {
		System.out.println("BoardService's boardupdate()");
		
		// ������񽺿��� role(����-ȸ�������ƴ���) ������ ������
		String role = memberService.getRole(sid);
		Session session = (Session)memberService.sessionMap.get(sid);	
		
		Map<String,Object> results = memberService.login("id", "pw"); 
		
		if (session.getId().equals(dto.getId()) || role == "MASTER") {
			int result = Bdao.update(dto);
			if (result > 0)
				return true;
		}
		return false;
	}
	
	//�� �����ϱ�
							// �̰� �����Ը���� ����   0704 �ڿ��� 13:17
	public boolean boardDelete(String id) throws Exception{
		System.out.println("BoardService's boardDelete()");
		String role = memberService.getRole(id);
		Session session = (Session)memberService.sessionMap.get(id);
		Map<String, Object> results = memberService.login("id","pw");
		
		if (session.getId().equals(id) || role == "MASTER"){
			int result = Bdao.delete(id); 
			if (result > 0)
				return true;
		}
		return false;
	}
	
	//�� id�� ��ȸ
	public List<BoardDto> boardsearch_id(String id) throws Exception{
		System.out.println("BoardService's boardsearch()");
		
	}
	
	//�� title�� ��ȸ
	public boolean boardsearch_title(BoardDto dto) throws Exception{
		System.out.println("BoardService's boardsearch_title()");
		
		return false;
	}
	
	//���� �� �� ��ȸ
	public boolean boardsearch_mine(BoardDto dto) throws Exception{
		System.out.println("BoardService's boardsearch_mine()");
		
		return false;
	}
	
	//Comment Area----------------------------------------------------
	
	//��� ��ȸ
	public List<CommentDto> Commentselect(CommentDto dto) throws Exception{
		System.out.println("BoardService's Commentselect()");
		
		return Cdao.select();
	}
	
	//��� �ۼ�
	public boolean Commentadd(CommentDto dto, String role) throws Exception{
		System.out.println("BoardService's Commentadd()");
		
		return false;
	}
	
	//��� ����
	public boolean Commentupdate(CommentDto dto, String role) throws Exception{
		System.out.println("BoardService's Commentupdate()");
		
		return false;
	}
	
	//��� ����
	public boolean Commentdelete(String id, String role) throws Exception{
		System.out.println("BoardService's Commentdelete()");
		
		return false;
	}


	
	
}