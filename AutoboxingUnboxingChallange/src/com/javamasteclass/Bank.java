package com.javamasteclass;
//In this Bank class we mainly deal with Branches and their functionalty:add branch, add costumer to that branch,
// add new tranaction to that branch, show list of costumers for certain branch and list of costumers tranactions.

import java.util.ArrayList;

public class Bank {
    //fields
    private ArrayList<Branches> branchesArrayList;
    private String bankName;

    //constructors
    public Bank(String bankName) {
        this.branchesArrayList = new ArrayList<Branches>();
        this.bankName = bankName;
    }

    public void addBranch(String branchName){
        if (findBranch(branchName)== null){
            branchesArrayList.add(new Branches(branchName));
        }else{
            System.out.println("Cant add branch, branch with this name already exists.");
        }
    }
    //method to find branches
    public Branches findBranch(String branchName){
        for (int i = 0; i < branchesArrayList.size(); i++){
            //searching brances and return its position
            Branches searchedBranch = branchesArrayList.get(i);
            if (searchedBranch.getBranchName().equals(branchName)){
                return searchedBranch;
            }
        }
        //branch not found
        return null;
    }

    //method to add newcostumer to brunch
    public void addCostumerToBrunch(String branchName,String costumerName,double initialAmount){
        //Acessing the Brances class iobjects, to find branch from list.
        Branches branches = findBranch(branchName);
        if (branches != null){
            //acessing the Brances class throgh constructor and use the add new costumer method in that class,
            //to add a new costumer to existing brunch.
           branches.addNewCostumer(costumerName,initialAmount);
        }else{
            System.out.println("Cant add costumer to brunch, brunch not existing!");
        }
    }

    //method for adding a new tranaction to existing costumer.
    public void addTransactionForExistingCostumer(String branchName,String costumerName,double amount){
        Branches branches = findBranch(branchName);
        if (branches != null){
            //todo: i think a check of names would be great, if that name is in that branch ?
            branches.addTransaction(costumerName,amount);
        }else{
            System.out.println("Cant add tranaction, branch not found.");
        }
    }
    public void listOfCostumers(String branchName, boolean showTranactions){
        //Find branch
        Branches branches = findBranch(branchName);
        if (branches != null){
            System.out.println("Customer details for branch " + branches.getBranchName());
            //list of customers for sertain branch
            ArrayList<Costumers> branchCostumers =branches.getCostumersArrayList();
            for (int i = 0; i < branchCostumers.size(); i++){
                Costumers branchCustomer = branchCostumers.get(i);
                //costumers list
                System.out.println("Costumer: " + branchCustomer.getCustomerName() + "[" + (i+1) +"]");
                if (showTranactions){
                    System.out.println("Costumers transactions: ");
                    //we acess the costumers transactions arrayList in the costumers class.
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int t = 0; t < transactions.size(); t++ ){
                        System.out.println("[" + (t+1) +"]" + " Amount: " + transactions.get(t));
                    }
                }
            }
        }else{
            System.out.println("Branch not found.");
        }
    }

    public void branchesList(){
        System.out.println("You have: " + branchesArrayList.size() + " available.");
        for (int i = 0; i < branchesArrayList.size(); i++){
            System.out.println((i + 1) + ". " + branchesArrayList.get(i).getBranchName());
        }
    }
}
