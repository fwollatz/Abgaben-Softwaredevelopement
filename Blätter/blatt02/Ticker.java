public class Ticker {
    private static Ticker Instanz;


    /**
     * Setting the constructer to private
     */
    private Ticker(){    }

    /**
     * Create an Instance of the Ticker-Class. If there already is an instance, use that one instead of creating a new one.
     * @return an instance of the Ticker
     */
    public static Ticker getInstance(){
        if ((Instanz==null)){
            Instanz = new Ticker();
        }
        return Instanz;
    }


    //Instanzmethoden
    /**
     * prints the text into the main console. Deletes new-lines and replaces them with "+++"
     * @param text the string that is supposed to be printed
     */
    public void print(String text){
        text = text.replace("\n", "+++");
        System.out.print("+++"+text);
    }
}

/**
 * 2.1.1:
 * Pros: Entwurfsmuster vereinfachen die Wartung und Erstellung. Sie sind von anderen Programmierern zu nutzen.
 * Cons:Ein festes Muster nimmt Flexibilität. Aufwändig zu lernen. Falscher Einsatz kann zu Verschlechterung führen.
 */