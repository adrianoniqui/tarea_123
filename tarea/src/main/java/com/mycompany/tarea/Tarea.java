/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea;

import com.mycompany.tarea.comandos.Broker;
import com.mycompany.tarea.comandos.BuyStock;
import com.mycompany.tarea.comandos.SellStock;
import com.mycompany.tarea.comandos.Stock;

/**
 *
 * @author adria
 */
public class Tarea {

    public static void main(String[] args) {

      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();     
    }
}
