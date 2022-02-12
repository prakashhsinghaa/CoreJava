public class operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult =result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 =20
        System.out.println("2 * 10 = " + result);

        result = result /5; // 20/5 =4
        System.out.println("20 / 5 = " + result);

        result  = result % 3; //the remainder of (4 % 3)=1
        System.out.println( result);

        //result = result  + 1;
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result +=2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("it is not an alien");
        }
        System.out.println("And i am scared of aliens");

        int topscore = 80;
        if(topscore != 100){
            System.out.println("you got the high score");
        }

        int secondTopScore = 81;
        if((topscore > secondTopScore) && (topscore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topscore > 90)  || (secondTopScore < 90)){
            System.out.println("Either or both the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is the correct way to asign");
        }

        if(isCar){
            System.out.println("true");
        }

        if(!isCar){
            System.out.println("isCar is not true");
        }

        isCar = true;
        boolean wasCar = isCar ? true:false;

        if(wasCar) {
            System.out.println("wascar is true");
        }

    }
}
