package objectPackage;

class Phone {
  // 필드
  private String model;
  private int price;
  //메서드
  void print() {
    System.out.println(price + "원 모델, " + model + " 휴대폰입니다");
  }

  public String getModel() {
    return model;
  }
  public void setModel(String modelName) {
    model = modelName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
