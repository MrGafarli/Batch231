package miniproje;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    public String numberPlate;
    public List<String> seats = new ArrayList<>();
    //Arraylist istifade etmek sebebi, avtobusda herdefe yeni
    //koltuk alinanda, sonra silininende silmek daha rahatdi arraylistde
    public Bus(String plaka){ //Constructor
        for (int i = 1; i < 33; i++) {
            this.seats.add(String.valueOf(i));
        }
    }
}
