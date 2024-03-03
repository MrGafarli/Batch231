package testklasi;

public class Student {
    //Access Modifiers
//    public static String stdName = "Farid";
//    protected String address = "Sumgait";
//    String email = "gafarli@box.az";
//    private String vesiqe = "Aze02154";
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "stdName='" + stdName + '\'' +
//                ", address='" + address + '\'' +
//                ", email='" + email + '\'' +
//                '}';
   public static String isPolindrom(){
       int k = 212;
       String m = String.valueOf(k);
       String reversed = "";
       int n = m.length()-1;
       while(n>=0){
           reversed=reversed+m.charAt(n);
           n--;

       }


       if (m.equals(reversed)){
          return ("It is Polindrom :  "+ m + " = "+ reversed);
       }else {
           return ("it is not polindrom   "+ m + " != "+ reversed);
       }

   }

}
