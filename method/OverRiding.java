/*Java 方法覆盖（Overriding）代码的实现*/

class Figure{
    double dim1;
    double dim2;
    Figure(double a , double b) {
        dim1=a;
        dim2=b;
    }
    Double area() {
        System.out.println("Inside area for figure.");
        return(dim1*dim2);
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a ,b);
    }
    Double area() {
        System.out.println("Inside area for rectangle.");
        return(dim1*dim2);
    }
}

public class OverRiding{
    public static void main (String []agrs){
        Figure f= new Figure(10 , 10);
        Rectangle r= new Rectangle(9 , 5);
        System.out.println("Area is :"+f.area());
        System.out.println("Area is :"+r.area());
    }
}
