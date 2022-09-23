public class MathOperation {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 25000000000L;
        long starsInAndromeda = 100000000000L;
        
        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected   " + (bagOfSweets1 + bagOfSweets2) + "   sweets");
        System.out.println( "There are  " + ( starsInMilkyWay + starsInAndromeda) + "  stars in the Milky Way and Andromeda");
        System.out.println( "With bon us marks, Ron scored  " + ( testScore + bonusMarks) + "/10 on his potion test. Snape wasn't too thrilled" );
        
        System.out.println( "Fred and George used a special spell to multiply their sweets to:  " + ( bagOfSweets1 * bagOfSweets2));
        System.out.println( "Snape made an error on his excal, accidentally multiplying Ron's score to:  " + (testScore * bonusMarks ) + "/10");  
    
        System.out.println("Originally, Fred had  " + (bagOfSweets2/bagOfSweets1) + "   times more sweets than George");
        System.out.println("Andromeda has  " + (starsInAndromeda/starsInMilkyWay) + "times more stars");
        System.out.println( "Snape caught the error furious, he divided Ron's score to:  " + (testScore/bonusMarks));
        
        System.out.println("10 is an even number, since dividing 10 by 2 has a reminder of:  " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a reminder of:  " + (5 % 2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);

        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);
    }   
}
