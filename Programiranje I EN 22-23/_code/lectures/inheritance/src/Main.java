import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle(4, "Blue", 150);
        Mazda mazda = new Mazda(4, "Red", 170, "Rotary");
        Honda honda = new Honda(4, "Grey", 240);


//        vehicle.drive();
//        mazda.drive();
//        honda.drive();

        Vehicle vehicle[]=new Vehicle[2];
        //vehicles[0]=vehicle;
        vehicle[0]=mazda;
        vehicle[1]=honda;
        /*Object object = new Object();
        System.out.println(object);
        System.out.println(mazda);*/




//        for (int i = 0; i < vehicle.length; i++) {
//            vehicle[i].drive();
//        }

        LinkedList<Vehicle> vehicles = new LinkedList<>();
        vehicles.add(mazda);
        vehicles.add(honda);

        /*for (Vehicle v: vehicles){
            v.drive();
        }*/

        //vehicles.stream().forEach(Vehicle::drive);






    }
}

//abstraction
//encapsulation
//inheritance
    //extends
    //interface
//
