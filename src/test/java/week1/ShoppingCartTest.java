package week1;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {


    @Test
    public void testCalculateTotalCost() {
        assertEquals(50.0, ShoppingCart.calculateTotalCost(10.0, 5), 0.001);
        assertEquals(0.0, ShoppingCart.calculateTotalCost(0.0, 5), 0.001);
        assertEquals(0.0, ShoppingCart.calculateTotalCost(10.0, 0), 0.001);

        assertEquals(-50.0, ShoppingCart.calculateTotalCost(-10.0, 5), 0.001);
        assertEquals(50.0, ShoppingCart.calculateTotalCost(10.0, -5), 0.001);
    }

    @Test
    public void testEnglishLocalization() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("InClass", locale);

        assertEquals("Enter the price of the item:", rb.getString("item_price"));
        assertEquals("Enter the quantity of the item:", rb.getString("item_quantity"));
        assertEquals("Total cost:", rb.getString("total_cost"));
    }

    @Test
    public void testFinnishLocalization() {
        Locale locale = new Locale("fi", "FI");
        ResourceBundle rb = ResourceBundle.getBundle("InClass", locale);

        assertEquals("Syötä tuotteen hinta:", rb.getString("item_price"));
        assertEquals("Syötä tuotteen määrä:", rb.getString("item_quantity"));
        assertEquals("Kokonaishinta:", rb.getString("total_cost"));
    }

    @Test
    public void testSwedishLocalization() {
        Locale locale = new Locale("sv", "SE");
        ResourceBundle rb = ResourceBundle.getBundle("InClass", locale);

        assertEquals("Ange priset på varan:", rb.getString("item_price"));
        assertEquals("Ange mängden av varan:", rb.getString("item_quantity"));
        assertEquals("Total kostnad:", rb.getString("total_cost"));
    }

    @Test
    public void testJapaneseLocalization() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("InClass", locale);

        assertEquals("アイテムの価格を入力してください:", rb.getString("item_price"));
        assertEquals("アイテムの数量を入力してください:", rb.getString("item_quantity"));
        assertEquals("合計金額:", rb.getString("total_cost"));
    }
}