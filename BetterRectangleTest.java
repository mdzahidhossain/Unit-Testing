package BasicJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BetterRectangleTest {
    BetterRectangle betterRectangle;

    public BetterRectangleTest() {

    }

    @Test
    public void getAreaTest() {
        betterRectangle = new BetterRectangle(3, 3, 10, 10);
        int area = betterRectangle.getArea();
        assertEquals(area, 100);
    }

    @Test
    public void getPerimeteTest() {
        betterRectangle = new BetterRectangle( 3,3,10, 10);
        int perimeter = betterRectangle.getperimeter();
        assertEquals(40,perimeter);
    }
}
