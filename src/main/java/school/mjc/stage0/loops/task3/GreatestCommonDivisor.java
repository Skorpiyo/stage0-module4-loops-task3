package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = 1;
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            for (int count = 1; count <= first && count <= second; count++) {
                if (first % count == 0 && second % count == 0)
                    result = count;
            }
            System.out.println(result);
        }
    }
}
