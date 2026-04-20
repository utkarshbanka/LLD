package Singeltion;

public class EagerSingelton {

    private static  final EagerSingelton instance = new EagerSingelton();

    private EagerSingelton() {}


    private EagerSingelton getInstance() {
        return instance;
    }
}
