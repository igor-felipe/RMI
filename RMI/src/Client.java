
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
   public static void main(String[] args) {
      try {
         ICalculator calc = (ICalculator) Naming
               .lookup("rmi://localhost:5509/RMI-Calculator");

         double resultado = calc.sum(8.0, 9.8);
         System.out.println("Resultado: " + resultado);

      } catch (NotBoundException | MalformedURLException | RemoteException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
