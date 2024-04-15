public class Car {

  private String carType;
  private String brand;
  private String vin;
  private String stateNumber;

  private String oilType;
  private int year;
  private boolean isWorked;
  private String color;
  private double mileage;

  public Car() {
  }

  public Car(
      String carType, String brand, String vin, String stateNumber,
      String oilType, int year, boolean isWorked,
      String color, double mileage
  ) {
    this.carType = carType;
    this.brand = brand;
    this.vin = vin;
    this.stateNumber = stateNumber;
    this.oilType = oilType;
    this.year = year;
    this.isWorked = isWorked;
    this.color = color;
    this.mileage = mileage;
  }

  public String getCarType() {
    return carType;
  }

  public String getBrand() {
    return brand;
  }

  public String getOilType() {
    return oilType;
  }

  public int getYear() {
    return year;
  }

  public boolean isWorked() {
    return isWorked;
  }

  public String getColor() {
    return color;
  }

  public double getMileage() {
    return mileage;
  }

  public String getVin() {
    return vin;
  }

  public String getStateNumber() {
    return stateNumber;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public void setStateNumber(String stateNumber) {
    this.stateNumber = stateNumber;
  }

  public void setOilType(String oilType) {
    this.oilType = oilType;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setWorked(boolean worked) {
    isWorked = worked;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setMileage(double mileage) {
    this.mileage = mileage;
  }
}
