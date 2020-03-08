package com.epam.Designpatterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
	public class MethodChainingDemo { 
		private static final Logger LOGGER=LogManager.getLogger(AudioPlayer.class);

	    public static void main(String args[]) 
	    { 
	        Student student1 = new Student(1); 
	        Student student2 = new Student(2); 
	       
	  	  
	        student1.setName("Ram");
	        student2.setName("Shyam").setAddress("Delhi"); 
	       
	       LOGGER.info(student1); 
	     LOGGER.info(student2); 
	    } 
	} 
	final class Student {
	    private int id; //required
	    private String name; //optional
	    private String address; //optional
	    public Student (int id) 
	    { 
	        this.id = id; 
	        
	    } 
	  
	    public Student setName(String name) 
	    { 
	        this.name = name; 
	        return this; 
	    } 
	  
	    public Student setAddress(String address) 
	    { 
	        this.address = address; 
	        return this; 
	    } 
	  
	    @Override
	    public String toString() 
	    { 
	        return "id = " + this.id + ", name = " + this.name +  
	                               ", address = " + this.address; 
	    } 
	} 

