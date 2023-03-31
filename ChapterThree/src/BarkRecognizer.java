import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println("Recognizing " + bark + " successfully.");
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
                door.close();
                timer.cancel();
            }

        }, 5000
        );
    }
}
