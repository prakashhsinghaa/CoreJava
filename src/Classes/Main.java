package Classes;

public class Main {

    public static void main(String[] args) {
        ClassCar porsche = new ClassCar();
        ClassCar Thar = new ClassCar();
        porsche.setModel("911");
        System.out.println("Model of Car is " + porsche.getModel());
    }
}
