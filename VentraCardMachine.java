package com.techtorial.ventraApp;

import java.util.ArrayList;

public class VentraCardMachine {

    private String location;
    private ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location) {
        this.location = location;
        this.allCards = new ArrayList<VentraCard>();
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<VentraCard> getAllCards() {
        return allCards;
    }

    public  void addCard(VentraCard card) {


            allCards.add(card);
        System.out.println("Congrats.You have created your new VentraCard.Safe Travel!");
        System.out.println("Your Card Number is " +card.getCardNumber());

        }
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */


    public void printCardNumbers(ArrayList<VentraCard> cards) {

        for (int i = 0; i < cards.size(); i++) {
            System.out.println((i+1) +". Card Number is " + cards.get(i).getCardNumber());
        }

        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    }


    public void printCardNumbersAndNames(ArrayList<VentraCard> cards) {

        for (int i = 0; i < cards.size(); i++) {
            System.out.println((i+1)+". Name is " + cards.get(i).getFullName()
            +" Card Number is " + cards.get(i).getCardNumber());
        }
    }








        public boolean updateCard(long oldCardNumber, VentraCard newCard) {

        if(cardNumberChecker(oldCardNumber)){
            for (int i = 0; i < allCards.size(); i++) {
                if (allCards.get(i).getCardNumber() == oldCardNumber) {
                    allCards.set(i, newCard);
                    System.out.println("Changed");
                }

            }
        }

            return cardNumberChecker(oldCardNumber);
        }

    public void printCardHoldersName(ArrayList<VentraCard> cards) {

        for (int i = 0; i < cards.size(); i++) {
                    System.out.println(cards.get(i).getFullName());
        }
    }

    public void changeEmailAddress(long cardNumber, String newEmail) {
        int oldCardIndex = 0;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == cardNumber) {
                oldCardIndex = i;
            }
        }

        allCards.get(oldCardIndex).setEmail(newEmail);


    }


    public void removeCard(long cardNumber) {
        if (cardNumberChecker(cardNumber)) {
            int oldCardIndex = 0;
            for (int i = 0; i < allCards.size(); i++) {
                if (allCards.get(i).getCardNumber() == cardNumber) {
                    oldCardIndex = i;
                }
                allCards.remove(oldCardIndex);
                System.out.println("Card has been removed");

            }
        }
        else System.out.println("Card number is not valid");;
    }

    public void printWithPhoneNumber(String phoneNumber){
        int oldCardIndex = 0;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                oldCardIndex = i;
            }
        }
        System.out.println("Name is " + allCards.get(oldCardIndex).getFullName()+
                " Phone number is " + allCards.get(oldCardIndex).getPhoneNumber()+
                " Email is " + allCards.get(oldCardIndex).getEmail()+
                " Card Number is " + allCards.get(oldCardIndex).getCardNumber());
    }

    public void changeCardNumber(long oldCardNumber){
    long newCardNumber=0;
       do{
           newCardNumber=(long)(Math.random()*10000000000000000l);
       }while (cardNumberChecker(newCardNumber));



        int oldCardIndex = 0;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == oldCardNumber) {
                oldCardIndex = i;
            }
        }
        allCards.get(oldCardIndex).setCardNumber(newCardNumber);

        System.out.println("New card number is " + allCards.get(oldCardIndex).getCardNumber());
    }

    public boolean cardNumberChecker(long cardNumberCheck){

        boolean isItValidCard=false;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == cardNumberCheck) {
                isItValidCard=true;
            }
        }
        if(isItValidCard==false){
        }
        return isItValidCard;
        }

    }








    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the car removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */


