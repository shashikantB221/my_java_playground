package p1;

class Machine
{
	void start()
	{
		System.out.println("In start() of Machine class");
	}
}

class Mobile extends Machine
{
	void start()
	{
		System.out.println("In start() of Mobile class");
	}
	
	void stop()
	{
		System.out.println("In stop() of Mobile class");
	}
}

public class TesterMachine
{
	public static void main(String[] args) {
		
		Machine mc1 = new Mobile();               //up-casting --> when object of subclass refers to reference variable of superclass
		mc1.start(); //if start method were not over-ridden in mobile class then it will call method of Machine class(super class)
		
		
		
		//down-casting
		 Mobile mb1 = (Mobile)mc1;
		 mb1.start();
		 mb1.stop();   
		
		
		
		

	}
}


