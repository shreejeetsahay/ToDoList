package com.company;

import java.util.Scanner;

public class Main {
    private static TodoFunction myTodoList=new TodoFunction();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int ch=0;
        boolean exit=false;
        while(!exit){
            printCommand();
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    printList();
                    break;
                case 4:
                    updateItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid choice entered. Please enter a valid choice.");
            }
        }
    }
    public static void printCommand(){
        System.out.println("Menu for your ToDo List" +
                "\n1. Add an item to list" +
                "\n2. Remove an item from the list" +
                "\n3. Print the list" +
                "\n4. Update an item on the list" +
                "\n5. Search an item on the list" +
                "\n6. Exit the program" +
                "\nEnter your choice:- ");

    }

    public static void addItem(){
        System.out.println("Enter the item to be entered:");
        String item= sc.nextLine();
        myTodoList.addItem(item);
    }

    public static void removeItem(){
        if(myTodoList.isListEmpty()==true)
        {
            System.out.println("Nothing to delete!!!");
        } else {
            System.out.println("Enter the position whose item is to be removed:-");
            int pos=sc.nextInt();
            myTodoList.removeItem(pos-1);
        }
    }

    public static void printList(){
        myTodoList.printList();
    }

    public static void updateItem(){
        if(myTodoList.isListEmpty()==true)
        {
            System.out.println("List is empty. Nothing to update!!!");
        } else {
            System.out.println("Enter the position where item is to be updated:");
            int index = sc.nextInt();
            sc.nextLine();
            index -= 1;
            System.out.println("Enter the new item:");
            String myItem = sc.nextLine();
            myTodoList.updateList(index, myItem);
        }
    }
    public static void searchItem(){
        if(myTodoList.isListEmpty()==true)
        {
            System.out.println("List is empty. Nothing to search!!!");
        } else {
            System.out.println("Enter the item to search: ");
            String myItem=sc.nextLine();
            if(myTodoList.findItem(myItem)==null){
                System.out.println("Item not found!!!!!");
            } else {
                System.out.println("Item \""+myItem+"\" is a part of the ToDo list.");
            }
        }
    }
}
