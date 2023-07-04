package Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Domain.Common.Dto.BoardDto;

public class BoardDao {
	private String id;
	private String pw;
	private String url;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//�̱��� ����
		private static BoardDao instance; 
		public static BoardDao getInstance() {
			if(instance==null)
				instance=new BoardDao();
			return instance;
		}
	
	private BoardDao() {
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
	
//		CURD
//	�� �ۼ�
	public int insert(BoardDto dto, String role) throws Exception{
		pstmt = conn.prepareStatement("insert into tbl_board values (null,?,?,?,now(),null)");
		
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getTitle());
		pstmt.setString(3, dto.getContents());
		
		return pstmt.executeUpdate();
	}
//	��ü�� ��ȸ
	public List<BoardDto> select() throws Exception{
		List<BoardDto> list = new ArrayList();
		BoardDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_contents");
		rs=pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				dto = new BoardDto();
				dto.setNumber(rs.getInt("number"));
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContents(rs.getString("contents"));
				dto.setDate(rs.getString("date"));
				dto.setHits(rs.getInt("hits"));
				list.add(dto);
			}
		}
		return list;
	}
	
	//�� �ϳ� ��ȸ(number�� ��ȸ)
	public BoardDto select(int number) {
		
		//���⿡ DB���� �ڵ带 �Է��ؾ���
		//number�� �� �ϳ��� �޾ƿ��� ��
		return null;
	}
	
//	id �� title�� �� ��ȸ
	public List<BoardDto> search_id(String id) throws Exception{
		List<BoardDto> list = new ArrayList();
		BoardDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_contents where id = ?");
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs!=null) {
			rs.next();
			dto = new BoardDto();
			dto.setNumber(rs.getInt("number"));
			dto.setId(rs.getString("id"));
			dto.setTitle(rs.getString("title"));
			dto.setDate(rs.getString("date"));
			dto.setHits(rs.getInt("hits"));
			rs.close();
		}
		pstmt.close();
		return list;
	}
	public List<BoardDto> search_title(String title) throws Exception{
		List<BoardDto> list = new ArrayList();
		BoardDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_contents where title = ?");
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs!=null) {
			rs.next();
			dto = new BoardDto();
			dto.setNumber(rs.getInt("number"));
			dto.setId(rs.getString("id"));
			dto.setTitle(rs.getString("title"));
			dto.setDate(rs.getString("date"));
			dto.setHits(rs.getInt("hits"));
			rs.close();
		}
		pstmt.close();
		return list;
	}
//	���� �� �� ��ȸ
	public List<BoardDto> select_mine(String id) throws Exception{
		List<BoardDto> list = new ArrayList();
		BoardDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_contents where id = ?");
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs!=null) {
			rs.next();
			dto = new BoardDto();
			dto.setNumber(rs.getInt("number"));
			dto.setId(rs.getString("id"));
			dto.setTitle(rs.getString("title"));
			dto.setDate(rs.getString("date"));
			dto.setHits(rs.getInt("hits"));
			rs.close();
		}
		pstmt.close();
		return list;
	}
//	���� �� �� ����
	public int update(BoardDto dto) throws Exception{
		pstmt = conn.prepareStatement("update tbl_contents set title=?,contents=?");
		pstmt.setString(3, dto.getTitle());
		pstmt.setString(4, dto.getContents());
		
		return pstmt.executeUpdate();
	}
//	���� �� �� ����
	public int delete(String id) throws Exception{  //���⵵ �̾�����
		pstmt = conn.prepareStatement("delete from tbl_board where id = ?");
		pstmt.setString(1, id);
		int result = pstmt.executeUpdate();
		pstmt.close();
		
		return result;
	}


	
	
}