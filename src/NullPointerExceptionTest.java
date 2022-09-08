public class NullPointerExceptionTest {

    public static void main(String[] args) {
        String name=null;

        if(name!=null) { //null check
            System.out.println(name.length());
        }else{
            System.out.println("String is null");
        }
    }
}

