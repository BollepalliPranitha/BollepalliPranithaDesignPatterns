package com.epam.Designpatterns;
import java.awt.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
public class Compositepattern {
public static void main(String args[]){
	Mother m1=new Mother("Radha","mother");
	Father f1=new Father("Krishna","father");
	Parents p1=new Parents();
	p1.addParent(m1);
	p1.addParent(f1);
	Mother m2=new Mother("seetha","mother");
	Father f2=new Father("Rama","father");
	Parents p2=new Parents();
	p2.addParent(m2);
	p2.addParent(f2);
	Parents p3=new Parents();
	p3.addParent(p1);
	p3.addParent(p2);
	p3.name();
}
}
interface Parent{
	void name();
}
class Mother implements Parent{
	private static final Logger LOGGER=LogManager.getLogger(Mother.class);
	String name;
	String position;
  public Mother(String name,String position){
	  this.name=name;
	  this.position=position;
  }
	public void name() {
	       LOGGER.info("name ="+name+" position ="+position);
	}}
	class Father implements Parent{
		private static final Logger LOGGER=LogManager.getLogger(Father.class);
		String name;
		String position;
	  public Father(String name,String position){
		  this.name=name;
		  this.position=position;
	  }
		public void name() {
		       LOGGER.info("name ="+name+" position ="+position);
		}
	}
	class Parents implements Parent{
         private ArrayList<Parent> l=new ArrayList<Parent>(); 
		public void name() {
			for(Parent p:l){
				p.name();
			}}
			 public void addParent(Parent p1) 
			    { 
			        l.add(p1);
			    } 
			        
			    public void removeParent(Parent p1)
			    { 
			        l.remove(p1);
			    } 
		}