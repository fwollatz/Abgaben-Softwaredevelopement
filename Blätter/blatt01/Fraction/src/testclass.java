public class testclass {

        private static void test(Fraction a, Fraction b){                                               //checks if a:Fraction and b:Fraction are equal
            if (a.equals(b)){
                System.out.println("This was equal to "+b.toString()+" and therefore correct.");
            }
            else {
                System.out.println("This was not equal to "+b.toString()+" and therefore incorrect.");
            }

        };

        public static void main(String args[]){                         //tests the different methods of class Fraction
            Fraction test1= new Fraction(1,2);
            Fraction test2= new Fraction(1,2);
            Fraction test3=new Fraction(1,2);
            Fraction test4=new Fraction(1,2);

            int testint=2;

            Fraction[] fractionarray={test1,test2,test3,test4};



            //if you want to test our code, you have to manually change the expected:Fraction.
            Fraction result=test1.multiply(testint);
            Fraction expected= new Fraction(1,1);
            System.out.println("The result was "+result.toString());
            test(result,expected);

            result=test1.multiply(test2);
            expected= new Fraction(1,4);
            System.out.println("The result was "+result.toString());
            test(result,expected);

            result=test1.divide(test2);
            expected= new Fraction(1,1);
            System.out.println("The result was "+result.toString());
            test(result,expected);

            result=test1.multiply(fractionarray);
            expected= new Fraction(1,16);
            System.out.println("The result was "+result.toString());
            test(result,expected);
            }

        }



