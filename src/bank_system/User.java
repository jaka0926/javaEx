package bank_system;

public class User {
  String name;
  int uID;
  int uPW;
  int uAccNum;
  boolean uAccPauseStatus = true;

  public User(String name) {
    this.name = name;
  }

  public void setuID(int uID) {
    this.uID = uID;
  }

  public void setuPW(int uPW) {
    this.uPW = uPW;
  }

  public void setuAccNum(int uAccNum) {
    this.uAccNum = uAccNum;
  }

  public void setuAccPauseStatus(boolean uAccPauseStatus) {
    this.uAccPauseStatus = uAccPauseStatus;
  }

  @Override
  public String toString() {
    return "--User name: " + name
        + "\n--User ID: " + uID
        + "\n--Password: " + uPW
        + "\n--Account number: " + uAccNum;
  }
}
