package finalAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * The ReadAccounts class provides methods to read account information from a CSV file.
 */
public class ReadAccounts {
    private String URL;

    /**
     * Constructs a ReadAccounts object with the specified file URL.
     * 
     * @param URL the URL of the CSV file
     */
    public ReadAccounts(String URL) {
        this.URL = URL;
    }

    /**
     * Returns a list of first names from the CSV file.
     * 
     * @return a LinkedList of first names
     * @throws IOException if an I/O error occurs
     */
    public LinkedList<String> getFirstNames() throws IOException {
        return getColumnData(0);
    }

    /**
     * Returns a list of last names from the CSV file.
     * 
     * @return a LinkedList of last names
     * @throws IOException if an I/O error occurs
     */
    public LinkedList<String> getLastNames() throws IOException {
        return getColumnData(1);
    }

    /**
     * Returns a list of account numbers from the CSV file.
     * 
     * @return a LinkedList of account numbers
     * @throws IOException if an I/O error occurs
     */
    public LinkedList<Integer> getAccounts() throws IOException {
        LinkedList<String> accountsString = getColumnData(2);
        LinkedList<Integer> accountsInteger = new LinkedList<>();
        for (String account : accountsString) {
            accountsInteger.add(Integer.parseInt(account));
        }
        return accountsInteger;
    }

    /**
     * Returns a list of balances from the CSV file.
     * 
     * @return a LinkedList of balances
     * @throws IOException if an I/O error occurs
     */
    public LinkedList<Integer> getBalances() throws IOException {
        LinkedList<String> balancesString = getColumnData(3);
        LinkedList<Integer> balancesInteger = new LinkedList<>();
        for (String balance : balancesString) {
            balancesInteger.add(Integer.parseInt(balance));
        }
        return balancesInteger;
    }

    /**
     * Utility method to get the data from a specified column of the CSV file.
     * 
     * @param column the column index
     * @return a LinkedList of data from the specified column
     * @throws IOException if an I/O error occurs
     */
    private LinkedList<String> getColumnData(int column) throws IOException {
        LinkedList<String> data = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(URL))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] dataParts = line.split(",");
                data.add(dataParts[column]);
            }
        }
        return data;
    }
}
