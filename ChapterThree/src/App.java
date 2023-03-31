public class App {
    public static void main(String[] args) throws Exception {
        DogDoor door = new DogDoor();
        BarkRecognizer bark = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        bark.recognize("wooof");
        System.out.println(door.isOpen());
        System.out.println("the door is closed");
        remote.pressButton();
        System.out.println("the door is opened");
        remote.pressButton();
        System.out.println("the door is closed");
        remote.pressButton();
        System.out.println(door.isOpen());
        System.out.println("the door is opened");
        remote.pressButton();
        System.out.println("the door is closed");


    }
}
