package com.dsabootcamp;

import java.util.Arrays;

public class DefangingAnIpAdderess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String defang = defangIpAddress("1.1.1.1");
		
		System.out.println(defang);

	}
	
	 static String defangIpAddress(String address) {
		
		String defang = "";
 		
 		for (int i= 0; i < address.length(); i++) {
 			
 			if(address.charAt(i) == '.')
 				defang = defang + "[.]";
 			
 			else 
 				defang = defang + address.charAt(i);
 		}
 		 return defang;
 	}
	 
	

}
