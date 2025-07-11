package com.tnsif.Shoping;

import org.springframework.stereotype.Component;

@Component
public class Cloths implements Ordering {
	public void order()
	{
		System.out.println("I am ordering clothes..");
	}

}
