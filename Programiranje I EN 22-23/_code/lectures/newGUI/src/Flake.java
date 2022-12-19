import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.util.Random;

public class Flake {
    float x;
    float y;
    int size;
    int detail;
    float turn = 0;

    public Flake(float x, float y, int size, int detail) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.detail = detail;
    }

    public void fall() {
        if (y > 600)
            y = -50;
        y += size / 3;

        float deltax= (float) Math.cos(turn+size)*3;
        x=x+deltax;
        turn+=0.02;

    }

    public void draw(Graphics2D g) {
        Random rand = new Random();
        g.setStroke((new BasicStroke(3)));
        g.setColor(new Color(rand.nextInt()));
        AffineTransform previous = g.getTransform();
        g.rotate(turn*50,x,y);
        float alpha = (float) Math.toRadians(360 / detail);
        for (int i = 0; i < detail; i++) {
            g.rotate(alpha, x, y);
            g.drawLine((int) x, (int) y, (int) x + size, (int) y + size);
        }
        g.setTransform(previous);


    }
}
