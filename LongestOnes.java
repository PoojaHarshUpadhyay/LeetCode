import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int[] cpdomains = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int result = longestOnes(cpdomains, 2);
        System.out.println(result);

    }

    public static int longestOnes(int[] A, int k) {
        int i = 0;
        int j = 0;
        while (i < A.length){
            if (A[i] == 0) {
                k--;
            }
            if (k < 0) {
                if(A[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }
        return i - j;
    }
}
