/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameisikukood;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NameIsikukood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя и фамилию: ");
        String firstname = scanner.next();
        String lastname = scanner.next();
        System.out.println("Введите личный код: ");
        String inputString = in.nextLine();
        System.out.println(""+firstname+" "+lastname+" родился "+inputString.substring(5,6)+""+inputString.substring(6,7)+
        "."+inputString.substring(3,4)+""+inputString.substring(4,5)+"."+inputString.substring(5,6)+""+inputString.substring(1,2)+""
        +inputString.substring(1,2)+""+inputString.substring(2,3)+"год");
    }
    
}
