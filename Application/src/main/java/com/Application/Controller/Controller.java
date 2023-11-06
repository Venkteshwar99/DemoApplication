package com.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Application.Service.ConvertTempServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/convert")
public class Controller {
	
	
	@Autowired
	ConvertTempServiceImpl serviceImpl;

	@PostMapping("/celcius")
	public ResponseEntity<?>farenheitToCelcius(@RequestParam double farenheit) {
		try {
			double d = serviceImpl.convertFartoCelcius(farenheit);
			return (ResponseEntity<?>)ResponseEntity.ok("Celcius: "+d);
		} catch (Exception ex) {
			return  (ResponseEntity<?>) ResponseEntity.status(500);
		}
	}
	
	@PostMapping("/farenheit")
	public ResponseEntity<?> celciusTofarenheit(@RequestParam double celcius) {
		try {
			double d=	serviceImpl.convertCeltoFarenheit(celcius);
			return (ResponseEntity<?>)ResponseEntity.ok("Farenheit: "+d);
		} catch (Exception ex) {
			return  (ResponseEntity<?>) ResponseEntity.status(500);
		}
	}
}
