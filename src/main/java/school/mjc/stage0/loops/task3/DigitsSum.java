package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int result;
        for (result = 0; t != 0; t = t / 10) {
            if(t>0){
            result = result + t % 10;
            } else{
                result=result + (t % 10)*-1;
            }
        }
        System.out.println(result);
    }
}
