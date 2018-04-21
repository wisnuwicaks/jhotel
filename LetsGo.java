import java.util.*;
/**
 * Write a description of class LetsGo here.
 *7t
 * @author WisnuWicaksono
 * @version 21 April 2018
 */
public class LetsGo
{
    public static int delayLionel, delayAndreas, delayMessi;
    private static Random acak = new Random();

    public static void main(String[] args)
    {
        RunForYourLife Lionel = new RunForYourLife("Lionel");
        delayLionel = acak.nextInt((500-100)+1)+100;
        Lionel.setDelay(delayLionel);
        Lionel.start();

        RunForYourLife Andreas = new RunForYourLife("Andreas");
        delayAndreas = acak.nextInt((delayLionel -10)+1)+100;
        Andreas.setDelay(delayAndreas);
        Andreas.start();

        RunForYourLife Messi = new RunForYourLife("Messi");
        delayMessi = acak.nextInt((delayAndreas -10)+1)+100;
        Messi.setDelay(delayMessi);
        Messi.start();
    }
}
