package com.training.exception;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			CourseDetails courseDetails=new CourseDetails()	;
			courseDetails.showCourses("java");
		}
		catch(Exception e){
			System.out.println("exception is "+e.getMessage());
		}
	}	

}
