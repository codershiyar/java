import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
class App{
    public static void main(String[] args) {
      LocalTime time = LocalTime.now();

      LocalTime time2 = LocalTime.parse("18:11:59");

      LocalDate date2 = LocalDate.parse("2024-06-11");
      System.out.println(date2.getYear());

      time = time.minusHours(2);

      System.out.println(time2.toString());
      System.out.println(LocalDateTime.now());

    }
}

/*
import java.time.LocalTime;                       لاستدعاء الكلاس جاهز الذي يمكننا من خلالها حصول على الوقت 
import java.time.LocalDateTime;         لاستدعاء الكلاس جاهز الذي يمكننا من خلالها حصول على التاريخ والوقت
------------------------------------------------------------------------------------------------------------
LocalTime.now()  To get the current time                       -                   للحصول على الوقت الحالي
getHour()        To get the current hour from time             -       للحصول على الساعة الحالية من الوقت
getMinute()      To get the current minute from time           -      للحصول على الدقيقة الحالية من الوقت
getSecond()      To get the current second from time           -      للحصول على الثانية الحالية من الوقت

plusHours()      To increase hours   to the current time       -           للزيادة ساعات إلى الوقت المحدد
plusMinutes()    To increase minutes to the current time       -           للزيادة دقائق إلى الوقت المحدد
plusSeconds()    To increase seconds to the current time       -           للزيادة ثواني إلى الوقت المحدد

minusHours()      To decrease hours from the current time      -              للنقص ساعات من الوقت المحدد
minusMinutes()    To decrease minutes from the current time    -              للنقص دقائق من الوقت المحدد
minusSeconds()    To decrease seconds from the current time    -              للنقص ثواني من الوقت المحدد



 */