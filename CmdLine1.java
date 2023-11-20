import java.util.Scanner;

public class CmdLine1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        // String s = sc.next();

        // System.out.println(i);
        // System.out.println(s);
        // sc.close();

        String organization = args[0];
        String name = args[1];
        int salary = Integer.parseInt(args[2]); 

        System.out.println(organization);
        
        System.out.println(name);
        
        System.out.println(salary);



    }
}