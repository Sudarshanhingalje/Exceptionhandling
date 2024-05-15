import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int num1;
		int num2;
System.out.println("Hey hi everyone , this is sudarshan here!");
Scanner sc =new Scanner(System.in) ;

System.out.println("Enter the no of student :");
int no = sc.nextInt();
System.out.println("enter num 1 :");
num1=sc.nextInt();

System.out.println("Enter num 2 :");
num2=sc.nextInt();

int ans =num1+ num2;

System.out.println(ans);

System.out.println("Addtition :"+ans);

	}

}
