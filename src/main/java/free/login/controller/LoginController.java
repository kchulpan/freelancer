package free.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController
{
	
	//--LogIn Part--시작
	
	@RequestMapping("/")
	public String logIn()
	{
		return "./LOGIN/login";
	}
	
	@RequestMapping("/Forgot-Password")
	public String pwFind()
	{
		return "./LOGIN/forgot-password";
	}

	@RequestMapping("/Register")
	public String register()
	{
		return "./LOGIN/register";
	}
	
	//--LogIn Part--끝

	//--SubPage--시작
	@RequestMapping("/SubPage")
	public String subPage() {
		return "ADMIN/00_COMMON/sub_page";
	}
	
	//--SubPage--끝
	
	//--비밀번호 찾기--시작
	
	
	
	//--비밀번호 찾기--끝
	
	
	
}