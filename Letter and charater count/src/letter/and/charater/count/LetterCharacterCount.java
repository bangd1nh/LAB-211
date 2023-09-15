/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letter.and.charater.count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LetterCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Map<Character, Integer> charCounts = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + c + "': " + count);
        }
    }
}
