package com.seok.chap02;

public class Reservation {
	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceConut;
	
	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceConut = audienceCount;
	}

}
