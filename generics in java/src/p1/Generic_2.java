package p1;


class Sum<T extends Number,U>
{
	T t;
	U u;
	public Sum(T t, U u)
	{
		this.t = t;
		this.u = u;
	}
	
	
}
public class Generic_2 {

	public static void main(String[] args) {
		
		Sum<Integer,Integer> sum = new Sum<Integer,Integer> (10, 20);
		 Integer I =  sum.t + sum.u ;
		 System.out.println("I = "+I);
		 
		 

			Sum<Integer,Double> sum2 = new Sum<Integer,Double> (10, 20.20);
			 Double I2 =  sum2.t + sum2.u ;
			 System.out.println("I2 = "+I2);

	}

}
