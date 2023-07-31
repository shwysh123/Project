package Controller.etc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.etc.Service.FileService;
import Domain.etc.Service.FileServiceImpl;

public class FileRemoveController implements SubController {
	
	FileService service = FileServiceImpl.getInstance();

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {

		try {
			
			boolean isremoved = service.removefile(req,resp);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}