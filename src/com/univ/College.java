package com.univ;

public class College extends University {

	@Override
	void ug() {
	 System.out.println("UG is Available");
		
	}

	@Override
	void pg() {
		System.out.println("PG is not Available");
		
	}
	
	public static void main(String[] args) {
		College cl = new College();
		cl.ug();
		cl.pg();
	}

}
