class App {
    public static void main(String[] args) {
        String date = "19/11/2025";
        String[] dateItems = date.split("/");
        System.out.println(dateItems[2]); 

        String time = "23:11:19";
        String[] timeItems = time.split(":");
        System.out.println(timeItems[0]); 

        String name = "Coder Shiyar";
        System.out.println(name.charAt(0));
        
        int number1 = 10;
        int number2 = 20;
        System.out.println(String.valueOf(number1) + String.valueOf(number2) );

        Integer number3 = 30;
        System.out.println(number3.toString()+40);
        System.out.println(String.valueOf(number3)+40);
    }
}

// ----------------------------------------------------------------------------------------------------------------
//     Java String methods  -  Part 4 الجزء الرابع
//     ----------------------------------------------------------------------------------------------------------------
//     1:split() : String[]                                      يستخدم لإنشاء قائمة (ارراي) من احد نصوص    
//         Splits a string into an array of substrings	
//     ----------------------------------------------------------------------------------------------------------------
//     2:charAt() : char       يستخدم لتحديد الشكل الذي يتواجد في التمركز الذي تحدده ويعيد لك ذلك شكل
//         Returns the character at the specified index (position)	
//     ----------------------------------------------------------------------------------------------------------------
//     3:valueOf() : String     يستخدم لتحويل انواع البيانات الاساسية إلى بيانات بصيغة البيانات النصية
//         Returns the string representation of the specified value
//     ----------------------------------------------------------------------------------------------------     	
//     4:toString()                 يستخدم لتحويل بيانات من نوع اوبجكت إلى بيانات بصيغة البيانات النصي 
//         A toString() is an in-built method in Java that returns the value given to it in string format. 	







/* ---------------------------------------------------------------------------------------------------------
    Java String methods  -  Part 1 الجزء الاول     
   ---------------------------------------------------------------------------------------------------------
   1:toUpperCase()       Converts a string to lower case letters -    تحويل الاحرف النص إلى الاحرف  الكبيرة
   2:toLowerCase()       Converts a string to upper case letters -     تحويل الاحرف النص إلى الاحرف الصغيرة
   3:length()            Returns the length of a specified string.                      يعيد طول نص المحدد
   4:trim()              Removes whitespace from both ends of a string  يزيل المسافة البيضاء من طرفي النص 
   ----------------------------------------------------------------------------------------------------------
    Java String methods  -  Part 2 الجزء الثاني
   ----------------------------------------------------------------------------------------------------------
    1: String replace(oldChar, newChar)  يقوم بإستبداول قيمة يطابق مع الجزء المحدد من النص , بالجزء جديد  
    Searches a string for a specified value, and returns a new string where the specified values are replaced
    ---------------------------------------------------------------------------------------------------------
    2: String substring(int startIndex, int endIndex)                                         يستخدم لقطع نص                                             
    This method can be used to cut a string 
    ---------------------------------------------------------------------------------------------------------
    3: indexOf()                                      ترجع تمركز الأول للحرف (الأحرف) المحدد في النص المحدد
    The indexOf() method returns the position of the first occurrence of specified character(s) in a string
    ---------------------------------------------------------------------------------------------------------
    4: lastIndexOf()                          ترجع موضع التواجد الأخير للحرف (الأحرف) المحدد في النص المحدد
    The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string
 ---------------------------------------------------------------------------------------------------------------
    Java String methods  -  Part 3 الجزء الثالث
   ----------------------------------------------------------------------------------------------------------------
    1: equals()                  يقارن نصين . إرجاع صحيح إذا كانت النصوص متساوية ، وإرجاع خطأ إذا لم يكن كذلك
        Compares two strings. Returns true if the strings are equal, and false if not	
   ----------------------------------------------------------------------------------------------------------------
    2: equalsIgnoreCase()                  يقارن نصين مع بعض دون حساسية تحقق من الحالة الاحرف الكبيرة و الصغيرة 
        Compares two strings, ignoring case considerations	
   ----------------------------------------------------------------------------------------------------------------
    3: contains()                                              للتحقق مما إذا كانت النص تحتوي على نص الذي تحدده
        Checks whether a string contains a sequence of characters	
   ----------------------------------------------------------------------------------------------------------------
    4: isEmpty()                                                              يتحقق مما إذا كانت النص فارغة أم لا
        The isEmpty() method checks whether a string is empty or not
   ----------------------------------------------------------------------------------------------------------------                                     
   5: startsWith()                                           يستخدم لتحقق إن كان النص يبدأ بجزء الذي تحدده او لا 
        Checks whether a string starts with specified characters	                                        
   ---------------------------------------------------------------------------------------------------------------- 
    6: endsWith()                                           يستخدم لتحقق إن كان النص ينتهي بجزء الذي تحدده او ل
        Checks whether a string ends with the specified character(s)	
   */