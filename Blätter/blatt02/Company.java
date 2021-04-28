public class Company {
    String name;

    //Instanzmethoden:
    /**
     * chnanges the stock prices
     * @param d new stockptice, converted into string to print on ticker
     */
    public void changeStockPrice(double d){
        Ticker ticker = Ticker.getInstance();
        String str = Double.toString(d);
        ticker.print(name+":"+str);
    }

    @Override
    /**
     * Overloading the method finalize to show when the garbage collector gets active
     */
    protected void finalize(){
        Ticker ticker = Ticker.getInstance();
        ticker.print(name+": is insolvent");
    }
}