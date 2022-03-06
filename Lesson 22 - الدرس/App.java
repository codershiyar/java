public class App {

   public static void main(String[] args) {
   //  byte number = 100;
   //  int numberInt = number;
   //  System.out.println(numberInt);

   //  double numberDouble = 10.59;
   //  int numberInt =(int) numberDouble;
   //  System.out.println(numberInt);

      // String text = ""+ numberInt;
      // String text = Integer.toString(numberInt);
      // char myChar = 'S' ;
      // String text = Character.toString(myChar);
      // System.out.println(text);

      String input = "15.40";
      double number = Double.parseDouble(input);
      System.out.println(number+10);=
   } 
}

// -----------------------------------------------------------------------------------------------------------------
// Java Type Casting
// -----------------------------------------------------------------------------------------------------------------
// غالبا يحدث تلقائيا تحويل نوع البيانات بواسطة جافا عند تحويل نوع بيانات من نوع صغير الى نوع اكبر ولكن ليس  
//  دائما , في بعض احيان لا يتم ذلك وبتالي يجب عليك قيام بتحويل نوع البيانات إلى نوع الذي ترغب بها بشكل يدوي
// Datatype conversion often occurs automatically by Java from smaller type to a larger type size.
// byte -> short -> char -> int -> long -> float -> double 
// -----------------------------------------------------------------------------------------------------------------
//                      عندما ترغب بتحويل بيانات من نوع كبير الى نوع صغير فيجب عليك قيام بذلك غالبا بشكل يدوي
// When you want to convert data from a large type to a small type, you must do this often manually
// double -> float -> long -> int -> char -> short -> byte  
// -----------------------------------------------------------------------------------------------------------------
// Converting for primary data types - الطريقة التحويل لأنواع البيانات الأساسية 
// -----------------------------------------------------------------------------------------------------------------
// (int)value  
// -----------------------------------------------------------------------------------------------------------------
// Converting primary datatype to String لتحويل البيانات الى نوع البيانات نصي:
// -----------------------------------------------------------------------------------------------------------------
// Way 1 - الطريقة: String text = "" + DataToBeConverted; 
// Way 2 - الطريقة: TheTypeOfDataToBeConverted.toString(DataToBeConverted)