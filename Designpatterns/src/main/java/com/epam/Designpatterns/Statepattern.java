package com.epam.Designpatterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Statepattern {

	public static void main(String[] args) {
		 AlertStateContext stateContext = new AlertStateContext(); 
	        stateContext.alert(); 
	        stateContext.alert(); 
	        stateContext.setState(new Silent()); 
	        stateContext.alert(); 
	        stateContext.alert(); 
	        stateContext.alert();   	

	}

}
interface MobileAlertState  
{ 
    public void alert(AlertStateContext ctx); 
} 
  
class AlertStateContext  
{ 
    private MobileAlertState currentState; 
  
    public AlertStateContext()  
    { 
        currentState = new Vibration(); 
    } 
  
    public void setState(MobileAlertState state)  
    { 
        currentState = state; 
    } 
  
    public void alert()  
    { 
        currentState.alert(this); 
    } 
} 

class Vibration implements MobileAlertState  
{ 
	private static final Logger LOGGER=LogManager.getLogger(Vibration.class);
    public void alert(AlertStateContext ctx)  
    { 
         LOGGER.info("vibration..."); 
    } 
  
} 
  
class Silent implements MobileAlertState 
{ 
	private static final Logger LOGGER=LogManager.getLogger(Silent.class);
    public void alert(AlertStateContext ctx)  
    { 
        LOGGER.info("silent..."); 
    } 
  
}  
