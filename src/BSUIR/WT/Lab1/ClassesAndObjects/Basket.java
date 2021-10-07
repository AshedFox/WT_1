package BSUIR.WT.Lab1.ClassesAndObjects;

import java.awt.Color;
import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<>();
    }

    public void AddBall(Ball ball){
        balls.add(ball);
    }

    public double getTotalWeight() {
        double totalWeight = 0d;
        for (Ball ball: balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int getCountOfColor(Color color){
        int count = 0;
        for (Ball ball: balls) {
            if (ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
