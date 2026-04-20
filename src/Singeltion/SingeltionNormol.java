package Singeltion;

public class SingeltionNormol {

    private  static  SingeltionNormol instance;

    public  SingeltionNormol getInstance(){
        if(instance==null){
            instance=new SingeltionNormol();
        }
        return instance;
    }

    ///  This is not good for production here if two people run on same time two object created;
    //this is singletion but not safe
}
