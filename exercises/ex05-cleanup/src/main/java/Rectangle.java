/**
 * Represents a two-dimensional rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a Rectangle with the given width and height.
   *
   * @param w the initial width
   * @param h the initial height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the dimensions of the rectangle by a factor.
   *
   * @param factor the factor to scale width and height by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks if this rectangle has a larger area than the other.
   *
   * @param other the other rectangle to compare
   * @return true if this rectangle has a larger area, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
