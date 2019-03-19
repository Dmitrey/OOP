package com.netcracker.courses.oop.Show;

import com.netcracker.courses.oop.Coffee.Coffee;
import com.netcracker.courses.oop.Work;

/**
 * Created by HP on 19.03.2019.
 */
public class Message {
    // Work work1 = new Work();
    public void showMenu(){
        System.out.println("1. Set van capacity"+"\n"+"2. Load the van"+"\n"+"3. Sort by parameter"+
                "\n"+"4. exit"+"\n"+"5. free space"+"\n"+"6. what is in the van?");
    }
    public void showCoffeeKind(){
        System.out.println("1. arabica"+"\n"+"2. robusta");
    }
    public void showCoffeeState(){
        System.out.println("1. grains"+"\n"+"2. milled"+"\n"+"3. instant coffee");
    }
    public void showVanContains(){
        for (Coffee o: Work.getList()) {
            System.out.println(o.getKind()+" "+o.getState()+" "+o.getWeight()+" "+o.getPrice());
        }
    }
    public void showSortParameters(){
        System.out.println("sort by:"+"\n"+"1. weight"+"\n"+"2. price");
    }
}