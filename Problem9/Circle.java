public class Circle extends GeometricObject {
    private double radius;
    public Circle(){
        super();
        radius = 1;
    }
    public Circle(double radius){
        super();
        if(radius <= 0){
            this.radius = 1;
        }else
            this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super();
        if(radius <= 0){
            this.radius = 1;
        }else
            this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    //set method
    public void setRadius(double radius){
        this.radius = radius;
    }
    //get method
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getDiameter(){
        return radius*2;
    }
    public void printCircle(){
        String text = "Circle: radius = " + radius + "\n";
        text += "Area = " + getArea() + "\n";
        text += "Perimeter = " + getPerimeter() + "\n";
        System.out.println(text + super.toString());
    }
}
