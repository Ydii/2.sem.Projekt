package domain;

import java.util.ArrayList;

/**
 *
 * @author Jannik
 */
public class Order {
    private int orderNo;
    private int state;
    private Customer customer;
    private ArrayList<Item> itemlist = new ArrayList<Item>();
    
    
//    public Order(ArrayList<Item> itemliste, Customer customer){
//      itemliste = itemliste;          
//      state=0;        
//      this.customer = customer;        
//    }
   
    public Order(int orderNo, ArrayList<Item> itemlist){
    
        this.orderNo = orderNo;
        this.itemlist = itemlist;
        state = 0;
        
    }
    public Customer getCustomer(){
        return customer;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int ordreNo) {
        this.orderNo = ordreNo;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public ArrayList<Item> getItemlist() {
        return itemlist;
    }

    
    
        
}
