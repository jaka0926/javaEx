package bank_system;

import java.util.Scanner;

public class BankSystem {
  public static void main(String[] args) {
    System.out.println("Welcome to JavaBank");
    boolean isRunning = true;
    while(isRunning) {
      System.out.println("_______________________________________________");
      System.out.println("How can we help you? (Input number between 1~5)");
      System.out.println("1: Open new account");
      System.out.println("2: Make Deposit");
      System.out.println("0: Exit");

      Scanner scanner = new Scanner(System.in);
      int inputNum = scanner.nextInt();

      switch (inputNum) {
        case 1:
          openAccount();
          break;
        case 2:
          System.out.println("Making deposit");
          break;
        case 0:
          isRunning = false;
          break;
        default:
          System.out.println("Error");
          break;
      }
    }
  }
  static void openAccount() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    User user = new User(name);
    System.out.print("Enter 6-digit birthday (yymmdd): ");
    int uID = scanner.nextInt();
    user.setuID(uID);
    System.out.print("Create 4-digit password for account: ");
    int uPW = scanner.nextInt();
    user.setuPW(uPW);
    user.setuAccNum((int)((Math.random() * 90000) + 10000));
    System.out.println("Your account has been opened as below");
    System.out.println(user.toString());
  }
}
