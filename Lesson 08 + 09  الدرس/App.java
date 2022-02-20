public class App {

public static void main(String[] args) {
// int number1 = 25;
// int number2 = 10;
// int result = number1%number2;
// System.out.println(++number1);
// System.out.println(number1);

String text =  " I love Java " + (20+25)+ " انا احب جافا";

System.out.println(text);
}  

}

// Arithmetic operators                       ^                      العمليات الحسابية
// -----------------------------------------------------------------------------------  
// Operator	    |     Name	
// -----------------------------------------------------------------------------------       
// +	            Addition	            جمع
// -	            Subtraction	            طرح
// *	            Multiplication	        ضرب
// /	            Division	            قسمة
// %	            Modulus	Returns the division remainder	إعادة الباقي العدد مقسم
// ++	            Increment	       زيادة 1 للعدد المحدد المخزن ضمن احد متغيرات
// --      	        Decrement	         نقص 1 للعدد المحدد المخزن ضمن احد متغيرات
// =                Assignment              يساوي 
// -----------------------------------------------------------------------------------
// Java Assignment Operators عمليات استناد قيمة
// ----------------------------------------------
// Operator
// =	       
// +=	
// -=	
// *=	
// /=
// %=	




// ------------------------------------------------------------------------------------------------------------------------
//  Arithmetic priority - أولويات العمليات الحسابية
// ------------------------------------------------------------------------------------------------------------------------
// 1: The order of operations is as follows: Parentheses, exponents, multiplication and division, addition and subtraction
//                                              يكون ترتيب العمليات كالآتي: “الأقواس، الأس، الضرب والقسمة، الجمع والطرح”.
// ------------------------------------------------------------------------------------------------------------------------
// 2: This can be described by: Parentheses beat exponents, which beat multiplication and division 
//                                                              (but multiplication and division are in the same order).
//      ويمكن وصف ذلك من خلال: تفوق الأقواس الأسس، التي تتفوق على الضرب والقسمة (لكن الضرب، والقسمة في نفس الترتيب).
// ------------------------------------------------------------------------------------------------------------------------
// 3: Multiplication and division take precedence over addition and subtraction (both in lower order), 
//                                                                                    in other words, the precedence is:
//                      والضرب والقسمة يفوقان الجمع والطرح، (وهما معًا في الترتيب السفلي)، وبمعنى آخر، الأسبقية هي
// ------------------------------------------------------------------------------------------------------------------------
// // 4:Multiplication and division (from right to left when the numbers are Arabic, and from 
//                                                             left to right when the numbers are English).
//  الضرب والقسمة (من اليمين إلى اليسار عندما تكون الأرقام عربية، ومن اليسار إلى اليمين عندما تكون الأرقام إنجليزية)
// ------------------------------------------------------------------------------------------------------------------------
// 5: addition and subtraction (from right to left when the numbers are Arabic,
//                                                          and from left to right when the numbers are English).
// الجمع والطرح (من اليمين إلى اليسار عندما تكون الأرقام عربية، ومن اليسار إلى اليمين عندما تكون الأرقام إنجليزية)