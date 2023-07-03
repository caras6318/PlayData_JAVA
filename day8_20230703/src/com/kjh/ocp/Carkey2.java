package com.kjh.ocp;

public interface Carkey2 {

	public void open();
	public void lock();
	public void turnOff();
	public void turnOn();

}
 class Key implements Carkey2{
	 public Key() { }
		 
	 @Override
	 public void open(){
		System.out.println("Smart 로 열기 ")
	 }
	 @Override
	 public void lock(){
		 
	 }
	 @Override
	 public void turnOn(){
		
	 }
	 @Override 
	 public void turnOff(){
		 
	 }
 }
	 
 }
