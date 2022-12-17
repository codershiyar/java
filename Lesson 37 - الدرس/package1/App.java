package package1;
import package2.App3;

 public class App extends App3 {
    public static void main(String[] args) {
        System.out.println(App2.name);
        printName();
    }
}



/*  ------------------------------------------------------------------------------------------------------
Access Modifier in Java شرح اوامر الذي يتيح لك بتحديد طريقة وصول إلى كلاس او متغير او ميتودس في الجافا                    
----------------------------------------------------------------------------------------------------------
No modifier         دون تحديد اي طريقة وصول    
Private                                 (خاص)      	                                 
Protected                              (محمي)	               
Public	                                (عام)          

Methods/Variables & Constructor class :         No modifier/Private/Protected/Public
----------------------------------------------------------------------------------------------------------
Classes:                                        No modifier / only public (abstract & final)
----------------------------------------------------------------------------------------------------------
*/