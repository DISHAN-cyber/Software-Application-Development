/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package lk.jiat.smarttrade.dialog;

import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import lk.jiat.smarttrade.dialog.panel.BasicProductInfoPanel;
import lk.jiat.smarttrade.dialog.panel.ProductImagePanel;
import lk.jiat.smarttrade.validation.Validator;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductDialog extends javax.swing.JDialog {

    private BasicProductInfoPanel productInfoPanel;
    private ProductImagePanel productImagePanel;
    private CardLayout contentPanelLayout;

    public ProductDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        backBtn.setVisible(false);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        loadPanels();
    }

    private void loadPanels() {
        if (contentPanelLayout == null && productContentPanel.getLayout() instanceof CardLayout) {
            contentPanelLayout = (CardLayout) productContentPanel.getLayout();
        }
        productInfoPanel = new BasicProductInfoPanel();
        productImagePanel = new ProductImagePanel();

        productContentPanel.add(productInfoPanel, "product_info");
        productContentPanel.add(productImagePanel, "product_image");

        contentPanelLayout.show(productContentPanel, "product_info");
        SwingUtilities.updateComponentTreeUI(productContentPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        controlBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productContentPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Product");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 20)); // NOI18N
        jLabel1.setText("Product Information");

        controlBtn.setBackground(new java.awt.Color(0, 102, 255));
        controlBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        controlBtn.setForeground(new java.awt.Color(255, 255, 255));
        controlBtn.setText("Next");
        controlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        productContentPanel.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(productContentPanel);

        backBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 328, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBtnActionPerformed
        if (controlBtn.getText().equalsIgnoreCase("next")) {
            contentPanelLayout.next(productContentPanel);
            controlBtn.setText("Submit");
            backBtn.setVisible(true);
        } else {
            insertProductData();
        }

    }//GEN-LAST:event_controlBtnActionPerformed

    private synchronized void insertProductData() {
        String productName = productInfoPanel.getPrNameInput().getText();
        String prSKU = productInfoPanel.getPrSKUInput().getText();
        String description = productInfoPanel.getPrDescriptionInput().getText();

        int categorySelectedIndex = productInfoPanel.getPrCategoryCombo().getSelectedIndex();
        int brandSelectedIndex = productInfoPanel.getPrBrandCombo().getSelectedIndex();

        String gender = String.valueOf(productInfoPanel.getPrGenderCombo().getSelectedItem());
        String status = String.valueOf(productInfoPanel.getPrStatusCombo().getSelectedItem());

        String imagePath = productImagePanel.getPrImagePathInput().getText();

        if (!Validator.isInputFieldValid(productName)) {
            return;
        } else if (!Validator.isInputFieldValid(prSKU)) {
            return;
        } else if (!Validator.isInputFieldValid(description)) {
            return;
        } else if (!Validator.isSelectedItemValid(categorySelectedIndex)) {
            return;
        } else if (!Validator.isSelectedItemValid(brandSelectedIndex)) {
            return;
        } else if (!Validator.isInputFieldValid(imagePath)) {
            return;
        }
        HashMap<String, Integer> categoriesMap = productInfoPanel.getCategoriesMap();
        HashMap<String, Integer> brandsMap = productInfoPanel.getBrandsMap();
        HashMap<String, Integer> genderMap = productInfoPanel.getGenderMap();
        HashMap<String, Integer> statusMap = productInfoPanel.getStatusMap();

        String category = productInfoPanel.getPrCategoryCombo().getItemAt(categorySelectedIndex);
        String brand = productInfoPanel.getPrBrandCombo().getItemAt(brandSelectedIndex);

        int categoryId = categoriesMap.get(category);
        int brandId = brandsMap.get(brand);
        int genderId = genderMap.get(gender);
        int statusId = statusMap.get(status);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarttrade",
                    "root",
                    "050201@Dilhara");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT `product_id` FROM `product` WHERE `product`.`name` = '" + productName + "' "
                    + "AND `product`.`category_id`='" + categoryId + "' "
                    + "AND `product`.`brand_id` = '" + brandId + "' "
                    + "AND `product`.`gender_id`='" + genderId + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "This product is already exists!",
                        "Product Information Dialog",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                s.executeUpdate("INSERT INTO `product`(`name`,`description`,`product_sku`,`category_id`,`brand_id`,`gender_id`, `status_id`) "
                        + "VALUES('" + productName + "', '" + description + "', '" + prSKU + "','" + categoryId + "','" + brandId + "','" + genderId + "', '" + statusId + "')");
                ResultSet rs1 = s.executeQuery("SELECT LAST_INSERT_ID()");
                if(rs1.next()){
                    int lastInsertId = rs1.getInt(1);
                    System.out.println(lastInsertId);
                    s.executeUpdate("INSERT INTO `product_image`(`path`,`product_id`) VALUES('"+imagePath+"','"+lastInsertId+"')");
                }
                JOptionPane.showMessageDialog(null, 
                        "New product added successfully!",
                        "Product Information Dialog",
                        JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        contentPanelLayout.previous(productContentPanel);
        controlBtn.setText("Next");
        backBtn.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton controlBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel productContentPanel;
    // End of variables declaration//GEN-END:variables
}
