package passbyvalue;

public class Car {
     String brand;
     String model;
     int year;
     boolean hybrid;

     public  void hareket(){
          System.out.println(brand+ " " +model+" hizli hareket eder! ");
     }
     public void dur(){
          System.out.println(brand + " fireni durdu");
     }

     public Car(String brand, String model, int year, boolean hybrid){
          this.brand = brand;
          this.model = model;
          this.year = year;
          this.hybrid = hybrid;

     }

     public Car(String brand, String model) {
          this.brand = brand;
          this.model = model;
     }

     public Car(String brand, int year) {
          this.brand = brand;
          this.year = year;
     }

     public Car(String brand, boolean hybrid) {
          this.brand = brand;
          this.hybrid = hybrid;
     }

     public Car(int year, boolean hybrid) {
          this.year = year;
          this.hybrid = hybrid;
     }

     public Car(String brand, String model, int year) {
          this.brand = brand;
          this.model = model;
          this.year = year;
     }

     public Car(String brand, int year, boolean hybrid) {
          this.brand = brand;
          this.year = year;
          this.hybrid = hybrid;
     }


     @Override
     public String toString() {
          return "Car{" +
                  "brand='" + brand + '\'' +
                  ", model='" + model + '\'' +
                  ", year=" + year +
                  ", hybrid=" + hybrid +
                  '}';
     }
}
