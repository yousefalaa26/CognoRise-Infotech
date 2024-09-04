import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= (int)(Math.random()*10)+1;
        boolean flag= true;
        for(int i=0; i<3; i++){
            System.out.println("You have "+(3-i)+" trails\nGuess a number between 1 and 10: ");
            int guess = input.nextInt();
            if(guess == num){
                flag= false;
                System.out.println("You guessed it!");
                break;
            }
            else{
                if (guess > num)
                    System.out.println("Too high");
                else
                    System.out.println("Too low");
            }
        }
        if(flag)
            System.out.println("No more Trails, Try again");
    }
}
