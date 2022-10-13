package VAT;

import java.util.Scanner;

public class VAT {
    private static double productPrice;
    private static int productQuantity;
    private static char symbl;

    static Scanner scanner = new Scanner(System.in);

    static int getQuantity() {
        System.out.println("Enter quantity of products ...");
        productQuantity = scanner.nextInt();
        return productQuantity;
    }

    static double getPrice() {
        double result;
        System.out.println("Enter product price, EUR ...");
        result = (scanner.nextDouble()) * 1.2;
        if (result == (int) result) {
            productPrice = result;
        } else {
            productPrice = (int) result + 1;
        }
        System.out.println("productprice = " + productPrice);

        return productPrice;
    }

    static double getResult() {

        double result;
        result = productPrice * productQuantity;
        return result;
    }

    static void oneIteration() {
        double sum = getResult();
        getQuantity();
        getPrice();
        getResult();
        System.out.println("PriceOfAll = " + (sum + getResult()));
        System.out.println("Do yo want enter data for another product group? y/n ");
        symbl = scanner.next().charAt(0);

    }


    public static void main(String[] args) {


        oneIteration();
        while (symbl == 'y') {
            oneIteration();

        }
    }

}
