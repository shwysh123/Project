package Domain.Common.Service;

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
	
	private MemberService() {

	}
	
//	ȸ�� �����ϱ�
	public boolean Join(MemberDto dto) throws Exception{
		return false;
	}
	
//	ȸ�� ��ȸ(��ü) - ȸ��
	public List<MemberDto> memberSearch(String role) throws Exception {
		return null;
	}
	
//	ȸ�� �����ϱ�
	public boolean memberDelete(String id, String role) throws Exception {
		return false;

	}
	
//	�α���
	public Map<String, Object> login(String id, String pw) throws Exception{
		return null;
	}
	
//	�α׾ƿ�
	public Boolean logout(String id, String pw) {
		return false;

	}
	

//	���� ��ȯ �Լ�(ȸ������ ����������)
	public String getRole(String sid) {
		return null;
	}
	
}