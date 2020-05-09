package package1;

import package2.App2;

class App1{
   public static void main(String[] args) {
       App2 data = new App2();
       data.read_message();
       System.out.print(data.name);
   }
}