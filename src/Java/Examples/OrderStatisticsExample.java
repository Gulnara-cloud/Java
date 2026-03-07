package Java.Examples;
import java.util.*;

class Order {
    private Long userId;
    private String orderNumber;

    public Order(Long userId, String orderNumber) {
        this.userId = userId;
        this.orderNumber = orderNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
}

public class OrderStatisticsExample {
    public static Map<Long, Integer> countOrdersByUser(List<Order> orders) {

        Map<Long, Integer> orderCountMap = new HashMap<>();

        for (Order order : orders) {
            Long userId = order.getUserId();
            orderCountMap.put(
                    userId,
                    orderCountMap.getOrDefault(userId, 0) + 1
            );
        }

        return orderCountMap;
    }
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order(1L, "ORD-1"),
                new Order(2L, "ORD-2"),
                new Order(1L, "ORD-3"),
                new Order(3L, "ORD-4"),
                new Order(2L, "ORD-5"),
                new Order(3L, "ORD-6")
        );
        Map<Long, Integer> result = countOrdersByUser(orders);
        for (Map.Entry<Long, Integer> entry : result.entrySet()) {
            System.out.println("User ID: " + entry.getKey()
                    + " | Orders count: " + entry.getValue());
        }
    }
}