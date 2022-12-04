package generic;

public class GenericClass <T> {
   private T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
