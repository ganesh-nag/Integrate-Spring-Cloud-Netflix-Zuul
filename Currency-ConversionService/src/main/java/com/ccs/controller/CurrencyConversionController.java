package com.ccs.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ccs.iface.ICurrencyExchangeServiceProxy;
import com.ccs.model.CurrencyConversionBean;


@RestController
public class CurrencyConversionController {
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ICurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConverter(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		System.out.println("In rest template client*********");
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from",from);
		uriVariables.put("to", to);
		
		
		
		ResponseEntity<CurrencyConversionBean> responseEntity = restTemplate.getForEntity(
				"http://Forex-Service/currency-exchange/from/{from}/to/{to}", 
				CurrencyConversionBean.class, 
				uriVariables);
		CurrencyConversionBean response = responseEntity.getBody();
		
		return  new CurrencyConversionBean(from, to, response.getConversionMultiple(),quantity,
				   quantity.multiply(response.getConversionMultiple()), response.getPort());		
	
		
	}
	
	@GetMapping("/currency-converterFeign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConverterFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		System.out.println("In feign client*********");
		CurrencyConversionBean response = proxy.getExchangeValue12(from, to);
		
		return  new CurrencyConversionBean(from, to, response.getConversionMultiple(),quantity,
				   quantity.multiply(response.getConversionMultiple()), response.getPort());	
		
	}

}
