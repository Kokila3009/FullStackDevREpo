package com.gentech.demo1;

class Country{
	
	    String Country_name;
	    String capital;
	    long population;
	    String area;
	    String currency;	    
}

class State{
	String State_name;
    long population;
    String area;
    String Country_Name;
	public long Population;
     
	
	
}
class District{
	String District_name;
    long population;
    String area;
    String State_Name;
	
   
}

class Village{
	String Village_name;
    long population;
    String area;
    String District_Name;

}

public class Assignment3 {

	public static void main(String[] args) {
		
		 Country c1 = new Country();
		    c1.Country_name="India";
		    c1. capital="New Delhi";
		    c1. population=(long) 141.72 ;
		    c1. area ="3.287 million km²";
		    c1. currency="Rupees";	  
				 
		State s1=new State();
		s1. State_name="Karnataka";
	    s1.Population=(long)6.446 ;
	    s1.area ="191,791 km²";
	    s1.Country_Name="India";
		
	    District d1=new District();
		d1.District_name="Mandya";
	    d1.population=(long)3.5 ;
	    d1.area ="20.4 km²";
	    d1.State_Name="Karnataka";
	      
	    Village v1=new Village();
		v1.Village_name="Kestur";
	    v1.population=3000 ;
	    v1.area ="3.5 km²";
	    v1.District_Name="Mandya";
	
		System.out.println("***Country Details***");
		System.out.println( c1.Country_name + " "+
	    c1. capital + " "+
	    c1. population + " "+
	    c1. area + " "+
	    c1. currency	  
		);
		System.out.println("***State Details***");
		System.out.println(s1. State_name +" "+ 
	    s1.Population +" "+ 
	    s1.area +" "+ 
	    s1.Country_Name );
		System.out.println("***District Details***");
		System.out.println(d1.District_name + " "+
	    d1.population + " "+
	    d1.area + " "+
	    d1.State_Name
	);
		System.out.println("****Vilage Details****");
		System.out.println(v1.Village_name + " "+
	    v1.population + " "+
	    v1.area + " "+
	    v1.District_Name
	);
		
		
	}

}