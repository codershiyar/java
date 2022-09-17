public class App {
   static String name = "Learn Java with Coder Shiyar";
          double version = 1.0;
          

    public static void main(String[] args) {
       App app = new App();
       app.version = 2.0;
       System.out.println(app.version);

       App app2 = new App();
        
       System.out.println(App2.getName());
    
    }

    void printName(){
        System.out.println(name);
    }
}

class App2{

   static String getName(){
        return App.name;
    }
}
/**  

Static and non-static variables in Java                   -                   المتغيرات الثابتة وغير الثابتة في جافا
=========================================================================================================================
1-a: A static variable acts as a global variable and is shared among all the objects of the class.
                          يعمل المتغير من نوع ستاتيك كمتغير عام ويتم مشاركته بين جميع كائنات الفئة (كلاسات ابوجكتس)                 
1-b: A non-static variables are specific to instance object in which they are created.
                   تعتبر المتغيرات غير ستاتيك خاصة ب اوبجكت الذي تم إنشاؤه ولا يتم مشاركة بياناتها مع اوبجكتس اخرى
-------------------------------------------------------------------------------------------------------------------------
2-a: A static variable can be accessed by static methods as well as non-static methods. 
                                     متغيرات من نوع ستاتيك يمكنك وصول إليه من خلال ميتودس من نوع ستاتيك و غير ستاتيك
2-b: A non-static variable can not be accessed by static member functions.
                             متغيرات من نوع غير ستاتيك لا يمكنك وصول إليه من خلال ميتودس من نوع ستاتيك بطريقة مباشرة

*/











/** 
    Extra
--------------------------------------------------------------------------------------------------------------------------
    Static variables occupies less space and memory allocation happens once.	
    A non-static variable may occupy more space. Memory allocation may happen at run time.
--------------------------------------------------------------------------------------------------------------------------
    A static variable is declared using static keyword.	
    A normal variable is not required to have any special keyword. 
**/
