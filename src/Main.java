public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer Minimum Value = " + myMinIntValue);
        System.out.println("integer Maximum Value = " + myMaxIntValue);

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMaxByteValue =Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + MyMaxByteValue);
        System.out.println("Byte Minimum Value = " + MyMinByteValue);

        short MyMinshortValue = Short.MIN_VALUE;
        short MyMaxshortValue =Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + MyMaxshortValue);
        System.out.println("Short Minimum Value = " + MyMinshortValue);

        long myLongValue = 100L;
        long MyMinLongValue = Long.MIN_VALUE;
        long MyMaxLongValue =Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + MyMaxLongValue);
        System.out.println("Long Minimum Value = " + MyMinLongValue);

        //casting
        int myTotal =(myMinIntValue / 2);
        byte myNewByteValue= (byte)(MyMinByteValue / 2);

       short myNewShortValue = (short)(MyMinshortValue / 2);


       byte myNum1 =101;
       short myNum2 =200;

       int myNum3 = 20000;
       long myNum4 = (50000L + 10L * (myNum1 + myNum2 + myNum3));
        System.out.println(myNum4);
    }
}
