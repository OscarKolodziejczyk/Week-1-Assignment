package week1git;

public class Reduce {
    public static int main(int n) {
        return reduce(n);
    }

    public static int reduce(int x) {
        int steps = 0;
        while (x > 0) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x - 1;
            }
            steps++;
        }
        return steps;
    }
}
