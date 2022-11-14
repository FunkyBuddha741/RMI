package RMI;

import java.io.*;
import java.io.BufferedReader;
import java.rmi.Naming;

public class Client {
    public static void main(String args[]) throws Exception
    {

        AddI stub = (AddI) Naming.lookup("rmi://localhost:5000/operators");

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        for(;;)

        {
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - GCD");
            System.out.println("6 - LCM");


            System.out.println("7 - Exit"); System.out.println();

            System.out.println("Enter Choice: ");

            String line = d.readLine();

            Integer choice = Integer.valueOf(line);

            int value = choice.intValue();

            int num1 = 0;
            int num2 = 0;

            switch(value)
            {
                case 1:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1= choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.add(num1, num2));
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1= choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.sub(num1, num2));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1 = choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.mul(num1, num2));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1 = choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.div(num1, num2));
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1 = choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.gcd(num1, num2));
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Number1: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num1 = choice.intValue();

                    System.out.println("Number2: ");
                    line = d.readLine(); System.out.println();
                    choice = new Integer (line);
                    num2 = choice.intValue();

                    // Call Remote Method

                    System.out.println("Answer: " + stub.lcm(num1, num2));
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;

                default :
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
