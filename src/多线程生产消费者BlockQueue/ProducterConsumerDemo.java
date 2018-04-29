package 多线程生产消费者BlockQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Administrator 1.生产者仅仅在仓储未满时生产，仓满则停止生产 2，消费者仅仅在仓储有产品时候才能消费，仓空则等待。
 *         3.当消费者发现仓储没产品可消费时候会通知生产者生产 4.生产者在生产出可消费产品时候，应该通知等待的消费者去消费。
 *
 */
public class ProducterConsumerDemo {

    public static void main(String[] args) {
        Storage storage = new Storage();

        ExecutorService service = Executors.newCachedThreadPool();

        Producer p0 = new Producer("腾讯", storage);

        Consumer c0 = new Consumer("cmazxiaoma", storage);

        service.submit(p0);

        service.submit(c0);

        service.shutdown();

    }
}
