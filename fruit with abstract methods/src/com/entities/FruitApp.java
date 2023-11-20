package com.entities;



 abstract class  Fruit
{
	public abstract void taste();
	public void juice() {
		System.out.println("juice method");
	}
	
}

class Mango extends Fruit
{

	@Override
	public void taste() {
		System.out.println("inside mango  taste");
		
	}
	
}

public class FruitApp {

	public static void main(String[] args) {
		
//		Fruit f = new Fruit(); error
		Fruit m = new Mango();
		m.juice();
		m.taste();

	}

}
