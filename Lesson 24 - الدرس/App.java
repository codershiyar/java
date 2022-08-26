import java.time.LocalTime;

 class App {
    public static void main(String[] args) {
    System.out.println(LocalTime.now());

    App2 app2 = new App2("Coder Shiyar");
    }

}

class App2{
    App2(String appName){
        System.out.println("App name: "+appName);
    }
    App2(){
       
    }
    App2(String appName, double version){

    }
}

// 1: Object Oriented Programming - exampels 
//------------------------------------------
// 2: Classes in Java
// -----------------------------------------------------------------------------------------------------------------
//                       قوانين لإنشاء اسماء كلاسات في جافا هي نفس قوانين إنشاء اسماء متغيرات  وملفات  في جافا
//                                                                    فقط اول حرف من اسم ينصح بان يكون حرف كبير
// The rules for creating class names in Java are the same as the rules for creating variable and file names in Java, 
// only the first letter of a name is recommended to be a capital letter.
// -----------------------------------------------------------------------------------------------------------------
//                                                             في كل ملف جافا يمكنك انشاء بها كلاس او اكثر من كلاس 
//                                         بشرط ان يكون اسم احد كلاسات بنفس اسم ملف جافا الذي يتواجد بها ذلك كلاس
// In each Java file, one or more classes can be created
// Only the main class must have the same name as the java file in which the class is created.
// -----------------------------------------------------------------------------------------------------------------
// 3: Class Constructors  in Java
// -----------------------------------------------------------------------------------------------------------------
//                                                     يمكن أن تحتوي كل فئة في جافا على كونستركتور واحد أو أكثر
// Every class in Java can have 1 or more constructors, but the constructor header must be different
// -----------------------------------------------------------------------------------------------------------------
