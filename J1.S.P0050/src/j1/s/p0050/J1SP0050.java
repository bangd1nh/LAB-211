/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0050;

/**
 *
 * @author admin
 */
public class J1SP0050 {

    /**
     * @param args the command line arguments
     */
    static Validation vl = new Validation();
    public static void main(String[] args) {
        
        boolean exit = true;
        while (exit){
            System.out.println("========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            int n = vl.inputInt("enter your choise", 1, 3);
            switch (n){
                case 1:
                    calculateEquation();
                    break;
                case 2:
                    quadraticEquation();
                    break;
                case 3:
                    exit = false;
                    break;
            }
        }
    }
    //Calculate Superlative Equation
    public static void calculateEquation(){
        float a = vl.inputFloat("Enter A",0,1000);
        float b = vl.inputFloat("Enter B",0,1000);
        float x = -b /a;
        System.out.println("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if(!checkEven(a))
            System.out.print(a+" ");
        if(!checkEven(b))
            System.out.print(b+" ");
        if(!checkEven(x))
            System.out.println(x+" ");
        System.out.println("Number is even: ");
        if (checkEven(a))
            System.out.print(a+" ");
        if (checkEven(b))
            System.out.print(b+" ");
        if (checkEven(x))
            System.out.print(x+" ");
        System.out.println("Number is perfect square: ");
        if (checkSquareNumber(a))
            System.out.print(a+" ");
        if (checkSquareNumber(b))
            System.out.print(b+" ");
        if (checkSquareNumber(x))
            System.out.print(x+" ");
        System.out.println("");
    }
    public static boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }
    public static void quadraticEquation(){
        float a = vl.inputFloat("Enter A",0,1000);
        float b = vl.inputFloat("Enter B",0,1000);
        float c = vl.inputFloat("Enter c",0,1000);
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (!checkEven(a))
            System.out.print(a + " ");
        if (!checkEven(b))
            System.out.print(b + " ");
        if (!checkEven(c))
            System.out.print(c + " ");
        if (!checkEven(x1))
            System.out.print(x1 + " ");
        if (!checkEven(x2)) 
            System.out.print(x2 + " ");
        System.out.println();
        System.out.print("Number is even: ");
        if (checkEven(a))
            System.out.print(a + " ");
        if (checkEven(b))
            System.out.print(b + " ");
        if (checkEven(c))
            System.out.print(b + " ");
        if (checkEven(x1))
            System.out.print(x1 + " ");
        if (checkEven(x2))
            System.out.print(x1 + " ");
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a))
            System.out.print(a + " ");
        if (checkSquareNumber(b))
            System.out.print(b + " ");
        if (checkSquareNumber(c))
            System.out.print(c + " ");
        if (checkSquareNumber(x1))
            System.out.print(x1 + " ");
        if (checkSquareNumber(x2))
            System.out.print(x2 + " ");
        System.out.println("");
    }
}
