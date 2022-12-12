public class Mazda extends Vehicle {

    String engineType;


    public Mazda(int numTires, String color, double topSpeed, String engineType) {
        super(numTires, color, topSpeed);
        this.engineType=engineType;
    }

    @Override
    public String toString(){
        return "Here's dream rotary mazda";
    }

    @Override
    public void drive(){
        System.out.println("mazdaaaaaz");
    }
    /*@Override
    public void drive(){
        System.out.println("Broom");
    }*/

    //overwriting
//  @override
//    public void drive(){
//        //System.out.println("SuTuTu");
//        if(engineType=="Rotary")
//            System.out.println("SuTuTu");
//        else
//            System.out.println("Broom");
//    }
}
