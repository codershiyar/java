package Java;

class App extends App2 {
 
   public static void main(String[] args) {

      System.out.println(App.name);
      App.show_message();
      App.show_message2();
   }
}

class App2 extends App3 {
   static String name = "Coder Shiyar Java";
}


class App3 extends App4{
   public static void show_message(){
      System.out.println("من كلاس الثالث");
   }
}

class App4{
   public static void show_message2(){
      System.out.println("من كلاس الرابع");
   }
}