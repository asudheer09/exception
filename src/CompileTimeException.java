public class CompileTimeException {

    public static void main(String[] args)  {

        System.out.println("hi 1");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hi 2");
    }
}
