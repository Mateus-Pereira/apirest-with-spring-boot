package br.com.apirest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class OlaMundoController {
	
	private static final String template ="Hello, %s!";
	private static AtomicLong counter = new AtomicLong();
	
	
	@GetMapping("/OlaMundo")
	public OlaMundo olamundo(@RequestParam(value = "name", defaultValue= "Word") 
	String name) {
		return new OlaMundo(counter.incrementAndGet(), String.format(template, name));
	}



}
