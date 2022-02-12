public class operatorChlg {

    public static void main(String args[]){
        double val1 = 20.00d;
        double val2 = 80.00d;

        double ans =(val1 + val2) * 100.00d;
        System.out.println(ans);
        double remainder = ans % 40.00d;
        System.out.println(remainder);
        boolean isZero = (remainder == 0) ? true : false;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("got some remaider");
        }
    }
}
