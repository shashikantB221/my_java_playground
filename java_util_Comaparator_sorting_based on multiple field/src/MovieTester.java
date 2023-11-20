import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>{
	private double rating;
	private String Name;
	private int year;
	
	public Movie(double rating,String Name,int year)
	{
		this.rating = rating;
		this.Name = Name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", Name=" + Name + ", year=" + year + "]";
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		//Comparison based on year
		
		return this.year - o.year;
	}
	
}

class RatingComparator implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() < o2.getRating())
			return -1;
		if(o1.getRating() > o2.getRating())
			return 1;
		return 0;
	}
	
}

class NameComparator implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class MovieTester {
 
	public static void main(String[] args) {
		ArrayList<Movie> m = new ArrayList<Movie>();
		m.add(new Movie(9.0, "XYZ", 2016));
		m.add(new Movie(8.2, "PQR", 2012));
		m.add(new Movie(7.1, "ABC", 2023));
		m.add(new Movie(9.2, "EFG", 2021));
		m.add(new Movie(6.4, "LMN", 2018));
		m.add(new Movie(5.3, "IJK", 2015));
		
		System.out.println("**************************");
		System.out.println("Movies");
		for(Movie mv : m)
			System.out.println(mv);
		
		System.out.println("**************************");
		Collections.sort(m);
		System.out.println("Movies sorted by Year");
		for(Movie mv : m)
			System.out.println(mv);
		
		System.out.println("**************************");
		System.out.println("Movies sorted by rating");
		RatingComparator rc = new RatingComparator();
		Collections.sort(m,rc);
		for(Movie mv : m)
			System.out.println(mv);
		
		System.out.println("**************************");
		System.out.println("Movies sorted by name");
		NameComparator nc = new NameComparator();
		Collections.sort(m,nc);
		for(Movie mv : m)
			System.out.println(mv);
		
		
		
		
	}
}
