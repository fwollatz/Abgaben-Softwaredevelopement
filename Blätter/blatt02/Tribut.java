public class Tribut {
    double x; //double x-koordinate
    double y; //double y-koordinate
    int area; //int area in which the tribute is
    int id;   //identifier for tribute

    static int idcounter=0;

    /**
     *
     * @param x; double x-koordinate
     * @param y; double y-koordinate
     * @param area; int area in which the tribute is
     */
    public Tribut(double x,double y, int area){
        idcounter++;
        id=idcounter;
        this.x=x;
        this.y=y;
        this.area=area;
    };
}
