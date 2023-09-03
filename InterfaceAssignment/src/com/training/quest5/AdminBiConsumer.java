package com.training.quest5;

import java.util.function.BiConsumer;

public class AdminBiConsumer {
	public static void main(String[] args) {
		BiConsumer<String, Integer> checkAdmin = (name, age) -> {
			if ("Admin".equals(name) && age > 30) {
				System.out.println("Welcome admin");
			} else {
				System.out.println("Wrong User");
			}
		};
		
		checkAdmin.accept("Admin", 32);
		checkAdmin.accept("Admin", 25);
		checkAdmin.accept("ADmin", 50);
	}

}
