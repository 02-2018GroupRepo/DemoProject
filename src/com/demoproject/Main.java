package com.demoproject;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    //Machine demoMachine = new Machine();
	    //System.out.println("Machine has $" + demoMachine.getMachineMoney());

    }

    public static void testRequestRestock(){
        Machine vendingMachine = new Machine("vmID");
        vendingMachine.addToList(4, "item");

        vendingMachine.removeFromList();
    }
}
