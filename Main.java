package com.company;

public class Main {

    public static float priceOfShipping(float orderValue,
                                        boolean saturdayDelivery,
                                        String destination) {
        float deliverCost = 0;
        switch (destination) {
            case "US":
                deliverCost = 20.00f;
                if (orderValue > 100) {
                    deliverCost -= 5.00f;
                }
                if (saturdayDelivery) {
                    deliverCost += 10.00f;
                }
                break;
            case "Mexico":
                deliverCost = 32.00f;
                break;
            default:
                deliverCost = 25.00f;
                if (orderValue > 100) {
                    deliverCost -= 7.00f;
                }
                if (saturdayDelivery) {
                    deliverCost += 12.00f;
                }
                break;
        }

        return deliverCost;
    }

    public static void main(String[] args) {


        System.out.println(priceOfShipping(200, true, "Canada"));

        float returnFromMethod = priceOfShipping(200, true, "Canada");
        System.out.println(returnFromMethod);

        returnFromMethod = priceOfShipping(100, false, "Mexico");
        System.out.println(returnFromMethod);

        System.out.println(priceOfShipping(50, true, "US"));



    }
}
