class App {
    String name;
    App app;

    void setApp(App app){
       this.app =  app;
    }
    App(String name){
        this();
        this.name = name;  
        System.out.println(this.getName());
        setApp(getApp());
    }

     App getApp(){   return this; }
    
    App(){ System.out.println("Start App");  }
    String getName(){return name;}

    public static void main(String[] args) {
       App app = new App("Learn Java");
    }
}

/*  --------------------------------------------------------------------
    this keyword in Java  - شرح امر هذا في الجافا
------------------------------------------------------------------------
    this  يمكن استخدام هذا للإشارة إلى فاريبل مثيل في الاوبجكت الحالي
    this           يمكن استخدام هذا للإستدعاء ميتود في الاوبجكت الحالي
    this()                    يمكن استخدامها للاستدعاء كونستروكتور كلاس
    this                       يمكن تمريرها كا قيمة عند استدعاء ميتود
    this            يمكن تمريرها كا قيمة عند استدعاء كونستروكتور كلاس
    this   يمكن استخدام هذا لإرجاع اوبجكت مثيل من كلاس الحالي في ميتود
           
    this can be used to refer current class instance variable. 
    this can be used to invoke current class method (implicitly)
    this() can be used to invoke current class constructor.
    this can be passed as an argument in the method call.
    this can be passed as argument in the constructor call.
    this can be used to return the current class instance from the method.

*/