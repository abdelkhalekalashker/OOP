/**
 * Car
 */
public class Car {
    private String serial;
    private CarSpecs carSpecs;

    public Car(String serial,CarSpecs carSpecs) {
        this.carSpecs = carSpecs;
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public boolean matched(Car car){
        CarSpecs specs = this.carSpecs;
        CarSpecs matchSpecs = car.carSpecs;

        if (this.getSerial() == car.getSerial() || specs.matchedSpecs(matchSpecs))
            return true;
        return false;
    }

    public void carspecs(){
        carSpecs.info();
    }



}
