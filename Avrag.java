import java.util.Scanner;


public class Avrag{
    public static void main(String[] args){
        int x[] = {47, 747, 56, 876, 785, 857}, avg = 0;
        for(int i: x){
            avg = avg + i;
        }
        System.out.println("The avrage of the array is : " + avg/x.length);
    }
}