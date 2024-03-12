
package isp.lab3.exercise2;

public class Rectangle {
    private int length;
    private int width;
    private String color;
    

 public Rectangle() {
        this.length = 1;
        this.width = 2;
        this.color = "red";
  
    }

 public int getLength() {
        return length;
    }

 public int getWidth() {
        return width;
    }

public String getColor() {
        return color;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }




}
