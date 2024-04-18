public class AutoPark {




  private Car[] garage = new Car[100];

  private Driver[] drivers = new Driver[200];


  public Car getCarByVin(String vin) {
    for (Car element : garage) {
      if (element != null &&
          (element.getVin() == vin )
      ) {
        return element;
      }
    }
    return null;
  }

  public void addCar(Car car) {
    for (int i = 0; i < this.garage.length; i++) {
      if (garage[i] == null) {
        garage[i] = car;
        return;
      }
    }
  }
  public void addDriver(Driver driver){
    for (int i = 0; i < this.drivers.length; i++) {
      if (drivers [i] == null){
        drivers[i] = driver;
        return;
      }

    }
  }

  public void SearchDriverFIO(Driver driver) {
    for (int i = 0; i < this.drivers.length; i++) {
      if (drivers[i] == null) {
        drivers[i] = driver;
        return;
      }
    }
  }


  public Car[] getGarage() {
    return garage;
  }

  public Driver[] getDrivers() {
    return drivers;
  }
}
