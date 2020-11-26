public class Runner {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Good Friend", "Hii!! <3");
        Friend friend2 = new Friend("Bad Friend", "");
        friend1.greet();
        System.out.println("--------------------");
        friend2.greet();
    }
}