package org.greens;



public class Info {
	
		public void CompanyName() {
			System.out.println("Company Name");	
	}
		public void CompanyId() {
			System.out.println("Company Id");
		}
			
			public void CompanyAddress() {
				System.out.println("Company Address");
			}
			
			public static void main(String [] args) {
				Info c =new Info();
				c.CompanyName();
				c.CompanyId();
				c.CompanyAddress();
			}
				
		
}
