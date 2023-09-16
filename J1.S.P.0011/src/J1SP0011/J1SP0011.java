/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J1SP0011;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J1SP0011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose input base system:");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int inputBase = scanner.nextInt();
            
            if (inputBase == 4) {
                System.out.println("Exiting the program.");
                break;
            }
            
            System.out.println("Choose output base system:");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            System.out.print("Enter your choice: ");
            
            int outputBase = scanner.nextInt();
            
            System.out.print("Enter the input value: ");
            String inputValue = scanner.next();
            
            try {
                int decimalValue;
                switch (inputBase) {
                    case 1:
                        decimalValue = Integer.parseInt(inputValue, 2);
                        break;
                    case 2:
                        decimalValue = Integer.parseInt(inputValue);
                        break;
                    case 3:
                        decimalValue = Integer.parseInt(inputValue, 16);
                        break;
                    default:
                        System.out.println("Invalid input base choice.");
                        continue;
                }
                
                String result;
                switch (outputBase) {
                    case 1:
                        result = Integer.toBinaryString(decimalValue);
                        break;
                    case 2:
                        result = Integer.toString(decimalValue);
                        break;
                    case 3:
                        result = Integer.toHexString(decimalValue);
                        break;
                    default:
                        System.out.println("Invalid output base choice.");
                        continue;
                } 
                System.out.println("Equivalent output value: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input value. Please enter a valid value for the selected base system.");
            }
        }
    }
}
