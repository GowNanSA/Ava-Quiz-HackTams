//Gowri Nanda's Avaiation Quiz 

//all avaiation information is from https://www.aopa.org/training-and-safety/learn-to-fly/flying-for-fun/take-your-medical-exam
//and faa.gov
//https://www.faa.gov/documentLibrary/media/Advisory_Circular/AC_90-89B.pdf
import java.util.*;
public class Quiz
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int points = 0, correct = 5, incorrect = 1;
        
        boolean start = false;
        System.out.print("What is your first name? -> "); 
        String name = sc.next();
        
        System.out.println("****HELLO!!!!****");
        System.out.println("Welcome to the flight safety test, Cadet " + name + "!");
        System.out.println("We hope that you have prepared well");
        System.out.println("If you can make it alive, you will become...");
        System.out.println("A pilot!");
        System.out.print("Are you ready, Cadet? Press 1 to start! -> ");
        int go = sc.nextInt();
        
        if(go == 1)
        {
            start = true; 
        }
        
        //Answer Key - A, C, B, B, C, A, C
        //Question Bank
        /*
        */
        boolean right = false;
        String answer = " ";
        while(start = true)
        {
            System.out.println("");
            System.out.println("****************************Your scenario******************************");
            System.out.println("*****You are working on preparing for/taking your Practical Test.******");
            System.out.println("*******Put the best action to complete when these things happen.*******");
            System.out.println("");
            
            //1
            System.out.println("Question 1. Which credentials must you follow when taking this test?");
            System.out.println(" A. Federal Aviation Administration \n B. Flight Safety Foundation \n C. General Aviation Pilots Association");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "a":
                    points+=correct;
                    System.out.println("Correct!\nThe FAA has created credentials for pilots and directions for beginner pilots.");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            
            //2
            System.out.println("Question 2. What is NOT a minimum requirement for a test pilot?");
            System.out.println(" A. Being fit\n B. Having the correct certification\n C. No food eaten 2 hours prior");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "c":
                    points+=correct;
                    System.out.println("Correct!\nThere are not really any officially listed credentials regarding food eaten before a\nflight. However, the pilot MUST be fit and have proper medical and education certification.");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            
            //3
            System.out.println("Question 3. What are three things that a pilot can NOT do before a flight?");
            System.out.println(" A. Drink alcohol, sit in a tanning bed, drink coffee \n B. Donate blood, have a lack of sleep, go scuba diving \n C. Have stress, have fatigue, take prescription drugs");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "b":
                    System.out.println("Correct!\nIt is important for a pilot to get plenty of sleep, and pilots can not\n pilot an aircraft if they donate 500 ml or less of blood.\nAdditionally, pilots can NOT be exposed to anesthetics 48 hours before flight.\nFun fact: pilots can not go scuba diving before a flight.\nWith prescription drugs, a pilot must have approval from an aviation medical examiner.");
                    points+=correct;
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println(""); 
            
            //4
            System.out.println("Question 4. What is the best way to avoid pain in the sinuses when flying?");
            System.out.println(" A. Bring cold medicine \n B. Do not fly with any respiratory condition \n C. Bring hot water ");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "b":
                    points+=correct;
                    System.out.println("Correct!\nIt is best to not fly with a cold or any sort of respiratory condition when\nin flight. Using medicine and nasal spray can help, but they\ncan cause fatigue.");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            
            //5
            System.out.println("Question 5. What is a sign that a propeller is out of track?");
            System.out.println(" A. Straight flange \n B. Moderately torqued mounting bolts \n C. Bent propeller blades");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "c":
                    points+=correct;
                    System.out.println("Correct!\nA out of track propeller can cause stress on the plane and make it unable to fly. A straight flange and properly rotated bolts indicate a tracked propeller.\nHowever bent blades are dangerous!");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            
            //6
            System.out.println("Question 6. What is a safety precaution to take before the engine of the plane starts?");
            System.out.println(" A. Wear ear and eye protection\n B. Manually check the engine \n C. Make sure the wheels are down ");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "a":
                    points+=correct;
                    System.out.println("Correct!\nIt is imperative to wear proper protection. Checking the engine before running can be very dangerous for teammates.\nThe wheels should also be down, not up. ");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            
            //7
            System.out.println("Question 7. What is NOT an engine test that is required after initial run-in tests?");
            System.out.println(" A. Compression Check \n B. Cold Cylinder Check \n C. Hot Cylinder Check");
            System.out.print("Enter your answer here: ");
            answer = sc.next();
            answer = answer.toLowerCase();     
            switch(answer)
            {
                case "c":
                    points+=correct;
                    System.out.println("Correct!\nThe cold cylinder check is is used to see if the engine ignites properly,\n and the compression check is for checking the pressure of the air.");
                    break;
                default:
                    points-=incorrect;
                    System.out.println("Incorrect :(");
                    break;
            }
            System.out.println("");
            System.out.println(""); 
            
            System.out.println("Final Score >>> " + points);

            //Calculate score
            if(points == 35)
            {
                System.out.println("Congratulations!!! You have passed this assessment!");
                System.out.println("You can take the Practical Test!");
                System.out.println(""); 
            }
            else if (points < 35 && points > 20)
            {
                System.out.println("Good job getting a decent score! You will want to answer all of these problems correctly");
                System.out.println(""); 
            }
            else if(points < 20)
            {
                System.out.println("Not quite there yet! You need to review the procedures before flight! Good effort!"); 
                System.out.println(""); 
            }
            
            else if(points < 0)
            {
                System.out.println("You received a negative score, so you must try harder!"); 
                System.out.println(""); 
            }
            System.out.println(""); 
            
            System.out.println("");
            System.out.print("Would you like to try this simulation again? Press 1 to try again, 2 to stop this assessment: ");
            go = sc.nextInt();
            if(go == 1)
                start = true;
            else if(go == 2)
            {
                start = false;
                break;
            }
        }
        System.out.println("Goodbye!!! Thank you for taking the test!");
        System.out.println(""); 
    }
}