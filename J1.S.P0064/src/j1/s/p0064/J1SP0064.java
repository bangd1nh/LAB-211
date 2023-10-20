/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0064;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J1SP0064 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("======Validate Program======");
        System.out.print("Phone number:");
        while(true){
            String number = sc.next();
            if(ValidateManager.isValidNumber(number)!=null){
                if(ValidateManager.phoneNumber(number))
                    break;
            }
        }
        System.out.println("email:");
        while (true){
            String email = sc.next();
            if(ValidateManager.isValidGmail(email))
                break;
        }
        System.out.println("date: ");
        while(true){
            String date = sc.next();
            if(ValidateManager.isValidDate(date))
                break;
        }
    }
}
