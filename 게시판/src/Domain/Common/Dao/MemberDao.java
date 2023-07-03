package Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Domain.Common.Dto.MemberDto;

public class MemberDao {
	private String id;
	private String pw;
	private String url;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberDao(){
		id = "root";
		pw = "1234";
		url = "jdbc:mysql://localhost:3306/�Խ���";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//	ȸ�� id/pw ����
	public int update(MemberDto dto) throws Exception{
		pstmt = conn.prepareStatement("update tbl_member set id=?,pw=?");
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getPw());
		
		return pstmt.executeUpdate();
	}
	
//	ȸ�� id/pw ����
	public int insert(MemberDto dto) throws Exception{
		pstmt = conn.prepareStatement("insert into tbl_member values(?,?)");
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getPw());
		
		return pstmt.executeUpdate();
	}
// 	ȸ�� id/pw ��ȸ
	public List<MemberDto> select() throws Exception{
		List<MemberDto> list = new ArrayList();
		MemberDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_member");
		rs = pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				dto = new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				list.add(dto);
			}
		}
		return list;
	}
//	ȸ�� id/pw ����
	public int delete(MemberDto dto) throws Exception{
		pstmt = conn.prepareStatement("delete from tbl_member where id = ?");
		pstmt.setString(1,dto.getId());
		
		return pstmt.executeUpdate();
	}
}
