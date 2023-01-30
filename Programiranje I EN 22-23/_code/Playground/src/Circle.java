public class Circle extends Canvas implements Renderable {

    Circle(int r){
        this.r=r;
    }
    @Override
    public void render() {
        System.out.println("Circle with radius: " + r);
    }

}
