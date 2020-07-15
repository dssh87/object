package com.seok.chap02;

import java.time.LocalDateTime;
//��
public class Screening {
	
	private Movie movie; // ���� ��ȭ
	private int sequence; // ����
	private LocalDateTime whenScreened; // �� ���� �ð�
	
	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	// �� ���� �ð� ��ȯ
	public LocalDateTime getStartTime() {
		return whenScreened;
	}
	
	// ������ ��ġ ���� �˻�
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}
	
	// �⺻ ��� ��ȯ
	public Money getMovieFee() {
		return movie.getFee();
	}
	
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}
	
	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}

}
