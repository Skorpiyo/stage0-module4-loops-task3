package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0;
        int second=1;
            for (int count = 1; count <= lastFibonacci; count++) {
                System.out.println(first);
                int result;
                result = first + second;
                first = second;
                second = result;
            }
        }
    }

