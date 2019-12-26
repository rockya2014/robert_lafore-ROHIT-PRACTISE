/*
 * fibonaccci series with lower and upper limit
 * */
package rohitPracctise;

public class FibonacciSSeries {
    static final long maxSize = 10L;
    //arr to capture fibonacci series
    static long[] arr = new long[Math.toIntExact(maxSize)];

    public static void main(String[] args) {

        //call fibonacci method with input parameter
        fibonacciMethod();
    }

    public static void fibonacciMethod() {
        long startFirstNumber = 0;
        long startSecondNumber = 1;
        long additionResultThirdNumber = 0;

        long firstNumber = startFirstNumber;
        long secondNumber = startSecondNumber;
        arr[0] = startFirstNumber;
        arr[1] = startSecondNumber;
        int limiterLower = 5;
        int limiterUpper = 31;
        for (int i = 2; i < maxSize; i++) {
            if (limiterUpper < additionResultThirdNumber) {
                break;
            }

            additionResultThirdNumber = firstNumber + secondNumber;
            if (limiterLower < additionResultThirdNumber) {
                arr[i] = additionResultThirdNumber;

            } else {
                i--;
            }

            firstNumber = secondNumber;
            secondNumber = additionResultThirdNumber;
        }
        //captured arr value display
        displayArr(arr);
    }

    private static void displayArr(long[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] == 0)) {//work around for 0 valuew to fixed emptu arr size extra
                System.out.println(arr[i]);
            }
        }
    }
}
