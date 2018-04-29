package 多线程生产消费者BlockQueue;

public class Product {
    private int id;

    public static int MAX = 20;

    public Product(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
