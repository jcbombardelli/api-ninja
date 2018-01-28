package ninja.bombardelli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

	@RequestMapping("/oi")
	@ResponseBody
	String home() {
		return "Hello World!";
	}


}
