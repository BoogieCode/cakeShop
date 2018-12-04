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
    int quantity;
    int price;
    
    cake(){
        name="";
        quantity=0;
        price=0;
    }
    cake(String n,int q,int p){
        name=n;
        quantity=q;
        price=p;
    }
    void addProduct(String n,int q,int p){
        name=n;
        quantity=q;
        price=p;
    }
    String getProduct(){
        String product=name+" "+quantity+" "+price;
        return product;
    }
    String getName(){
    return name;
    }
    int getQuantity(){
     return quantity;   
    }
    int getPrice(){
     return price;   
    }
    void setQuantity(int q){
        quantity=q;   
    }
    void setPrice(int p){
        price=p;   
    }
    void setName(String n){
        name=n;
    }
}
