package free.admin.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/")
	public String login() {
		return "LOGIN/login";
	}
	
	/*include*/
	@RequestMapping("/Freelancer")
	public String Freelancer()
	{
		
		return "CLIENT/client";
	}
	
	
	@RequestMapping("/Commoncode")
	public String commoncode() {
		
		return "ADMIN/00_COMMON/commoncode";
	}
	
	@RequestMapping("/Freeln")
	public String freeln() {
		return "ADMIN/01_FLEENL/freeln";
	}
	
	@RequestMapping("/Project")
	public String project() {
		return "ADMIN/02_PROJECT/project";
	}
	
	@RequestMapping("/Client")
	public String client() {
		return "ADMIN/04_CLIENT/client";
	}
	
}
