import java.util.Scanner;

public class leapYear{
    public static void main(String[] args){
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("enter a year: ");
        year = input.nextInt();

        if (year%400==0)
        {
            System.out.println(year+" is a leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

    }
}
