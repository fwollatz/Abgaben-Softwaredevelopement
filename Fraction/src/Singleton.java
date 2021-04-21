public class Singleton {
    private static Singleton Instanz;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if ((Instanz==null)){
            Instanz = new Singleton();
        }
        return Instanz;
        }
    }

