public class App {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <N>");
            System.exit(1);
        }

        int N = Integer.parseInt(args[0]);
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < N; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }

    }
}
