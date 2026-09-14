public class RectangleTester{

    public static void main(String[] args) {
        
    Rectangle rect = new Rectangle(5, 10);
    
    System.out.println("Length: " + rect.getLength());
    System.out.println("Width: " + rect.getWidth());
    System.out.println("Area: " + rect.calculateArea());
    System.out.println("Perimeter: " + rect.calculatePerimeter());
    System.out.println("Diagonal: " + rect.calculateDiagonal());
    
    Rectangle zero = new Rectangle(-5, -10);
    System.out.println(rect.toString());
    boolean equals = rect.equals(zero);
    System.out.println("Equals: " + equals);

    }

}


