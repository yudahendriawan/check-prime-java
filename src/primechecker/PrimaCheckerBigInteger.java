/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primechecker;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class PrimaCheckerBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        boolean check;
        BigInteger number = new BigInteger(n);
        scanner.close();

        //    number.isProbablePrime(1);
        check = number.isProbablePrime(1);
        if (check) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
