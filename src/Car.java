/**Author: Matt Busch
 * Date: 11/28/2017
 * Purpose: Assign setters, getters, and constructors to Car object
 */
public class Car {
    private String color;
    private int horsePower;
    private double engineSize;
    private String make;
    private static int count;

    /**Constructor without parameters
     *
     */
    public Car() {
        this.color = "";
        this.horsePower = 0;
        this.engineSize = 0;
        this.make = "";
        this.count++;
    }

    /**Constructor with parameters
     *
     * @param color
     * @param horsePower
     * @param engineSize
     * @param make
     */
    public Car(String color, int horsePower, double engineSize, String make) {
        this.color = color;
        this.horsePower = horsePower;
        this.engineSize = engineSize;
        this.make = make;
        this.count++;
    }

    /**Get the color of the Car
     *
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**Set the color of the Car
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**Get the horse power of the car
     *
     * @return
     */
    public int getHorsePower() {
        return this.horsePower;
    }

    /**Set the horse power of the car
     *
     * @param horsePower
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /**Get the engine size of the car
     *
     * @return
     */
    public double getEngineSize() {
        return this.engineSize;
    }

    /**Set the engine size of the car
     *
     * @param engineSize
     */
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    /**get the make of the car
     *
     * @return
     */
    public String getMake() {
        return this.make;
    }

    /**Set the make of the car
     *
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**Get the count of cars
     *
     * @return
     */
    public static int getCount() {
        return count;
    }
    public boolean equals(Car otherObject) {
        return (this.color == otherObject.color) && (this.horsePower == otherObject.horsePower) && (this.engineSize == otherObject.engineSize)&& (this.make == otherObject.make);
    }

    /**Returns the variable in a String
     *
     * @return
     */
    public String toString() {
        return "Car color is " + this.color + ", horse power is " + this.horsePower + ", engine size is " + this.engineSize + ", make is " + this.make;
    }
}
