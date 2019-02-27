package com.forex.model;



public class ExchangeValue {
	
	private String from;
	private String to;
	private Double conversionMultiple;
	private int port;
	
	public ExchangeValue() {}
	
	public ExchangeValue(String from, String to, Double conversionMultiple) {
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

}
