import java.time.LocalDate;
class App{
    public static void main(String[] args) {
      LocalDate date = LocalDate.now();
      date = date.plusYears(3);
      
      System.out.println(date.getYear() + " - " + date.getMonthValue() + " - " + date.getDayOfMonth());
    }
}

/*
import java.time.LocalDate;                     لاستدعاء الكلاس جاهز الذي يمكننا من خلالها حصول على التاريخ 
------------------------------------------------------------------------------------------------------------
LocalDate.now()  To get the current date                       -                 للحصول على التاريخ الحالي
getYear()        To get the current year from date             -      للحصول على السنة الحالية من التاريخ
getMonthValue()  To get the current month from date            -       للحصول على الشهر الحالي من التاريخ
getMonth()       To get the name of the current month          -  للحصول على الاسم الشهر الحالي من التاريخ
getDayOfMonth()  To get the current day of the month from date -  للحصول على اليوم الحالي من الشهر الحالي
getDayOfYear()   To get the current day of the month from date - للحصول على اليوم الحالي من السنة الحالية
------------------------------------------------------------------------------------------------------------
minusDays() To decrease days from the current date             -              للنقص ايام من التاريخ المحدد
plusDays()  To increase days to the current date               -           للزيادة ايام إلى التاريخ المحدد

 */