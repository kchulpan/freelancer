package free.admin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import free.admin.service.ChargeListService;

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
	
	/* 담당자 조회 */
	
/*	@Autowired
	ChargeListService chargeListService;
	
	@RequestMapping("/ChargeList")
	public ModelAndView chrList(@RequestParam HashMap<String,Object> map) 
	{
		ModelAndView mav = new ModelAndView();
		chargeListService.chrList(map);
		mav.
		return "";
	}*/
}
