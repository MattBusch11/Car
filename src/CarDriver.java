import javax.swing.*;

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
        System.out.println("Number of cars is " + Car.getCount());
        String color = JOptionPane.showInputDialog(null, "Enter color of the car");
        int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse power of the car"));
        double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter engine size of the car"));
        String make = JOptionPane.showInputDialog(null, "Enter make of the car");







        Car hisCar = new Car(color, horsePower, engineSize, make);
        Car herCar = new Car("Black", 400, 3.5, "Honda");
        Car myCar = new Car("Black", 400, 3.5, "Honda");
        /*myCar.setColor("Blue");
        myCar.setHorsePower(650);
        myCar.setEngineSize(6.5);
        myCar.setMake("Ferrari");
        System.out.println(myCar.getColor());
        System.out.println(myCar.getHorsePower());
        System.out.println(myCar.getEngineSize());
        System.out.println(myCar.getMake());*/
        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);
        System.out.println("Is myCar the same as hisCar? " + myCar.equals(hisCar));
        System.out.println("Is hisCar the same as herCar? " + hisCar.equals(herCar));
        System.out.println("Is herCar the same as myCar? " + herCar.equals(myCar));

    }
}
