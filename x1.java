public class x1 {
public static void main(String[] args) {
    long result = 0, a = 0, b = 1;
    long startTime = System.nanoTime();
    for (int i = 2; i <= 50; i++) {
        result = a + b;
        a = b;
        b = result;
    }
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println(result);
    System.out.println("Czas w nanosekundach: "+duration + " ns");
}
}