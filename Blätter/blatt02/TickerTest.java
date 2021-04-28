public class TickerTest {
    public static void main(String[] args){

        //Testing if the Ticker Works
        Ticker ticker =Ticker.getInstance();

        //Creating Companies
        Company fwollatz = new Company();
        fwollatz.name="fwollatz";
        fwollatz.changeStockPrice(1000000.00);

        Company dbeeck = new Company();
        dbeeck.name="dbeeck";
        dbeeck.changeStockPrice(2.00);
        dbeeck=null;

        System.gc(); //hints to the VM it needs to clean up. The decision if a gc is performed is still up to the VM.

        for(int i=0; i<100; i++){fwollatz.changeStockPrice(i*1.00);}

        fwollatz=null;

        System.out.println();
        System.out.println();
        System.out.println("Unterbrochen: Das drüber und drunter veschiedene Sachen stehen, zeigt, dass die GC ziemlich random ist. ");
        System.out.println();

        //Creating Companies
        fwollatz = new Company();
        fwollatz.name="fwollatz";
        fwollatz.changeStockPrice(1000000.00);

        dbeeck = new Company();
        dbeeck.name="dbeeck";
        dbeeck.changeStockPrice(2.00);
        dbeeck=null;

        System.gc(); //hints to the VM it needs to clean up. The decision if a gc is performed is still up to the VM.

        for(int i=0; i<100; i++){fwollatz.changeStockPrice(i*1.00);}

        fwollatz=null;

        while (true){}//waiting for destructor to definitly be called. Not wise in real life.
    }
}
