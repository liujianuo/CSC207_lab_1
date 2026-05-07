public class Multiples {

    public static void main(String[] args) {
        int n = 1000;
        int threes = (n-1)/3;
        int fives = (n-1)/5;
        int fifteens = (n-1)/15;
        int result = threes + fives - fifteens;
        System.out.println(result);
    }

}
