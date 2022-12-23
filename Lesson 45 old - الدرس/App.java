
public class App{

  
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("Coder");
        int length = text.length();
        text.append(" Shiyar");
        text.delete(0, 6);
        text.insert(0, " I love ");
        text.append(text.charAt(0) + ": ");
        
        if(text.length() >=  12){

            String textSubstring = text.substring(0);

            System.out.print(textSubstring);
        }else{
            System.out.print("التمركز الذي قمت بتحديدها  , لا يتوجد بسبب عدد احرف  في البيانات المتغير , يكون أقل من تمركز الذي قمت بتحديدها"); 
        }
        
 
     
        

  // Part 1 - StringBuffer - جزء الأول
        // append(String s)	يتم استخدامها لإضافة النص
        // insert(int offset, String s) يُستخدم لإدراج النص المحدد إلى القيمة الذي يملك المتغير  في الموضع الذي تحدده
        // replace(int startIndex, int endIndex, String str)  يستخدم لإستبدال جزء من النص الذي تحدده بقيمة جديدة تحددها بنفسك
       


   // Part 2 - StringBuffer - جزء الثاني
        // delete(int startIndex, int endIndex)  يستخدم لحذف جزء من النص , تحدده بنفسك أي جزء ترغب بحذفها
        // reverse()	 يستخدم لعكس النص.
        // charAt(int index)	 يستخدم لإرجاع الحرف في الموضع المحدد.
       

        // Part 3 - StringBuffer - جزء الثالث
        // length()	تُستخدم لإرجاع طول النص ، أي العدد الإجمالي للأحرف.
        // substring(int beginIndex)  يقوم بإعادة لك القيمة الذي يملكه المتغير ابتداء من تمركز الذي تحدده
       
        // يقوم بإعادة لك القيمة الذي يملكه المتغير ابتداء من تمركز الذي تحدده إلى تمركز الذي تقوم بتحديدها
        // substring(int beginIndex, int endIndex)  


    }
    
}





      