package Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface SubController {


	void execute(HttpServletRequest req,HttpServletResponse resp);

}