import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); 
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        // fruits.set(0, "Orange");
        // fruits.remove(0);
        // fruits.clear();
        System.out.println(fruits.size());
    }
}

/* ----(Java ArrayList)--------------------------------------------------------------------------------------------------
   The ArrayList class is a resizable array  كلاس اراي ليست يستخدم لإنشاء مصفوفات متطورة مقارنةً مع المصفوفات العادية 
   ---------------------------------------------------------------------------------------------------------------------
   Value = قيمة                        Position = تمركز                     Arrays = مصفوفات
   ---------------------------------------------------------------------------------------------------------------------
   add(Value)                   To add items/elements to the ArrayList                               لإضافة قيمة جديدة
   set(Position, Value)         To modify an item,                                                     لتحديث احد قيم
   get(Position)                To access an element in the ArrayList                               لوصول إلى احد قيم
   remove(Position)             To remove an item/element                                                لحذف احد قيم     
   clear()                      To remove all the elements in the ArrayList                             لحذف جميع قيم 
   size()                       To find out how many elements an ArrayList have لمعرفة عدد العناصر الموجودة في اراي
   ---------------------------------------------------------------------------------------------------------------------
*/