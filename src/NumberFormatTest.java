import java.text.NumberFormat;

public class NumberFormatTest {

    public static void main(String[] args) {
        String num="123";
        //int ---> Integer
        //float----> Float
       try {
           int n = Integer.parseInt(num);
           System.out.println(n);
       } catch (NumberFormatException n){
           System.out.println("unable to convert string to int due to incorrect format of string");
       }




    }
}
