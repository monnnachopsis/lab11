public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void length(){
        System.out.println("длины сторон треугольника: a = "+this.a+". b = "+this.b+". c = "+this.c);
    }
    public void perim(){
        System.out.println("периметр треугольника "+(this.a+this.b+this.c));
    }
    public void plosh(){
        double p=(this.a+this.b+this.c)*0.5;
        System.out.println("площадь треугольника "+ Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)));
    }
}
