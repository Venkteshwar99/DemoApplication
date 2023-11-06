package com.Application.Service;
import org.springframework.stereotype.Service;

@Service
public class ConvertTempServiceImpl implements ConvertTempService {

	@Override
	public double convertFartoCelcius(double farenheit) {
		double celcius = (farenheit - 32) * 5 / 9;
		System.out.println("celcius: "+celcius);
	    return celcius;
	}
	
	
	@Override
	public double convertCeltoFarenheit(double celcius) {
		double farenheit = (celcius * 9 / 5) + 32;
		System.out.println("farenheit: "+farenheit);
		return farenheit;
	}
}
