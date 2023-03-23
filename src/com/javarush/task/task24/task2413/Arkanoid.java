package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {

    static Arkanoid game;

    private int width;
    private int height;
    private boolean isGameOver;

    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;


    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {
    }

    public void move() {
        stand.move();
        ball.move();
    }

    public void draw(Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        bricks.forEach(brick -> brick.draw(canvas));
    }

    public void checkBricksBump() {
        for (Brick brick : bricks) {
            if (ball.intersects(brick)) {
                bricks.remove(brick);
                double angle = Math.random() * 360;
                ball.setDirection(angle);
                break;
            }
        }
    }

    public void checkStandBump(){
        if(ball.intersects(stand)){
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame(){
        if(ball.y > height){
            isGameOver = true;
        }
    }


    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
