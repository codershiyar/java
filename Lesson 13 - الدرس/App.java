
public class App {

public static void main(String[] args) {
// int counter = 1;
// int number= 7;
// while(counter<=20){
// System.out.println(counter + " * " + number + " = " + (counter * number) );
// counter++;
// }

String[] webLanguages = {"html","css" ,"JavaScript" , "PHP"};

int counter2 = 0;
while(counter2<webLanguages.length){
System.out.println("Language " + (counter2 + 1) + " : " + webLanguages[counter2]);
counter2++;
}

   }
}


// Java While Loop  
// ---------------------------------------------------------------------
// يستخدم لتكرار تنفيذ الأوامر الى ما يصبح الشرط الذي وضعته غير صحيح
// ---------------------------------------------------------------------
// while (condition الشرط) {
//    // code block to be executed - الكود الذي ترغب بان يتم تنفيذها
//  }