package BasicJava;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int xleft, int xright, int width, int height){
        super.setLocation(xleft,xright);
        super.setSize(width, height);
    }
    public int getArea(){
        return width * height;
    }

    public int getperimeter(){
        return (width + height) * 2;
    }
}