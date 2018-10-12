package free.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	/*include*/
	
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
	
	@RequestMapping("/Charge")
	public String charge() {
		return "ADMIN/03_CHARGE/charge";
	}
	
	@RequestMapping("/Client")
	public String client() {
		return "ADMIN/04_CLIENT/client";
	}
	
	
}
