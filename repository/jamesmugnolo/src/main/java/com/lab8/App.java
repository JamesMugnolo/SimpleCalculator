package com.lab8;
import java.util.Scanner;
import java.util.StringTokenizer;
public class App {

    public static void main(String[] args) {
        Calculator math = new Calculator();
        float op1;
        String operator;
        float op2;
        String equation;
        StringTokenizer equTokens;
        String continueInput;
        StringTokenizer contInputTokens;
        int isEquationlooping = 1;
        boolean isEndInputlooping = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App.");

        while(isEquationlooping != 0) {
            System.out.println("\nOperations supported: addition, subtraction, multiplication, and division.");
            System.out.println("Please enter your equation [number1 operator number2]:");
            try {
                equation = scanner.nextLine();
                equTokens = new StringTokenizer(equation);
                if(equTokens.countTokens() < 3)
                    throw new TooFewArgsException();
                if(equTokens.countTokens() > 3)
                    throw new TooManyArgsException();
                
                op1 = Float.parseFloat(equTokens.nextToken());
                operator = equTokens.nextToken();
                op2 = Float.parseFloat(equTokens.nextToken());

                if(operator.equals("+")) 
                    System.out.println(math.Add(op1, op2));
                else if(operator.equals("-")) 
                    System.out.println(math.Subtract(op1, op2));
                else if(operator.equals("*")) 
                    System.out.println(math.Multiply(op1, op2));
                else if(operator.equals("/")) 
                    System.out.println(math.Divide(op1, op2));
                else 
                    throw new InvalidOpperationTypeException();

            } catch (NumberFormatException e) {
                System.out.println("Incorect Input Format! Please follow the format of [number1 operator number2] \n");
            } catch (TooFewArgsException e) {
                System.out.println(e.toString());
            } catch (TooManyArgsException e) {
                System.out.println(e.toString());
            } catch (InvalidOpperationTypeException e) {
                System.out.println(e.toString());
            }

            isEndInputlooping = true;
            while(isEndInputlooping) {
                try {
                    System.out.println("Enter 0 to exit; enter any other number to continue:");
                    continueInput = scanner.nextLine();
                    contInputTokens = new StringTokenizer(continueInput);
                    if(contInputTokens.countTokens() > 1)
                        throw new TooManyArgsException();
                    if(contInputTokens.countTokens() < 1)
                        throw new TooFewArgsException();
                    isEquationlooping = Integer.parseInt(contInputTokens.nextToken());
                    isEndInputlooping = false;
                } catch (NumberFormatException e) {
                    System.out.println("\nIncorrect Input Format! please enter a number!");
                    isEndInputlooping = true;
                } catch (TooFewArgsException e) {
                    System.out.println(e.toString());
                    isEndInputlooping = true;
                } catch (TooManyArgsException e) {
                    System.out.println(e.toString());
                    isEndInputlooping = true;
                }
            }

        }
        scanner.close();
    }
}
