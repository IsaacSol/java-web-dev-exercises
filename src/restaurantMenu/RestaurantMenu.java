package restaurantMenu;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RestaurantMenu {
    public static final int millisecondsInWeek = 604800000;
    static Date lastUpdated = new Date();
    static ArrayList<MenuItem> menu = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        addMenuItem("Dessert", "Chocolate-chip cookie", "Soft freshly baked chocolate chip cookies", 1.99,true, new Date());
        addMenuItem("Dessert", "Sugar cookie", "Soft freshly baked sugar cookies", 1.75,true, new Date());
        addMenuItem("Dessert", "Vanilla Ice cream", "Creamy hand churned vanilla ice cream", 5.99,true, new Date());
        addMenuItem("Dessert", "Chocolate-chip cookie", "Soft freshly baked chocolate chip cookies", 1.99,false, new Date());
        printoutMenu();
        printoutMenuItem(2);
        removeMenuItem(2);
        printoutMenu();
//        while (true) {
//            break;
////            printoutMenu(menu);
//        }

    }
    //Check if menu contains item
    public  static boolean menuContains(MenuItem item){
        for (MenuItem food: menu) {
            if (item.equals(food)) {
                System.err.println("Item already exists!\nRemoving Duplicate");
                return true;
            }
        }
        return false;
    }
    //add menu item
    public static void addMenuItem(String category, String name, String description, double price, Boolean isNew, Date myDate) {
        lastUpdated = new Date();
        MenuItem item = new MenuItem(category, name, description, price, isNew, myDate);
        if (!menuContains(item)){
            menu.add(item);
        }
    }
    //remove menu item
    public static void removeMenuItem(int index){
        if (index < 0 || index >= menu.size()) {
            System.err.println("No Item Found!");
        } else {
            lastUpdated = new Date();
            menu.remove(index);
        }
    }
    //print out entire menu
    public static void printoutMenu() {
        for (MenuItem item : menu) {
            System.out.println(item.toString());
        }
    }
    //print out the menu item for the given index
    public static void printoutMenuItem(int index) {
        if (index < 0 || index >= menu.size()) {
            System.err.println("No Item Found!");
        } else {
            System.out.println(menu.get(index).toString());
        }
    }
    //Update isNew
    public static void updateDate(){
        for (MenuItem item: menu) {
            if (item.creationDate.getTime() + millisecondsInWeek <= new Date().getTime()) {
                item.changeIsNew(false);
            }
        }
    }
}
