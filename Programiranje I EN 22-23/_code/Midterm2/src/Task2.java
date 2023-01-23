public class Task2 {
    public static void main(String[] args) {
        Triangles triang = new Triangles("Triangle1", 4);
        triang.render();
        Rectangles rect = new Rectangles("Rectangle1", 3);
        rect.render();
        Rectangles circ = new Rectangles("Circle1", 2);
        circ.render();
    }
}

class Canvas {
    public String name;
    public int points;

    public Canvas(String name, int points){
        this.name=name;
        this.points=points;
    }
    public void render(){
        System.out.println(name + " has " + points + " points.");
    }
}

class Triangles extends Canvas{

    public Triangles(String name, int points) {
        super(name, points);
        if(this.points!= 3)
            points=3;
    }
    @Override
    public void render(){
        System.out.println(name + " has " + points + " points.");
    }
}

class Rectangles extends Canvas{

    public Rectangles(String name, int points) {
        super(name, points);
        if(this.points!= 3)
            points=4;
    }
    @Override
    public void render(){
        System.out.println(name + " has " + points + " points.");
    }
}

class Circles extends Canvas{

    public Circles(String name, int points) {
        super(name, points);
        if(this.points!= 3)
            points=2;
    }
    @Override
    public void render(){
        System.out.println(name + " has " + points + " points.");
    }
}
