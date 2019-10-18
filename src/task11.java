import java.util.Scanner;
import java.lang.*;


public class task11 {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.println("Hey, What is your name?");
        String NameInput = in.next();
        Thread.sleep(2500);
        System.out.println("Nice to meet you " + NameInput + "!! " + "You have a very nice name :)");
        Thread.sleep(6000);
        System.out.println("Hmm Uno Question? Are you a bit crazy?");
        String AnswerToCraziness = in.next();
        Thread.sleep(4000);

        if(AnswerToCraziness.equals("no, why?") || AnswerToCraziness.equals("No, why?") ||AnswerToCraziness.equals("why?") ||AnswerToCraziness.equals("Why?") ||AnswerToCraziness.equals("??") || AnswerToCraziness.equals("no")|| AnswerToCraziness.equals("No"))
        {
            System.out.println("You are currently talking to the calculator... Congratulations, your life in on the terrific course!");
        }
        else if (AnswerToCraziness.equals("yes") || AnswerToCraziness.equals("Yes"))
        {
            System.out.println("As I thought... You realize that you are currently talking to the computer? Ok doesn't matter...");
        }

        Thread.sleep(7000);
        System.out.println("You know what? you seem to be funny, I like you already!");
        Thread.sleep(6000);
        System.out.println("Do you want to listen to my joke?");
        String AnswerToAJoke = in.next();

        if(AnswerToAJoke.equals("Yes") || AnswerToAJoke.equals("yes") || AnswerToAJoke.equals("ok"))
        {
            Thread.sleep(1000);
            System.out.println("Good choice - Here it comes!");
            Thread.sleep(3000);
            System.out.println("How many times does 43 go into 9?");
            Double AnwserPriest = in.nextDouble();
            Thread.sleep(3000);

            if(AnwserPriest.isNaN())
            {
                System.out.println("Common! Give me your answer!");
                in.nextDouble();
                Thread.sleep(1300);
            }


            System.out.println("The priest won't tell you, but he knows.");
            Thread.sleep(5000);
            System.out.println("Hhahahahhah I bet you are laughing too!");
            Thread.sleep(5000);
            System.out.println("Enough jokes, let's get to work! A word to introduce myself");
            Thread.sleep(6000);
        }
        else if(AnswerToAJoke.equals("No") || AnswerToAJoke.equals("no") || AnswerToAJoke.equals("nope"))
        {
            System.out.println("Rough customer, I wish I had legs and could run the fuck out of here. But anyways...");
        }

        Thread.sleep(6000);
        System.out.println("I am a funny perimeter and area calculator! Just give me the radius and I will do the rest");



        Thread.sleep(6000);
        System.out.println("And to be completely honest with you... I am pretty busy so if you could give me a heads up how many times do you want to use me?");
        int IleRazy = in.nextInt();




        for(int i = 0; i<IleRazy; i++) {
            System.out.println("Ok, So what is the radius of your circle?");
            Double RadiusInput = in.nextDouble();

            if (RadiusInput.isNaN()) {
                System.out.println("Ohh baby... didn't you have math at school? Think twice before you ask me again");
            }
            System.out.println("What should I calculate- Perimeter or Area? ");
            String Choice = in.next();

            ///  Zmienne
            final Double PiValue = 3.14;
            Double PerimeterValue = RadiusInput * PiValue * 2;
            Double AreaValue = 2 * PiValue * (RadiusInput * RadiusInput);

            /// Wybór programu
            if (Choice.isEmpty()) {
                System.out.println("Proszę byś coś podał");
                Choice = in.next();
            } else if (Choice.equals("Perimeter") || Choice.equals("perimeter")) {
                System.out.println("The Perimeter is equal to: " + PerimeterValue);
            } else if (Choice.equals("Area") || Choice.equals("area")) {
                System.out.println("Area of the circle is equal to: " + AreaValue);
            } else {
                System.out.println("I do not understand what do you mean...");
            }
            Thread.sleep(3000);
        }


    }
}
