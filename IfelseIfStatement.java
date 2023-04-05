package ConditionalStatement;

public class IfelseIfStatement {
    public static void main(String[] args) {

        // it works on the same principle as if-else statement however we can have multiple conditions.If the condition inside the if block is true, then the code inside the if block will be be executed, if it is false, the control will move to the else-if block and will check if it is true and execute the statement in the else if-block. when the condition in else-if block is false, it will execute the statement in the final else block.
        
        int marks = 35;
        if (marks > 80) {
            System.out.println("A");

        } else if (marks > 60) {
            System.out.println("B");

        } else if (marks > 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
