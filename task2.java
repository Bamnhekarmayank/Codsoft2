package Codsoft;
import java.util.*;
//Student grade calculator
public class task2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int tm;
        float ap;
        System.out.println("Enter marks obtained in respective subjects out of 100 :\n");
        System.out.println("Maths :");
        int m =s.nextInt();
        System.out.println("Physics :");
        int p=s.nextInt();
        System.out.println("Chemistry :");
        int c= s.nextInt();
        System.out.println("Biology :");
        int b=s.nextInt();
        System.out.println("English :");
        int e = s.nextInt();
        tm=p+m+b+e+c;
        System.out.println("The total marks obtained is :\n"+tm);
        ap=(float) tm/5;
        System.out.println("The average percentage is :\n"+ap+"%");
        System.out.println("Grade corresponding to the average percentage :");
        if (ap>=91.0 && ap<=100.0){
            System.out.println("A grade");
        } else if (ap>=81.0 && ap<=90.0) {
            System.out.println("B+ grade");
        } else if (ap>=71.0 && ap<=80.0) {
            System.out.println("B grade");
        } else if (ap>61.0 && ap<=70.0) {
            System.out.println("C grade");
        } else if (ap>=51.0 && ap<=60.0) {
            System.out.println("D grade");
        }else{
            System.out.println("F grade");
        }
    }
}
