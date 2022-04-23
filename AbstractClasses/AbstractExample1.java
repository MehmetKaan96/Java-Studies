abstract class Hospital {
    abstract void emergency();

    abstract void appointment();

    abstract void admit();

    abstract void billing();
}

class MyHospital extends Hospital {
    MyHospital() {
        System.out.println("Welcome to MyHospital");
    }

    void emergency() {
        System.out.println("Emergency Department");
    }

    void appointment() {
        System.out.println("Please come in to your appointment in time");
    }

    void admit() {
        System.out.println("Doctor will admit you soon, please be patient.");
    }

    void billing() {
        System.out.println("Yout doctor bill will be sent via email");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        //reference of an abstract class
        Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();

        MyHospital mh = new MyHospital();
        mh.emergency();
        mh.appointment();
        mh.admit();
        mh.billing();
    }
}
