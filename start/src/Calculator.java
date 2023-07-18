import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements ICalculator {

    protected Calculator() throws RemoteException {
        super();
    }

    @Override
    public double sum(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        return a / b;
    }

    @Override
    public double log(double a) throws RemoteException {
        return Math.log(a);
    }

    @Override
    public double log10(double a) throws RemoteException {
        return Math.log10(a);
    }

    @Override
    public double exp(double a) throws RemoteException {
        return Math.exp(a);
    }

    @Override
    public double pow(double a, double b) throws RemoteException {
        return Math.pow(a, b);
    }

    @Override
    public double sin(double a) throws RemoteException {
        return Math.sin(a);
    }

    @Override
    public double cos(double a) throws RemoteException {
        return Math.cos(a);
    }

    @Override
    public double sqrt(double a) throws RemoteException {
        return Math.sqrt(a);
    }
}
