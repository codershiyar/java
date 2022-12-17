
public class App{
  
     App(){
       
     }
     public static void main(String[] args) {
     

      // replaceAll()      من خلالها يمكنك استبداله جزء من النص بجزء جديد        
      // replaceFirst()     يقوم بإستبداول قيمة يطابق مع الجزء المحدد من النص , بالجزء جديد
      // isEmpty()          يستخدم لتحقق إذا كان متغير من نوع بيانات نصي خالي من بيانات او لا        
      // lastIndexOf()      تمركز اخر جزء يطابق مع الجزء المحدد     
      // startsWith()        يستخدم لتحقق إن كان النص يبدأ بجزء الذي تحدده او لا     
      // endsWith()          يستخدم لتحقق إن كان النص ينتهي بجزء الذي تحدده او لا    
      String text = "Java, I like Java.";
      text = text.replaceFirst("not", "@");
      boolean isEmpty = text.isEmpty();
      int lastIndexOf = text.indexOf("Java");

      boolean startsWith = text.startsWith(" ");
      boolean endsWith = text.endsWith(".");
      // if(text.isEmpty()){

      // }else{

      // }
      System.out.println(endsWith);

     }
     
 }
 
 
 
 
 
       