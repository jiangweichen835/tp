package parser;

import command.CommandParameters;
import inventory.Medicine;
import inventory.Stock;

import java.util.ArrayList;
import java.util.HashMap;

public class MedicineManager {

    /**
     * Retrieves the total stock quantity for medicine with same name.
     *
     * @param medicines Arraylist of medicines.
     * @param name      Medicine name.
     * @return Total stock quantity for the medicine.
     */
    public static int getTotalStockQuantity(ArrayList<Medicine> medicines, String name) {
        int existingQuantity = 0;
        for (Medicine medicine : medicines) {
            if (!(medicine instanceof Stock)) {
                continue;
            }
            boolean isSameMedicineName = medicine.getMedicineName().equalsIgnoreCase(name);
            if (isSameMedicineName) {
                existingQuantity += medicine.getQuantity();
            }
        }
        return existingQuantity;
    }

    /**
     * Retrieves the maximum stock quantity for medicine with same name.
     *
     * @param medicines Arraylist of medicines.
     * @param name      Medicine name.
     * @return Total maximum stock quantity for the medicine.
     */
    public static int getMaxStockQuantity(ArrayList<Medicine> medicines, String name) {
        int existingMaxQuantity = 0;
        for (Medicine medicine : medicines) {
            if (!(medicine instanceof Stock)) {
                continue;
            }
            boolean isSameMedicineName = medicine.getMedicineName().equalsIgnoreCase(name);
            if (isSameMedicineName) {
                existingMaxQuantity = ((Stock) medicine).getMaxQuantity();
                break;
            }
        }
        assert (existingMaxQuantity > 0) : "Invalid max quantity";
        return existingMaxQuantity;
    }

    /**
     * Retrieves total number of column for the medicine with same name.
     *
     * @param medicines Arraylist of medicines.
     * @param name Medicine name.
     * @return Total number of columns for the same medicine.
     */
    public static int getTotalColumn(ArrayList<Medicine> medicines, String name) {
        int existingColumnQuantity = 0;
        for (Medicine medicine : medicines) {
            if (medicine instanceof Stock) {
                boolean isSameMedicineName = medicine.getMedicineName().equalsIgnoreCase(name);
                if (isSameMedicineName) {
                    existingColumnQuantity++;
                }
            }
        }
        return existingColumnQuantity;
    }

    /**
     * Extracts the stock object for a given stock id.
     *
     * @param parameters HashMap Key-Value set for parameter and user specified parameter value.
     * @param medicines  Arraylist of all medicines.
     * @return Stock object of the provided stock id by user
     */
    public static Stock extractStockObject(HashMap<String, String> parameters, ArrayList<Medicine> medicines) {
        int stockId = Integer.parseInt(parameters.get(CommandParameters.STOCK_ID));
        Stock stock = null;
        for (Medicine medicine : medicines) {
            if (medicine instanceof Stock && stockId == ((Stock) medicine).getStockID()) {
                stock = (Stock) medicine;
            }
        }
        return stock;
    }

}
