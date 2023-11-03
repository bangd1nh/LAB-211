/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0079;

import static j1.s.p0079.Validation.checkIntLimit;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class printMenu {
    public void printMain() throws IOException {
        Manager man = new Manager();
        while (true) {
            System.out.println("1. Compression");
            System.out.println("2. Extraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choose = checkIntLimit(1, 3);
            switch (choose) {
                case 1:
                    man.zipFile();
                    break;
                case 2:
                    man.unzipFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
