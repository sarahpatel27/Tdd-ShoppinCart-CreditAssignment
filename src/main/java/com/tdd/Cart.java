package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<ItemSale> items;
    List<Cart> cart;
    String item_name;
    int price;
    int qty;
    
    public Cart(String item_name,int price,int qty){

        this.item_name=item_name;
        this.price=price;
        this.qty=qty;
    }
    public Cart(){
        cart=new ArrayList<>();
        items=new ArrayList<>();
    }
    public int getItem() {
        return cart.size();
    }
    public void add(Cart cart1) {
        cart.add(cart1);
    }

    public int getTotalSum(){
        int sum=0;
        for (Cart cart2 : cart) {
            sum+=cart2.price;            
        }
        return sum;
    }

    public int getQtyUpdate(){
        int Qty=0;
        for (Cart cart2 : cart) {
            Qty+=cart2.qty;            
        }
        return Qty;
    }

    public int getPriceAndQty(){
        return cart.size();
    }

    public void addItem(ItemSale item) {
        items.add(item);
    }

    public void removeItem(String item_name) {
        cart.removeAll(items);
    }

    
    public int removeQty(int Qty){
        for(int i=0; i<cart.size();i++){
            if(cart.get(i).equals(qty)){
                cart.remove(i-1);
            }
        }
        return cart.size();
    }
    

}