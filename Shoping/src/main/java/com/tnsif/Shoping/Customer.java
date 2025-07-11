package com.tnsif.Shoping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("cloths")
	private Ordering ordering;
	public void customerorder()
	{
		ordering.order();
	}

}
