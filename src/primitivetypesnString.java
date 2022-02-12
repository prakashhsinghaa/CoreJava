public class primitivetypesnString {

    public static void main(String[] args) {
        //primitive data types
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //it is not primitive String is a class
        //string in java is immutable we cant change a string after it is created
        //instead what happens is a new string is created
        String myString ="this is a string";
        System.out.println(myString);

        myString = myString + ", and this is more ";
        System.out.println(myString);

        myString = myString + "\u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Laststring is equal to " + lastString);

        double dnum = 120.47d;
        lastString = lastString + dnum;
        System.out.println("Lastring is" + lastString);

    }
}
