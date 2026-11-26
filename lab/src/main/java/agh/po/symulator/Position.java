package agh.po.symulator;

public class Position {
    private double x;
    private double y;

    public Position(double c_x, double c_y) {
        x = c_x;
        y = c_y;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position getPosition() {
        System.out.print("Position of car: "+x+", "+y+" (x,y).");
        return this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double dt, double v, Position target) {
        double x_distance = Math.pow(target.x-x, 2);
        double y_distance = Math.pow(target.y-y, 2);
        double distance = Math.sqrt(x_distance+y_distance);
        double step = (v/3600)*dt;
        double new_x = step*(target.x-x)/distance;
        double new_y = step*(target.y-y)/distance;
        x = new_x;
        y = new_y;
        String out_message = "New x: "+x+", new y: "+y ;
        System.out.println(out_message);
    }
}
