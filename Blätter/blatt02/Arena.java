import java.lang.Math;

public class Arena {


    /**
     *
     * @param a : double[]; n-dimensional Vector,
     * @param b : double[]; n-dimensional Vector,
     * @return sum: double;
     */
    private double dotProduct(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {                            //Für jede Dimension des Vektors multipliziere und summiere auf
            sum += a[i] * b[i];
        }
        return sum;
    }


    /**
     *
     * @param vec: double[]; Vektor von dem wir den Betrag wollen
     * @return double; Betrag des Vectors
     */
    private double betragEinesVektors(double[] vec){
        return Math.sqrt(Math.pow(vec[0],2.0)+Math.pow(vec[1],2.0));
    }


    /**
     *
     * @param x: double; x koordinate des Tributs
     * @param y: double; y koordinate des Tributs
     * @return Areal in dem der Tribut ist.
     * 1 entspricht dem Areal von 12-13 Uhr, 2 ist 13 bis 14 Uhr, usw.
     */
    public int getArea(double x, double y){

        double[] VecMitteZwoelf={0.0,1.5};
        double[] VecMitteTribut={x,y};


        //Nicht mehr in Arena. Alarm.
        if (betragEinesVektors(VecMitteTribut)>1.5){                    //Checke ob Distanz zur Mitte größer als radius
            return -1;
        }


        //in Arena: Alles gut.
        //Berechne den Winkel von dem Vectoren VecMitteZwoelf((0/0) zu (0/1.5)) zu VecMitteTribut ((0/0) zu (x/y))
        double skprodukt=dotProduct(VecMitteZwoelf,VecMitteTribut);
        double betrag1=betragEinesVektors(VecMitteZwoelf);
        double betrag2=betragEinesVektors(VecMitteTribut);
        double winkel=Math.acos(skprodukt/(betrag1*betrag2));

        //umrechnung von Bogen in Gradmaß:
        winkel=(360/(2*Math.PI))*winkel;


        //bestimme die Position
        int position=(int)winkel;
        if (winkel>0 && winkel<=30){
            position=1;
        }
        else if (winkel>30 && winkel<=60){
            position=2;
        }
        else if (winkel>60 && winkel<=90){
            position=3;
        }
        else if (winkel>90 && winkel<=120){
            position=4;
        }
        else if (winkel>120 && winkel<=150){
            position=5;
        }
        else if (winkel>150 && winkel<=180){
            position=6;
        }


        //Spiegeln, falls auf der Linken Seite
        if (x>0) {
            return position;
        }
        else{
            return 13-position;
        }

    }
}
