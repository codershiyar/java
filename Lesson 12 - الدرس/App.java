public class App {

   public static void main(String[] args) {
      
      try{
            String[] languages  = {"العربية" , "الانجليزية" , "الألمانية" ,"الهولندية" , "الكردية"};
            System.out.println(languages[5]);   
      }catch(Exception error){
           System.out.println("حدث خطا ما"); 
           System.out.println(error); 
      }finally{   
            System.out.println("اكتمل جملة تراي وكاتش");  
      }


   } 
}


// When executing Java code, different errors can occur: coding errors made by the programmer,
//  errors due to wrong input, or other unforeseeable things.
//         عند تنفيذ كود جافا ، يمكن أن تحدث أخطاء مختلفة: أخطاء في اكواد قام بها المبرمج
//                               ، أو أخطاء ناتجة عن إدخال خاطئ ، أو أشياء أخرى غير متوقعة
// -------------------------------------------------------------------------------------------------------------
// When an error occurs, Java will normally stop and generate an error message.
//                                      عند حدوث خطأ ما ، ستتوقف جافا عادةً وتنشئ رسالة خطأ 
// -------------------------------------------------------------------------------------------------------------
// The try statement allows you to define a block of code to be tested for errors while it is being executed.
//                                           ضمن جملة تراي يمكنك وضع اوامر جافا الذي ترغب بان يتم تنفيذها 
// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//          ضمن جملة كاتش يمكنك وضع الاوامر جافا الذي ترغب بأن يتم تنفيذها في حال حدوث خطا ما في جملة تراي 
//                       او يمكنك استخدامها لاخفاء الخطا لتجنب تعطيل تطبيق او برنامج او لعبة بسبب ذلك الخطا
// -------------------------------------------------------------------------------------------------------------
// The finally statement lets you execute code, after try...catch, regardless of the result:
// تتيح لك العبارة فاينالي تنفيذ التعليمات البرمجية ، بعد تراي ... كاتش ، بغض النظر عن النتيجة
// -------------------------------------------------------------------------------------------------------------
// The try and catch keywords come in pairs:
// try {
      //  Block of code to try
      
//  }
//  catch(Exception e) {
      //  Block of code to handle errors
      
//  } finally { }