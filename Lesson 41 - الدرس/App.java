import java.util.ArrayList;

public class App {
    static ArrayList<Person> persons = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();
    static ArrayList<IDCard> idCards = new ArrayList<>();
    static ArrayList<Registration> registrations = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    public static void main(String[] args) {
     
    }
}
class IDCard{Person person;}

class Person{String name;}
class Order{Person person; int OrderNumber;}

class Student{String name;}
class Course{ String name;}
class Registration{ Student student; Course course;}
/* --------------------------------------------------------------------------------------------------------------------
    Association in Java 
    --------------------------------------------------------------------------------------------------------------------
    Association in Java is a connection or relation between two separate classes that are set up through their objects.
     الاقتران في جافا هو اتصال أو علاقة بين كلاسين (فئتين)  منفصلتين تم إعدادهما من خلال اوبجكت خاص بهم (كائناتهما) 
   --------------------------------------------------------------------------------------------------------------------
   1:   one to many    1 -> *
   2:   one to one     1 -> 1
   3:   many to many   * -> *
   --------------------------------------------------------------------------------------------------------------------
   Person  -  Order              طالب - طلبية
   Person  -  ID card       شخص - هوية شخصية
   Student -  Course             طالب - كورس
*/