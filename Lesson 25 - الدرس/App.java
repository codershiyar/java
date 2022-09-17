import java.time.LocalDate;

public class App {

    static void printMessage(String message){
        System.out.println(message);
    }

    String getName(){
        return "Coder Shiyar";
    }
    
    public static void main(String[] args) {
       App.printMessage("Hi from main");
       App app = new App();
       System.out.println(app.getName());

       System.out.println(LocalDate.now());
       System.out.println("text".length());
    }

}

// ---------------------------------------------------------------------------------------------------------------------
//  Java Methods  (members/function)
//                                                                                وظيفة او مهمة   
//----------------------------------------------------------------------------------------------------------------------
// 1: There are ready-made methods in Java that were developed by others            وظائف جاهزة 
// 2: methods that you can create yourself                           وظائف يمكنك انشائها بنفسك
//----------------------------------------------------------------------------------------------------------------------
// 3: void type   النوع الذي فقط ينفذ اوامر التي تتواجد ضمنها عند استدعائها دون إعادة اي شي
// 4: return type    النوع الذي يقوم بتنفيذ اوامر التي تتواجد ضمنها و ثم يقوم بإعادة بيانات
// ---------------------------------------------------------------------------------------------------------------------








/** Static and non-static methods in Java                   -               مهمات/وظائف الثابتة وغير الثابتة في جافا
------------------------------------------------------------------------------------------------------------------------
1-A: You can make a method of static type if you want to call method's without having to create a class-object
       يمكنك عمل ميتود من النوع ستاتيك إذا كنت تريد ان تتمكن من استدعاء ميتود دون الحاجة إلى إنشاء اي كلاس اوبجكت

1-B: You can make a variable of type non-static if you want to access a variable only via Class Object 
and the variable data is not shared with other objects
  يمكنك عمل ميتود من النوع غير ستاتيك إذا ترغب بإستدعاء ميتود عبر كلاس اوبجكت في ميتودس من نوع ستاتيك أو كلاس اخر
 
-------------------------------------------------------------------------------------------------------------------------
2-a: A static method can access only static methods and can not access non-static methods.
ضمن ميتود من نوع ستاتيك يمكنك وصول فقط الى ميتودس من نوع ستاتيك ولا يمكنك وصول إلى ميتودس ليست من نوع ستاتيك 
                          بطريقة مباشرة. يمكنك انشاء كلاس اوبجكت ان كنت ترغب باستدعاء ميتود من نوع غير ستاتيك
2-b: A non-static method can access both static as well as non-static members.                                  
                                                  يمكن للميتودس غير ستاتيك الوصول إلى كل من ميتودس ستاتك وغير ستاتيك
*/































