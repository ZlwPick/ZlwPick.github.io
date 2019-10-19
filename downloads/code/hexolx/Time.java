/**
 * @author zlw
 * @create 2019-09-11 22:53
 */
public class Time {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        doSomeThing();
        long endTime = System.currentTimeMillis();
        System.out.println("====================");
        System.out.println( (endTime - startTime)+"ms");
    }

    public static void doSomeThing(){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(i * j);
            }
        }
    }
}
