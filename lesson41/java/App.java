
public class App extends Payment {

    @Override
    public void language(){
        System.out.println("اللغة : العربية");
    }
    public static void main(String[] args) {
        App app = new App();
        app.payment_method();
        app.language();
    }
    
}