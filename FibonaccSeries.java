package class2_live;

public class FibonaccSeries {
    public static void main(String[] args) {
//example : 1+2+3+5+...n;
        int n =5 ;
        int first = 0, second = 1, febonacci = 0;
        for (int i = 0; i <= n; i++){
           febonacci = first + second;
           first = second;
           second = febonacci;
            System.out.println(febonacci);
        }
    }
}
