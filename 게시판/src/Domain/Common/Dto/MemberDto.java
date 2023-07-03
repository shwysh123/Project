package Domain.Common.Dto;

public class MemberDto {
	private String id;
	private String pw;
	
//	�⺻ ������
	public MemberDto() {}
	
//	��� ���ڸ� �޴� ������
	public MemberDto(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

//	toString ������
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pw=" + pw + "]";
	}

//	getter and setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}