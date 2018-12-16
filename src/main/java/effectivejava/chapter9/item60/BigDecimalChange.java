package effectivejava.chapter9.item60;

import java.math.BigDecimal;

public class BigDecimalChange {
    // Broken - uses floating point for monetary calculation!
    public static void main(String[] args) {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        BigDecimal funds = new BigDecimal("1.00");
        int itemsBought = 0;
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
