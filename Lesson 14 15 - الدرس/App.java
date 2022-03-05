import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // System.out.println("Enter your age: ");
      // int age = scanner.nextInt();
      // if(age>=18){
      //    System.out.println("You can access this page");
      // }else if(age<=0){
      //    System.out.println("Invalid value");
      // }
      // else{
      //    System.out.println("Access denied");
      // }
      // System.out.println("Enter your email: ");
      // String email = scanner.nextLine();

      // System.out.println("Enter your password: ");
      // String password = scanner.nextLine();
      
      // if(email.equals("admin@gmail.com") && password.equals("1212")){
      //    System.out.println("You logged in");
      // }else{
      //    System.out.println("Login failed, try again");
      // }
      System.out.println("Enter 1 for Arabic or 2 for English: ");
      int option = scanner.nextInt();
      if(option == 1){
         System.out.println("Selected Language is Arabic");
      }else if(option == 2){
         System.out.println("Selected Language is English");
      }else{
         System.out.println("Invalid option");
      }
   } 
}
// Java Comparison Operators - العمليات المقارنة في جافا
// ------------------------------------------------------------------------------------------------------------
// Comparison operators are used to compare two values:    يتم استخدام رموز عمليات مقارنة لمقارنة بين عددين
// ------------------------------------------------------------------------------------------------------------
// Operator - رمز	      Name - اسم      
// ------------------------------------------------------------------------------------------------------------
// ==	                  Equal to	                                   يساوي 
// !=	                  Not equal	                          ليس متساوي
// >	                  Greater than                              اكبر من
// <	                  Less than	                              اصغر من
// >=	                  Greater than or equal to         أكبر من أو يساوي
// <=	                  Less than or equal to           أصغر من أو يساوي
// Java Logical Operators 
// ---------------------------------------------------------------------------------------------------------------
//Operator(الرمز) Name(الاسم)	 Description	(الوصف)
// ---------------------------------------------------------------------------------------------------------------
// && 	          and و       Returns true if both statements are true  يعود صحيح إذا كانت كلتا العبارتين صحيحين 
// || 	          or	او     Returns true if one of the statements is trueيعود صحيحًا إذا كان أحد العبارات صحيحًا
// !	             not لا       Reverse the result, returns false if the result is true
//                                                               اعكس النتيجة ، وإرجاع خطأ إذا كانت النتيجة صحيحة

// Java Conditions and If else Statements - شرح كيفية تنفيذ اوامر حسب شرط الذي تحدده
// ----------------------------------------------------------------------------------------------
// Use if to specify a block of code to be executed, if a specified condition is true
//                              استخدمه في حال اذا كنت ترغب بتنفيذ اوامر حسب الشرط الذي تحدده
// ----------------------------------------------------------------------------------------------
// Use else to specify a block of code to be executed, if the same condition is false
//                 استخدمه في حال اذا كنت ترغب بتنفيذ اوامر في حال الشرط الذي وضعته لم يتحقق
// ----------------------------------------------------------------------------------------------
// Use else if to specify a new condition to test, if the first condition is false
//                                    استخدمه في حال لتحديد شرط اخر في حال الشرط اول لم يتحقق 



