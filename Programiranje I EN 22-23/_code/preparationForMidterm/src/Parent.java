public class Parent {
    int number;
    String color;

    Parent(int number, String color){
        this.number=number;
        this.color=color;

    }
    public void print(){
        System.out.println("number " + number + " has color " + color);
    }
}
