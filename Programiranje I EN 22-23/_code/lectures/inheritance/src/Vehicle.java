public abstract class Vehicle{
    int numTires;
    String color;
    double topSpeed;

    public Vehicle(int numTires, String color, double topSpeed) {

        this.numTires = numTires;
        this.color=color;
        this.topSpeed=topSpeed;
    }

    public abstract void drive();

/*@Override
    public void drive(){
        System.out.println("Brr");
    }*/



//    public void drive(){
//        System.out.println("Brr");
//    }
}
