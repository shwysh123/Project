package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController implements SubController {

		public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
			//파라미터
			
			//입력값 검증
			
			//서비스 실행
			
			// view로 이동
		try {
			req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
		}
		 catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
}
