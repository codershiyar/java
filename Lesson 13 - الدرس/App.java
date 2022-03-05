import java.util.Scanner; 
public class App {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      try {
         System.out.println("Enter your age: ");
         int age = keyboard.nextInt();
         System.out.println("Age: "+ age);
      } catch (Exception e) {
         //TODO: handle exception
         System.out.println("Error invalid data");
      }
    

      System.out.println("Enter your email: ");
      keyboard.nextLine();
      String email =keyboard.nextLine();
      System.out.println("Email: " + email);

   } 
}

// Java User Input (Scanner) يتم استخدامها لجعل مستخدم يقوم بتحديد بيانات
// ------------------------------------------------------------------------------------------------------------------
// import java.util.Scanner;                       لكي نتمكن من استخدام سكنر يجب علينا استدعاء ملف سكنر في جافا
// Scanner keyboard = new Scanner(System.in);                            لانشاء متغير لقراء بيانات من لوحة مفاتيح
// ------------------------------------------------------------------------------------------------------------------
// nextLine()	Reads a String value from the user                           يستخدم لقراءة بيانات من نوع بيانات نصي
// ------------------------------------------------------------------------------------------------------------------
// nextBoolean()	Reads a boolean value from the user                                 لقراءة بيانات من نوع صح و خطا
// ------------------------------------------------------------------------------------------------------------------
// nextByte()	 Reads a byte value from the user             لقراءة بيانات من نوع ارقام ليس بها فاصلة من نوع بايت
// ------------------------------------------------------------------------------------------------------------------
// nextDouble() Reads a double value from the user    يستخدم لقراءة اعداد الذي بها فاصلة ونوع بياناته يكون دوبول
// nextFloat()	Reads a float value from the user       يستخدم لقراءة اعداد الذي بها فاصلة ونوع بياناته يكون فلوت
// ------------------------------------------------------------------------------------------------------------------
// nextInt()	Reads a int value from the user                 يستخدم لقراءة اعداد الذي ليس بها فاصلة من نوع إينت
// nextLong()	Reads a long value from the user        يستخدم لقراءة اعداد الذي ليس بها فاصلة من نوع اعداد طويلة
// nextShort()	Reads a short value from the user       يستخدم لقراءة اعداد الذي ليس بها فاصلة من نوع اعداد قصيرة
