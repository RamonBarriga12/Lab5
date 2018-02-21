import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * checkings account.
     */
    private int checkings;
    /**
     * savings account.
     */
    private int savings;
    /**
     * student account.
     */
    private int student;
    /**
     * workplace account.
     */
    private int workplace;
    /**
     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name name of the string.
     * @param accountCategory category of the account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return checkings.
     */
    public int getCheckings() {
        return this.checkings;
    }

    /**
     *
     * @return savings.
     */
    public int getSavings() {
        return this.savings;
    }
    /**
     *
     * @return student.
     */
    public int getStudent() {
        return this.student;
    }

    /**
     *
     * @return checkings.
     */
    public int getWorkplace() {
        return this.workplace;
    }
}