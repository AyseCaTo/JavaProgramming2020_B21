package day29_Methods;

public class Calculator {

    public static void main(String[] args) {

        calculator(3,'*',7);
        calculator(90,'%',8);
        calculator(100,'#',70);
    }

    public static void calculator(int n1, char operator, int n2){
        boolean isValidOperator = operator=='+' || operator=='-' ||operator=='*' ||operator=='/' ||operator=='%';
        if (isValidOperator){
            switch (operator){
                case '+':
                    System.out.println("sum of two numbers is: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("subtraction of two numbers is: " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("multiplication of two numbers is: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("division of two numbers is: " + (n1 / n2));
                    break;
                default:
                    System.out.println("remainder of two numbers is: " + (n1 % n2));
                    break;
            }

        }else{
            System.err.println("Invalid Operator!");
        }
    }
}
/*
create a function for the calculator.
                parameters:
                        int n1
                        int n2
                        char operator
 */