import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExerciseNumberOne();
        ExerciseNumberTwo();
        ExerciseNumberThree();
        ExerciseNumberFour();
        ExerciseNumberFive();
    }
    public static void ExerciseNumberOne(){

        System.out.println("Enter your username");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        if(username.toLowerCase().equals("admin")){
            System.out.println("welcome admin");
        }else if(username.toLowerCase().equals("superuser")){
            System.out.println("welcome superuser");
        }else{
            System.out.println("welcome user");
        }

    }

    public static void ExerciseNumberTwo(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber){

            System.out.println("greatest number is : " + firstNumber);
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("greatest number is : " + secondNumber);
        }else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("greatest number is : " + thirdNumber);
        }else System.out.println("number are equaled");
    }

    public static void ExerciseNumberThree(){
        int RandomNumber = (int) (Math.random() * 7);

        RandomNumber = RandomNumber == 0 ? 1 : RandomNumber; // Remove 0 from random

        switch(RandomNumber){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
                                        default:
                                            System.out.println("Invalid number");
                                            break;
        }
    }
    public static void ExerciseNumberFour(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score grade");
        int score = input.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("A");
        }else if(score >= 80 && score <= 89){
            System.out.println("B");
        }else if(score >= 70 && score <= 79){
            System.out.println("C");
        }else if(score >= 60 && score <= 69){
            System.out.println("D");
        }else if(score >= 0 && score <= 59){
            System.out.println("F");
        }else{
            System.out.println("Invalid score");
        }
    }

    public static void ExerciseNumberFive(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age >= 0 && age < 13){
            System.out.println("Child");
        }else if(age >= 13 && age <= 19){
            System.out.println("Teenager");
        }else if(age >= 20){
            System.out.println("Adult");
        }else System.out.println("Invalid age");
    }
}