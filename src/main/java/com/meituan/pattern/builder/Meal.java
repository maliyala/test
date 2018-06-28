package com.meituan.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    //增加商品
    public void addItem(Item item){
        items.add(item);
    }
    //计算所点餐商品的总价格
    public float getCost(){
        float cost = 0.0f;
        for(Item item: items){
            cost+=item.price();
        }
        return cost;
    }
    public void showItem(){
        for(Item item:items){
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());

        }
    }
}
