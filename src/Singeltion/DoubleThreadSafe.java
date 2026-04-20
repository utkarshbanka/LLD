package Singeltion;

public class DoubleThreadSafe {

    private static  DoubleThreadSafe instance;


    public static  DoubleThreadSafe  getInstance(){
        if(instance == null){
            synchronized (DoubleThreadSafe.class){
                if(instance == null){
                    instance = new DoubleThreadSafe();
                }
            }
        }
        return instance;
    }
}
