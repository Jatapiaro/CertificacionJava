public class Wrapper2{
    public static void main(String[] args) {

        Integer i1 = new Integer(10); //creates new instance
        Integer i2 = new Integer(10);
        /*
        * Use cache
        */
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        Integer i5 = 10;
        Integer i6 = 10;

        System.out.println();

    }
}
