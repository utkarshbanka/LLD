package Opps;

public class OChildInheritance  extends  OInheritance{

    @Override
    public void emailPasswordPrint() {
        super.emailPasswordPrint();
    }

    public static void main(String[] args) {

        OInheritance o = new OChildInheritance(); // here what we do here we poin parent class if we don't point parent class here then we can not set the value beacue its beacme its varible are private ;
        o.name = "Utkarsh";
        o.password = "This is for testing only";

        o.emailPasswordPrint();


    }
}
