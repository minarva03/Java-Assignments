package com.training.quest4;

import java.util.function.Supplier;

public class UppercaseSupplier {

	public static void main(String[] args) {
		Supplier<String> upName=()-> {
			String name = "Minarva";
            return name.toUpperCase();
		};
		
		System.out.println("My name in upper case: " + upName.get());
	}

}
