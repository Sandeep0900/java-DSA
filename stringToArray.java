import java.util.*;

public class stringToArray {
    public static void main(String[] arr) {
        String num = "15 15 60";
        // String[] num1 = num.split(", ");

        int[] num2 =  new int[3];

        // for(int i=0; i<3; i++) {
        //     num2[i] = Integer.parseInt(num1[i]); 
        // }
        // for(int i=0; i<3; i++) {
        //     System.out.println(num2);
        // }
        int i=num.length(), j=0, k=0;
        int val = 0;
        while(j != i && j < i) {
            if(num.charAt(j) == ' ') {
                j++;
                num2[k++] = val;
                val = 0;
                continue;
            }
            if(j == i && j > i) {
                break;
            }
            val *= 10;
            int a = num.charAt(j) - '0';
            val += a;
            j++;
        } 
        num2[k] = val;
        for(int q=0; q<3; q++) {
            System.out.println(num2[q]);
        }
    } 
}