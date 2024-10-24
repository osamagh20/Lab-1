import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Q - 1 :
        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
        System.out.println(firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
        System.out.println(firstNumber+" X "+secondNumber+" = "+(firstNumber*secondNumber));
        System.out.println(firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber));
        System.out.println(firstNumber+" mod "+secondNumber+" = "+(firstNumber%secondNumber));*/

        /*Q - 2 : 2. Write a Java program that takes a number as input and prints its multiplication table up to
        10.

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num+" X "+i+" = "+num*i);

        }*/

       /*
       Q - 3 : 3. Write a Java program to print the area and perimeter of a circle.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);*/

        /*Q - 4 : 4. Java program to find out the average of a set of integers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of numbers:");
        int count = scanner.nextInt();

        double total = 0.0;
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter an integer: ");
            int num = scanner.nextInt();
            total = total+num;


        }
        System.out.println("The average is: "+total/count);*/

       /* Q - 5 : 5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number : ");
        int num3 = scanner.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            int total = num1 + num2 ;
            System.out.println("The result is : " + (total == num3));

        }*/
/*

        Q - 6 : 6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String str1 = scanner.nextLine();


        for (int i = str1.length()-1; i <= str1.length(); i--) {
            String str2 = str1.charAt(i) + "";
            if(i == str1.length()-1){
                System.out.print("Reverse word: ");

            }
            System.out.print(str2);
            if (i <= 0){
                break;
            }
        }
*/
        /*
        Q - 7 : Java program to check whether the given number is even or odd

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if(num % 2 !=0){
            System.out.println("The number is Odd");
        }else{
            System.out.println("The number is Even");

        }*/
/*

        Q - 8 : 8 - Java program to convert the temperature in Centigrade to Fahrenheit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Centigrade: ");
        double temp = scanner.nextDouble();
        double temp_feh = (temp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + temp_feh);
*/
        /*Q - 9 : 9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        System.out.println("Input a number:");
        int index = scanner.nextInt();
        System.out.println(str.charAt(index));
*/


       /* Q - 10 : 10. Write a Java program to print the area and perimeter of a rectangle.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Width = ");
        double width = scanner.nextDouble();
        System.out.print("Height = ");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width+ height);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
*/

/*
        Q - 11 :  Write a Java program to compare two numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Input second integer: ");
        int secondInt = scanner.nextInt();
        if (firstInt == secondInt ) {
            System.out.println(firstInt + " = " + secondInt);
            if(firstInt >= secondInt) {
                System.out.println(firstInt + " >= " + secondInt);
            } else if (firstInt <= secondInt) {
                System.out.println(secondInt + " <= " + firstInt);
            }

        }else if(firstInt < secondInt) {
                System.out.println(firstInt + " != " + secondInt);
                System.out.println(firstInt + " < " + secondInt);
                if(firstInt <= secondInt) {
                    System.out.println(firstInt + " <= " + secondInt);
                }
        }else if(secondInt < firstInt) {
                System.out.println(secondInt + " != " + firstInt);
                System.out.println(secondInt + " < " + firstInt);
                if(secondInt <= firstInt) {
                    System.out.println(secondInt + " <= " + firstInt);
                }
        } else if (firstInt  > secondInt) {
                System.out.println(firstInt + " != " + secondInt);
                System.out.println(firstInt + " > " + secondInt);
                if(firstInt  >= secondInt) {
                    System.out.println(firstInt + " >= " + secondInt);
                }
            }
*/


/*
        Q - 12 : 12. Write a Java program to convert seconds to hours, minutes and seconds.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsLeft = seconds % 60;
        System.out.println("Time: " + hours+":"+minutes+":"+secondsLeft);
        */
/*
        Q - 13 : 13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Input fourth number: ");
        int fourthNumber = scanner.nextInt();

        if(firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber) {
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal!");
        }*/
/*
        Q - 14 : 14. Write a Java program that reads an integer and check whether it is negative, zero, or
        positive.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Number is positive");
        }else if(number < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }*/

        /*
        Q - 15 : 15.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 ,Don’t count -1).

        int number;
        int posTotal = 0;
        int negTotal = 0;
        int zeroTotal = 0;
        do {
            System.out.println("Please enter number or -1 for Exit ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if(number > 0){
                posTotal ++;
            }else if(number < 0 && number != -1){
                negTotal ++;
            }else if(number == 0){
                zeroTotal ++;

            }

        } while (number != -1);

        System.out.println(posTotal+" positives");
        System.out.println(zeroTotal+" zero");
        System.out.println(negTotal+" negatives");*/

/*
        Q - 16 : 16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = scanner.nextLine();


        for (int i = num.length()-1; i <= num.length(); i--) {
            String num2 = num.charAt(i) + "";
            if(i == num.length()-1){
                System.out.print("Reverse number: ");

            }
            System.out.print(num2);
            if (i <= 0){
                break;
            }
        }*/

      /*  Q - 17 : 17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.

        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = 0;
        int smallest = 0;
        do{
            System.out.println("Enter number or 0 for exit : ");
            number = scanner.nextInt();

            if(number > 0){
                if(number > largest){
                    largest = number;
                }else if(number < smallest){
                    smallest = number;
                }

            }else if(number < smallest){
                smallest = number;
            }

        }while(number != 0);
        System.out.println("The largest number is : " + largest);
        System.out.println("The smallest number is : " + smallest);

*/

        /*
        Q - 18 : 18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        int count=0 ;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Number of a's: "+count);
        */


    }
    }
