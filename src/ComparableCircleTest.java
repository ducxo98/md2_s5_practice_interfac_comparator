import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(5.0);
        circles[2] = new ComparableCircle(2.0);

        System.out.println("Pre-sorted:");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (Circle circle:circles){
            System.out.println(circle);
        }

    }
}
