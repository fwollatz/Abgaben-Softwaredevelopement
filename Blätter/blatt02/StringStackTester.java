public class StringStackTester {
    public static void main(String[] args){


        //StringStack GehtNicht=new StringStack(1);

        //Creating Original
        System.out.println("Creating Original");
        StringStack Original=new StringStack();
        Original.push("Eins");
        System.out.println(Original.peek());
        Original.push("Zwei");
        System.out.println(Original.peek());

        //Copying Original
        System.out.println("Copying Original");
        StringStack Copy=new StringStack(Original);
        System.out.println(Original.peek());
        System.out.println(Copy.peek());

        //Changing Copy
        System.out.println("Changing Copy");
        Copy.pop();

        System.out.println(Original.peek());
        System.out.println(Copy.peek());

        //check if Deep or shallow Copy
        if (Original.peek()!= Copy.peek()){
            System.out.println("We have a DeepCopy");
        }
        else{
            System.out.println("this is a shallow Copy");
        }
        //--> Keine Shallow, sondern Deep-Copy

    }
}
