package isp.lab9.exercise1.ui;

import isp.lab9.exercise1.services.UserPortfolio;

import javax.swing.*;
import java.util.Map;

/**
 *  todo: implement portfolio panel; for each owned stock add symbol, quantity, price per unit, total price of the position
 *  it should look similar to the 'Market' panel
 */
public class PortfolioJPanel extends JPanel {
    private StockMarketJFrame frame;
    private UserPortfolio portfolio;
    public PortfolioJPanel(StockMarketJFrame frame){
        portfolio=frame.getPortfolio();
        this.frame=frame;
        initComponents();
    }
    private  void initComponents(){
        String names[] = new String[]{"Name", "Quantity"};
        String data[][] = new String[][]{};
        getData(data);
        JTable table = new JTable(data, names);
        this.add(table);
        setVisible(true);

    }

    public void getData(String[][] data) {
        int i = 0;
        Map<String, Integer> map = portfolio.getShares();
        for(String j:map.keySet()){
            data[i][0]=j;
            data[i][1]= map.get(j).toString();
        }
    }




}
