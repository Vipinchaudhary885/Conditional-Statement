package ConditionalStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 100;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                // break is an very important keyword when we are implementing switch statement.
            case 2:
                System.out.println("Tuesdsy");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}
