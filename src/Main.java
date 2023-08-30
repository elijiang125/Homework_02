public class Main {
    public static void main(String[] args) {

        LispList list = new NonEmptyList("A", new NonEmptyList("B", new NonEmptyList("C", new EmptyList())));

        System.out.println("Hello world!");
    }
}