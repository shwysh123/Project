package Domain.Common.Dto;

public class CommentDto {
	private String id;
	private String comment;
	private String date;
	
//	����Ʈ ������
	public CommentDto() {}
	
//	��� ���ڸ� �޴� ������
	public CommentDto(String id, String comment, String date) {
		this.id = id;
		this.comment = comment;
		this.date = date;
	}
//	toString ������
	@Override
	public String toString() {
		return "CommentDto [id=" + id + ", comment=" + comment + ", date=" + date + "]";
	}
	

//	getter and setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String contents) {
		this.comment = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}