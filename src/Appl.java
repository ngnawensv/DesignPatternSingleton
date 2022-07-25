public class Appl {
    public static void main(String[] args) {
        /*Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        */
        Connection c=Connection.getConn();
        Connection c1=Connection.getConn();
        Connection c2=Connection.getConn();

    }
}
