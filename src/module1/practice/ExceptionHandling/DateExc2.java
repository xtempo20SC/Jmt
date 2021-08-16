package module1.practice.ExceptionHandling;

//public class DateExc2 {
//
//}

import java.util.Scanner;
class MonthException extends Exception{
public MonthException(String message){
 super(message); 
}
} 
class DayException extends Exception{
public DayException(String message){
 super(message);
}
}
class YearException extends Exception{
public YearException(String message){
 super(message);
}
}
public class DateExc2{
 public static void main(String[] args) {
 int monthnum;
 int monthDays=0;
 String monthName="";
 String date="";
 Scanner input=new Scanner(System.in);
 System.out.println("Please enter a date in this format: Month/Day/Year.");
 date=input.next();
 String[] pars=date.split("/");
 int month=Integer.parseInt(pars[0]);
 int day=Integer.parseInt(pars[1]);
 int year=Integer.parseInt(pars[2]); 
 System.out.println(month+" "+day+" "+year);
switch(month){
 
 case 1:
    monthName="January";
    monthDays=31;
    break;
 case 2:
    monthName="February";
    monthDays=28;
    break;
 case 3:
    monthName="March";
    monthDays=31;
    break;
 case 4:
    monthName="April";
    monthDays=30;
    break;
 case 5:
    monthName="May";
    monthDays=31;
    break;
 case '6':
    monthName="June";
    monthDays=30;
    break;
 case 7:
     monthName="July";
     monthDays=31;
     break;
 case '8':
     monthName="August";
     monthDays=31;
     break;
 case '9':
     monthName="September";
     monthDays=30;
     break;
 case 10:
    monthName="October";
    monthDays=31;
    break;
 case 11:
    monthName="November"; 
    monthDays=30;
    break;
 case 12:
    monthName="December";
    monthDays=31;
    break;
// default:
// System.out.println("Not valid.");
 }
System.out.println(monthDays+" "+monthName);

 while(true){
 try{
 if(month<=1||month>=12){
 throw new MonthException("The month must be numbers 1-12.");
 }
 else{
 break;
 }
 }
 catch(MonthException e){
 System.out.println("Please enter a valid month: ");
 month=input.nextInt();
 continue;
 }
 }
 while(true){
 try{
 if(day<=1||day>=monthDays){
 throw new DayException("That day does not exist in this month.");
 }
 else{
 break;
 }
 }
 catch(DayException e){  
 System.out.println("Please enter a valid day: "); 
 day=input.nextInt();
 continue;
 }
 }
 while(true){
 try{
 if(year<=1000||year>=3000){
 throw new YearException("The year must be between 1000 and 3000.");
 }
 else{
 break;
 }
 }
 catch(YearException e){
 System.out.println("Please enter a valid year: ");
 year=input.nextInt();
 continue;
 }
 }
 System.out.println("The date conversion is: " + monthName+ " " + day + ", " + year);
 }
}
