/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0064;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class ValidateManager {
    static Scanner sc = new Scanner (System.in);
    public static boolean phoneNumber(String number){
        String phoneNumberRegex = "^09\\d{8}$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(number);
        if(matcher.matches()){
            return true;
        }
        else{
            System.out.println("must be 10 digits and begin with 09");
            return false;
        }
    }
    public static String isValidNumber(String input) {
        String regex = "^[0-9]+$"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            return input;
        else
            return null;
    }
    public static boolean isValidGmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        else{
            System.out.println("Email must is correct format (@gmail.com)");
            return false;
        }
    }
    public static boolean isValidDate(String date){
        String format = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);

        try {
            sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Date to correct format(dd/mm/yyyy)");
            return false;
        }
        return true;
    }
}
