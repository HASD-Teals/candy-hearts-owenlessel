public class HeartsClient {
    public static void main(String[] args) throws Exception {
        String[] sayings= {"Hi","Bye"};
        Heart test1 = new Heart("red", 0, 1.50, true, 20, 5,sayings);
        System.out.println(test1.report());
    }
}
