package miniproje;

public class Ticket {
    // Mesafe,koltuk No, fiyat bilgisi, YolculukTipi
    public double distance;
    public int typeNo;
    public String seatNo;
    public double price;

    // bilet fiyatini hesaplama
    public void getTotalPrice() {
        int seat = Integer.parseInt(this.seatNo); // String seatno deyishenini int-e chevirdik
        double total = 0;
        switch (this.typeNo) {
            case 1: //tek yon
                if (seat % 3 == 0) {
                    total =  this.distance * 1.2;
                }else {
                    total=this.distance*1;
                }
                System.out.println("Toplam tutar: "+total);
                break;
            case 2: // gedish gelish


        }
    }

}
