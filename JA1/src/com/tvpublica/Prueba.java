package com.tvpublica;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holaaaa");
		Caballo h = new Caballo();
		
		try {
			h.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
		}
		h.start();
		System.out.println("què");
	
		
		
	}

}
