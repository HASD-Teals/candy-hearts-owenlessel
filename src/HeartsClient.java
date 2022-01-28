import java.util.Scanner;

public class HeartsClient {
    public static void main(String[] args) throws Exception {
        String[] sayings = { "Hi", "Love CS-A", "Go Girl!" };
        Heart Group1 = new Heart("red", 0, 5.00, true, 50, 3, sayings[0]);
        Heart Group2 = new Heart("teal", 0, 4.50, true, 200, 5, sayings[1]);
        Heart Group3 = new Heart("green", 0, 3.50, true, 75, 2, sayings[2]);
        // System.out.println(Group1.report());
        Heart[] Store = { Group1, Group2, Group3 };
        for (int i = 0; i < Store.length; i++) {
            System.out.println(Store[i].report());
            System.out.println();
        }
        buyOut(Store);
        Store[0].adjStock(25);
        placeOrder("teal",Store);

    }

    public static int buyOut(Heart[] Store) {
        int numHearts = 0;
        for (int i = 0; i < Store.length; i++) {
            numHearts = numHearts + Store[i].getStock();
        }

        return numHearts;
    }
    public static double placeOrder(String color,Heart[] Store){
        int orderQuanity=0;
        double costPer=0.0;
        double total=0;
        if(color=="red"){
            costPer=Store[0].getCost();
            orderQuanity=Store[0].getStock();
            total=costPer*orderQuanity;
        }
        if(color=="teal"){
            costPer=Store[1].getCost();
            orderQuanity=Store[1].getStock();
            total=costPer*orderQuanity;
        }
        if(color=="green"){
            costPer=Store[2].getCost();
            orderQuanity=Store[2].getStock();
            total=costPer*orderQuanity;
        }
        return total;
    }
}
