package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;
    private static final double TEN_PERCENT_TAX_RATE = .10;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        printHeaders(output);
        printCustomerInfo(output);

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            printLineItem(output, lineItem);
            double salesTax = lineItem.totalAmount() * TEN_PERCENT_TAX_RATE;
            totSalesTx = calculateTotalSalesTax(totSalesTx, salesTax);
            tot = calculateTotalAmountOfLineItem(tot, lineItem, salesTax);
        }

        printStateTax(output, totSalesTx);
        printTotalAmount(output, tot);

        return output.toString();
    }

    private double calculateTotalSalesTax(double totSalesTx, double salesTax) {
        totSalesTx += salesTax;
        return totSalesTx;
    }

    private double calculateTotalAmountOfLineItem(double tot, LineItem lineItem, double salesTax) {
        tot += lineItem.totalAmount() + salesTax;
        return tot;
    }

    private void printLineItem(StringBuilder output, LineItem lineItem) {
        output.append(lineItem.getDescription());
        output.append('\t');
        output.append(lineItem.getPrice());
        output.append('\t');
        output.append(lineItem.getQuantity());
        output.append('\t');
        output.append(lineItem.totalAmount());
        output.append('\n');
    }

    private void printTotalAmount(StringBuilder output, double tot) {
        output.append("Total Amount").append('\t').append(tot);
    }

    private void printStateTax(StringBuilder output, double totSalesTx) {
        output.append("Sales Tax").append('\t').append(totSalesTx);
    }

    private void printCustomerInfo(StringBuilder output) {
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }

    private void printHeaders(StringBuilder output) {
        output.append("======Printing Orders======\n");
    }
}