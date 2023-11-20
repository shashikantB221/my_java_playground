import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Movie implements Comparable<Movie> {

	double rating;
	String name;
	int year;

	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "] ";
	}

	@Override
	public int compareTo(Movie o) {
		// comparison based on year

		return this.year - o.year;
	}

}

public class MovieTester {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie(8.9, "Shawshank Redemption", 2007));
		list.add(new Movie(9.9, "Dark knight", 2008));
		list.add(new Movie(7.9, "Intersteller ", 2011));
		list.add(new Movie(9.0, "Ms Dhoni ", 2016));

		System.out.println("Before sorting"+"\n ***************************");
		for(Movie m : list)
			System.out.println(m);
		
		Collections.sort(list); //sort() method of Collections class implements java.lang.Comparable I/F
		System.out.println("after sorting"+"\n ***************************");
		for(Movie m : list)
			System.out.println(m);
		

	}

}
