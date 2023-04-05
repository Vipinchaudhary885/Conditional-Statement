package ConditionalStatement;

public class IfelseStatement {
    public static void main(String[] args) {

        // if-else statement.
        int marks = 20;
        if (marks > 33) {
            System.out.println("Passed");

        } else {
            System.out.println("Failed");
             // failed isliye print hua hai b/c the marks is not more than 33 i.e. the condition inside 'if' parentheses is false, the compiler jumps to the else part of the code and we get "failed" printed.
        }
    }
}
