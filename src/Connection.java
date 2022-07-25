public class Connection {
    private static final  Connection conn=new Connection();
    /*static {
        conn=new Connection();
    }*/
    private Connection(){
        System.out.println("Création d'un instance de connection");
    }
    public static Connection getConn(){
        return conn;
    }
}
