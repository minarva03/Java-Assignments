package com.training.collection;
import java.util.*;

public class MapDemo {

	public MapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String,List<String>> list=new HashMap<>();
		
		List<String> karnataka = Arrays.asList(
                new String("bijaypura"),
                new String("banglore"),
                new String("hassan"),
                new String(",amagaluru"),
                new String("udupi"),
                new String("tumakuru"));
		     list.put("Karnataka:", karnataka);
		
		List<String> maharashtra = Arrays.asList(
                new String("kolhaapur"),
                new String("nagpur"),
                new String("pune"),
                new String("aurangabad"),
                new String("mumbai"),
                new String("nasik"));
		list.put("Maharastra:", maharashtra);
		
		List<String> odisha = Arrays.asList(
                new String("bbsr"),
                new String("baleswar"),
                new String("burla"),
                new String("berhmapur"),
                new String("udupi"),
                new String("bhadrak"));
		     list.put("odisha:", odisha);

		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
		    String key = entry.getKey();
		    List<String> value = entry.getValue();
		    System.out.println(key + value);
		}
	}

}
