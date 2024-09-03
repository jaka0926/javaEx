package bank_system;

import java.util.*;

public class BankSystem {
  public static void main(String[] args) {
    System.out.println("Welcome to JavaBank");
    Scanner scanner = new Scanner(System.in);
    Map<Integer, User> userList = new HashMap<>();
    User loginUser = null;
    boolean isRunning = true;
    boolean loggedIn = false;
    while (!loggedIn) {
      System.out.println("(1): Register");
      System.out.println("(2): Login");
      System.out.println("(0): Exit");
      System.out.print("Input here -> ");

      int inputNum = scanner.nextInt();
      switch (inputNum) {
        case 1:
          System.out.println("--User registration--");
          User user = register();
          int userName = user.uID;
          userList.put(userName, user);
          break;
        case 2:
          loginUser = login(userList);
          System.out.println("Login user: " + loginUser);
          if (loginUser != null) {
            loggedIn = true;
          }
          break;
        case 0:
          loggedIn = true;
          isRunning = false;
          break;
        default:
          System.out.println("Invalid input (Input number between 0~2)");
      }
    }
    System.out.println("--Login successful--");

    while(isRunning) {
      System.out.println("_______________________________________________");
      System.out.println("How can we help you? (Input number between 0~5)");
      System.out.println("(1): Open new account");
      System.out.println("(2): Check balance");
      System.out.println("(3): Make deposit");
      System.out.println("(4): Withdraw money");
      System.out.println("(5): Delete account");
      System.out.println("(0): Exit");
      System.out.print("Input here -> ");

      int inputNum = scanner.nextInt();

      switch (inputNum) {
        case 1:
          openNewAccount(loginUser);
          break;
        case 2:
          if (loginUser.account == null) {
            System.out.println("!--No account found, open account first--!");
            break;
          }
          checkBalance(loginUser);
          break;
        case 3:
          if (loginUser.account == null) {
            System.out.println("!--No account found, open account first--!");
            break;
          }
          deposit(loginUser);
          break;
        case 4:
          if (loginUser.account == null) {
            System.out.println("!--No account found, open account first--!");
            break;
          }
          withdraw(loginUser);
          break;
        case 5:
          break;
        case 0:
          isRunning = false;
          break;
        default:
          System.out.println("Invalid input (Input number between 0~5)");
          break;
      }
    }
  }
  static User register() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    String userName = scanner.nextLine();
    User user = new User(userName);
    System.out.print("Enter user ID number(6-digit): ");
    int userID = scanner.nextInt();
    user.setuID(userID);
    return user;
  }

  static User login(Map userList) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter user ID number(6-digit): ");
    int userID = scanner.nextInt();
    if (userList.containsKey(userID)) {
      return (User) userList.get(userID);
    }
    System.out.println("!---User not found, try again---!");
    return null;
  }

  static void openNewAccount(User user) {
    user.openAccount();
    Scanner scanner = new Scanner(System.in);
    System.out.println("--Creating new account--");
    System.out.print("Create 4-digit password for account: ");
    int uPW = scanner.nextInt();
    user.account.setAccPW(uPW);
    user.account.setAccNum((int)((Math.random() * 90000) + 10000));
    user.account.setAccOpenDate(new Date());
    System.out.println("Your account has been opened as below");
    System.out.println(user.account.toString());
  }

  static void checkBalance(User user) {
    Scanner scanner = new Scanner(System.in);
    boolean pwValid;
    System.out.print("Enter account number: ");
    int inputID = scanner.nextInt();
    if (inputID == user.account.accNum) {
      System.out.print("Enter password: ");
      int inputPW = scanner.nextInt();
      pwValid = passwordValidation(user, inputPW);
      if (pwValid) {
        System.out.println("Your account balance is: " + user.account.accBalance + "$");
      }
      else {
        System.out.println("!---Invalid password, try again---!");
      }
    }
    else {
      System.out.println("!---Invalid account number, try again---!");
    }
  }

  static boolean passwordValidation(User user, int inputPW) {
    return inputPW == user.account.accPW;
  }

  static void deposit(User user) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter account number: ");
    int inputID = scanner.nextInt();
    if (inputID == user.account.accNum) {
      System.out.print("Enter deposit amount($): ");
      double amount = scanner.nextDouble();
      user.account.deposit(amount);
      System.out.println("Deposited " + amount + "$ to account: " + user.account.accNum);
      System.out.println("Current account balance: " + user.account.accBalance);
    }
    else {
      System.out.println("!---Invalid account number, try again---!");
    }
  }
  static void withdraw(User user) {
    Scanner scanner = new Scanner(System.in);
    boolean pwValid;
    System.out.print("Enter account number: ");
    int inputID = scanner.nextInt();
    if (inputID == user.account.accNum) {
      System.out.print("Enter password: ");
      int inputPW = scanner.nextInt();
      pwValid = passwordValidation(user, inputPW);
      if (pwValid) {
        System.out.println("Account balance: " + user.account.accBalance + "$");
        System.out.print("Enter withdrawal amount($): ");
        double amount = scanner.nextDouble();
        if (amount > user.account.accBalance) {
          System.out.println("!---Entered amount is greater than account balance, try again---!");
        }
        else {
          user.account.withdraw(amount);
          System.out.println("Withdrew " + amount + "$ from account: " + user.account.accNum);
          System.out.println("Your account balance is: " + user.account.accBalance + "$");
        }
      }
      else {
        System.out.println("!---Invalid password, try again---!");
      }
    }
    else {
      System.out.println("!---Invalid account number, try again---!");
    }
  }
}
