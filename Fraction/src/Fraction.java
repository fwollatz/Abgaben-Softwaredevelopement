public class Fraction {
    int numerator;
    int denominator;


    //Kürzen von Brüchen
    private int[] Kuerzen(int denominator, int numerator){
        int gegete = ggt(denominator, numerator);
        denominator = denominator/gegete;
        numerator = numerator/gegete;
        int[] rueckgabe={denominator,numerator};
        return rueckgabe;
    }

    //Größten gemeinsamen Teiler ermitteln
    public int ggt(int denominator, int numerator){
        int a = denominator;
        int b = numerator;
        int rest;
        while(b != 0){
            rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }


    //Instanzmethoden

        //Gibt die Fraction als String aus
        public String toString(){
            return numerator+"/"+denominator;
        }

        //Überladen der equals Funktion.
        public boolean equals(Fraction Other){
            return (Other.numerator==this.numerator)&&(Other.denominator==this.denominator);
        }

        //Rechenoperatoren
            Fraction multiply(int factor){
                int numerator = this.numerator*factor;
                Fraction ergebnis = new Fraction(numerator,this.denominator);
                return ergebnis;
            }

            Fraction multiply(Fraction factor){
                int numerator = this.numerator* factor.numerator;
                int denominator = this.denominator* factor.denominator;
                Fraction ergebnis = new Fraction(numerator,denominator);
                return ergebnis;
            }

            Fraction divide(Fraction factor){
                int numerator = factor.denominator;
                int denominator = factor.numerator;
                Fraction kehrwert = new Fraction(numerator,denominator);
                //System.out.println(kehrwert.toString());

                Fraction ergebnis = multiply(kehrwert);
                return ergebnis;
            }

            Fraction multiply(Fraction ... factors){

                Fraction ergebnis = new Fraction(1,1);
                for (Fraction factor: factors){
                    ergebnis = ergebnis.multiply(factor);
                }
                return ergebnis;
            }





    //Konstruktoren!

        //Instanziierungs-Funktion mit numerator und denominator
        public Fraction(int numerator, int denominator){
            if (denominator==0){
                System.out.println("The denominator has to be != 0");
            }
            int[] rueckgabe=Kuerzen(numerator,denominator);
            this.numerator=rueckgabe[0];
            this.denominator=rueckgabe[1];
            //System.out.println(rueckgabe[0]+"/"+rueckgabe[1]);
        }


        //Instanziierungs-Funktion mit numerator
        public Fraction(int numerator){
            this(numerator,1);
        }












}
