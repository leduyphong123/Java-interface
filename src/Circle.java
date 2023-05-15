public class Circle {
    private double radius;
    private String color;
    private boolean filled=false;
    Circle(){
        radius=1.0;
        color="red";
    }
    Circle(double radius,String color,boolean filled){
        this.color=color;
        this.radius=radius;
    }
    Circle(double radius){
        this.radius=radius;
        color="red";
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "A Circle with radius= "+ radius +",A Shape with color of " + color;
    }

}