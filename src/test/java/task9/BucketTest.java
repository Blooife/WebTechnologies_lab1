package task9;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BucketTest extends Bucket {
    @Test
    public void checkZeroBlue(){
        Ball[] balls = {new Ball(5, Color.RED), new Ball(2,Color.WHITE), new Ball(7,Color.BLACK), new Ball(1,Color.GREEN), new Ball(9, Color.BLACK)};
        Bucket bucket = new Bucket();
        for (Ball ball: balls) {
            bucket.addBall(ball);
        }
        assertEquals(0,bucket.countBlue());
        assertEquals(24,bucket.countWeight());
    }
    @Test
    public void checkZeroBalls(){
        Bucket bucket = new Bucket();
        assertEquals(0,bucket.countBlue());
        assertEquals(0,bucket.countWeight());
    }
    @Test
    public void checkUsual(){
        Ball[] balls = {new Ball(4, Color.BLUE), new Ball(2,Color.BLUE), new Ball(3,Color.BLACK), new Ball(1,Color.WHITE)};
        Bucket bucket = new Bucket();
        for (Ball ball: balls) {
            bucket.addBall(ball);
        }
        assertEquals(2,bucket.countBlue());
        assertEquals(10,bucket.countWeight());
    }
}