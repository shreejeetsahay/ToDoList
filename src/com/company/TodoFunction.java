package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoFunction {
    private ArrayList<String> todoList=new ArrayList<String>();
    private Scanner sc=new Scanner(System.in);
    //add an item
    public void addItem(String item){
        todoList.add(item);
        System.out.println("\nAdded item=\""+item+"\" successfully.");
    }
    //remove an item
    public void removeItem(int index){
        if(todoList.size()<=index || index<=-1){
            System.out.println("Index Invalid!!!");
        }else{
            String myItem=todoList.get(index);
            System.out.println("Are you sure you want to delete the item with below details?-\n1. Index:-"+index+"\n2. Item:-"+myItem+"\nPress y or Y for Yes.\nPress n or N for No.");
            char ch;
            ch=sc.next().charAt(0);
            switch(ch){
                case 'Y':
                case 'y':
                    todoList.remove(index);
                    System.out.println("Item removed at index:- "+index+" successfully!!!");
                    break;
                case 'N':
                case 'n':
                    System.out.println("Item not deleted!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }

        }
    }
    //print the list
    public void printList(){
        if(todoList.isEmpty()){
            System.out.println("Nothing to display!!!");
        }else {
            System.out.println("Number of items in the list= "+todoList.size());
            System.out.println("Position\tItem Name\n----------------------------------");
            for(int i=0;i< todoList.size();i++){
                System.out.println((i+1)+"\t\t\t"+ todoList.get(i));
            }
        }
    }
    //check if list is empty
    public boolean isListEmpty(){
        return todoList.isEmpty();
    }
    //update an item in the list
    public void updateList(int index,String item){
        if(todoList.size()<=index || index<=-1){
            System.out.println("Index Invalid!!!");
        }
        else{
            todoList.set(index,item);
            System.out.println("Update operation successful!!!");
        }
    }
    //search an item in the list
    public String findItem(String item){
        int res=todoList.indexOf(item);
        if(res==-1){
            return null;
        }else{
            return todoList.get(res);
        }
    }
}
