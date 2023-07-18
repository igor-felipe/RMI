import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) throws Exception {
        try {
            LocateRegistry
                    .createRegistry(5509)
                    .rebind("RMI-Calculator", new Calculator());

            System.out.println("Server awaiting requests.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
