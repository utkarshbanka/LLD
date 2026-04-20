package Singeltion;

public class BillPushSingeltion {

    private BillPushSingeltion instance;

    private static class Holder {
         private static final BillPushSingeltion INSTANCE = new BillPushSingeltion();
    }

    private static  BillPushSingeltion getInstance(){
        return Holder.INSTANCE;
    }
}
