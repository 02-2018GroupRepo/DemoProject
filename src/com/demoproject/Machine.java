package com.demoproject;

import java.util.ArrayList;

public class Machine {
  
  private double totalMoney;
  ArrayList<String> products = new ArrayList<String>();
  private String machineID;


  public Machine(String machineID) {
    this.machineID = machineID;
    totalMoney = 35d;
  }

  public void setTotalMoney(double totalMoney) {
    this.totalMoney = totalMoney;
  }
  
  public double getTotalMoney() {
    return totalMoney;
  }
  
  // Add one item at a time
  public void addToList(String item){
    products.add(item);
  }

  // (OverLoad Method) Add multiple Items at a time
  public void addToList(int amountToAdd, String item){
    for(int i = 0; i < amountToAdd; i++){
      products.add(item);
    }
  }

  // Remove the first item
  public void removeFromList(){
    products.remove(0);
    requestRestock();
  }

  public void requestRestock(){
    if(products.size() < 3); // Send a request to the HomeBase by using magic
    // Send ID to homeBase
  }

  public int getSize(){
    return products.size();
  }

  public void receivedMessage(){
    // include conditional to check message status
    System.out.println("Thanks! Received Confirmation from HomeDepot");
  }
  
}

