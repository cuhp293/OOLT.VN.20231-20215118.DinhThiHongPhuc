// Exercise 6.4
import java.util.Scanner;
import java.util.Arrays;

public class DisplayDays {
    // Array of months have 31 days
    static String[] month_31 = {"January", "Jan", "Jan.", "1",
                "March", "Mar", "Mar.", "3",
                "May", "5",
                "July", "Jul", "Jul.", "7",
                "August", "Aug", "Aug.", "8",
                "October", "Oct", "Oct.", "10",
                "December", "Dec", "Dec.", "12"};
            
    // Array of months have 30 days
    static String[] month_30 = {"April", "Apr", "Apr.", "4",
                "June", "Jun", "Jun.", "6",
                "September", "Sep", "Sep.", "9",
                "November", "Nov", "Nov.", "11"};

    // Array of February
    static String[] february = {"February", "Feb", "Feb.", "2"};

    public static boolean checkMonth(String month){
        if (Arrays.asList(february).contains(month) || Arrays.asList(month_30).contains(month) || 
            Arrays.asList(month_31).contains(month)) {
            return true;
        }
            return false;
    }

    public static boolean checkYear(int year) {
        String Year = Integer.toString(year);
        if (Year.length() != 4)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int iYear;
        do {
            System.out.print("Enter year: ");
            iYear = keyboard.nextInt();
        } while (!checkYear(iYear));

        keyboard.nextLine();
        String month;
        do {
            System.out.print("Enter month: ");
            month = keyboard.nextLine();
        } while (!checkMonth(month));
        
        for(String i : month_31) {
            if(i.equals(month)) {
                System.out.println("Month: " + month + " (" + iYear + ") has 31 days.");
                System.exit(0);
            }
        }

        for(String i : month_30) {
            if(i.equals(month)) {
                System.out.println("Month: " + month + " (" + iYear + ") has 30 days.");
                System.exit(0);
            }
        }

        for(String i:february) {
            if((iYear % 4) == 0 || ((iYear%4==0) && (iYear%100!=0))) {
                System.out.println("Month: 2 ("+ iYear + ") has 29 days.");
                System.exit(0);
            }
            else
                System.out.println("Month: 2 ("+ iYear + ") has 28 days.");
            System.exit(0);
        }
    }
}