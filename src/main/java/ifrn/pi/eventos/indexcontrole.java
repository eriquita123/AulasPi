package ifrn.pi.eventos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontrole {

	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
}
