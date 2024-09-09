public class Multiples {
    public static void main(String[] args) {

        int multiplesOf3 = 999/3;
        int multiplesOf5 = 999/5;

        int duplicate = 0;

        int i = 5;

        while (i < 1000) {

            if (i % 3 == 0) {
                duplicate++;
            }

            i = i + 5;
        }

        System.out.println(multiplesOf5 + multiplesOf3 - duplicate);
    }
}
