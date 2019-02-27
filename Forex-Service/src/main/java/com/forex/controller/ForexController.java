package com.forex.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.forex.model.ExchangeValue;

@RestController
public class ForexController {
	
	private Map<String, Double> map;
	private ExchangeValue exchangeValue;
	private Double value;
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		map = Map.of("EUR" + "INR", 75.0,"USD" + "INR", 70.0,"AUD" + "INR", 25.0 );
		System.out.println(map);
		
		map.forEach((k, v) -> { 
			value = map.get(from + to);
		});
		
		exchangeValue = new ExchangeValue(from, to, value);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
	
}
