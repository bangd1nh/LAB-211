/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import VIew.Menu;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import model.Fruit;

/**
 *
 * @author admin
 */
public class Controller extends Menu {
    ArrayList<Fruit> list = new ArrayList<>();
    Validation vl = new Validation();
    Hashtable<String,ArrayList<Fruit>> hashtable = new Hashtable<String, ArrayList<Fruit>>();
    static String[] mc={"create fruit","view order","Shopping"};
    public Controller(){
        super("Fruit shop system",mc);
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                createFruit();
                break;
            case 2:
                viewOrder();
                break;
            case 3:
                shopping();
                break;
        }
    }
    public void createFruit(){
        int id = vl.inputInt("create fruit id",0,100);
        String name = vl.inputString("create fruitname:");
        double price = vl.inputDouble("create fruit price: "+name,0,1000);
        int quantity = vl.inputInt("create quantity: "+name,1, 1000);
        String origin = vl.inputString("create origin: "+name);
        Fruit f = new Fruit(id,name,price,quantity,origin);
        list.add(f);
    }
    public void shopping(){
        ArrayList<Fruit> listItemBought = new ArrayList<>();
        int index = 1;
        System.out.println("List of Fruit");
        System.out.printf("|%-10s|%-15s|%-10s|%10s|%n", "ITEM", "FRUIT NAME","ORIGIN","PRICE");
        for(Fruit f : list){
            System.out.printf("%-10s%-15s%-10s%-10s%n",index, f.getFruitId(), f.getFruitName(), f.getOrigin(), f.getPrice());
            index++;
        }
        int choise = vl.inputInt("Enter your choise",1,list.size());
        Fruit selectedFruit = list.get(choise-1);
        System.out.println("You selected: " + selectedFruit.getFruitName());
        int quantity = vl.inputInt("Please input your quantity",1,1000);
        selectedFruit.setQuantity(quantity);
        listItemBought.add(selectedFruit);
        boolean repeat = true;
        while (repeat) { 
        String c = vl.inputString("Do you want to order now (Y/N)"); 
        switch (c) {
            case "Y":
                System.out.printf("%-18s|%-10s|%-10s|%10s%n","Product","Quantity","Price","Amount"); 
                double total = 0;
                for (Fruit f : listItemBought) {
                    System.out.printf("%-18s%-10s%-10s%-10s%n", f.getFruitName(),f.getQuantity(), f.getPrice(), (f.getQuantity()* f.getPrice()));
                    total += quantity * f.getPrice();
                }
                System.out.println("Total: " + total);
                String customerName = vl.inputString("enter your name:");
                hashtable.put(customerName, listItemBought);
                repeat = false;
                break;
        case "N":
            repeat = false;
            break;
        default:
            System.out.println("please enter again"); 
            repeat = true;
      }
    }
    }
    public void viewOrder(){
        Enumeration<String> nameCustomerList = hashtable.keys();
        while(nameCustomerList.hasMoreElements()){
            String nameCustomer = nameCustomerList.nextElement();
            System.out.println("Customer: "+ nameCustomer);
            System.out.println("Product | Quantity | Price | Amount ");
            double total = 0;
            for(Fruit f : hashtable.get(nameCustomer)){
            System.out.printf("%-15s%-10d%-10.2f%10.2f%n", f.getFruitName(), f.getQuantity(), f.getPrice(), (f.getQuantity()*f.getPrice()));
            total +=f.getQuantity()*f.getPrice();
        }
            System.out.println("Total: "+ total);
        }
    }
}
