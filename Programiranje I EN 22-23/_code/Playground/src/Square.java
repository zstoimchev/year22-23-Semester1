public class Square extends Canvas implements Renderable {

    Square(int r){
        this.r=r;
    }
    @Override
    public void render() {
        System.out.println("Square with radius: " + r);
    }
}
