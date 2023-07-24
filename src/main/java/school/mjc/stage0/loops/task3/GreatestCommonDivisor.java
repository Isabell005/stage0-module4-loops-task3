package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int Temp, GCD = 0;
        while (second != 0) {
            Temp = second;
            second = first % second;
            first = Temp;
        }
        GCD = first;
        System.out.println(GCD);
    }
}
