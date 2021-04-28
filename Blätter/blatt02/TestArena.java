public class TestArena {


    public static void main(String[] args){
        /*erstelle Arena*/
        Arena panem=new Arena();

        /*erstelle 13 Fälle*/
        Tribut[] Testbatterie= {
                new Tribut(0.25,1,1),//1
                new Tribut(0.75,0.75,2),//2
                new Tribut(1,0.25,3),//3
                new Tribut(1,-0.25,4),//4
                new Tribut(0.5,-0.5,5),//5
                new Tribut(0.5,-1,6),//6
                new Tribut(-0.25,-1,7),//7
                new Tribut(-0.75,-0.75,8),//8
                new Tribut(-1,-0.25,9),//9
                new Tribut(-1,0.25,10),//10
                new Tribut(-0.75,0.75,11),//11
                new Tribut(-0.25,1,12),//12
                new Tribut(200,400,-1),//13
        };

        /*Teste alle 13 Tribute*/
        boolean Fehler=false;
        for (int g=0; g<Testbatterie.length; g++){
            Tribut Test=Testbatterie[g];
            int area=panem.getArea(Test.x, Test.y);

            //ist vermutetes und tatsächliches Areal gleich?
            if (!(Test.area==area)){
                System.out.println(Test.id+" ist defekt. Er ist in "+area+" hätte aber in "+Test.area+" sein sollen");
                Fehler=true;
            }


        }

        //Melde ob das System Fehlerfrei durchlief oder nicht.
        if (Fehler){
            System.out.println("Etwas passt nicht.");
        }
        else{
            System.out.println("Läuft Fehlerfrei");
        }


    }


}
