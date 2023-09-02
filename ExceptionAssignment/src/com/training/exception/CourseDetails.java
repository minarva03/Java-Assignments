package com.training.exception;

public class CourseDetails {
	
	void showCourses(String course) throws Exception{
		try {
			if(!course.equals("java")) 
				
				throw new Exception();
			}
			catch(Exception e) {
				System.out.println("exception...");
				throw e;
			}
			finally {
				System.out.println("close");
			}
		System.out.println("work done");
	}

}
