
public class Admin extends User{
    // SubClass  
    // SuperClass

    String name = "ROOT_ADMIN";

    public void getName(){
        System.out.println(super.name);
    }
    
    public void getValue() {
        super.getName();
    }
public static void main(String[] args) {
    Admin admin = new Admin();
    admin.getName();
    admin.getValue();

}
}