package Singeltion;

import kotlin.jvm.Synchronized;

public class ThreadSafeSingeltion {

    private static ThreadSafeSingeltion instance;

    private ThreadSafeSingeltion() {

    }

    private static  synchronized ThreadSafeSingeltion getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingeltion();
        }
        return instance;
    }
}
