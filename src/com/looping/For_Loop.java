package com.looping;

public class For_Loop {
	
	public static void main(String[] args) {
		
		for (int i = 5; i>=1; i--) {    //outer loop
			
			for (int j = 1; j<=i; j++) {   //inner  loop
				
				System.out.print("*");
										
		}	
			System.out.println();		
	}		
	
	for (int i = 1; i<=5; i++) {    //outer loop
		
		for (int j = 1; j<=i; j++) {   //inner  loop
			
			System.out.print("*");
									
			}	
		System.out.println();		
		}		
	
for (int i = 1; i<=5; i++) {    //outer loop
		
		for (int j = 1; j<=i; j++) {   //inner  loop
			
			System.out.print(j);
									
			}	
		System.out.println();		
		}

	}
}



