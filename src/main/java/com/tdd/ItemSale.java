package com.tdd;

import java.util.ArrayList;
import java.util.List;
public class ItemSale {
    List<ItemSale> items;
    String item_name;
    int price;
    int qty;
    Boolean onSale;
    
    public ItemSale(){}

    public ItemSale(String item_name,int price,int qty ,boolean onSale){
        items=new ArrayList<>();
        this.item_name=item_name;
        this.price=price;
        this.onSale=onSale;
        this.qty=qty;
    }
    public List<ItemSale> getHighlightedItems() {
        return items;
    }
    
    public boolean onSale() {
        return true;
    }    
}