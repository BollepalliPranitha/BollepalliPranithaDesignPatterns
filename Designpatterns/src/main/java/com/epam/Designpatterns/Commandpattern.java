package com.epam.Designpatterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Commandpattern {
    public static void main(String args[]){
    	Waiter w=new Waiter();
    	Cook c=new Cook();
    	SimpleControl s=new SimpleControl();
    	s.cooking(new OrderList(w));// order is listed by the waiter
    	s.placedOrder();
    	s.cooking(new Cooking(c));//listed order is cooked by cook
    	s.placedOrder();
    }
}
interface CustomerOrder{
	void order();
}
class Waiter{
	private static final Logger LOGGER=LogManager.getLogger(Waiter.class);
	void TaketheOrder(){
		LOGGER.info("order list given by customer");//order was taken waiter...
	}
}
class OrderList implements CustomerOrder{
      Waiter orderlist;
      public OrderList(Waiter orderlist){
    	  this.orderlist=orderlist;
      }
	public void order() {
		orderlist.TaketheOrder();//order was listed
	
		}
	}
class Cook {private static final Logger LOGGER=LogManager.getLogger(Cook.class);
	void order(){
		LOGGER.info("cooking...");
	}
}
class Cooking implements CustomerOrder{
      Cook cook;
      public Cooking(Cook c){
    	  cook=c;
      }
	public void order() {
		cook.order();
		
	}
	
}
class SimpleControl{
	CustomerOrder c;
	public void cooking(CustomerOrder c){
	this.c=c;	
	}
	public void placedOrder(){
		c.order();
	}
}


