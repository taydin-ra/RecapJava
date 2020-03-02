package study.techno;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=fib(8);
        System.out.println(a);
    }

    public static int fib(int N) {

//	    	 return - 1;


        int first = 1;
        int second = 1;
        int c = 0;


        for (int i = 0; i < 10; i++) {
            c = first + second;
            first = second;
            second = c;

        }
        return c;
    }
}

