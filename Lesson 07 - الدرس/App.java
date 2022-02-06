public class App {

public static void main(String[] args) {
      // rule 1 
      String text = "Learn Java in Arabic";
      // rule 4
      String texT = "تعلم جافا  مع كودر شيار";
      // rule 5
      boolean IsWorking = true;
      System.out.println(texT);
   }
}

//                  القسم الثالث :شرح للقوانين انشاء اسماء متغيرات في جافا 
// القواعد العامة لتسمية المتغيرات هي:
// ------------------------------------------------ -------------------------
//       يمكن أن تحتوي الأسماء على أحرف وأرقام وشرطات سفلية وعلامات الدولار 
//                                    _ يجب أن تبدأ الأسماء بحرف او بـ $ أو 
//              ينصح أن تبدأ الأسماء بحرف صغير ولا يمكن أن تحتوي على مسافة 
//                الأسماء حساسة لحالة الأحرف هناك فرق بين احرف كبيرة وصغيرة
//                                 لا يمكن استخدام  الكلمات المحجوزة كأسماء

// Part 3: An explanation of the rules for creating variable names in Java
//--------------------------------------------------------------------------
// The general rules for naming variables are:
//------------------------------------------------------------------------
// Names can contain letters, digits, underscores, and dollar signs
// Names must begin with a letter also with $ or _
// Names should start with a lowercase letter and it cannot contain whitespace
// Names are case sensitive ("myVar" and "myvar" are different variables)
// Reserved words (like Java keywords, such as int or boolean) cannot be used as names


// List of Reserved Java Keywords - قائمة لبعض اسماء محجوزة في جافا
//------------------------------------------------------------------------
// abstract	   assert	      boolean	   break	   byte	      case
// catch	      char	         class	      const	   continue	   default
// double	   do	            else	      enum	   extends	   false
// final	      finally	      float	      for	   goto	      if
// implements	import	      instanceof	int	   interface	long
// native	   new	         null	      package	private	   protected
// public	   return	      short	      static	strictfp	   super
// switch	   synchronized	this	      throw	   throws	   transient
// true	      try	void	volatile	      while	
