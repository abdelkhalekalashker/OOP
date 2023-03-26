

public class CarSpecs {

    private String name;
    private String model;
    private int price;

    public CarSpecs(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price  = price;
    }

    public void info() {
        System.out.println("\n Name: " + name + "\n Model: " + model + "\n Price: " + price);
    }

    public boolean matchedSpecs(CarSpecs matchSpecs){
        if (this.name == matchSpecs.getName() || this.model == matchSpecs.getModel() || this.price == matchSpecs.getPrice())
            return true;

            return false;

    }




}
