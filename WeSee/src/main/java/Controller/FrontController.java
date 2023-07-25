package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;

public class FrontController extends HttpServlet {

	private Map<String, SubController> map = new HashMap();
}
