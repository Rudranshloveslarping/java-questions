interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo captured");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone();
        p.takePhoto();
        p.playMusic();
    }
}
