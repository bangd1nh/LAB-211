/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0057;

/**
 *
 * @author admin
 */
public class J1SP0057 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createNewAccount();
                    break;
                case 2:
                    Manager.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
