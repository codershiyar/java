public class App extends  Settings{
    public void printName(){ 
        System.out.println("Name: test");
    }
    public static void main(String[] args) {
    //    final String name = "Shiyar";
    //     name = "Coder Shiyar";
       
    }
}

final class Settings{
   final public void printName(){
        System.out.println("Name: Coder Shiyar");
    }
}


/* final(نهائي) :                               يتم استخدامها إذا كنت ترغب بجعل قيمة متغير ثابتة غير قابلة للتعديل
                                                                    او ا كنت ترغب بجعل كلاس او ميتود غير قابل للتعديل  
------------------------------------------------------------------------------------------------------------------------
 1: The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable
 ------------------------------------------------------------------------------------------------------------------------
 2: The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...)
 ------------------------------------------------------------------------------------------------------------------------
*/