package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int check=1;
        int result=0;
        for(int count=1;count<=lengthOfLastNumber; count++){
            check *=10;
            result+=check-1;
        }
        System.out.println(result);
    }
}
