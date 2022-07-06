package GeekBrains.Homework.Seminar_1;

class program {
    public static void main(String[] args) {
        int a = 2;
        int b = -3;

        System.out.println(powRecursion(a, b));
        System.out.println(powIter(a, b));
    }
        public static double powRecursion(double a, int b){
            if(b == 0) return 1;

            if(b < 0) {
                return powRecursion(1/a, -b);
            }
            double res = powRecursion(a, b/2);

            return b % 2 == 0 ? res * res : res * res * a;
        }

    public static double powIter(int a, int b) {
        if (a == 0 || a == 1) return a;
        if (b == 0 && a != 0) return 1;
        double res = 1;

        if (b < 0) {
            b = -b;
            while (b > 0) {
                res *= a;
                b -= 1;
            }
            return (1 / res);
        }
        while (b > 0) {
            if (b % 2 != 0)
                res = res * a;
            a = a * a;
            b = b / 2;

            }
        return res;
    }
}
