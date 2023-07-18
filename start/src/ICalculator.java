import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
    double sum(double a, double b) throws RemoteException;

    double sub(double a, double b) throws RemoteException;

    double mul(double a, double b) throws RemoteException;

    double div(double a, double b) throws RemoteException;

    double log(double a) throws RemoteException;

    double log10(double a) throws RemoteException;

    double exp(double a) throws RemoteException;

    double pow(double a, double b) throws RemoteException;

    double sin(double a) throws RemoteException;

    double cos(double a) throws RemoteException;

    double sqrt(double a) throws RemoteException;
}
