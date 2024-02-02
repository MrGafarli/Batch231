package d8stringmanipulations;

public class StringMetods {
    public static void main(String[] args) {
        String tv = "$456.98";
        String laptop = "345.88";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$","");
        double tvPrice =  Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(tvPrice);

        String name = "  faRid gAfarli  ";


        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last); //C
    }
}
