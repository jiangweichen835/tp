package parser;

import inventory.Medicine;
import inventory.Stock;
import org.junit.jupiter.api.Test;
import ui.Ui;

import java.text.ParseException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StockValidatorTest {
    private Ui ui = new Ui();

    @Test
    public void checkValidStockId_validId_expectTrue() {
        ArrayList<Medicine> tempMedicines = new ArrayList<>();
        try {
            tempMedicines.add(new Stock("PANADOL", 20, 20, DateParser.stringToDate("13-9-2021"),
                    "BEST MEDICINE TO CURE HEADACHES, FEVER AND PAINS", 1000));
        } catch (ParseException e) {
            ui.print("Unable to parse date!");
        }
        boolean isValid = StockValidator.isValidStockId(ui,"1", tempMedicines);
        assertTrue(isValid);
    }

    @Test
    public void checkValidStockId_validId_expectFalse() {
        ArrayList<Medicine> tempMedicines = new ArrayList<>();
        try {
            tempMedicines.add(new Stock("PANADOL", 20, 20, DateParser.stringToDate("13-9-2021"),
                    "BEST MEDICINE TO CURE HEADACHES, FEVER AND PAINS", 1000));
        } catch (ParseException e) {
            ui.print("Unable to parse date!");
        }
        boolean isInvalid = StockValidator.isValidStockId(ui,"5", tempMedicines);
        assertFalse(isInvalid);
    }


    @Test
    public void checkValidName_validName_expectTrue() {
        String inputString = "panadol";
        boolean isValid = StockValidator.isValidName(ui, inputString);
        assertTrue(isValid);
    }

    @Test
    public void checkValidName_validName_expectFalse() {
        String inputString = "";
        boolean isInvalid = StockValidator.isValidName(ui, inputString);
        assertFalse(isInvalid);
    }

    @Test
    public void checkValidPrice_validPrice_expectTrue() {
        String inputPrice = "20";
        boolean isValid = StockValidator.isValidPrice(ui, inputPrice);
        assertTrue(isValid);
    }

    @Test
    public void checkValidPrice_validPrice_expectFalse() {
        String inputPrice = "-1";
        boolean isInvalid = StockValidator.isValidPrice(ui, inputPrice);
        assertFalse(isInvalid);
    }


    @Test
    public void checkValidQuantity_validQuantity_expectTrue() {
        String inputString = "0";
        boolean isValid = StockValidator.isValidQuantity(ui, inputString);
        assertTrue(isValid);
    }

    @Test
    public void checkValidQuantity_validQuantity_expectFalse() {
        String inputString = "-1";
        boolean isInvalid = StockValidator.isValidQuantity(ui, inputString);
        assertFalse(isInvalid);
    }


    @Test
    public void checkValidExpiry_validDate_expectTrue() {
        String inputDate = "08-10-2021";
        boolean isValid = StockValidator.isValidExpiry(ui, inputDate);
        assertTrue(isValid);
    }

    @Test
    public void checkValidExpiry_validDate_expectFalse() {
        String inputDate = "8 Oct 2021";
        boolean isInvalid = StockValidator.isValidExpiry(ui, inputDate);
        assertFalse(isInvalid);
    }

    @Test
    public void checkValidDescription_validDescription_expectTrue() {
        String inputDescription = "BEST MEDICINE TO CURE HEADACHES, FEVER AND PAINS";
        boolean isValid = StockValidator.isValidExpiry(ui, inputDescription);
        assertTrue(isValid);
    }

    @Test
    public void checkValidDescription_validDescription_expectFalse() {
        String inputDescription = "";
        boolean isInvalid = StockValidator.isValidExpiry(ui, inputDescription);
        assertFalse(isInvalid);
    }

    @Test
    public void checkValidMax_validQuantity_expectTrue() {
        String inputMaxQuantity = "100";
        boolean isValid = StockValidator.isValidExpiry(ui, inputMaxQuantity);
        assertTrue(isValid);
    }

    @Test
    public void checkValidMax_validQuantity_expectFalse() {
        String inputMaxQuantity = "";
        boolean isInvalid = StockValidator.isValidExpiry(ui, inputMaxQuantity);
        assertFalse(isInvalid);
    }

    @Test
    public void checkValidColumn_validColumn
}
