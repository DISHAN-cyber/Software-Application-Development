package lk.jiat.smarttrade.dialog.panel;

import lk.jiat.smarttrade.entity.Gender;
import lk.jiat.smarttrade.entity.Status;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicProductInfoPanel extends javax.swing.JPanel {
  private final HashMap<String, Integer> genderMap;
  private final HashMap<String, Integer> categoriesMap;
  private final HashMap<String, Integer> brandsMap;
  private final HashMap<String, Integer> statusMap;
    
    public BasicProductInfoPanel() {
        initComponents();
        this.genderMap = new HashMap<>();
        this.categoriesMap = new HashMap<>();
        this.brandsMap = new HashMap<>();
        this.statusMap = new HashMap<>();
        loadCategories();
        loadBrands();
        loadGenders();
        loadProductStatus();
        generateSKUNumber();
    }

    private ResultSet searchData(String query) {
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarttrade",
                    "root",
                    "050201@Dilhara");
            Statement smt = c.createStatement();
            rs = smt.executeQuery(query);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    private void loadCategories() {
        try {
            ResultSet rs = searchData("SELECT * FROM `category`");
            Vector<String> categories = new Vector();
            categories.add("Select Category");
            categoriesMap.put("Select Category", 0);
            while (rs.next()) {
                String categoryName = rs.getString("name");
                categoriesMap.put(categoryName, rs.getInt("category_id"));
                categories.add(categoryName);
            }
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(categories);
            prCategoryCombo.setModel(dcm);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadBrands() {
        try {
            ResultSet rs = searchData("SELECT * FROM `brand`");
            Vector<String> brands = new Vector();
            brands.add("Select Brand");
            brandsMap.put("Select Brand", 0);
            while (rs.next()) {
                String brandName = rs.getString("name");
                brandsMap.put(brandName, rs.getInt("brand_id"));
                brands.add(brandName);
            }
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(brands);
            prBrandCombo.setModel(dcm);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadGenders() {
        Gender[] genders = Gender.values();
        prGenderCombo.removeAllItems();
        for (Gender g : genders) {
            prGenderCombo.addItem(String.valueOf(g));
            genderMap.put(String.valueOf(g), g.getId());
        }
    }

    private void loadProductStatus() {
        Status[] statusValues = Status.values();
        prStatusCombo.removeAllItems();
        for (Status s : statusValues) {
            prStatusCombo.addItem(String.valueOf(s));
            statusMap.put(String.valueOf(s), s.getId());
        }
    }

    private void generateSKUNumber() {
        String skuNumber = "pro_" + System.currentTimeMillis();
        prSKUInput.setText(skuNumber);
    }

    public JTextField getPrNameInput() {
        return prNameInput;
    }
    public JTextField getPrSKUInput() {
        return prSKUInput;
    }
    public JTextArea getPrDescriptionInput() {
        return prDescriptionInput;
    }
    public JComboBox<String> getPrCategoryCombo() {
        return prCategoryCombo;
    }
    public JComboBox<String> getPrBrandCombo() {
        return prBrandCombo;
    }
    public JComboBox<String> getPrGenderCombo() {
        return prGenderCombo;
    }
    public JComboBox<String> getPrStatusCombo() {
        return prStatusCombo;
    }

    public HashMap<String, Integer> getCategoriesMap() {
        return categoriesMap;
    }

    public HashMap<String, Integer> getBrandsMap() {
        return brandsMap;
    }

    public HashMap<String, Integer> getGenderMap() {
        return genderMap;
    }

    public HashMap<String, Integer> getStatusMap() {
        return statusMap;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prDescriptionInput = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prNameInput = new javax.swing.JTextField();
        prSKUInput = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prCategoryCombo = new javax.swing.JComboBox<>();
        prBrandCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prGenderCombo = new javax.swing.JComboBox<>();
        prStatusCombo = new javax.swing.JComboBox<>();

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel4.setText("Product Description");

        prDescriptionInput.setColumns(20);
        prDescriptionInput.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        prDescriptionInput.setRows(5);
        jScrollPane1.setViewportView(prDescriptionInput);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 5));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel3.setText("Product SKU Number");
        jPanel2.add(jLabel3);

        prNameInput.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        prNameInput.setPreferredSize(new java.awt.Dimension(68, 30));
        jPanel2.add(prNameInput);

        prSKUInput.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        prSKUInput.setEnabled(false);
        jPanel2.add(prSKUInput);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 5));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel1.setText("Product Category");
        jPanel1.add(jLabel1);

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel5.setText("Product Brand");
        jPanel1.add(jLabel5);

        prCategoryCombo.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        prCategoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(prCategoryCombo);

        prBrandCombo.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        prBrandCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(prBrandCombo);

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 10, 5));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel6.setText("Gender");
        jPanel3.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        jLabel7.setText("Product Status");
        jPanel3.add(jLabel7);

        prGenderCombo.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        prGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(prGenderCombo);

        prStatusCombo.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        prStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(prStatusCombo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> prBrandCombo;
    private javax.swing.JComboBox<String> prCategoryCombo;
    private javax.swing.JTextArea prDescriptionInput;
    private javax.swing.JComboBox<String> prGenderCombo;
    private javax.swing.JTextField prNameInput;
    private javax.swing.JTextField prSKUInput;
    private javax.swing.JComboBox<String> prStatusCombo;
    // End of variables declaration//GEN-END:variables
}
