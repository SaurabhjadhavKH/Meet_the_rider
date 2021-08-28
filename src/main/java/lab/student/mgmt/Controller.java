package lab.student.mgmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

	@GetMapping("test")
	public String test() {
		return "Testing...";
	}
	
	@GetMapping("login")
	public String loginpage()
	{
		return "login";
	}
	
}
