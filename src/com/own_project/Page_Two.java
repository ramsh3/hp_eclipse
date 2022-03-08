package com.own_project;

import java.util.Scanner;

public class Page_Two extends Page_One{
	
	public static void main(String[] args) {
		
		Page_Two own = new Page_Two();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the client id : ");
		
		String Id=s.next();
				
		System.out.println("enter the password : ");
		
		String pwd=s.next();
				
		if (own.getclient_ID().equals(Id) && own.getpassword().equals(pwd) || own.getclient_ID1().equals(Id) && own.getpassword1().equals(pwd) ) {
			
		System.out.println("Login Successfully");
		
		System.out.println("Enter the stock name : ");
		
		own.setStock_Name(s.next());
				
		System.out.println("enter the buy price : ");
		
		own.setbuy_Price(s.nextInt());
				
		System.out.println("enter the sell price : ");
		
		own.setsell_Price(s.nextInt());
		
		System.out.println();
		System.out.println("******   "+own.getStock_Name().toUpperCase()+" Tradebook  *******");		
		System.out.println("Best buying price is "+own.getbuy_Price());		
		System.out.println("Best selling price : "+own.getsell_Price());
		
	}
		else {
			System.out.println("Incorrect Client ID & Password");
		}
	
	}

}
