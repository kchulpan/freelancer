package free.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	/*include*/
	
	@RequestMapping("/Commoncode")
	public String commoncode() {
		
		return "include/commoncode";
	}
	
	@RequestMapping("/Freeln")
	public String freeln() {
		return "include/freeln";
	}
	
	@RequestMapping("/Project")
	public String project() {
		return "include/project";
	}
	
	@RequestMapping("/Charge")
	public String charge() {
		return "include/charge";
	}
	
	@RequestMapping("/Client")
	public String client() {
		return "include/client";
	}
	
	
}
