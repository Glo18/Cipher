import models.Cipher;

import java.util.Scanner;

public class App {

//    private static int keyDecrypt;

    public static void main(String[] args) {
//        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
//            String userEncrypt = myConsole.readLine();
            String userEncrypt = myScanner.nextLine();

            if (userEncrypt.equals("encrypt")) {
                System.out.println("Enter your statement:");
//                    String statement = myConsole.readLine();
                String statement = myScanner.nextLine();
                System.out.println("Enter encryption key:");
                int key = myScanner.nextInt();

                Cipher userEncryption = new Cipher(statement, key);
                String encryption = userEncryption.isEncrypted(statement, key);

                System.out.println("Your encrypted statement is: \n" + encryption);
            } else if (userEncrypt.equals("decrypt")) {
                System.out.println("Enter your statement:");
//                    String statementDecrypt = myConsole.readLine();
                String statementDecrypt = myScanner.nextLine();

                System.out.println("Enter decryption key:");
                int keyDecrypt = myScanner.nextInt();

                Cipher userDecryption = new Cipher(statementDecrypt, keyDecrypt);
                String decryption = userDecryption.toDecrypt(statementDecrypt, keyDecrypt);
                System.out.println("Your decrypted statement is: \n" + decryption);

            } else if (userEncrypt.equals("exit")) {
                System.out.println("Goodbye!");

                programRunning = false;

            }
        }

    }
}