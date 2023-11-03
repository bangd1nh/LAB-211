/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0079;

import static j1.s.p0079.Manager.unzipFile;
import static j1.s.p0079.Manager.zipFile;
import static j1.s.p0079.Validation.checkIntLimit;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class printMenu {
    public static void printMain() throws IOException {
        while (true) {
            System.out.println("1. Compression");
            System.out.println("2. Extraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choose = checkIntLimit(1, 3);
            switch (choose) {
                case 1:
                    zipFile();
                    break;
                case 2:
                    unzipFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
