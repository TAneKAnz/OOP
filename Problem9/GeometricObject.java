import java.util.Date;

public class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreate;
    public GeometricObject(){
        color = "red";
        filled = false;
        dateCreate = new Date();
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreate = new Date();
    }
    //set method
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //get method
    public String getColor(){
        return color;
    }
    public Date getDateCreate(){
        return dateCreate;
    }

    public boolean isFilled(){
        return filled;
    }

    public String toString(){
        return "Color =" + getColor() + ", isFilled =" + isFilled();
    }
    public void displayPbject(GeometricObject object){
        if(object instanceof Triangle){
            Triangle triangle = (Triangle)object;
            triangle.printTriangle();
        }
        if(object instanceof Circle){
            Circle circle = (Circle)object;
            circle.printCircle();
        }
        if(object instanceof Rectangle){
            Rectangle rectangle = (Rectangle)object;
            rectangle.printRectangle();
        }
    }
}