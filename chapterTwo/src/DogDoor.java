public class DogDoor{
    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public boolean isOpen(){
        return open;
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    public void barkRecognition(){
        open();
    }


}
