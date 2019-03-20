package com.netcracker.courses.oop;

import com.netcracker.courses.oop.Coffee.Coffee;
import com.netcracker.courses.oop.Show.Message;
import com.netcracker.courses.oop.Van.Van;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by HP on 19.03.2019.
 */
public class Work {
    //private static int i=0;
    private int temp = 0;
    Message message = new Message();
    Van van = new Van();

    static public ArrayList<Coffee> getList() {
        return list;
    }

    static ArrayList<Coffee> list = new ArrayList<Coffee>(); // коллекция с объектами класса Coffee

    static Scanner scanner = new Scanner(System.in);

    public void programWorks(){
        while(temp!=4){
            message.showMenu();

            temp = scanner.nextInt();
            switch (temp){
                case 1:
                    System.out.print("van capacity: ");
                    van.setVanCapacity(scanner.nextInt());
                    break;
                case 2:
                    Coffee coffee = new Coffee();
                    list.add(coffee);   //добавление объектов в коллекцию
                    System.out.println("choose the coffee");
                    message.showCoffeeKind();
                    temp = scanner.nextInt();
                    coffee.setKind(temp);
                    message.showCoffeeState();
                    temp = scanner.nextInt();
                    coffee.setState(temp);
                    System.out.println("enter the weight");
                    coffee.setWeight(scanner.nextInt());
                    van.setFreeSpace(van.getFreeSpace()-coffee.getWeight());
                    System.out.println("enter the price");
                    coffee.setPrice(scanner.nextDouble());
                    break;
                case 3:
                    message.showSortParameters();
                    if(scanner.nextInt() == 1){
                        weightSort(list);
                        message.showVanContains();
                    }
                    else {
                        priceSort(list);
                        message.showVanContains();
                    }
                    break;
                case 5:
                    System.out.println(van.getFreeSpace());
                    break;
                case 6:
                    message.showVanContains();
                    break;
                case 7:
                    System.out.println("1. find by weight"+"\n"+"2. find by price");
                    temp = scanner.nextInt();
                    switch (temp){
                        case 1:
                            weightFind(list);
                            break;
                        case 2:
                            priceFind(list);
                            break;
                    }
            }
        }
    }
    public static void weightSort(ArrayList<Coffee> list){
        Collections.sort(list, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                Integer x1 = o1.getWeight();
                Integer x2 = o2.getWeight();
                return x1.compareTo(x2);
            }
        });
    }
    public static void priceSort(ArrayList<Coffee> list){
        Collections.sort(list, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                Double x1 = o1.getPrice();
                Double x2 = o2.getPrice();
                return x1.compareTo(x2);
            }
        });
    }
    public void weightFind(ArrayList<Coffee> list){
        System.out.println("enter the min weight:");
        int a = scanner.nextInt();
        System.out.println("enter the max weight:");
        int b = scanner.nextInt();
        ArrayList<Coffee> weight = new ArrayList<>();
        for (Coffee obj: list){
            if (obj.getWeight()>a&&obj.getWeight()<b)
                weight.add(obj);
        }
        message.showListContains(weight);
    }
    public void priceFind(ArrayList<Coffee> list){
        System.out.println("enter the min price:");
        double a = scanner.nextDouble();
        System.out.println("enter the max price:");
        double b = scanner.nextDouble();
        ArrayList<Coffee> price = new ArrayList<>();
        for (Coffee obj: list){
            if (obj.getPrice()>a&&obj.getPrice()<b)
                price.add(obj);
        }
        message.showListContains(price);
    }
}