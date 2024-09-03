package bank_system;

public class User {
  public String name;
  int uID;
  Account account;

  public User(String name) {
    this.name = name;
  }

  public void setuID(int uID) {
    this.uID = uID;
  }

  public void openAccount() {
    account = new Account();
  }
}
