package chauncy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

	@Value("${server.port}")
	String port;

	@RequestMapping("/client")
	public String client(@RequestParam String name) {
		return "name:" + name + ",from port:" + port;
	}

}

