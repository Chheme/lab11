public class Rectangle {
    int a,b;
    public Rectangle(){
        a=0;
        b=0;
    }
    public Rectangle(int x, int y){
        a=x;
        b=y;
    }
    public static void OutR(int x, int y){
        System.out.println("Стороны прямоугольника: "+x+" "+y);
    }
    public static void PerimetrR(int x, int y){
        int P=x+y;
        System.out.println("Периметр прямоугольника="+ P);
    }
    public static void PloshadR(int x, int y){
        int S=x*y;
        System.out.println("Площадь премоугольника="+S);
    }

}
