/**
 * Created by Finley on 5/10/17.
 */
import java.awt.Graphics;
import edu.princeton.cs.introcs.*

public class Ball {
    public int posX, posY, width, height;
    public int motionX, motionY;
}
    public Ball() {
        posX = 0.0;
        posY = 0.0;
        motionX = StdRandom.uniform(-0.015, 0.015);//assigns a random motion
        motionY = StdRandom.uniform(-0.015, 0.015);//values are small so its smooth
        double radius = 2.0;
    }

    // move the ball one step
    public void move() {
        if (Math.abs(posX + motionX) + radius > 1.0) motionX = -motionX;//bounces of either side - x velocity reversed
        if (Math.abs(posY + motionY) + radius > 1.0) motionY = -motionY;//bounces of top or bottom - y velocity reversed
        posX =  posX + motionX;
        posY = posY + motionY;
    }

    // draw the ball
    public void draw() {
        StdDraw.filledCircle(posX, posY, radius);
    }



    // test client
    public static void main(String[] args) {

        // create and initialize two balls
        Ball b1 = new Ball();


        // animate them
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);
            b1.move();
            b1.draw();
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}

//    public void update()
//    {
//        if(checkCollision()==1)
//        {
//            this.motionX = 1;
//            this.motionY =
//        }
//
//    }
//    //this might go in the board class
//    public int checkCollision() {
//        if(posY > //get board height || posY < 0 ) {
//            if (posX > //get board width || posX < 0) {
//                return 1//has collided with a wall
//            }
//        }
//        return 0;//has not collided with a wall
//    }
//
//    public void render(Graphics g)
//    {
//        g.setColor(Color.BLACK);
//        g.fillOval(posX,posY,width,height);
//    }
//}




