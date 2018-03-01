import java.util.Scanner;

public class Player1Letter {
public static String p1letter()
{
	System.out.println("Please select from x or o");
	Scanner scan1 = new Scanner(System.in);
	String l1 = scan1.next();
	return l1;
}
}
