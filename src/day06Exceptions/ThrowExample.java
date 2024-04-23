package day06Exceptions;


class WhatAreYouDoing extends RuntimeException{
	
	public WhatAreYouDoing(String str) {
		super(str);
	}
}


public class ThrowExample {

	public static void main(String[] args) {
		
		int amount = 100;
		
		if(amount >= 1000) {
			System.out.println("good to go!");
		}
		else {
			throw new WhatAreYouDoing("put some money bro!");
		}
		
		System.out.println(amount);
	}
}
