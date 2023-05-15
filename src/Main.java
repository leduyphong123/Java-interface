import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        ComparableCircle[] comparableCircle=new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle(3.6);
        comparableCircle[1] = new ComparableCircle();
        comparableCircle[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("add comparableCircle");
        for(ComparableCircle i: comparableCircle){
            System.out.println(i);
        }
        Arrays.sort(comparableCircle);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }
        System.out.println(comparableCircle[1].compareTo(comparableCircle[0]));
    }
}