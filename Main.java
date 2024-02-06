public class Main {
    public static void main (String[] args){
        //"Math" is the maths method in Java

        System.out.println(Math.max(5, 10));//returns 10 as its the higher of the two numbers
        System.out.println(Math.min(5, 10));//returns 5 as is the lower of the two numbers
        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());//this makes a pseudorandom number
        int rand = (int) (Math.random() * 9);//this makes a pseudorandom number between zero and eight
        //don't forget that most languages are upper bound exclusive
        System.out.println(rand);
        System.out.println(rand);//ooh, random!
    }
}
