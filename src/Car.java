/**Author: Matt Busch
 * Date: 11/28/2017
 * Purpose: Assign setters, getters, and constructors to Car object
 */
public class Car {
    private String color;
    private int horsePower;
    private double engineSize;
    private String make;

    /**Constructor without parameters
     *
     */
    public Car() {
        this.color = "Blue";
        this.horsePower = 650;
        this.engineSize = 6.5;
        this.make = "Ferrari";
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

    /**Returns the variable in a String
     * 
     * @return
     */
    public String toString() {
        return "Car color is " + this.color + ", horse power is " + this.horsePower + ", engine size is " + this.engineSize + ", make is " + this.make;
    }
}
