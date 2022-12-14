/**
 * A class that represents a measurement in feet and inches. The measurement
 * should be _well-formed_, that is, the number of inches should not be >= 12.
 */
public class Measurement {

    private int currentFeet;
    private int currentInches;

    /**
     * Constructor: initialize this object to be a measurement of 0 feet, 0
     * inches
     */
    public Measurement() {
        currentFeet = 0;
        currentInches = 0;

    }

    /**
     * Constructor: takes a number of feet as its single argument, using 0 as
     * the number of inches
     */
    public Measurement(int feet) {
        currentFeet = feet;
        currentInches = 0;

    }

    /**
     * Constructor: takes the number of feet in the measurement and the number
     * of inches as arguments (in that order), and does the appropriate
     * initialization
     */
    public Measurement(int feet, int inches) {
        currentFeet = feet + inches / 12;
        currentInches = inches % 12;
    }

    /**
     * Returns the number of feet in this Measurement. For example, if the
     * Measurement has 1 foot and 6 inches, this method should return 1.
     */
    public int getFeet() {
        return currentFeet; // provided to allow the file to compile
    }

    /**
     * Returns the number of inches in this Measurement. For example, if the
     * Measurement has 1 foot and 6 inches, this method should return 6.
     */
    public int getInches() {
        return currentInches; // provided to allow the file to compile
    }

    /**
     * Adds the argument m2 to the current measurement.
     *
     * @param m2 - Measurement to add. Should not change.
     * @return a new Measurement containing the sum of this and m2.
     */
    public Measurement plus(Measurement m2) {
        int currentLength = currentFeet * 12 + currentInches;
        int addLength = m2.currentFeet * 12 + m2.currentInches;
        currentLength += addLength;
        currentFeet = currentLength / 12;
        currentInches = currentLength % 12;
        return new Measurement(currentFeet, currentInches); // provided to allow the file to compile
    }

    /**
     * Subtracts the argument m2 from the current measurement. You may assume
     * that m2 will always be smaller than the current measurement.
     *
     * @param m2 - Measurement to subtract. Should not change.
     * @return a new Measurement containing the difference of this and m2.
     */
    public Measurement minus(Measurement m2) {
        int currentLength = currentFeet * 12 + currentInches;
        int minusLength = m2.currentFeet * 12 + m2.currentInches;
        currentLength -= minusLength;
        currentFeet = currentLength / 12;
        currentInches = currentLength % 12;
        return new Measurement(currentFeet, currentInches); // provided to allow the file to compile
    }

    /**
     * Returns a new Measurement that is the current measurement multiplied by
     * n. For example, if this object represents a measurement of 7 inches,
     * this.multiple(3) should return an object that represents 1 foot,
     * 9 inches (which totals to 21 inches).
     *
     * The current measurement should not change.
     *
     * @param multipleAmount
     * @return a new Measurement containing this times multipleAmount
     */
    public Measurement multiple(int multipleAmount) {
        int currentLength = currentFeet * 12 + currentInches;
        int multipleFeet = 0;
        int multipleInches = 0;
        int totalMultiInches = currentLength * multipleAmount;
        while (totalMultiInches >= 12) {
            totalMultiInches -= 12;
            multipleFeet += 1;
        }
        multipleInches = totalMultiInches;
        return new Measurement( multipleFeet, multipleInches); // provided to allow the file to compile
    }

    /**
     * Returns the String representation of this object in the form:
     *      f'i"
     * In other words, th number of feet followed by a single quote followed
     * by the number of inches less than 12 followed by a double quote (with no
     * blanks).
     *
     * For example, 0 foot 2 inches is formatted as 0'2"
     */
    @Override
    public String toString() {
        String strFeet = Integer.toString(currentFeet);
        String strInches = Integer.toString(currentInches);
        return strFeet + "\'" + strInches + "\""; // provided to allow the file to compile

    }


}