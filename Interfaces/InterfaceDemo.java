class Phone {
    void call() {
        System.out.println("Calling...");
    }

    void message() {
        System.out.println("Messaging...");
    }
}

interface ICamera {
    void takeASnap();

    void recordAVideo();
}

interface IMusicPlayer {
    void play();

    void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    public void videoCall(){
        System.out.println("Video calling started");
    }

    @Override
    public void play() {
        System.out.println("The song is playing");
    }

    @Override
    public void pause() {
        System.out.println("The song is stopped");
    }

    @Override
    public void takeASnap() {
        System.out.println("Photo taken");
    }

    @Override
    public void recordAVideo() {
        System.out.println("Video recorded");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.message();
        sp.play();
        sp.pause();
        sp.takeASnap();
        sp.recordAVideo();
        sp.videoCall();

        System.out.println();

        //Dynamic Method Dispatch
        ICamera c = new SmartPhone();
        //Can only call it's own methods
        c.takeASnap();
        c.recordAVideo();

        System.out.println();

        //Dynamic Method Dispatch
        IMusicPlayer m = new SmartPhone();
        //Can only call it's own methods
        m.play();
        m.pause();

        System.out.println();

        //Dynamic Method Dispatch
        Phone p = new SmartPhone();
        //Can only call it's own methods
        p.call();
        p.message();
    }
}
