package com.ccs.model;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	private String from;
	  private String to;
	  private BigDecimal conversionMultiple;
	  private BigDecimal quantity;
	  private BigDecimal totalCalculatedAmount;
	  private int port;

	  public CurrencyConversionBean() {

	  }

	  public CurrencyConversionBean(String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			  BigDecimal totalCalculatedAmount, int port) {
	    super();
	    
	    this.from = from;
	    this.to = to;
	    this.conversionMultiple = conversionMultiple;
	    this.quantity = quantity;
	    this.totalCalculatedAmount = totalCalculatedAmount;
	    this.port = port;
	  }

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public int getPort() {
		return port;
	}


}
