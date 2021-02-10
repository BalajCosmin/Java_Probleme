
// program care citeste numarul de secunde, minute, ore si afiseaza numarul de secunde trecute de la miezul noptii sau numarul de
//secunde pana la miezul noptii sau procentul de timp din zi trecut pana la acel moment

package com.company;
import java.util.*;
public class Time{



 public static void main(String[] args)
 {
     int hours;
     int minutes;
     int seconds;


     /* se citeste numarul curent de secunde, ore, minute */

     System.out.println("Introduce the current number of seconds: ");
     Scanner read_seconds = new Scanner(System.in);
     seconds = read_seconds.nextInt();
     if((seconds<0) || (seconds>59))
     {
         System.out.println("Optiune gresita ");
         System.exit(0);
     }


         System.out.println("Introduce the current number of minutes: ");
         Scanner read_minutes = new Scanner(System.in);
         minutes = read_minutes.nextInt();

     if((minutes<0) || (minutes>59))
     {
         System.out.println("Optiune gresita ");
         System.exit(0);
     }

         System.out.println("Introduce the current number of Hours: ");
         Scanner read_hours = new Scanner(System.in);
         hours = read_seconds.nextInt();
     if((hours<0) || (hours>23))
     {
         System.out.println("Optiune gresita ");
         System.exit(0);
     }

         char back = 'N';       //optiune pentru reinceperea programului
         Boolean begin = false;


         do {
             int option;

             System.out.println("Introduce the option: \n 1:Show the current number of seconds passed since midnight \n " +
                     " 2: show the number of seconds until midnight \n  " + "3: show the percentage of time passed in the current day \n");

             Scanner read_option = new Scanner(System.in);
             option = read_option.nextInt();


             int seconds_in_hours = hours * 60 * 60;     //numarul de secunde trecute in ora citia de la miezul noptii
             int seconds_in_minutes = hours * 60;      // numarul de secunde trecute in minutele citite de la miezul noptii
             int result = seconds_in_hours + seconds_in_minutes + seconds;


             if (option == 1) {

                 System.out.println("The number of seconds passed since midnight is: " + result);
             }

             int seconds_in_a_day = 24 * 3600;   //numarul de secunde dintr-o zi
             if (option == 2) {
                 int seconds_remaining = seconds_in_a_day - result;
                 System.out.println("The number of seconds remaining untill midnight is: " + seconds_remaining);
             }


             if (option == 3) {
                 double percentage_passed = (result * 100) / seconds_in_a_day;
                 System.out.println("The percentage of time passed in the current day is: " + percentage_passed);  //procentajul de timp trecut in ziua curenta
             }

             System.out.println("Do you want another option?     Y/N ");
             Scanner go_back = new Scanner(System.in);
             back = go_back.next().charAt(0);
             if (back == 'Y') {
                 begin = true;
             } else
                 begin = false;

         }

         while (begin == true);


     }}