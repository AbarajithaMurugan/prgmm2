package org.program;

public class ExceptionHandle {
	public static void main(String[] args) {
		
	
	try {
		
		throw new Exception("nothing");
	} catch (Exception e) {
       System.out.println(e.getMessage());
        e.printStackTrace();
	}
		finally {
			System.out.println("my exception");
		}
	}

	
	
}