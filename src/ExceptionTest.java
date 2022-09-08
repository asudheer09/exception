public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("hi1");
        System.out.println("hi2");
        System.out.println("hi3");
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException obj){
            obj.printStackTrace();
        }

        System.out.println("hi4");
        System.out.println("hi5");
    }
}



