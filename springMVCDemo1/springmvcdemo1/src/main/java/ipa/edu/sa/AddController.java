/**
 * 
 */
package ipa.edu.sa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PASHAM
 *
 */
@Controller
public class AddController {
	
	@RequestMapping("/add")
	public String add() {
		return "display.jsp";	
		
	}

}
