package com.epam.Designpatterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class Singletonsample {
	 
		
	    private static Singletonsample obj; 
	  
	    // private constructor to force use of 
	    // getInstance() to create Singleton object 
	    private Singletonsample() {} 
	    public static Singletonsample getInstance() 
	    { 
	        if (obj==null) 
	            obj = new Singletonsample(); 
	        return obj; 
	    } 
	   
	    }
 class Singleton
{private static final Logger LOGGER=LogManager.getLogger(Singleton.class);
    public static void main( String[] args )
    {
      Singletonsample s= Singletonsample.getInstance();
      Singletonsample s1= Singletonsample.getInstance();
     LOGGER.info(s1);
    LOGGER.info(s1);
    }
}


