public class Counter
{
    public static void main(String[] args){             //Start here

        if (checkInput(args)){                          //check if args are ok
            int x = Integer.parseInt(args[0]);          //convert Input to Int
            count(x);                                   //start counting
        }
    }


    public static boolean checkInput(String[] input){   //checks if input is valid

        //exactly one input is allowed
        if (input.length!=1){
            System.out.println("Counter takes exact 1 argument. A valid call would be \"java Counter 10\".");
            System.exit(1);
            return false;
        }

        //this input must be >0
        int arg0=Integer.parseInt(input[0]);//convert Input to Int
        if (arg0 <= 0){
            System.out.println("Counter only takes an Input > 0. A valid call would be \"java Counter 10\".");
            System.exit(1);
            return false;
        }

        return true;
    }

    public static void count(int x){        //counts from 1 to x:int
        for (int i = 1; i < x+1; i++) {
            System.out.println(i);
        }
    }
}
