package Java;

class App implements AppInterface{
   @Override
   public void setName(String name){
      System.out.println("الأسم: "+ name);
      System.out.println(App.course_name);
   };

   public static void setName2(String name){
      System.out.println("الأسم: "+ name);
      System.out.println(App.course_name);
   }
   public static void main(String[] args) {
      App app = new App();
     // app.setName("Coder Shiyar");

      App.setName2("Coder Shiyar");
      
      AppInterface appInterface = new AppInterface(){
         public void setName(String name){
            System.out.println(name);
         };
      };

      appInterface.setName("تم تنفيذ اوامر من داخل انترفيس اوبجكت غير نظامي");
   }
}
