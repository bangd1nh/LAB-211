package common;

import java.io.File;
import java.util.Scanner;

public class Library {

    private final Scanner sc = new Scanner(System.in);

    public int getInt(String prompt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(prompt);
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        return a;
    }

    public String inputString(String message ) {
        System.out.print(message );
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.err.println("Not empty!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

public double checkInputDouble(String prompt ) {
        //loop until user input correct
        while (true) {
            System.out.print(prompt );
            try {
                double result = Double.parseDouble(sc.nextLine());
                if(result > 0) {
                    return result;
                }
                else {
                    return 0;
                }
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }
    
    public String checkInputPathFile(String promt) {
        System.out.print(promt);
        while (true) {
            String result = sc.nextLine().trim();
            File file = new File(result);
            //check file exist or not and path must be file
            if (!file.exists() || !file.isFile()) {
                System.err.println("Path doesn't exist");
                System.out.print("Enter again: ");
            }
            else {
                return result;
            }
        }
    }
    public boolean checkInputYN(String message) {
    while (true) {
        System.out.print(message);
        String result = sc.nextLine();
        if (result.equalsIgnoreCase("Y")) {
            return true; 
        } else if (result.equalsIgnoreCase("N")) {
            return false; 
        } else {
            System.err.println("Please input 'Y' or 'N'.");
            System.out.print("Enter again: ");
        }
    }
}


}
