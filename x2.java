public class x2 {
public static void main(String[] args) {
    long result = 0, sum =0, a = 0, b = 1;
    while(result <= 4000000){
            result = a + b;
            a = b;
            b = result;
            if (result % 2 == 0) {
            sum += result;
        }
    }
    System.out.println("suma parzystych liczb: "+sum);
}
}