package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;

        expression = scanner.next();
        scanner.close();

        int i = 0;

        for (; i < expression.length(); i++){
            if(expression.charAt(i) == '+'){
                System.out.print(" mais ");
            } else  if(expression.charAt(i) == '-'){
                System.out.print(" menos ");
            } else  if(expression.charAt(i) == '/'){
                System.out.print(" dividido ");
            } else  if(expression.charAt(i) == '*'){
                System.out.print(" multiplicado ");
            } else {
                System.out.print(expression.charAt(i));
            }
        }
    }

}