public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void length(){
        System.out.println("длины сторон прямоугольника: a = "+this.a+". b = "+this.b);
    }
    public void perim(){
        System.out.println("периметр прямоугольника "+((this.a+this.b)*2));
    }
    public void plosh(){
        System.out.println("площадь прямоугольника "+ (this.a*this.b));
    }
}
