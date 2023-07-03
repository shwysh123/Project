package Domain.Common.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Common.Dao.MemberDao;
import Domain.Common.Dto.MemberDto;

public class MemberService {

		public Map<String, Object> sessionMap;
		
		private MemberDao dao;
	
	private static MemberService instance;
	public static MemberService getInstance() {
		if(instance == null) instance = new MemberService();
		return instance;
	}
	
	public  MemberService() {
		dao=MemberDao.getInstance();
		sessionMap = new HashMap();
	}
	
//	ȸ�� �����ϱ�
	public boolean Join(MemberDto dto) throws Exception{
		int result = dao.insert(dto);
		if(result >0)
			return true;
		return false;
	}
	
//	ȸ�� ��ȸ(��ü) - ȸ��
	public List<MemberDto> memberSearch(String role) throws Exception {
		
		
	}
	
//	ȸ�� �����ϱ�
	public boolean memberDelete(String id, String role) throws Exception {
		
	}
	
//	�α���
	public Map<String, Object> login(String id, String pw) throws Exception{
		
	}
	
//	�α׾ƿ�
	public Boolean logout(String id, String role) {
		
	}
	

//	���� ��ȯ �Լ�
	public String getRole(String id, String pw) {

	}

}