package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentaireController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/commentaire")
	public Commentaire Commentaire(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Commentaire(1,counter.incrementAndGet(),"pseudo1", String.format(template, name));
	}
}