/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0057;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Manager {
      public static int menu() {
        System.out.println("1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 3);
        return choice;
    }

    //create a new account
    public static void createNewAccount() {
        if (!Validate.checkFileExist()) {
            return;
        }
        String username = Validate.checkInputUsername();
        String password = Validate.checkInputPassword();
        if (!Validate.checkUsernameExist(username)) {
            System.err.println("Username exist.");
            return;
        }
        addAccountData(username, password);
    }

    public static void loginSystem() {
        if (!Validate.checkFileExist()) {
            return;
        }
        String username = Validate.checkInputUsername();
        String password = Validate.checkInputPassword();
        if (!Validate.checkUsernameExist(username)) {
            if (!password.equalsIgnoreCase(passwordByUsername(username))) {
                System.err.println("Password incorrect.");
            }
            System.err.println("Login success.");
        }
    }

    public static void addAccountData(String username, String password) {
        File file = new File("D:/LAB211/J1.S.P0057/user.dat");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(username + ";" + password + "\n");
            fileWriter.close();
            System.err.println("Create successly.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String passwordByUsername(String username) {
        File file = new File("D:/LAB211/J1.S.P0057/user.dat");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] account = line.split(";");
                if (username.equalsIgnoreCase(account[0])) {
                    return account[1];
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
