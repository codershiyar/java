package Java;

public class App extends App2 {
   
   @Override
   public void show_name(){
      System.out.println("Name: Coder Shiyar");
   }

   public static void main(String[] args) {
     App app = new App();
     app.show_name();

   }

}

