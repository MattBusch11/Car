/**Author: Matt Busch
 * Date: 11/28/2017
 * Purpose: Instantiate Car objects
 */
public class CarDriver {
    /**Purpose: Instantiate variables of Car Objects and output them
     *
     * @param args
     */
    public static void main(String [] args) {
        Car hisCar = new Car("Black", 400, 3.5, "Honda");
        Car herCar = new Car("Pink", 300, 2.5, "Volks");
        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setHorsePower(650);
        myCar.setEngineSize(6.5);
        myCar.setMake("Ferrari");
        System.out.println(myCar.getColor());
        System.out.println(myCar.getHorsePower());
        System.out.println(myCar.getEngineSize());
        System.out.println(myCar.getMake());
        System.out.println(hisCar);
        System.out.println(herCar);
    }
}
