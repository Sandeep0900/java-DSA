import java.util.Arrays;

public class stirngToInteger {

    public static void main(String[] args) {
        String s = "12 1 1 2    0  ";
        s = s.trim();
        String[] arr = s.split("\\s+");

        Arrays.sort(arr);   
        int sum = 0;
        for(String a:arr) {         
            sum += Integer.parseInt(a);     
        }
        
        System.out.println(sum);
    }
    
}
