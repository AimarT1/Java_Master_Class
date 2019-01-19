package com.javamasteclass;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("SEB");

    public static void main(String[] args) {

        boolean quit = false;
        int choiseOptions = 0;
        printOptions();

        while (!quit){
            System.out.println("");
            System.out.println("Enter Option to choose: ");
            choiseOptions = scanner.nextInt();
            switch (choiseOptions){
                case 1:
                    printOptions();
                    break;
                case 2:
                    addBranchOfBank();
                    break;
                case 3:
                    addNewCostumer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    showCostumerList();
                    break;
                case 6:
                    bank.branchesList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Exiting bank application.");
                    break;
            }
        }
    }
    private static void printOptions(){
        System.out.println("1 - Print options menu.");
        System.out.println("2 - Add banks brach.");
        System.out.println("3 - Add new costumer.");
        System.out.println("4 - Add new transaction.");
        System.out.println("5 - Show list of costumers.");
        System.out.println("6 - Show list of branches.");
        System.out.println("7 - Exit bank application.");

    }
    public static void addBranchOfBank(){
        System.out.println("Enter branch name: ");
        String branchName = scanner.next();
        bank.addBranch(branchName);
    }
    private static void addNewCostumer(){
        System.out.println("Enter branch name , you want to add costumer: ");
        String branchName = scanner.next();
        System.out.println("Enter new costumer name: ");
        String name = scanner.next();
        System.out.println("Enter new costumers inizial tranaction: ");
        double inizialAmount = scanner.nextFloat();
        bank.addCostumerToBrunch(branchName,name,inizialAmount);
    }
    private static void addTransaction(){
        System.out.println("Enter costumers bank branch for transaction: ");
        String branchNameForCostumer = scanner.next();
        System.out.println("Enter costumer name: ");
        String name = scanner.next();
        System.out.println("Enter amount you want to add: ");
        //using scanner.nextFloat(); - errors with double.
        double additionalAmount = scanner.nextFloat();
        bank.addTransactionForExistingCostumer(branchNameForCostumer,name,additionalAmount);

    }
    private static void showCostumerList(){
        System.out.println("Enter banks branch name: ");
        String costumersInThatBranch = scanner.next();
        System.out.println("If you want to see list of costumers tranactions: ");
        boolean showtranactions = scanner.nextBoolean();
        bank.listOfCostumers(costumersInThatBranch,showtranactions);
    }
}
