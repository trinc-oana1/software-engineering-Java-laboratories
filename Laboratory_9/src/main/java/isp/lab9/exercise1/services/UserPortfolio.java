/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1.services;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.table.AbstractTableModel;
import java.math.BigDecimal;
import java.util.Map;

/**
 * Uses Lombok to get rid of boilerplate code.
 *
 * @author mihai.hulea
 * @author radu.miron
 */
@Data // it creates getters, setters, equals(), hashCode() and toString() (at compile time)
@AllArgsConstructor // it creates the constructor with arguments for all the attributes (at compile time)
public abstract class UserPortfolio extends AbstractTableModel {
    private BigDecimal cash;
    private Map<String, Integer> shares; // a map of number of shares by stock symbol
    public UserPortfolio(BigDecimal cash){this.cash=cash;}
    public void addShares(String name, int nr){shares.put(name, nr);}
    public BigDecimal buy(String symbol, int quantity, BigDecimal value) {
        if(this.cash.compareTo(value) >=0){
            this.cash =this.cash.subtract(value);
            if(shares.containsKey(symbol)){
                shares.put(symbol, shares.get(symbol)+quantity);
            }else{
                shares.put(symbol, quantity);
            }
        }
        System.out.println("User is buying: "+symbol+" "+quantity+" "+value.toPlainString());
        return cash;
    }
}
