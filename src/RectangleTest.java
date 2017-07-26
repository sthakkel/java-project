import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
  Rectangle myRectangle = new Rectangle(10,6);

  @Test
  public void testGetArea() {
    assertEquals(myRectangle.getArea(), 31);
  }

  @Test
  public void testGetPerimeter() {
    assertEquals(myRectangle.getPerimeter(), 22);
  }

  @Test
  public void testLength() {
    assertEquals(myRectangle.length, 9);
  }

  @Test
  public void testWidth() {
    assertEquals(myRectangle.width, 9);
  }
}
