package task9;

import java.awt.*;
import java.util.ArrayList;

public class Bucket {
    private int weight;
    private ArrayList<Ball> balls;

    public Bucket(ArrayList<Ball> b) {
        this.balls = new ArrayList<>(b);
        weight = countWeight();
    }

    public Bucket(){
        this.balls = new ArrayList<>();
    }

    public int countWeight(){
        int w = 0;
        for (Ball ball: balls) {
            w += ball.weight;
        }
        return w;
    }

    public void addBall(Ball ball){
        if(ball == null){
            return;
        }
        balls.add(ball);
        weight += ball.weight;
    }

    public int countBlue() {
        int k = 0;
        for (Ball ball : balls) {
            if (ball.color.equals(Color.BLUE)) {
                k++;
            }
        }
        return k;
    }

}
