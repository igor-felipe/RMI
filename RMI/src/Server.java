import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) throws Exception {
        try {
            LocateRegistry
                    .createRegistry(5509)
                    .rebind("RMI-Calculator", new Calculator());

            System.out.println("Server awaiting requests.");
            System.out.println(
                "    |\\__/,|   (`\\\r\n" + //
                    "  _.|o o  |_   ) )\r\n" + //
                    "-(((---(((--------.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
