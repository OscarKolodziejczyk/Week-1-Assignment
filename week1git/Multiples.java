public class Multiples {
    public static int main(int n, int a, int b) {
        return FindMultiples(a, b, n);
    }

    public static int FindMultiples(int a, int b, int n) {
        int count = 0;
        int i = 1;
        while(i < n){
            boolean divisibleBy_a = i % a == 0;
            boolean divisibleBy_b = i % b == 0;

            if (divisibleBy_a) {
                count++;
            }
            else if (divisibleBy_b) {
                count++;
            }
            i++;
        }
        return count;
    }
}
