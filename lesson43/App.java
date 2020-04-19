
public class App{

  
    public static void main(String[] args) {

        String text = "Coder Shiyar";

        StringBuffer textBuffer = new StringBuffer("Coder Shiyar");
        textBuffer.append(" is a teacher");
        textBuffer.insert(0, "1: ");
        textBuffer.replace(0, 2, "YouTube: ");

        System.out.println(textBuffer);

        // Part 1 - StringBuffer - جزء الأول
        // append(String s)	يتم استخدامها لإضافة النص
        // insert(int offset, String s) يُستخدم لإدراج النص المحدد إلى القيمة الذي يملك المتغير  في الموضع الذي تحدده
        // replace(int startIndex, int endIndex, String str)  يستخدم لإستبدال جزء من النص الذي تحدده بقيمة جديدة تحددها بنفسك
       

     
    }
    
}








      