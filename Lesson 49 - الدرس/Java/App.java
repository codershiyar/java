package Java;

public class App {

   public static void main(String[] args) {
    App app = new App();

   App.App2 app2 = app.new App2("Coder Shiyar");
 //  app2.print_message();
   } 

    class App2{
       public void print_message(){
        System.out.println("تم تشغيل ميتود الذي يتواجد ضمن ال كلاس الداخلي");
       }
    App2(){
        System.out.println("تم تشغيل كونستركتور كلاس الداخلي");
    }

    App2(String name){
      System.out.println("Name: " + name);  
    }
    
   }

}