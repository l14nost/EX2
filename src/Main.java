import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Input length of array:");
        int length = in.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<array.length;i++){

            System.out.print("Input "+(i+1)+" element:");
            array[i] = in.nextInt();
        }
        int num;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    check = true;
                    num = array[i];
                    array[i] = array[i+1];
                    array[i+1] = num;
                }
            }
        }
        int count = 0;
        for(int x:array){
            count++;
            System.out.println("#"+count+" element: "+x);
        }
    }
}