import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter 1 for Arabic , 2 for English , 3 For Dutch");
      int option = scanner.nextInt();
      switch(option){
         case 1:
         System.out.println("مرحبا");
         break;
         case 2:
         System.out.println("Hello");
         break;
         case 3:
         System.out.println("Hoi");
         break;
         default:
         System.out.println("Error");
      }

      if(option == 1){
         System.out.println("مرحبا");
      }else if(option == 2){
         System.out.println("Hello");
      }else if(option == 3){
         System.out.println("Hoi");
      }else{
         System.out.println("Error");
      }
      
   } 
}

// Java Switch Statements
// ---------------------------------------------------------------------------------------------
// Use the switch statement to select one of many code blocks to be executed.
// استخدم جملة سويتش لتحديد واحدة من العديد من مجموعات التعليمات البرمجية ليتم تنفيذها
// ---------------------------------------------------------------------------------------------
// switch(expression) {
//    case a:
//      // code block
//      break;
//    case b:
//      // code block
//      break;
//    default:
//      // code block
//  }
// ---------------------------------------------------------------------------------------------
// The default keyword specifies some code to run if there is no case match
// ---------------------------------------------------------------------------------------------
