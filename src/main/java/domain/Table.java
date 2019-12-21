package domain;

public class Table {

    private static final int ORDER_NOTHING = 0;

    private final int number;
    private final Orders orders = new Orders();

    public Table( final int number ) {
        this.number = number;
    }

    public void addOrder( Order order ) {
        orders.addOrder(order);
    }

    public boolean hasOrder() {
        return !orders.orderNothing();
    }

    public boolean isEqaul( int tableNumber ) {
        return this.number == tableNumber;
    }

    public int tableNumber() {
        return getNumber();
    }

    private int getNumber() {
        return number;
    }

    public int getAmount() {
        return orders.getAmount();
    }

    public int getOrderSize() {
        return orders.getOrderSize();
    }

    public void clearOrder() {
        orders.clearOrder();
    }

    public String orderToString() {
        return orders.toString();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
