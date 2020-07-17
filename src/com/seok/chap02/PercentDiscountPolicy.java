package com.seok.chap02;

import com.seok.chap01.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy{

	private double percent;
	
	public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
		super(conditions);
		this.percent = percent;
	}
	
	@Override
	protected Money getDiscountAmount(Screening screening) {

		return screening.getMovieFee().times(percent);
	}

}
