/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakeshop;

/**
 *
 * @author Boo
 */
public class cake {
    String name;
    float quantity;
    int price;
    
    cake(){
        name="";
        quantity=0;
        price=0;
    }
    cake(String n,float q,int p){
        name=n;
        quantity=q;
        price=p;
    }
    void addProduct(String n,float q,int p){
        name=n;
        quantity=q;
        price=p;
    }
    String getProduct(){
        String product=name+" "+quantity+" "+price;
        return product;
    }
    float getQuantity(){
     return quantity;   
    }
    int getPrice(){
     return price;   
    }
}
