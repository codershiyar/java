import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); 
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        // fruits.remove("Kiwi");
        try {
            System.out.println(fruits.get(fruits.size() - 4));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("لا يوجد اي قيمة في ذلك تمركز , لذلك ظهرت الخطأ");
        }
       
        int position = 0;
        // for(String item : fruits ){
        //     position++;
        //     System.out.println(position+" : " +item);
        // }
        for(int i = 0; i<fruits.size(); ++i){
            position++;
            System.out.println(position+" : " + fruits.get(i));
        }
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