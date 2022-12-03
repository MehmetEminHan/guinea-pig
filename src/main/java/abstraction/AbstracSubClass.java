package abstraction;



public class AbstracSubClass extends AbstractClass  {


    @Override
    public int sayHello(int a){
        int b =a;
        return b;
    }

    @Override
    public String method() {
        return "Abstract method from abstrac subclass";
    }
}
