import java.util.LinkedList;

public class BarkRecognizer {
    private DogDoor door;
    private LinkedList <String> bark;

    public BarkRecognizer(DogDoor door, LinkedList <String> bark) {
        this.door = door;
        this.bark = bark;
    }

    public void recognize(String bark){
        for (String owner : this.bark) {
            if(owner == bark){
                door.open();
                return;
            }
        }
        System.out.println("this is not allowed dog");
    }
}
