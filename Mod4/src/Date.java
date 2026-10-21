//Create a data type Date that represents a date. You should be able to create
// a new Date by specifying the month, day, and year. It should support methods
// to compute the number of days between two dates, return the day of the week that
// a day falls on, etc. The program should be named CustomDate.java.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Date {
    int[] MD = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        dateCheck(month,day);
    this.day = day;
    this.month = month;
    this.year = year;
    }
    public boolean dateCheck(int days,int month){
        if(month<1||month>12)return false;
        if(day<1|| day> MD[month-1])return false;
        return true;
    }
    public String dayOfTheWeek(int  month, int day,  int year){
        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek weekDay = date.getDayOfWeek();
        return weekDay.toString();
    }
    public int daysBetween(int  month1, int day1,  int year1, int  month2, int day2,  int year2){
        LocalDate date1 = LocalDate.of(month1, day1,year1);
        LocalDate date2 = LocalDate.of(month2, day2,year2);
         return (int) ChronoUnit.DAYS.between(date1,date2);
    }
}
/*
{
        String[] DOTW = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //month, date, year, week day
        int[] o = {1,1,2027,5};
        int x = 0;
        int time= 0;
        if(year>o[2]){
            x = 365*(year-o[2]-1);
            x += day;
            for(int i = 11;i > month+1;i--){
                x += MD[i];
            }
        } else if (year<o[0]) {
            time = 1;
            x = 365*(o[2]-year);
            x += MD[month]-day;
            for(int i = 0;i < month-1;i++){
                x += MD[i];
            }
        } else {
            x+=day;
            for(int i = 0;i < month-1;i++){
               x += MD[i];
            }
            if(time == 0) {
                if (x % 7 != 0) {
                    x %= 7;
                    if(x==1){
                        x = 6;
                    }else{
                        x--;
                    }
                } else {
                    return "Friday";
                }
            }else{
                if (x % 7 != 0) {
                    x %= 7;
                    if(x==1){
                        x = 4;
                    }else{
                        x++;
                    }
                } else {
                    return "Friday";
                }
            }
        }
        return DOTW[x];
    }
 */
