package program;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the year:");
	n=in.nextInt();
if((n%400==0 && n%100!=0) || (n%4==0 && n%100!=0)){
	System.out.println("it is leap year");
}
else{
	System.out.println("it is not leap year");
}
	}

}
