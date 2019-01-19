package com.javamasteclass;
//In this branch class we mainly deal with costumers and their functionality: to findcostumer, add costumer,add transaction.

import java.util.ArrayList;

public class Branches {
   private String branchName;
   private ArrayList<Costumers> costumersArrayList;
    //constructors
    public Branches(String branchName) {
        this.branchName = branchName;
        //Inizializing costumers array list.
        this.costumersArrayList = new ArrayList<Costumers>();
    }

    //method to find costumer
    private Costumers findCostumer(String costumerName){
        for (int i = 0; i < costumersArrayList.size(); i++){
            // we search if costumer is in the list and return its position
            Costumers searchedCostumer = costumersArrayList.get(i);
            if (searchedCostumer.getCustomerName().equals(costumerName)){
                return searchedCostumer;
            }
        }
        //no costumer found.
        return null;
    }
    //method to add new costumer.
    public void addNewCostumer(String costumerName,double inizialAmount){
        //null- no costumer with that name exists.
        if (findCostumer(costumerName) == null){
            //make more sense than Costumer costumer = new Costumers(costumerName,inizialAmount);
            costumersArrayList.add(new Costumers(costumerName,inizialAmount));
        }else{
            System.out.println("Unable to add, costumer with that name already exists.");
        }
    }
    //method to add transactions.
    public void addTransaction (String costumerName,double amount){
        Costumers isCostumerExisting = findCostumer(costumerName);
        //not null- costumer is there
        if (isCostumerExisting != null){
            isCostumerExisting.addTranaction(amount);
        }else{
            System.out.println("Costumer not found, cant add transaction.");
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Costumers> getCostumersArrayList() {
        return costumersArrayList;
    }
}
