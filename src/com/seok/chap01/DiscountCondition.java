package com.seok.chap01;

import com.seok.chap02.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
