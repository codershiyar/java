package Java;

public class App extends App4 implements App2,App3 {
  
   public static void main(String[] args) {
      System.out.println(App2.APP_NAME);
         App app = new App();
         app.show_name("Coder Shiyar");
         App4 app2 = new App4();
   }

   @Override
   public void show_name(String name) {
      // TODO Auto-generated method stub
      System.out.println("Name: " + name);
   }

}

