package ConditionalStatement;

public class NestedIfElseStatement {
    // yani if-else statement ke andar ek or if-else statement.
    public static void main(String[] args) {
        int marks = 81;
        if (marks > 33) {
            if (marks > 80) {
                System.out.println("gracefully");
            }
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}