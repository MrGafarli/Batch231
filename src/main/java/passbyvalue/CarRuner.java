package passbyvalue;

public class CarRuner {
    public static void main(String[] args) {
        Car araba = new Car("Hyundai", "Elantra", 2015, false);

        System.out.println(araba.brand);
        System.out.println("araba.model = " + araba.model);
        System.out.println("araba.year = " + araba.year);
        if (araba.hybrid==false){
            System.out.println("Elantra hibrid deyil!");
        }

        araba.hareket();
        araba.dur();
        System.out.println("---------------------");
        Car araba2 = new Car("Toyoto","Camry",2023,true);
        System.out.println("araba2.brand = " + araba2.brand);
        System.out.println("araba2.model = " + araba2.model);
        System.out.println("araba2.year = " + araba2.year);
        System.out.println("araba2.hybrid = " + araba2.hybrid);
        System.out.println(araba);
        System.out.println(araba2);

        Car c1 = new Car("BMW",2020);
        if (c1.model==null){
            System.out.println(araba.model);
        }
        Car c2 = new Car("toto",2018,false);
        Car c3 = new Car("moto",2019,true);


    }
}
