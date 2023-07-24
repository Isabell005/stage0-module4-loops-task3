package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int  digit, sum =0;

        while (t > 0) {

            digit = t % 10;

            sum = sum + digit;

            t = t / 10;
        }

        System.out.println(sum);

    }
}
