/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0058;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Manager {
    
    public static void addWord(HashMap<String, String> hm){
        System.out.print("Enter Enlish: ");
        String english = Validation.checkInputString();
        if (hm.containsKey(english)) {
            if (!Validation.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = Validation.checkInputString();
        hm.put(english, vietnam);
        System.out.println("Add successful.");
    }
    
    public static void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString();
        hm.remove(english);
        System.out.println("Delete successful.");
    }
    
    public static void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString();
        if (hm.containsKey(english)){
            String value = hm.get(english);
            System.out.println("Vietnamese: "+value);
        }else
            System.out.println("Not found in data");
    }
    
    public static int menu() {
        System.out.println("1. Add new word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Search word.");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
}
