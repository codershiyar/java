public class App {
   public static void main(String[] args) {
      
      String[] webLanguages ={"HTML","CSS" , "JavaScript" , "PHP"};
      
      for(int counter = 0; counter<webLanguages.length; counter++ ){
         System.out.println(counter+1 + ": " + webLanguages[(webLanguages.length-1)-counter]);
      }

      // for(int counter = 0; counter<webLanguages.length; counter++ ){
      //    System.out.println(counter+1 + ": " + webLanguages[counter]);
      // }
      // for(int counter =1; counter<=5; counter++){
      //    System.out.println(counter);
      // }

   } 
}

// The For Loop - يتم استخدامها لتكرار تنفيذ اوامر حسب عدد مرات الذي تحدده
// -------------------------------------------------------------------------------------------------
// When you know exactly how many times you want to loop through a block of code, use the
//  for loop instead of a while loop:
// عندما تعرف بالضبط عدد المرات التي تريد تكرار تنفيذ اوامر ، استخدم حلقة فور بدلاً من حلقة ويل
// -------------------------------------------------------------------------------------------------
// The for loop has the following syntax:     قوانين لانشاء فور لوب بشكل صحيح 
// --------------------------------------------------------------------------------
// for (statement 1; statement 2; statement 3) {
//   // code block to be executed
// }
// --------------------------------------------------------------------------------
// Statement 1 is executed (one time) before the execution of the code block.
//        يتم تنفيذه (مرة واحدة) , غالب يستخدم لانشاء متغير لاجل العداد تكرار
// --------------------------------------------------------------------------------
// Statement 2 defines the condition for executing the code block.
//                              يحدد شرط تنفيذ التعليمات البرمجية في حال شرط 
//       الذي تضعه صحيح سيتم تكرار تنفيذ اوامر الى ما يصبح ذلك شرط غير صحيح
// --------------------------------------------------------------------------------
// Statement 3 is executed (every time) after the code block has been executed.
//      {} يتم تنفيذه (في كل مرة) بعد تنفيذ التعليمات البرمجية المتواجد ضمن




// String[] webLanguages ={"HTML","CSS" , "JavaScript" , "PHP"};