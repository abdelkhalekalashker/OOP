import java.util.LinkedList;

public class BarkRecognizer {
    private DogDoor door;
    private LinkedList <String> allowedBarks;

    public BarkRecognizer(DogDoor door, LinkedList <String> bark) {
        this.door = door;
        this.allowedBarks = bark;
    }

    public void recognize(String bark){
        for (String allowedBark : this.allowedBarks) {
            if(allowedBark == bark){
                door.open();
                return;
            }
        }
        System.out.println("this is not allowed dog");
    }
}
