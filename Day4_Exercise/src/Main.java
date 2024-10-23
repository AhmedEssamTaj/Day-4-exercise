import java.util.Scanner;

/*
Author: Ahmed Essam Taj
Date: 23, October
Day 4 Exercise

 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*
        Q1 /Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.

 */
        // ===== answer Q1 ==============
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("i = " + i);
            }
        }

     /*
        Q2 /Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.

 */

        // ===== answer Q2 ==============
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        int temp = sentence.length();
        int count = temp;
        String reversedSentence = "";
        do {
            char ch = sentence.charAt(count - 1);
            reversedSentence += ch;
            count--;
        } while (count > 0);
        System.out.println(reversedSentence);


   /*
        Q3 /Write a program to find the factorial value of any number entered
through the keyboard.

 */

        // ===== answer Q3 ==============

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i > 0; i--) {

            factorial *= i;

        }
        System.out.println("Factorial of " + number + " is :" + factorial);

 /*
        Q4 /Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)

 */

        // ===== answer Q4 ==============

        System.out.println("Enter the base (number) : ");
        int base = scanner.nextInt();
        System.out.println("Enter the power : ");
        int powerNum = scanner.nextInt();

        int pow = 1;

        for (int i = 0; i < powerNum; i++) {
            pow = pow * base;
        }
        System.out.println(base + " Power " + powerNum + " = " + pow);


 /*
        Q5 / Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.

 */

        // ===== answer Q5 ==============
        int sumEven = 0;
        int sumOdd = 0;
        int num = 0;
        do {
            System.out.println("Enter a number or (0) to quit: ");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        } while (num != 0);
        System.out.println("Sum of even numbers is : " + sumEven);
        System.out.println("Sum of odd numbers is : " + sumOdd);


         /*
        Q6 / Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.

 */

        // ===== answer Q6 ==============
        System.out.println("enter a positive number");
        int posNum = scanner.nextInt();

        if (posNum <= 1) {
            System.out.println("Not a prime number");
        } else {
            boolean isPrime = true;


            for (int cont = 2; cont < posNum; cont++) {
                if (posNum % cont == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not Prime number");
            }
        }


         /*
        Q7 / Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week

 */

        // ===== answer Q7 ==============

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day " + j);

            }
        }

  /*
        Q8 / Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left

 */

        // ===== answer Q8  ==============
        scanner.nextLine();
        System.out.println("enter a string: ");
        String str = scanner.nextLine();
        String reversedSentenceQ8 = "";

        for (int i = str.length(); i > 0; i--) {
            char ch = str.charAt(i - 1);
            reversedSentenceQ8 += ch;
        }


        if(reversedSentenceQ8.equals(str)){
            System.out.println("string is a palindrome");
        }else{
            System.out.println("string is not a palindrome");
        }


    }
}