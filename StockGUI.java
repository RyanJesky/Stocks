/** **************************************************
 * Program Name: Week 5 Lab
 * Programmer's Name: Ryan Jesky
 * Program Description: This program accepts input from users, calculates stock information, displays them,
 * allows to save to file, and can be populated from file
 ********************************************************** */
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class StockGUI extends javax.swing.JFrame {

    DefaultListModel listModel;  //declare list model
    public ArrayList<Stock> stocks; //declare arraylist

    public StockGUI() {
        listModel = new DefaultListModel(); //initialize model
        stocks = new ArrayList();   //initialize arraylist

        initComponents(); //creating GUI

        this.setLocationRelativeTo(null); //centering jframe
        this.setTitle("Stocks");

        //update total value
        updateTotalValue();
    }

    public void updateTotalValue() {
        //calculate total value of portfolio
        double totalValue = 0.0;

        //cycle through stocks
        for (Stock stock : stocks) {
            double stockValue = stock.getShares() * stock.getCurrentPrice();
            totalValue += stockValue;
        }

        //display total value
        DecimalFormat fmt = new DecimalFormat("$#,##0.00");
        lblTotalValue.setText("Total value: " + fmt.format(totalValue));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        tabStocks = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listStocks = new javax.swing.JList<>();
        lblStock = new javax.swing.JLabel();
        btnRemoveStock = new javax.swing.JButton();
        lblTotalValue = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblStockName = new javax.swing.JLabel();
        txtStockName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        lblCurrentPrice = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtCurrentPrice = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuOpen = new javax.swing.JMenuItem();
        mnuSave = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listStocks.setModel(listModel);
        listStocks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listStocksValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listStocks);

        btnRemoveStock.setText("Remove Stock");
        btnRemoveStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btnRemoveStock)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(btnRemoveStock)
                                .addContainerGap())
        );

        tabStocks.addTab("Show Stocks", jPanel2);

        lblStockName.setText("Stock Name");

        lblQuantity.setText("Quantity");

        lblPurchasePrice.setText("Purchase Price");

        lblCurrentPrice.setText("Current Price");

        btnAddStock.setText("Add Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQuantity)
                                        .addComponent(lblPurchasePrice)
                                        .addComponent(lblCurrentPrice)
                                        .addComponent(lblStockName))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStockName)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(txtCurrentPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(txtPurchasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(btnAddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblStockName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQuantity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPurchasePrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCurrentPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddStock)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabStocks.addTab("Add Stocks", jPanel1);

        jMenu1.setText("File");

        mnuOpen.setText("Open");
        mnuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOpen);

        mnuSave.setText("Save");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSave);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabStocks)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabStocks)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        if (txtStockName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stock Name is required.", "Stock Name is missing", JOptionPane.ERROR_MESSAGE);
            txtStockName.requestFocus();
            return;
        }
        if (txtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity is required.", "Quantity is missing", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        if (txtPurchasePrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Purchase Price is required.", "Purchase Price is missing", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
            return;
        }
        if (txtCurrentPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Current Price is required.", "Current Price is missing", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
            return;
        }

        //create variables for input
        double quantity;
        double purchasePrice;
        double currentPrice;

        //set variables and test for correct input
        String stockName = txtStockName.getText();
        try {
            quantity = Double.parseDouble(txtQuantity.getText());
            purchasePrice = Double.parseDouble(txtPurchasePrice.getText());
            currentPrice = Double.parseDouble(txtCurrentPrice.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter Quantity, Purchase Price, and Current Price as numbers.", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //create object
        Stock stock = new Stock(stockName, quantity, purchasePrice, currentPrice);

        //add stock object to model and array
        listModel.addElement(stock);
        stocks.add(stock);

        //clear for next input and set focus to top input
        txtStockName.setText(""); //setting each txt field empty for next input
        txtStockName.requestFocusInWindow(); //setting cursor to top txt field for next input
        txtQuantity.setText("");
        txtPurchasePrice.setText("");
        txtCurrentPrice.setText("");

        //update total value
        updateTotalValue();
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnRemoveStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStockActionPerformed
        int selection = listStocks.getSelectedIndex();  //creating JList selection index
        if (selection == -1) {  //if nothing is selected and button is hit display error
            JOptionPane.showMessageDialog(null, "Please select and item to remove");
        } else {
            listModel.remove(selection); //remove list element based on selection index
            stocks.remove(selection); //remove arrayList element based on selection index
            lblStock.setText(""); //set lbl as empty

            //update total value
            updateTotalValue();
        }
    }//GEN-LAST:event_btnRemoveStockActionPerformed

    private void listStocksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listStocksValueChanged
        DecimalFormat profitLoss = new DecimalFormat("0.00"); //decimal formatter to make lbl look better
        Stock stock = listStocks.getSelectedValue(); //creating Stock object for each JList selection value change
        if (stock != null) //if not null do something
        {
            lblStock.setText("Profit/Loss:  $" + profitLoss.format(stock.profitLoss()).replaceAll("\\.00", "")); //set lb as profitLoss method formatted by demical formatter (replace all uneccesary decimals with "")
        }
    }//GEN-LAST:event_listStocksValueChanged

    private void mnuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpenActionPerformed
        //open file and read stocks
        String fileName = JOptionPane.showInputDialog(this, "Enter filename: ", "File Name", JOptionPane.QUESTION_MESSAGE);//get user input for file name

        StockIO inFile = new StockIO(/*"H:/" +*/fileName); //commented out my location of H drive

        try { //try opening file
            ArrayList<Stock> stocksFromFile = inFile.getData();

            //clear out current stocks
            listModel.clear();
            stocks.clear();

            //loop through the files tocks and add them to the model arraylist
            for (Stock s : stocksFromFile) {
                listModel.addElement(s);
                stocks.add(s);
            }

            //update total value
            updateTotalValue();

        } catch (FileNotFoundException ex) { //otherwise catch all sorts of error and display error message
            JOptionPane.showMessageDialog(this, "Error: " + fileName + " File was not found.", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(StockGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuOpenActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        //save to file
        String fileName = JOptionPane.showInputDialog(this, "Enter filename:", "File Name", JOptionPane.QUESTION_MESSAGE); //get user input for file name

        StockIO outToFile = new StockIO(fileName); //create stockIO object paramatized to fileName

        try {
            outToFile.saveData(stocks);
            JOptionPane.showMessageDialog(this, "Stocks were saved to the file."); //try saving array to file
        } catch (IOException ex) {
            Logger.getLogger(StockIO.class.getName()).log(Level.SEVERE, null, ex); //otherwise catch all sorts of errors
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        //exit app
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnRemoveStock;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockName;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JList<Stock> listStocks;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuOpen;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JTabbedPane tabStocks;
    private javax.swing.JTextField txtCurrentPrice;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables
}
