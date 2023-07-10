package Domain.Common.Service;

import java.util.List;

import Domain.Common.Dao.CommentDao;
import Domain.Common.Dao.CommentDaoImpl;
import Domain.Common.Dto.CommentDto;

public class CommentServiceImpl implements CommentService {

	private CommentDao dao;
	
	private static CommentService instance;
	public static CommentService getInstance() {
		if(instance == null) instance = new CommentServiceImpl();
		return instance;
	}
	private MemberService memberService;
	
	
	private CommentServiceImpl() {
		dao = CommentDaoImpl.getInstance();
		memberService = MemberServiceImpl.getInstance();
	}
//	��� ��ȸ�ϱ� - ��ü
	@Override
	public List<CommentDto> Commentselecat(CommentDto dto) throws Exception{
		return null;
	}
	
//	��� ����ϱ� - ȸ��
	@Override
	public boolean Commentadd(CommentDto dto, String role) throws Exception{
		return false;

	}
	
//	��� �����ϱ�
	@Override
	public boolean Commentupdate(CommentDto dto, String role) throws Exception{
		return false;

	}
	
//	��� �����ϱ�
	@Override
	public boolean Commentdelete(String id, String pw, String role) throws Exception{
		return false;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}