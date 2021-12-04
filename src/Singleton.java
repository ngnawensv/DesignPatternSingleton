public class Singleton {
    private  static final Singleton singleton;
    static {
        singleton = new Singleton();
    }
    private Singleton(){
        System.out.println("Instance created");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
