import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Noble_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(noble_integer(array,size));
    }

    static int noble_integer(int[] array, int size) {
        Arrays.sort(array);
        int count=0;
        for(int i=0;i<size;i++){
            if(array[i]==(size-1-i)){
                count++;
            }
        }
        if(count==0){
            return -1;
        }
        return count;
    }
}
