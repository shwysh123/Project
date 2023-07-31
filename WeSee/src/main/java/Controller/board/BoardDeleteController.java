package Controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Service.BoardService;
import Domain.Common.Service.BoardServiceImpl;

@SuppressWarnings("serial")

public class BoardDeleteController extends HttpServlet implements SubController {

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		
	
	try{
	String id = req.getParameter("id");	
	
	BoardService service = BoardServiceImpl.getInstance();
	boolean result = service.boardDelete(id);

	if(result==true)
	{
		req.setAttribute("msg","해당글이 삭제되었습니다.");
		req.getRequestDispatcher("/myinfo.jsp").forward(req,resp);
		}else
		{
		req.setAttribute("msg","해당글이 없습니다.");
		req.getRequestDispatcher("/myinfo.jsp").forward(req,resp);
		}
	}
		catch(Exception e) {
		e.printStackTrace();
		req.setAttribute("msg", "시도하신 요청이 실패하였습니다.");
		req.getRequestDispatcher("/myinfo.jsp").forward(req, resp);
	}
}
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("BoardDeleteController execute");

	}
}
	
