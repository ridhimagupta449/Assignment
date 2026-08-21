package food.main;

import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.utility.OrderUtility;

public class Main {

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Riya", 500);
        orders[1] = new PremiumOrder(102, "Aman", 800);
        orders[2] = new RegularOrder(103, "Simran", 600);
        orders[3] = new PremiumOrder(104, "Karan", 1000);
        orders[4] = new RegularOrder(105, "Neha", 750);
        orders[5] = new PremiumOrder(106, "Rahul", 1200);

        for (int i = 0; i < orders.length; i++) {

            if (OrderUtility.validateAmount(orders[i].getAmount())
                    && OrderUtility.validateCustomerName(orders[i].getCustomerName())) {

                OrderUtility.generateOrderSummary(orders[i]);

            } else {
                System.out.println("Invalid Order Details!");
            }
        }

        FoodOrder.displayTotalOrders();
    }
}