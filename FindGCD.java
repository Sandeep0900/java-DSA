public class FindGCD {

    static int Gcd(int a, int b) {

        while(a!=b) {
            if(a>b) {
                a -= b;
            }
            if(b>a) {
                b -= a;
            }
        }

        return a;
    } 

    public static void main(String[] arr) {
        int[] a = {9,3,1,2,6,3};
        int p=3, count=0;
        int n = a.length;

        // int gcdVal = a[0];
        // for(int i=1; i<n; i++) {
        //     gcdVal = Gcd(gcdVal, a[i]);
        // }


        for(int i=0; i<n; i++) {
            int gcdVal = a[i];
            for(int j=i; j<n; j++) {
                gcdVal = Gcd(gcdVal, a[j]);
                if(gcdVal == p) {
                    count++;
                }
                if(gcdVal < p) {
                    break;
                }
            }
        }


       
        System.out.println(count);
    }
}