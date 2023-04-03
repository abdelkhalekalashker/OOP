public class BarkRecognizer {
    private DogDoor door;
    private String bark;

    public BarkRecognizer(DogDoor door, String bark) {
        this.door = door;
        this.bark = bark;
    }

    public void recognize(String bark){
        if(this.bark == bark){
            door.open();

        }
    }
}
