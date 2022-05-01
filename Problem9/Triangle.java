public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(){
        super();
        //set default value
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public Triangle(double side1,double side2,double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
        this.setFilled(filled);
    }
    //set method
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    //get method
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double result = (s*(s-side1)*(s-side2)*(s-side3));
        return Math.sqrt(result);
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public void printTriangle(){
        String text = "Triangle: side1 = " + side1 + "side2 = " + side2 + " side3 = " + side3 + "\n";
        text += "Area = " + getArea() + "\n";
        text += "Perimeter = " + getPerimeter() + "\n";
        System.out.println(text + super.toString());
    }
}
