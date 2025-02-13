public class xtoThePowerN {
    
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowersq = halfPower * halfPower;
    
        // Odd n
        if (n % 2 != 0) {
            return x * halfPowersq;
        }
        return halfPowersq;
    }
    
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
}
