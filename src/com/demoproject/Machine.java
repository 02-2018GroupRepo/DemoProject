package com.demoproject;

public class Machine {
  
  private double totalMoney;
  
  public Machine() {
  totalMoney = 35d;
  }
  
  public void setMachineMoney(double incomingCash) {
    totalMoney = incomingCash;
  }
  
  public double getMachineMoney() {
    return totalMoney;
  }
  
}
