package free.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController
{
	
	//--LogIn Part--����
	
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
	
	//--LogIn Part--��

	//--SubPage--����
	@RequestMapping("/SubPage")
	public String subPage() {
		return "ADMIN/00_COMMON/sub_page";
	}
	
	//--SubPage--��
	
	//--��й�ȣ ã��--����
	
	
	
	//--��й�ȣ ã��--��
	
	
	
}