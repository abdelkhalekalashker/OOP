import java.util.Iterator;
import java.util.LinkedList;

public class CarStore {
    LinkedList<Car> cars;

    public CarStore() {
        cars = new LinkedList<Car>();
    }

    public void addCar(String serial,CarSpecs carSpecs) {
        Car car = new Car(serial, carSpecs);
        cars.add(car);
    }

    public  LinkedList<Car> search(Car searchCar){

        LinkedList<Car> resultCars = new LinkedList<Car>();
       for(Iterator i = cars.iterator(); i.hasNext() ; ){
           Car car = (Car)i.next();
           if(car.matched(searchCar))
               resultCars.add(car);
       }
       return resultCars;
   }

}
