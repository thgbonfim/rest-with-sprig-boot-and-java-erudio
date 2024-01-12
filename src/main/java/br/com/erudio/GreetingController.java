package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
		
	
	//Definindo Template	
	
	private static final String template = "hello, %s!";
    private final AtomicLong content = new AtomicLong();

	
	//Criar Metodo
	@GetMapping("/greeting")
	
	public Greeting greeting(@RequestParam(value = "name", defaultValue =  "word")
	String name) {
		return new Greeting(content.incrementAndGet(), String.format(template, name));
	}
	
}
