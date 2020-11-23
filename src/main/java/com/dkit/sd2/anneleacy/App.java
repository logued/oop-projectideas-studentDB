package com.dkit.sd2.anneleacy;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;


/**
 *  Program to introduce the use of LocalDate class
 */
public class App
{
    public static void main(String[] args)
    {

//
//      Java API:  https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
//
//        https://www.baeldung.com/java-8-date-time-intro
//
//
//
        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);
//
        //Creating LocalDate by providing input arguments
        LocalDate firstDay = LocalDate.of(2021, Month.JANUARY, 1);
        System.out.println("Specific Date=" + firstDay);
//
//      Try creating date by providing invalid inputs
//      Exception in thread "main" java.time.DateTimeException:
//
        LocalDate newDay = firstDay.plusDays(5);
        System.out.println("newDay=" + newDay);
        newDay = newDay.plusWeeks(5);
        System.out.println("newDay=" + newDay);
        newDay = newDay.plusMonths(5);
        System.out.println("newDay=" + newDay + "\n");

        System.out.println("What is the day of the month : " + today.getDayOfMonth());
        System.out.println("What is the Month name : " + today.getMonth());

//            newDay = newDay.   //look at methods

        if (newDay.isBefore(today))
        {
            System.out.println("Before");
        }
        else
        {
            System.out.println("After");
        }
//
//
//      Convert String to a LocalDate
//        https://www.mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
        LocalDate d = LocalDate.parse("2018-12-25");  //default format
        DayOfWeek day = LocalDate.parse("2018-12-25").getDayOfWeek();
        System.out.println("day = " + day);



//TODO#1 Create a LocalDate object & determine what day of the week Christmas falls


//        Determining difference between 2 dates
//        https://www.baeldung.com/java-date-difference
        LocalDate now = LocalDate.now();
        LocalDate sixDaysAhead = now.plusDays(6);
//

        long diff = DAYS.between(now, sixDaysAhead);
        System.out.println("Difference = " + diff);

//TODO#2 Determine how many days from now until Christmas day
//



        System.out.println("\n\n******** LocalDate *******\n");
        LocalDate thisDate = LocalDate.now();
        System.out.println("CurrentDate=" + thisDate);

        System.out.println("\n\n******** LocalTime *******\n");
        LocalTime thisTime = LocalTime.now();
        System.out.println("CurrentTime=" + thisTime);


        System.out.println("\n\n******** LocalDateTime *******\n");
        LocalDateTime thisDateTime = LocalDateTime.now();
        System.out.println("CurrentTime=" + thisDateTime);


    }
}
