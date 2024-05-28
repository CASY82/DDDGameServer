package com.study.futurelab.domain.common;

public interface DomainConverter<A, B> {
	B convert(A a);
}
