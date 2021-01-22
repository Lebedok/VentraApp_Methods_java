package com.techtorial.ventraApp;

import java.util.Random;

public class VentraCard {
    private String fullName;
    private String phoneNumber;
    private String email;
    private long cardNumber;
    VentraCardMachine machine3= new VentraCardMachine("Chicago");



    public VentraCard(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cardNumber= createCardNumber();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }


    /*
    1- Create instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */

    public VentraCard createCard(String fullName, String phoneNumber, String email){

    /*
    this method needs to return VentraCard according to the parameter
     */
        return new VentraCard(fullName,phoneNumber,email) ;
    }

//    public long createCardNumber(){
//
//
//        long cardNumber=(long)(Math.random()*10000000000000000l);
//        this.cardNumber=cardNumber;
//
//        return cardNumber;
//    }

    public long createCardNumber(){
        long newCardNumber=0;
        do{
            newCardNumber=(long)(Math.random()*10000000000000000l);
        }while (machine3.cardNumberChecker(newCardNumber));


        return newCardNumber;
    }
}
