import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
            CarSpecs carSpecs = new CarSpecs("BMW" , "2022", 465);
            CarStore store = new CarStore();
            store.addCar("970987986" , carSpecs);
            store.addCar("970987986" , carSpecs);
            store.addCar("970987986" , carSpecs);

            Car searchCar = new Car("970987986" , carSpecs);
            LinkedList<Car> result = store.search(searchCar);

            if (result == null) {
                System.out.println("there was no result!");
            }else{
                for (Car car : result) {
                System.out.println("show this Car ");
                car.carspecs();
                }
            }
    }
}
