public class ArrayIndexException {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        try {
            System.out.println(arr[-5]);
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("you are accessing out of size of the array");
            a.printStackTrace();

        }
    }
}
