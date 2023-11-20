class Person {
  private String name;
  private int age;

  public Person() {
    this("Unknown", 0);
  }

  public Person(String name) {
    this(name, 0);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}


  
}
 
public class abc{
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
}