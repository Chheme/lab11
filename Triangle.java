import static java.lang.Math.*;

public class Triangle {
    int a,b,c;
    public Triangle(){
        a=0;
        b=0;
        c=0;
    }
    public Triangle(int x, int y, int z){
        this.a=x;
        this.b=y;
        this.c=z;
    }
public static void OutT(int x, int y, int z){
     System.out.println("Стороны треугольника: "+x+" "+y+" "+z);
}
public static void PerimetrT(int x, int y, int z){
        int P=x+y+z;
    System.out.println("Периметр треугольника="+P);
}
public static void PloshadT(int a, int b, int c){
 double p=(a+b+c)/2;
    double S=sqrt(p * (p - a) * (p - b) * (p - c));
    System.out.println("Площадь треугольника="+S);
}

}
