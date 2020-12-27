import javax.management.ObjectName;
import java.util.Arrays;
import java.util.Scanner;

public class Massiv {
    int [] intArray;
    int n;
    public Massiv()
    {
        n = 0;
        intArray = new int[0];
    }
    public Massiv(int x)
    {
        n = x;
        intArray = new int[n];
    }
    public static int[] InpM(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n=sc.nextInt();
        int [] intArray = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++){
             intArray[i]= sc.nextInt();
        }
        return intArray;
    }
public static void OutM(int []intArray){
    System.out.println("Элементы массива: ");
    for (int i = 0; i < intArray.length; i++){
        System.out.println(intArray[i]+" ");
    }
}
public static void Ots(int []intArray){
    Arrays.sort(intArray);
    System.out.println(Arrays.toString(intArray));
}
    
}

