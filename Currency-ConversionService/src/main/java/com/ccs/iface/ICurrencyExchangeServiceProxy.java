package com.ccs.iface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ccs.model.CurrencyConversionBean;

//@FeignClient(name="Forex-Service", url="localhost:8000")
@FeignClient("Forex-Service")
public interface ICurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeValue12(@PathVariable String from, @PathVariable String to);

}
