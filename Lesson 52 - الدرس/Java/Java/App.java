package Java;
// extends + implements  معنى 

// extends = مدد او رث
// يعني مدد الكلاس مع كلاس أخر  - او اجعل يرث الكلاس من كلاس اخر

// implements  -  زود 
// يعني تزويد الكلاس بإنترفيس

class App extends App2   implements Color , Background {
   public static void main(String[] args) {
     System.out.println(App.name);
   }
}


class App2{
   static String name = "Coder Shiyar";
}