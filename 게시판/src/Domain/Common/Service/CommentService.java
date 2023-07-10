package Domain.Common.Service;

import java.util.List;

import Domain.Common.Dto.CommentDto;

public interface CommentService {

	//	��� ��ȸ�ϱ� - ��ü
	List<CommentDto> Commentselecat(CommentDto dto) throws Exception;

	//	��� ����ϱ� - ȸ��
	boolean Commentadd(CommentDto dto, String role) throws Exception;

	//	��� �����ϱ�
	boolean Commentupdate(CommentDto dto, String role) throws Exception;

	//	��� �����ϱ�
	boolean Commentdelete(String id, String pw, String role) throws Exception;

}