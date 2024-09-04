package bank_system;
import java.util.Date;

public class Account {
  int accNum;
  int accPW;
  Date accOpenDate;
  double accBalance = 0.0;

  public void setAccPW(int accPW) {
    this.accPW = accPW;
  }

  public void setAccNum(int accNum) {
    this.accNum = accNum;
  }

  public void setAccOpenDate(Date accOpenDate) {
    this.accOpenDate = accOpenDate;
  }

  public void deposit(double amount) {
    accBalance += amount;
  }

  public void withdraw(double amount) {
    accBalance -= amount;
  }

  @Override
  public String toString() {
    return "\n--Account number: " + accNum
        + "\n--Password: " + accPW
        + "\n--Account open date: " + accOpenDate;
  }
}
