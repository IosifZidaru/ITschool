package sesion7;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class UtilesExamples {
    public static void main(String[] args) {
        locailDateExample();
        localDateTimeExample();
        randomeExample();
        mathExample();
        durationExample();

    }

    public static void locailDateExample() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is : " + today);

        LocalDate tenDays = today.plusDays(10);
        System.out.println("ten days from now : " + tenDays);

        System.out.println("2 months before: " + today.minusMonths(2));
        System.out.println("2 years before: " + today.minusYears(2));


       // String f


    }

    public static void localDateTimeExample(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        String fataTimeString = "2025-12-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");

        System.out.println(today.format(formatter));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm")));
        System.out.println(today.format(formatter));

        LocalDateTime future = LocalDateTime.of(2025, 12, 9 , 20, 05);
        String result = future.isBefore(today)? "before": "after";

        System.out.println("before or after? : " + result);
        System.out.println(future);

        Date utilDate = new Date();
        java.sql.Date  sqlDate= new java.sql.Date(utilDate.getTime());

        System.out.println("util date: " + utilDate);
        System.out.println("sql date: " + sqlDate);

        Timestamp timestamp = new Timestamp(sqlDate.getTime());
        System.out.println("times : " + timestamp );

    }


    public static void randomeExample(){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        double randomeDouble = random.nextDouble();
        System.out.println(randomeDouble);

        String[] name = { "Marcel", "Marcela", "Ion", };
        System.out.println(name[random.nextInt(name.length)]);
        System.out.println(random.nextBoolean());
    }


    public static void mathExample(){
        int nr1 = 11;
        int nr2 = 32;

        System.out.println(Math.min(nr1, nr2));
        System.out.println(Math.max(nr1, nr2));
        System.out.println(Math.PI);
    }

    public static void durationExample(){
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.plusDays(1).plusHours(5).plusMinutes(4324);
        Duration duration = Duration.between(time1 , time2);
        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }





}
