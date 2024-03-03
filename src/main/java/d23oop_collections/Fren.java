package d23oop_collections;

public interface Fren {
    void abs();
    void esp();
    void run();
    int fiyat = 100;
    default void guc(){
        System.out.println("fren gucu iyidir");
    }

    static void hiz(){
        System.out.println("fren hizli basilir");
    }
}
