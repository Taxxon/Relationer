/**
 * Created by emka15 on 2017-11-08.
 */
public class Test {
    public static void main(String[] args) {
        //test Mtpoint
        MyPoint test = new MyPoint();
        MyPoint test2 = new MyPoint(2, 2);
        System.out.println(test);
        System.out.println(test2);

        //test seters and geters
        System.out.println(test2.getX());
        System.out.println(test2.getY());
        test2.setX(4);
        test2.setY(4);
        int[] array = test2.getXY();
        System.out.println(array[0] + " " + array[1]);
        test2.setXY(2,2);
        int[] array2 = test2.getXY();
        System.out.println(array[0] + " " + array[1]);

        //test distance
        System.out.println(test2.distance());
        System.out.println(test2.distance(3, 3));
        System.out.println(test2.distance(test));
    }
}
