package CSW2022.practica4_22;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("sample")
	public String helloSpring(){
		return "Hello Spring";
	}
}
