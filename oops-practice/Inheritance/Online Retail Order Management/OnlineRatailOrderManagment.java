class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRatailOrderManagment {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2024-06-01", "TRK456", "2024-06-05");
        System.out.println("Order ID: " + deliveredOrder.getOrderId());
        System.out.println("Order Date: " + deliveredOrder.getOrderDate());
        System.out.println("Tracking Number: " + deliveredOrder.getTrackingNumber());
        System.out.println("Delivery Date: " + deliveredOrder.getDeliveryDate());
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}
