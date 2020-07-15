package com.seok.chap02;

import com.seok.chap01.DiscountCondition;

public class SequenceCondition implements DiscountCondition {

	private int sequence;
	
	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}
	@Override
	public boolean isSatisfiedBy(Screening screening) {	
		return screening.isSequence(sequence);
	}

}
