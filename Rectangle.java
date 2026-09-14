public class Rectangle{
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }
public int getLength(){
    return length;
}
public int getWidth(){
    return width;
}
public void setLength(int newLength){
    this.length = newLength;
}
public void setWidth(int newWidth){
this.width = newWidth;
}

public int calculateArea(){
    int area = getLength() * getWidth();
    return area;
}
public int calculatePerimeter(){
    int perimeter = (2 * getLength()) + (2 * getWidth());
    return perimeter;
}
public double calculateDiagonal(){
    double dlength = getLength();
    double dwidth = getWidth();
    double sidessquared = Math.pow(dlength , 2) + Math.pow(dwidth , 2);
    double hyp = Math.sqrt(sidessquared);
    return hyp;
}
public String toString(){
String sentence = "Length: " + length + " Width: " + width;
return sentence;
}
public boolean equals(Rectangle other){
if(other.length == length && other.width == width){
    return true;
}
else{
    return false;
}
}


}