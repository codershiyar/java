
import java.util.Scanner;

public class App{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
 //  String name = scan.nextLine();
//   boolean isMarried = scan.nextBoolean();
//  System.out.println("Name is : " + name);

System.out.println("ضع رقم الأول");
int number1 = scan.nextInt();
System.out.println("ضع الرقم الثاني");
int number2 = scan.nextInt();

if(number1>number2){
    System.out.println("القيمة المتغير الأول اكبر");
}else if(number1==number2){
    System.out.println("العددين متساويين");
}
else{
  System.out.println("القيمة المتغير الثاني أكبر");  
}

double double_number = scan.nextDouble();
  }
}