import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter number:");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
              int number = sc.nextInt();
              if(first){
                  first = false;
                  min = number;
                  max = number;
              }

              if(number > max){
                  max = number;
              }
              if(number < min){
                  min = number;
              }
            }else {
                     break;
            }
            System.out.println("min= "+ min +", max= "+ max);
            sc.nextLine();
        }

        sc.close();
    }
}
