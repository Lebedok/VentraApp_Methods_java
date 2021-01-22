package com.techtorial.ventraApp;

import java.util.ArrayList;
import java.util.Scanner;

public class VentraAppRunner {

    static VentraCardMachine machine = new VentraCardMachine("Chicago");

    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }

    private static   void makeAChoice(String choice){
        Scanner input= new Scanner(System.in);
        switch (choice){
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
                System.out.println("Please enter your Full Name");
                String FullName =input.nextLine();
                System.out.println("Please enter your PhoneNumber");
                String PhoneNumber =input.nextLine();
                System.out.println("Please enter your Email");
                String Email =input.next();
                VentraCard newCard= new VentraCard(FullName, PhoneNumber,Email);


                machine.addCard(newCard);

                System.out.println("Total card number is " + machine.getAllCards().size());

                /*
                1- Using scanner get the information of User (FullName, PhoneNumber, Email)
                2- Create new card According to this information(Call createCard method)
                3- Call addCard method from VentraCard Machine and add new card
                 */
                break;
            case "2":

                machine.printCardNumbersAndNames (machine.getAllCards());

                break;
            case "3":
                machine.printCardNumbers(machine.getAllCards());
break;
            case "4":
                Scanner input1=new Scanner(System.in);
                System.out.println("Please enter your old card number");
                long oldCardNumber=input1.nextLong();
                if(machine.cardNumberChecker(oldCardNumber)){
                    System.out.println("Please enter your Full Name");
                    String FullName1 =input.nextLine();
                    System.out.println("Please enter your new PhoneNumber");
                    String PhoneNumber1 =input.nextLine();
                    System.out.println("Please enter your new Email");
                    String Email1 =input.next();

                    VentraCard newCard1= new VentraCard(FullName1,PhoneNumber1,Email1);
                    System.out.println("Congrats, you updated your card.Your new card num" +
                            "ber is " + newCard1.getCardNumber());
                    System.out.println(newCard1.getFullName());
                    System.out.println(newCard1.getPhoneNumber());
                    System.out.println(newCard1.getEmail());
                }
                else System.out.println("Card number is not valid");



                break;

            case "5":
                System.out.println("Please enter your old card number");
                long oldCardNumber1=input.nextLong();
                if(machine.cardNumberChecker(oldCardNumber1)){
                    machine.changeCardNumber(oldCardNumber1);
                    System.out.println("Card number has changed");
                }
                else System.out.println("Card number is not valid");

                break;


            case "6":
                System.out.println("Please enter your old card number");
                long oldCardNumber2=input.nextLong();

                System.out.println("Please enter new email address");
                String newEmail=input.next();



                machine.changeEmailAddress(oldCardNumber2,newEmail);
                break;


            case "7":
                System.out.println("Please enter your phone number");
                String phoneNumber=input.next();

                machine.printWithPhoneNumber(phoneNumber);

                break;

            case "8":
                printOptions();

                break;

            case "9":
                System.out.println("Please enter the car number that you want to remove");
                long cardNumber=input.nextLong();
                machine.removeCard(cardNumber);

                break;



        }
    }

    public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

        System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card  with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To print available options");
        System.out.println("9 - To remove card");
        System.out.println("0 - To exit");
    }
}
