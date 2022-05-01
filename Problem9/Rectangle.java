public class Rectangle extends GeometricObject{
    private double width, height;
    public Rectangle(){
        width = 1;
        height = 1;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    //get method
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return width + height;
    }
    
    public void printRectangle(){
        String text = "Rectangle: width =" + width + ", height =" + height + "\n";
        text += "Area = " + getArea() + "\n";
        text += "Perimeter = " + getPerimeter() + "\n";
        System.out.println(text + super.toString());
    }
}
