
import java.util.Scanner;
public class index {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		double side=sc.nextDouble();
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double r= sq(side,side1);
		double r1= cube(side,side1,side2);
		 System.out.println(r);
		 System.out.println(r1);
	}
	
	static double sq(double side,double side1) {
		return side*side1;
	}
	
	static double cube(double side,double side1,double side2) {
		return side*side1*side2;
	}
}
