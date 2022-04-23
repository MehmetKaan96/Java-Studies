class TV {
    public void switchOn() {
        System.out.println("TV is on.");
    }

    public void changeChannel() {
        System.out.println("TV Channel changed.");
    }

    public void switchOff() {
        System.out.println("TV is off.");
    }
}

class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("SmartTV is on.");
    }

    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel changed.");
    }

    @Override
    public void switchOff() {
        System.out.println("SmartTV is off.");
    }

    public void browse() {
        System.out.println("Browsing the internet.");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchOn();
        t.changeChannel();
        t.switchOff();

        SmartTV st = new SmartTV();
        st.switchOn();
        st.changeChannel();
        st.browse();
        st.switchOff();

        //Dynamic Method Dispatch 
        TV tv = new SmartTV();
        tv.switchOn();//SmartTV method will be called
        tv.changeChannel();//SmartTV method will be called
        tv.switchOff();//SmartTV method will be called
        /*We couldn't use the browse() method. because even though the object
        is Sub class the reference is Super class, so that's why we can only 
        use Super class methods.*/
    }
}
