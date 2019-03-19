package com.netcracker.courses.oop;

import com.netcracker.courses.oop.Coffee.Coffee;
import com.netcracker.courses.oop.Show.Show;
import com.netcracker.courses.oop.Van.Van;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HP on 19.03.2019.
 */
public class Work {
    //private static int i=0;
    private int temp = 0;
    Show show = new Show();
    Van van = new Van();

    static public ArrayList<Coffee> getList() {
        return list;
    }

    static ArrayList<Coffee> list = new ArrayList<Coffee>(); // коллекция с объектами класса Coffee

    public void programWorks(){
        while(temp!=4){
            show.showMenu();
            Scanner scanner = new Scanner(System.in);
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
                    show.showCoffeeKind();
                    temp = scanner.nextInt();
                    coffee.setKind(temp);
                    show.showCoffeeState();
                    temp = scanner.nextInt();
                    coffee.setState(temp);
                    System.out.println("enter the weight");
                    coffee.setWeight(scanner.nextInt());
                    van.setFreeSpace(van.getFreeSpace()-coffee.getWeight());
                    if(van.getFreeSpace()>=0)
                        break;
                    else System.out.println("not enough free space");
                    break;
                case 3:
                    System.out.println("we'll be back right soon again...");
                    break;
                case 5:
                    System.out.println(van.getFreeSpace());
                case 6:
                    show.showVanContains();
            }
        }
    }

}