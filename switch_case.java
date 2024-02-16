import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        int dayOfWeek;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day of week");
        dayOfWeek = scan.nextInt();
        switch(dayOfWeek) {
            case 1 : System.out.println("Sunday");
                break;
            case 2 : System.out.println("Monday");

            case 3 : System.out.println("Tuesday");
                break;
            case 4 : System.out.println("Wednesday");
                break;
            case 5 : System.out.println("Thursday");
                break;
            case 6 : System.out.println("Friday");
                break;
            case 7 : System.out.println("Saturday");
                break;
            default :
                System.out.println("Invalid day");
        }
        int someNum = 2;
        switch(someNum)
        { case 1 :
            case 2 : case 3 :
            System.out.println("Some logic for 1 or 2 or 3");
            break; case 4 : case 5 : case 6 :
            System.out.println("Some logic for 4 or 5 or 6");
            break;
        }
    }
} 