
public class App {

public static void main(String[] args) {

   String[] languages = {"Arabic" , "Dutch" , "German" , "Kurdish" , "English"};
   // System.out.println(languages[0]);
   // System.out.println(languages[1]);
   // System.out.println(languages[2]);
   // System.out.println(languages[3]);
   // System.out.println(languages[4]);
   int numbering = 0;
   for(String language : languages ){
      ++numbering;
      System.out.println(numbering + ": " + language);
   }

   }
}

// for (type variableName : arrayName) {
//    // code block to be executed - الكود الذي ترغب بتنفيذه
//  }


