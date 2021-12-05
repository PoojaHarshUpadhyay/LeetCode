import javafx.beans.binding.StringBinding;

import java.time.ZonedDateTime;
import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Hello obj = new Hello();
        int res = obj.gcd(78, 52);
        System.out.print(res);
    }

    int gcd(int a, int b) {
        if (a < 0) {
            a = a * (-1);
        }
        if (b < 0) {
            b = b * (-1);
        }

        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}

