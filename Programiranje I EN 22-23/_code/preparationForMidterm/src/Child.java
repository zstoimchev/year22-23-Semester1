public class Child extends Parent{



    Child(int number, String color) {
        super(number, color);
    }

    @Override
    public void print(){
        System.out.println("number " + color);
    }
}
