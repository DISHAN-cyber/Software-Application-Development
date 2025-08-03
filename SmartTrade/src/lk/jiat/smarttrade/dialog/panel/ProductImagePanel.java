/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lk.jiat.smarttrade.dialog.panel;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dilhara
 */
public class ProductImagePanel extends javax.swing.JPanel {

   
    public ProductImagePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prImagePathInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        imageLoadingPanel = new javax.swing.JPanel();

        prImagePathInput.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N

        jButton1.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imageLoadingPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(prImagePathInput, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addComponent(imageLoadingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prImagePathInput)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLoadingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images (.png, .jpeg, .jpg)",
                "png", "jpeg", "jpg");
        chooser.setFileFilter(filter);
        int option = chooser.showOpenDialog(imageLoadingPanel);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try {
                File imageFolder = new File("product_images");
                if (!imageFolder.exists()) {
                    imageFolder.mkdir();
                }
                String fileName = System.currentTimeMillis() + "_" + selectedFile.getName();
                File destinationFile = new File(imageFolder, fileName);
                prImagePathInput.setText(destinationFile.getAbsolutePath());
                Files.copy(selectedFile.toPath(),
                        destinationFile.toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
                showImage(destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showImage(File imageFile) {
        ProductImage productImage = new ProductImage();
        productImage.setPreferredSize(new Dimension(140, 180));
        ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
        Image image = icon.getImage().getScaledInstance(productImage.getPreferredSize().width,
                productImage.getPreferredSize().height, Image.SCALE_SMOOTH);
        boolean isSet = productImage.setProductImage(new ImageIcon(image));
        if (isSet) {
            imageLoadingPanel.add(productImage);
            SwingUtilities.updateComponentTreeUI(imageLoadingPanel);
        }
    }

    public JTextField getPrImagePathInput() {
        return prImagePathInput;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imageLoadingPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField prImagePathInput;
    // End of variables declaration//GEN-END:variables
}
