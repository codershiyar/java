
public class App{

  
    public static void main(String[] args) {
        StringBuffer textBuffer = new StringBuffer("Coder Shiyar Java");
        textBuffer.delete(0, 5);
      //  textBuffer.reverse();
        char position10 = textBuffer.charAt(10);
        System.out.print(position10);

     
       
    }
    
}

  // Part 1 - StringBuffer - جزء الأول
        // append(String s)	يتم استخدامها لإضافة النص
        // insert(int offset, String s) يُستخدم لإدراج النص المحدد إلى القيمة الذي يملك المتغير  في الموضع الذي تحدده
        // replace(int startIndex, int endIndex, String str)  يستخدم لإستبدال جزء من النص الذي تحدده بقيمة جديدة تحددها بنفسك
       


   // Part 2 - StringBuffer - جزء الثاني
        // delete(int startIndex, int endIndex)  يستخدم لحذف جزء من النص , تحدده بنفسك أي جزء ترغب بحذفها
        // reverse()	 يستخدم لعكس النص.
        // charAt(int index)	 يستخدم لإرجاع الحرف في الموضع المحدد.
       