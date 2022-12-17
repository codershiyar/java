public class App {
    public static void main(String[] args) {
        AppInfo appInfo = new AppInfo();
        appInfo.setName("Learn Java with Shiyar");
        System.out.println(appInfo.getName());

        AppInfo2 appInfo2 = new AppInfo2("I love ...");

        System.out.println(appInfo2.getName());
    }
}

class AppInfo{
    private String name;  

 public String getName(){
        return name;
}

public void setName(String name){
    this.name = name;
}

}

class AppInfo2{
    private String name;  

    AppInfo2(String name){
        this.name = name;
    }
 public String getName(){
        return name;
}

}

/* -------------------------------------------------------------------------------------------
Encapsulation in OOP in Java  
/* -------------------------------------------------------------------------------------------
                                                بالإختصار هو جعل متغيرات من نوع خاص ومنع وصول
 إليهم بطريقة مباشرة خارج الكلاس الذي تم إنشاء تلك متغيرات بها
 In short, it is to make variables of a private type and prevent access  them directly 
                                outside the class in which these variables are created
/* -------------------------------------------------------------------------------------------
Getters & Setters methods 
/* -------------------------------------------------------------------------------------------
They are methods that you create to access these variables through other classes
In order to read or update its data
    هم عبارة عن وظائف تقوم بإنشائها للوصول إلى تلك متغيرات من خلالها عبر كلاسات اخرى  
                                                       بهدف قراءة بياناتها او تحديثها 

There are various reasons as to why encapsulation is essential in Java:
Encapsulation allows us to modify the code or A part of the code without having to change any other functions or code.
Encapsulation controls how we access data.
We can modify the code based on the requirements using encapsulation.
Encapsulation makes our applications simpler.                                                       
*/