class Store {

    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }

    void invite() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }

}

interface Member {
    void callback();
}

class Customer implements Member {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("OK,I will visit " + name);

    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mehmet");
        Customer c2 = new Customer("AbdulBari");
        Store s = new Store();
        s.register(c1);
        s.register(c2);
        s.invite();
    }
}
