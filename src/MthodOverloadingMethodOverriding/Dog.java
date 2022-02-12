package MthodOverloadingMethodOverriding;

public class Dog {

    public void bark(){
        System.out.println("woof");
    }

    //Method overloading is done using same name but differnt parameters
    public void bark(int number){
        for(int i=0;i<number;i++){
            System.out.println("woof");
        }
    }
}
