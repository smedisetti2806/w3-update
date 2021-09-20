public class boxTestClass {
    public static void main(String[] args) {
        cardBoardBox box = new cardBoardBox();

        cardBoardBoxAvailable available = new cardBoardBoxAvailable(box);
        cardBoardBoxNotAvailable notAvailable = new cardBoardBoxNotAvailable(box);

        boxOrder order = new boxOrder();

        order.OrderIn(available);
        order.OrderIn(notAvailable);

        order.OrderOut();
    }
}
