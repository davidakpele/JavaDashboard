package dashboard;

import java.awt.Color;
import javax.swing.JOptionPane;

public class DashboardPanel extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DashboardPanel() {
        initComponents();
         jScrollPane1.getViewport().setBackground(Color.white);
        Functionvalidate.ViewProductFunction("");
        setTitle("Product Management Dashboard");
        
        promptsMenu.add(MenuPop);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem83 = new javax.swing.JMenuItem();
        MenuPop = new javax.swing.JPanel();
        EditProductbtn = new javax.swing.JButton();
        deleteproductbtn = new javax.swing.JButton();
        promptsMenu = new javax.swing.JPopupMenu();
        Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ViewProductTable = new javax.swing.JButton();
        brand = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SideBar = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductDataTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        DeleteAllBtn = new javax.swing.JButton();
        SearchData = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AddFile = new javax.swing.JMenuItem();
        AddFileProps = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem53 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem66 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenuItem74 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jMenuItem75 = new javax.swing.JMenuItem();
        jMenuItem76 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenu21 = new javax.swing.JMenu();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        jMenuItem77 = new javax.swing.JMenuItem();
        jMenuItem78 = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem80 = new javax.swing.JMenuItem();
        jMenuItem81 = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        jMenuItem82 = new javax.swing.JMenuItem();
        jMenuItem84 = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem85 = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JPopupMenu.Separator();
        jMenuItem86 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem87 = new javax.swing.JMenuItem();
        jSeparator27 = new javax.swing.JPopupMenu.Separator();
        jMenuItem88 = new javax.swing.JMenuItem();
        jMenuItem89 = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        jMenuItem90 = new javax.swing.JMenuItem();
        jMenuItem91 = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JPopupMenu.Separator();
        jMenuItem92 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem94 = new javax.swing.JMenuItem();
        jMenuItem95 = new javax.swing.JMenuItem();
        jMenuItem96 = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        jMenuItem93 = new javax.swing.JMenuItem();
        jMenuItem97 = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        jMenu24 = new javax.swing.JMenu();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenuItem98 = new javax.swing.JMenuItem();
        jMenuItem99 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem100 = new javax.swing.JMenuItem();
        jMenuItem101 = new javax.swing.JMenuItem();
        jMenuItem102 = new javax.swing.JMenuItem();
        jMenuItem103 = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JPopupMenu.Separator();
        jMenuItem104 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenuItem108 = new javax.swing.JMenuItem();
        jMenuItem109 = new javax.swing.JMenuItem();
        jSeparator36 = new javax.swing.JPopupMenu.Separator();
        jMenuItem110 = new javax.swing.JMenuItem();
        jMenuItem111 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem112 = new javax.swing.JMenuItem();
        jMenuItem113 = new javax.swing.JMenuItem();
        jMenu27 = new javax.swing.JMenu();
        jMenuItem114 = new javax.swing.JMenuItem();
        jMenuItem115 = new javax.swing.JMenuItem();
        jSeparator37 = new javax.swing.JPopupMenu.Separator();
        jMenuItem116 = new javax.swing.JMenuItem();
        jMenu28 = new javax.swing.JMenu();
        jMenuItem117 = new javax.swing.JMenuItem();
        jMenuItem118 = new javax.swing.JMenuItem();
        jMenu29 = new javax.swing.JMenu();
        jMenuItem119 = new javax.swing.JMenuItem();
        jMenuItem120 = new javax.swing.JMenuItem();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem121 = new javax.swing.JMenuItem();
        jMenuItem122 = new javax.swing.JMenuItem();
        jSeparator34 = new javax.swing.JPopupMenu.Separator();
        jMenu31 = new javax.swing.JMenu();
        jMenuItem123 = new javax.swing.JMenuItem();
        jMenuItem105 = new javax.swing.JMenuItem();
        jMenuItem106 = new javax.swing.JMenuItem();
        jSeparator35 = new javax.swing.JPopupMenu.Separator();
        jMenuItem107 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem124 = new javax.swing.JMenuItem();
        jMenuItem125 = new javax.swing.JMenuItem();
        jMenuItem126 = new javax.swing.JMenuItem();
        jSeparator38 = new javax.swing.JPopupMenu.Separator();
        jMenuItem128 = new javax.swing.JMenuItem();
        jMenu32 = new javax.swing.JMenu();
        jMenuItem139 = new javax.swing.JMenuItem();
        jSeparator42 = new javax.swing.JPopupMenu.Separator();
        jMenuItem140 = new javax.swing.JMenuItem();
        jMenuItem141 = new javax.swing.JMenuItem();
        jSeparator39 = new javax.swing.JPopupMenu.Separator();
        jMenuItem129 = new javax.swing.JMenuItem();
        jMenuItem130 = new javax.swing.JMenuItem();
        jMenuItem135 = new javax.swing.JMenuItem();
        jMenuItem134 = new javax.swing.JMenuItem();
        jMenuItem131 = new javax.swing.JMenuItem();
        jMenuItem132 = new javax.swing.JMenuItem();
        jMenuItem133 = new javax.swing.JMenuItem();
        jMenuItem136 = new javax.swing.JMenuItem();
        jMenuItem137 = new javax.swing.JMenuItem();
        jMenu33 = new javax.swing.JMenu();
        jMenuItem142 = new javax.swing.JMenuItem();
        jMenuItem143 = new javax.swing.JMenuItem();
        jMenuItem144 = new javax.swing.JMenuItem();
        jSeparator40 = new javax.swing.JPopupMenu.Separator();
        jMenuItem127 = new javax.swing.JMenuItem();
        jSeparator41 = new javax.swing.JPopupMenu.Separator();
        jMenuItem138 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem145 = new javax.swing.JMenuItem();
        jMenuItem146 = new javax.swing.JMenuItem();
        jMenuItem147 = new javax.swing.JMenuItem();
        jMenuItem148 = new javax.swing.JMenuItem();
        jMenuItem149 = new javax.swing.JMenuItem();
        jMenuItem150 = new javax.swing.JMenuItem();
        jMenuItem151 = new javax.swing.JMenuItem();
        jMenuItem152 = new javax.swing.JMenuItem();
        jMenuItem153 = new javax.swing.JMenuItem();
        jMenuItem154 = new javax.swing.JMenuItem();
        jMenu34 = new javax.swing.JMenu();
        jMenuItem155 = new javax.swing.JMenuItem();
        jMenuItem161 = new javax.swing.JMenuItem();
        jMenuItem162 = new javax.swing.JMenuItem();
        jMenuItem163 = new javax.swing.JMenuItem();
        jMenuItem164 = new javax.swing.JMenuItem();
        jMenuItem165 = new javax.swing.JMenuItem();
        jMenuItem166 = new javax.swing.JMenuItem();
        jMenuItem167 = new javax.swing.JMenuItem();
        jSeparator45 = new javax.swing.JPopupMenu.Separator();
        jMenuItem168 = new javax.swing.JMenuItem();
        jSeparator46 = new javax.swing.JPopupMenu.Separator();
        jMenuItem169 = new javax.swing.JMenuItem();
        jMenuItem170 = new javax.swing.JMenuItem();
        jMenu35 = new javax.swing.JMenu();
        jMenuItem171 = new javax.swing.JMenuItem();
        jMenuItem172 = new javax.swing.JMenuItem();
        jMenu36 = new javax.swing.JMenu();
        jMenuItem173 = new javax.swing.JMenuItem();
        jMenuItem174 = new javax.swing.JMenuItem();
        jMenuItem175 = new javax.swing.JMenuItem();
        jMenuItem176 = new javax.swing.JMenuItem();
        jMenuItem177 = new javax.swing.JMenuItem();
        jMenu37 = new javax.swing.JMenu();
        jMenuItem184 = new javax.swing.JMenuItem();
        jMenuItem185 = new javax.swing.JMenuItem();
        jMenuItem186 = new javax.swing.JMenuItem();
        jMenuItem187 = new javax.swing.JMenuItem();
        jMenuItem188 = new javax.swing.JMenuItem();
        jMenuItem189 = new javax.swing.JMenuItem();
        jSeparator48 = new javax.swing.JPopupMenu.Separator();
        jMenuItem190 = new javax.swing.JMenuItem();
        jMenuItem191 = new javax.swing.JMenuItem();
        jMenuItem192 = new javax.swing.JMenuItem();
        jSeparator43 = new javax.swing.JPopupMenu.Separator();
        jMenu39 = new javax.swing.JMenu();
        jMenuItem178 = new javax.swing.JMenuItem();
        jMenuItem179 = new javax.swing.JMenuItem();
        jSeparator47 = new javax.swing.JPopupMenu.Separator();
        jMenuItem180 = new javax.swing.JMenuItem();
        jMenuItem181 = new javax.swing.JMenuItem();
        jMenuItem182 = new javax.swing.JMenuItem();
        jMenuItem156 = new javax.swing.JMenuItem();
        jSeparator44 = new javax.swing.JPopupMenu.Separator();
        jMenuItem157 = new javax.swing.JMenuItem();
        jMenuItem158 = new javax.swing.JMenuItem();
        jMenuItem159 = new javax.swing.JMenuItem();
        jMenu38 = new javax.swing.JMenu();
        jMenuItem183 = new javax.swing.JMenuItem();
        jMenuItem160 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem193 = new javax.swing.JMenuItem();
        jMenuItem194 = new javax.swing.JMenuItem();
        jMenuItem195 = new javax.swing.JMenuItem();
        jMenuItem196 = new javax.swing.JMenuItem();
        jSeparator49 = new javax.swing.JPopupMenu.Separator();
        jMenuItem197 = new javax.swing.JMenuItem();
        jMenuItem198 = new javax.swing.JMenuItem();
        jSeparator50 = new javax.swing.JPopupMenu.Separator();
        jMenuItem199 = new javax.swing.JMenuItem();
        jMenuItem200 = new javax.swing.JMenuItem();
        jMenuItem201 = new javax.swing.JMenuItem();

        jMenuItem83.setText("jMenuItem83");

        EditProductbtn.setBackground(new java.awt.Color(16, 144, 3));
        EditProductbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EditProductbtn.setForeground(new java.awt.Color(255, 255, 255));
        EditProductbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_edit_20px_1.png"))); // NOI18N
        EditProductbtn.setText("Edit");
        EditProductbtn.setToolTipText("Edit this Product");
        EditProductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProductbtnActionPerformed(evt);
            }
        });

        deleteproductbtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteproductbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteproductbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Remove_20px.png"))); // NOI18N
        deleteproductbtn.setText("Delete");
        deleteproductbtn.setToolTipText("Delete product");
        deleteproductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproductbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPopLayout = new javax.swing.GroupLayout(MenuPop);
        MenuPop.setLayout(MenuPopLayout);
        MenuPopLayout.setHorizontalGroup(
            MenuPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteproductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
            .addComponent(EditProductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuPopLayout.setVerticalGroup(
            MenuPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPopLayout.createSequentialGroup()
                .addComponent(EditProductbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteproductbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_file_30px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_folder_30px_2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_card_index_30px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_save_all_30px.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_menu_vertical_18px_1.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_menu_vertical_18px_1.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_undo_20px_1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_redo_20px_1.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<default config>" }));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_globe_25px.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sort_down_12px_2.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_nailer_30px.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sledgehammer_30px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_open_view_30px_1.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_timer_30px_1.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sort_down_12px_2.png"))); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sort_down_12px_2.png"))); // NOI18N
        jLabel16.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sort_down_12px_2.png"))); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_sort_down_12px_2.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(10, 10));

        ViewProductTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewProductTable.setForeground(new java.awt.Color(255, 255, 255));
        ViewProductTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_aliexpress_20px.png"))); // NOI18N
        ViewProductTable.setText("Category");
        ViewProductTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductTableActionPerformed(evt);
            }
        });

        brand.setBackground(new java.awt.Color(13, 8, 105));
        brand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brand.setForeground(new java.awt.Color(255, 255, 255));
        brand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_shopping_cart_20px.png"))); // NOI18N
        brand.setText("Brand");
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewProductTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewProductTable)
                        .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SideBar.setEditable(true);
        jScrollPane2.setViewportView(SideBar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(234, 27, 154));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("INVENTORY MANAGEMENT SYSTEM ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel19))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));

        ProductDataTable.setAutoCreateRowSorter(true);
        ProductDataTable.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        ProductDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Category", "Brand", "Quatity", "Status", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductDataTable.setComponentPopupMenu(promptsMenu);
        ProductDataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ProductDataTable);

        AddBtn.setBackground(new java.awt.Color(7, 132, 19));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_shopping_cart_20px.png"))); // NOI18N
        AddBtn.setText("Add Product");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteAllBtn.setBackground(new java.awt.Color(204, 0, 51));
        DeleteAllBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DeleteAllBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Remove_30px.png"))); // NOI18N
        DeleteAllBtn.setText("Delete ALL");
        DeleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllBtnActionPerformed(evt);
            }
        });

        SearchData.setText("Search Product...");
        SearchData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchDataFocusLost(evt);
            }
        });
        SearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDataActionPerformed(evt);
            }
        });
        SearchData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchDataKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteAllBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))))
        );

        jMenu1.setText("File");

        AddFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_folder_20px.png"))); // NOI18N
        AddFile.setText("New Project...");
        AddFile.setToolTipText("Add New Project");
        AddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFileActionPerformed(evt);
            }
        });
        jMenu1.add(AddFile);

        AddFileProps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_folder_20px_2.png"))); // NOI18N
        AddFileProps.setText("Add File...");
        AddFileProps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFilePropsActionPerformed(evt);
            }
        });
        jMenu1.add(AddFileProps);
        jMenu1.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_opened_folder_20px.png"))); // NOI18N
        jMenuItem1.setText("Open Project...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Close Project (Dashboard)");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Close All Projects");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Open File...");
        jMenu1.add(jMenuItem4);

        jMenu3.setText("Open Recent File");

        jMenuItem7.setText("File one");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("File Two");
        jMenu3.add(jMenuItem8);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Project Groups");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Project Properties (Dashboard)");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator3);

        jMenu4.setText("Import Project");
        jMenu1.add(jMenu4);

        jMenu5.setText("Export Project");
        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator4);

        jMenuItem9.setText("Save");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Save As...");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Save All");
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator5);

        jMenuItem12.setText("Page Setup...");
        jMenu1.add(jMenuItem12);

        jMenuItem14.setText("Print...");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem13.setText("Print HTML...");
        jMenu1.add(jMenuItem13);
        jMenu1.add(jSeparator6);

        jMenuItem15.setText("Exit");
        jMenu1.add(jMenuItem15);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_undo_20px.png"))); // NOI18N
        jMenuItem16.setText("Undo");
        jMenu2.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_redo_20px.png"))); // NOI18N
        jMenuItem17.setText("Redo");
        jMenu2.add(jMenuItem17);
        jMenu2.add(jSeparator7);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_scissors_20px.png"))); // NOI18N
        jMenuItem19.setText("Cut");
        jMenu2.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_copy_link_20px.png"))); // NOI18N
        jMenuItem20.setText("Copy");
        jMenu2.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_clipboard_20px.png"))); // NOI18N
        jMenuItem21.setText("Paste");
        jMenu2.add(jMenuItem21);

        jMenuItem23.setText("Paste from History");
        jMenu2.add(jMenuItem23);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Remove_20px.png"))); // NOI18N
        jMenuItem22.setText("Delete");
        jMenu2.add(jMenuItem22);

        jMenuItem31.setText("Select All");
        jMenu2.add(jMenuItem31);

        jMenuItem32.setText("Select Identifier");
        jMenu2.add(jMenuItem32);
        jMenu2.add(jSeparator10);

        jMenuItem33.setText("Find Selection");
        jMenu2.add(jMenuItem33);

        jMenuItem34.setText("Fine Next");
        jMenu2.add(jMenuItem34);

        jMenuItem35.setText("Find Previous");
        jMenu2.add(jMenuItem35);
        jMenu2.add(jSeparator11);

        jMenuItem36.setText("Find...");
        jMenu2.add(jMenuItem36);

        jMenuItem37.setText("Replace...");
        jMenu2.add(jMenuItem37);

        jMenuItem38.setText("Find Usages");
        jMenu2.add(jMenuItem38);
        jMenu2.add(jSeparator12);

        jMenuItem39.setText("Find in Projects...");
        jMenu2.add(jMenuItem39);

        jMenuItem40.setText("Replace in Projects...");
        jMenu2.add(jMenuItem40);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("View");

        jMenu17.setText("Editors");

        jMenuItem24.setText("Source");
        jMenu17.add(jMenuItem24);

        jMenuItem25.setText("Design");
        jMenu17.add(jMenuItem25);

        jMenuItem26.setText("History");
        jMenu17.add(jMenuItem26);

        jMenu7.add(jMenu17);

        jMenu18.setText("Split");

        jMenuItem27.setText("Vertically");
        jMenu18.add(jMenuItem27);

        jMenuItem28.setText("Horizontally");
        jMenu18.add(jMenuItem28);

        jMenu7.add(jMenu18);
        jMenu7.add(jSeparator8);

        jMenuItem18.setText("IDE Log");
        jMenu7.add(jMenuItem18);
        jMenu7.add(jSeparator9);

        jMenu6.setText("Toolbars");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("File");
        jMenu6.add(jCheckBoxMenuItem1);

        jMenuItem29.setText("Clipboard");
        jMenu6.add(jMenuItem29);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Undo/Redo");
        jMenu6.add(jCheckBoxMenuItem2);

        jMenuItem30.setText("Remote");
        jMenu6.add(jMenuItem30);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Run");
        jMenu6.add(jCheckBoxMenuItem3);

        jMenu7.add(jMenu6);

        jMenuItem41.setText("Show Editor Toolbar");
        jMenu7.add(jMenuItem41);

        jMenuItem42.setText("Show Line Number");
        jMenu7.add(jMenuItem42);

        jMenuItem43.setText("Show Non-printable Characters");
        jMenu7.add(jMenuItem43);

        jMenuItem44.setText("Show Breadcrumbs");
        jMenu7.add(jMenuItem44);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Show Indent Guide Lines");
        jMenu7.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Show Diff Sidebar");
        jMenu7.add(jCheckBoxMenuItem5);

        jMenuItem45.setText("Show Versioning Label");
        jMenu7.add(jMenuItem45);

        jMenuItem46.setText("Synchronize Editor wih View");
        jMenu7.add(jMenuItem46);
        jMenu7.add(jSeparator13);

        jMenuItem47.setText("Full Screen");
        jMenu7.add(jMenuItem47);

        jMenuBar1.add(jMenu7);

        jMenu19.setText("Navigate");

        jMenuItem48.setText("Go to File...");
        jMenu19.add(jMenuItem48);

        jMenuItem49.setText("Go to Type...");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem49);

        jMenuItem50.setText("Go to Symbol...");
        jMenu19.add(jMenuItem50);

        jMenuItem51.setText("Go to Spring Bean...");
        jMenu19.add(jMenuItem51);
        jMenu19.add(jSeparator14);

        jMenuItem52.setText("Go to Declaration");
        jMenu19.add(jMenuItem52);

        jMenu20.setText("Inspect");

        jMenuItem53.setText("File Hierarchy");
        jMenu20.add(jMenuItem53);

        jMenu19.add(jMenu20);
        jMenu19.add(jSeparator15);

        jMenuItem54.setText("Toggle Bookmark");
        jMenu19.add(jMenuItem54);

        jMenuItem55.setText("Bookmark History Popup Next");
        jMenu19.add(jMenuItem55);

        jMenuItem56.setText("Bookmark History Popup Previous");
        jMenu19.add(jMenuItem56);
        jMenu19.add(jSeparator16);

        jMenuItem57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_extensions_folder_20px.png"))); // NOI18N
        jMenuItem57.setText("Select in Project");
        jMenu19.add(jMenuItem57);

        jMenuItem58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_ogg_20px.png"))); // NOI18N
        jMenuItem58.setText("Select in File");
        jMenu19.add(jMenuItem58);

        jMenuBar1.add(jMenu19);

        jMenu8.setText("Source");

        jMenuItem59.setText("Format");
        jMenu8.add(jMenuItem59);

        jMenuItem60.setText("Move Code Element Up");
        jMenu8.add(jMenuItem60);

        jMenuItem61.setText("Move Code Element Down");
        jMenu8.add(jMenuItem61);
        jMenu8.add(jSeparator17);

        jMenuItem62.setText("Remove Surrounding Code...");
        jMenu8.add(jMenuItem62);

        jMenuItem63.setText("Fix Code");
        jMenu8.add(jMenuItem63);

        jMenuItem64.setText("Organize Imports");
        jMenu8.add(jMenuItem64);

        jMenuItem65.setText("Organize Members");
        jMenu8.add(jMenuItem65);
        jMenu8.add(jSeparator18);

        jMenuItem66.setText("Inspect...");
        jMenu8.add(jMenuItem66);
        jMenu8.add(jSeparator19);

        jMenuItem67.setText("Scan for External Changes");
        jMenu8.add(jMenuItem67);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Refactor");

        jMenuItem68.setText("Rename...");
        jMenu9.add(jMenuItem68);

        jMenuItem69.setText("Move...");
        jMenu9.add(jMenuItem69);

        jMenuItem70.setText("Copy...");
        jMenu9.add(jMenuItem70);

        jMenuItem71.setText("Safely delete...");
        jMenu9.add(jMenuItem71);
        jMenu9.add(jSeparator20);

        jMenuItem74.setText("Pull  Up...");
        jMenu9.add(jMenuItem74);

        jMenuItem72.setText("Push Down...");
        jMenu9.add(jMenuItem72);

        jMenuItem73.setText("Extract Interface...");
        jMenu9.add(jMenuItem73);

        jMenuItem75.setText("Extract Superclass...");
        jMenu9.add(jMenuItem75);

        jMenuItem76.setText("Use Supertype Where Possible...");
        jMenu9.add(jMenuItem76);
        jMenu9.add(jSeparator21);

        jMenu21.setText("Introduce");
        jMenu9.add(jMenu21);
        jMenu9.add(jSeparator22);

        jMenuItem77.setText("Convert to Anonymous to Member...");
        jMenu9.add(jMenuItem77);

        jMenuItem78.setText("Encapsulate Field");
        jMenu9.add(jMenuItem78);
        jMenu9.add(jSeparator23);

        jMenuItem79.setText("Inspect and Transform");
        jMenu9.add(jMenuItem79);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Run");

        jMenuItem80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_play_20px.png"))); // NOI18N
        jMenuItem80.setText("Run Project (Dashboard)");
        jMenu10.add(jMenuItem80);

        jMenuItem81.setText("Test Project (Dashboard)");
        jMenu10.add(jMenuItem81);
        jMenu10.add(jSeparator24);

        jMenuItem82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_hammer_20px_2.png"))); // NOI18N
        jMenuItem82.setText("Build Project (Dashboard)");
        jMenu10.add(jMenuItem82);

        jMenuItem84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_law_20px_1.png"))); // NOI18N
        jMenuItem84.setText("Clean and Build Project (Dashboard)");
        jMenu10.add(jMenuItem84);
        jMenu10.add(jSeparator25);

        jMenu22.setText("Set Project Configuration");

        jMenuItem85.setText("<default config>");
        jMenu22.add(jMenuItem85);
        jMenu22.add(jSeparator26);

        jMenuItem86.setText("Customize...");
        jMenu22.add(jMenuItem86);

        jMenu10.add(jMenu22);

        jMenu23.setText("Set Main Project ");

        jMenuItem87.setText("None");
        jMenu23.add(jMenuItem87);
        jMenu23.add(jSeparator27);

        jMenuItem88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_coffee_script_20px.png"))); // NOI18N
        jMenuItem88.setText("Bookmark Repository");
        jMenu23.add(jMenuItem88);

        jMenuItem89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_coffee_script_20px.png"))); // NOI18N
        jMenuItem89.setText("Dashboard");
        jMenu23.add(jMenuItem89);

        jMenu10.add(jMenu23);
        jMenu10.add(jSeparator28);

        jMenuItem90.setText("Generate Javadoc (Dashboard)");
        jMenu10.add(jMenuItem90);

        jMenuItem91.setText("Run File");
        jMenu10.add(jMenuItem91);
        jMenu10.add(jSeparator29);

        jMenuItem92.setText("Repeat Build/ Run: Dashboard (run)");
        jMenu10.add(jMenuItem92);

        jMenuBar1.add(jMenu10);

        jMenu11.setText("Debug");

        jMenuItem94.setText("Debug File");
        jMenu11.add(jMenuItem94);

        jMenuItem95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_attach_20px.png"))); // NOI18N
        jMenuItem95.setText("Attach Debugger...");
        jMenu11.add(jMenuItem95);

        jMenuItem96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_bug_20px.png"))); // NOI18N
        jMenuItem96.setText("Debug Core File...");
        jMenu11.add(jMenuItem96);
        jMenu11.add(jSeparator30);

        jMenuItem93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_last_20px_1.png"))); // NOI18N
        jMenuItem93.setText("Debug Project (Dashboard)");
        jMenu11.add(jMenuItem93);

        jMenuItem97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_download_from_ftp_20px_1.png"))); // NOI18N
        jMenuItem97.setText("Step Into");
        jMenu11.add(jMenuItem97);
        jMenu11.add(jSeparator31);

        jMenu24.setText("Stack");
        jMenu11.add(jMenu24);
        jMenu11.add(jSeparator32);

        jMenuItem98.setText("New Breakpoint...");
        jMenu11.add(jMenuItem98);

        jMenuItem99.setText("New Watch...");
        jMenu11.add(jMenuItem99);

        jMenuBar1.add(jMenu11);

        jMenu12.setText("Profile");

        jMenuItem100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_countdown_clock_20px.png"))); // NOI18N
        jMenuItem100.setText("Profile Project Dashboard");
        jMenu12.add(jMenuItem100);

        jMenuItem101.setText("Profile File");
        jMenu12.add(jMenuItem101);

        jMenuItem102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_old_fashioned_clock_20px.png"))); // NOI18N
        jMenuItem102.setText("Attach to Project (Dashboard)");
        jMenu12.add(jMenuItem102);

        jMenuItem103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_old_fashioned_clock_20px.png"))); // NOI18N
        jMenuItem103.setText("Attach to External Process");
        jMenu12.add(jMenuItem103);
        jMenu12.add(jSeparator33);

        jMenuItem104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_folder_20px_2.png"))); // NOI18N
        jMenuItem104.setText("Insert Profiling Point...");
        jMenu12.add(jMenuItem104);

        jMenuBar1.add(jMenu12);

        jMenu13.setText("Team");

        jMenu25.setText("Git");

        jMenuItem108.setText("Clone...");
        jMenu25.add(jMenuItem108);

        jMenuItem109.setText("Initialize Repository");
        jMenu25.add(jMenuItem109);
        jMenu25.add(jSeparator36);

        jMenuItem110.setText("Repository Browser");
        jMenu25.add(jMenuItem110);

        jMenuItem111.setText("Open Global Configuartion");
        jMenu25.add(jMenuItem111);

        jMenu13.add(jMenu25);

        jMenu26.setText("Mercurial");

        jMenuItem112.setText("Initialize Repository...");
        jMenu26.add(jMenuItem112);

        jMenuItem113.setText("Clone Other...");
        jMenuItem113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem113ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem113);

        jMenu13.add(jMenu26);

        jMenu27.setText("Remote Git");

        jMenuItem114.setText("Clone...");
        jMenu27.add(jMenuItem114);

        jMenuItem115.setText("Initialize Repository...");
        jMenu27.add(jMenuItem115);
        jMenu27.add(jSeparator37);

        jMenuItem116.setText("Repository Browser..");
        jMenu27.add(jMenuItem116);

        jMenu13.add(jMenu27);

        jMenu28.setText("Remote Mercurial");

        jMenuItem117.setText("Initialize Repository");
        jMenu28.add(jMenuItem117);

        jMenuItem118.setText("Clone Other...");
        jMenu28.add(jMenuItem118);

        jMenu13.add(jMenu28);

        jMenu29.setText("Remote Subversion");

        jMenuItem119.setText("Checkout...");
        jMenu29.add(jMenuItem119);

        jMenuItem120.setText("Import to Repository");
        jMenu29.add(jMenuItem120);

        jMenu13.add(jMenu29);

        jMenu30.setText("Subversion");

        jMenuItem121.setText("Checkout...");
        jMenu30.add(jMenuItem121);

        jMenuItem122.setText("Import to Repository");
        jMenu30.add(jMenuItem122);

        jMenu13.add(jMenu30);
        jMenu13.add(jSeparator34);

        jMenu31.setText("History");

        jMenuItem123.setText("Show History");
        jMenu31.add(jMenuItem123);

        jMenu13.add(jMenu31);

        jMenuItem105.setText("Find Tasks...");
        jMenuItem105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem105ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem105);

        jMenuItem106.setText("Report Tasks...");
        jMenu13.add(jMenuItem106);
        jMenu13.add(jSeparator35);

        jMenuItem107.setText("Create Build Job...");
        jMenuItem107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem107ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem107);

        jMenuBar1.add(jMenu13);

        jMenu14.setText("Tools");

        jMenuItem124.setText("Apply Diff Patch...");
        jMenu14.add(jMenuItem124);

        jMenuItem125.setText("Diff");
        jMenuItem125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem125ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem125);

        jMenuItem126.setText("Add to Favorites");
        jMenu14.add(jMenuItem126);
        jMenu14.add(jSeparator38);

        jMenuItem128.setText("Analyze javadoc");
        jMenu14.add(jMenuItem128);

        jMenu32.setText("Internationalization");

        jMenuItem139.setText("Internationalize...");
        jMenu32.add(jMenuItem139);
        jMenu32.add(jSeparator42);

        jMenuItem140.setText("Internationalization Wizard");
        jMenu32.add(jMenuItem140);

        jMenuItem141.setText("Internationalization Test Wizard");
        jMenu32.add(jMenuItem141);

        jMenu14.add(jMenu32);
        jMenu14.add(jSeparator39);

        jMenuItem129.setText("Java Platforms");
        jMenuItem129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem129ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem129);

        jMenuItem130.setText("Netbeans Platforms");
        jMenu14.add(jMenuItem130);

        jMenuItem135.setText("Ant Variables");
        jMenu14.add(jMenuItem135);

        jMenuItem134.setText("Libraries");
        jMenu14.add(jMenuItem134);

        jMenuItem131.setText("Servers");
        jMenu14.add(jMenuItem131);

        jMenuItem132.setText("Cloud Providers");
        jMenu14.add(jMenuItem132);

        jMenuItem133.setText("Keystore Management");
        jMenu14.add(jMenuItem133);

        jMenuItem136.setText("Templates");
        jMenu14.add(jMenuItem136);

        jMenuItem137.setText("DTDs and XML Schemas");
        jMenu14.add(jMenuItem137);

        jMenu33.setText("Palette");

        jMenuItem142.setText("Swing/AWT Components");
        jMenu33.add(jMenuItem142);

        jMenuItem143.setText("HTML/JSP Code Clips");
        jMenu33.add(jMenuItem143);

        jMenuItem144.setText("Code Clips");
        jMenu33.add(jMenuItem144);

        jMenu14.add(jMenu33);
        jMenu14.add(jSeparator40);

        jMenuItem127.setText("Plugins");
        jMenu14.add(jMenuItem127);
        jMenu14.add(jSeparator41);

        jMenuItem138.setText("Options");
        jMenu14.add(jMenuItem138);

        jMenuBar1.add(jMenu14);

        jMenu15.setText("Windows");

        jMenuItem145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_opened_folder_20px.png"))); // NOI18N
        jMenuItem145.setText("Projects");
        jMenu15.add(jMenuItem145);

        jMenuItem146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_download_from_ftp_20px_1.png"))); // NOI18N
        jMenuItem146.setText("Files");
        jMenu15.add(jMenuItem146);

        jMenuItem147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_star_pokemon_20px.png"))); // NOI18N
        jMenuItem147.setText("Classes");
        jMenu15.add(jMenuItem147);

        jMenuItem148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_tree_structure_20px.png"))); // NOI18N
        jMenuItem148.setText("Favorites");
        jMenu15.add(jMenuItem148);

        jMenuItem149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_service_bell_20px.png"))); // NOI18N
        jMenuItem149.setText("Services");
        jMenu15.add(jMenuItem149);

        jMenuItem150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_navigator_20px.png"))); // NOI18N
        jMenuItem150.setText("Navigator");
        jMenu15.add(jMenuItem150);

        jMenuItem151.setText("Action Items");
        jMenuItem151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem151ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem151);

        jMenuItem152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_system_task_20px.png"))); // NOI18N
        jMenuItem152.setText("Tasks");
        jMenu15.add(jMenuItem152);

        jMenuItem153.setText("Output");
        jMenu15.add(jMenuItem153);

        jMenuItem154.setText("Editor");
        jMenu15.add(jMenuItem154);

        jMenu34.setText("Debugging");

        jMenuItem155.setText("Variables");
        jMenu34.add(jMenuItem155);

        jMenuItem161.setText("Watches");
        jMenu34.add(jMenuItem161);

        jMenuItem162.setText("Call Stack");
        jMenu34.add(jMenuItem162);

        jMenuItem163.setText("Loaded Classes");
        jMenu34.add(jMenuItem163);

        jMenuItem164.setText("Breakpoints");
        jMenu34.add(jMenuItem164);

        jMenuItem165.setText("Sessions");
        jMenu34.add(jMenuItem165);

        jMenuItem166.setText("Threads");
        jMenu34.add(jMenuItem166);

        jMenuItem167.setText("Sources");
        jMenu34.add(jMenuItem167);
        jMenu34.add(jSeparator45);

        jMenuItem168.setText("Debugging");
        jMenu34.add(jMenuItem168);
        jMenu34.add(jSeparator46);

        jMenuItem169.setText("Debugger Console");
        jMenu34.add(jMenuItem169);

        jMenuItem170.setText("Analyze Stack");
        jMenu34.add(jMenuItem170);

        jMenu15.add(jMenu34);

        jMenu35.setText("Profiling");

        jMenuItem171.setText("Snapshots");
        jMenu35.add(jMenuItem171);

        jMenuItem172.setText("Profiling Points");
        jMenu35.add(jMenuItem172);

        jMenu15.add(jMenu35);

        jMenu36.setText("Web");

        jMenuItem173.setText("Web Browser");
        jMenu36.add(jMenuItem173);

        jMenuItem174.setText("CSS Styles");
        jMenu36.add(jMenuItem174);

        jMenuItem175.setText("Broswer DOM");
        jMenu36.add(jMenuItem175);

        jMenuItem176.setText("Knockout");
        jMenu36.add(jMenuItem176);

        jMenuItem177.setText("Network Monitor");
        jMenu36.add(jMenuItem177);

        jMenu15.add(jMenu36);

        jMenu37.setText("IDE Tools");

        jMenuItem184.setText("Palette");
        jMenu37.add(jMenuItem184);

        jMenuItem185.setText("Properties");
        jMenu37.add(jMenuItem185);

        jMenuItem186.setText("Test Results");
        jMenu37.add(jMenuItem186);

        jMenuItem187.setText("Bookmarks");
        jMenu37.add(jMenuItem187);

        jMenuItem188.setText("Java Documentations");
        jMenu37.add(jMenuItem188);

        jMenuItem189.setText("C/C++ Documentation");
        jMenu37.add(jMenuItem189);
        jMenu37.add(jSeparator48);

        jMenuItem190.setText("Notifications");
        jMenu37.add(jMenuItem190);

        jMenuItem191.setText("Exception Reporter");
        jMenu37.add(jMenuItem191);

        jMenuItem192.setText("Terminar");
        jMenu37.add(jMenuItem192);

        jMenu15.add(jMenu37);
        jMenu15.add(jSeparator43);

        jMenu39.setText("Configure Window");

        jMenuItem178.setText("Miximize");
        jMenu39.add(jMenuItem178);

        jMenuItem179.setText("Float");
        jMenu39.add(jMenuItem179);
        jMenu39.add(jSeparator47);

        jMenuItem180.setText("Clone Document");
        jMenu39.add(jMenuItem180);

        jMenuItem181.setText("Split Document");
        jMenu39.add(jMenuItem181);

        jMenuItem182.setText("New Document Tap Group");
        jMenu39.add(jMenuItem182);

        jMenu15.add(jMenu39);

        jMenuItem156.setText("Reset Windows");
        jMenu15.add(jMenuItem156);
        jMenu15.add(jSeparator44);

        jMenuItem157.setText("Close Window");
        jMenu15.add(jMenuItem157);

        jMenuItem158.setText("Close All Documents");
        jMenu15.add(jMenuItem158);

        jMenuItem159.setText("Close Other Documents");
        jMenu15.add(jMenuItem159);

        jMenu38.setText("Document Groups");

        jMenuItem183.setText("New Document Group...");
        jMenu38.add(jMenuItem183);

        jMenu15.add(jMenu38);

        jMenuItem160.setText("Documents...");
        jMenu15.add(jMenuItem160);

        jMenuBar1.add(jMenu15);

        jMenu16.setText("Help");

        jMenuItem193.setText("Help Contents");
        jMenu16.add(jMenuItem193);

        jMenuItem194.setText("Online Docs and Support");
        jMenu16.add(jMenuItem194);

        jMenuItem195.setText("Keyboard Shortcuts Card");
        jMenu16.add(jMenuItem195);

        jMenuItem196.setText("Report Issue...");
        jMenu16.add(jMenuItem196);
        jMenu16.add(jSeparator49);

        jMenuItem197.setText("Javadoc index Search");
        jMenu16.add(jMenuItem197);

        jMenuItem198.setText("Javadoc References");
        jMenu16.add(jMenuItem198);
        jMenu16.add(jSeparator50);

        jMenuItem199.setText("Check for Updates");
        jMenu16.add(jMenuItem199);

        jMenuItem200.setText("Start Page");
        jMenu16.add(jMenuItem200);

        jMenuItem201.setText("About");
        jMenuItem201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem201ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem201);

        jMenuBar1.add(jMenu16);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddFileActionPerformed

    private void AddFilePropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFilePropsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddFilePropsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem105ActionPerformed

    private void jMenuItem107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem107ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem107ActionPerformed

    private void jMenuItem113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem113ActionPerformed

    private void jMenuItem125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem125ActionPerformed

    private void jMenuItem129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem129ActionPerformed

    private void jMenuItem151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem151ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem151ActionPerformed

    private void jMenuItem201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem201ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem201ActionPerformed

    private void DeleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllBtnActionPerformed
         if (JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Delete All Data?", "",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Functionvalidate.isTruncateProductTable()) {
                Functionvalidate.ViewProductFunction("");
                JOptionPane.showMessageDialog(this, "Succesfully Deleted..!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Fail To Delete Data", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteAllBtnActionPerformed

    private void ViewProductTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductTableActionPerformed
        Category view= new Category(this, true);
        view.pack();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }//GEN-LAST:event_ViewProductTableActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        AddProduct view= new AddProduct(this, true);
        view.pack();
        view.setLocationRelativeTo(null);
        view.setTitle("Add New Product");
        view.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SearchDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchDataKeyReleased
        Functionvalidate.ViewProductFunction(this.SearchData.getText());
    }//GEN-LAST:event_SearchDataKeyReleased

    private void SearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchDataActionPerformed

    @SuppressWarnings("static-access")
    private void EditProductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProductbtnActionPerformed
         int fila = ProductDataTable.getSelectedRow();
        editProduct Edit= new editProduct(this, true);
        
        Edit.pack();
        Edit.setLocationRelativeTo(null);
        Edit.setTitle("Edit Product");
        Edit.ProductID.setText(ProductDataTable.getValueAt(fila, 0).toString());
        Edit.Productname.setText(ProductDataTable.getValueAt(fila, 1).toString());
        Edit.ProductPrice.setText(ProductDataTable.getValueAt(fila, 2).toString());
        Edit.ProductCategory.addItem(ProductDataTable.getValueAt(fila, 3).toString());
        Edit.ProductBrand.addItem(ProductDataTable.getValueAt(fila, 4).toString());
        Edit.ProductQty.setText(ProductDataTable.getValueAt(fila, 5).toString());
        Edit.ProductStatus.addItem(ProductDataTable.getValueAt(fila, 6).toString());
        Edit.ProductDescription.setText(ProductDataTable.getValueAt(fila, 7).toString());
        Edit.setVisible(true);
        ProductDataTable.setVisible(true);
    }//GEN-LAST:event_EditProductbtnActionPerformed

    private void deleteproductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproductbtnActionPerformed
         int r = ProductDataTable.getSelectedRow();
        RouteClass s = new RouteClass();
        s.setProductID(ProductDataTable.getValueAt(r, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "Are You Sure You?", "", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Functionvalidate.isDeleteProducts(s)) {
                 Functionvalidate.ViewProductFunction("");
                JOptionPane.showMessageDialog(this, "Succesfully Deleted..!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Fail To Delete Data", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteproductbtnActionPerformed

    private void SearchDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchDataFocusGained
         if(SearchData.getText().equals("Search Product...")){
            SearchData.setText("");
        }
        SearchData.setForeground(Color.black);
    }//GEN-LAST:event_SearchDataFocusGained

    private void SearchDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchDataFocusLost
         // TODO add your handling code here:
          if(SearchData.getText().equals("")){
            SearchData.setText("Search Product...");
        }
        SearchData.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_SearchDataFocusLost

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
        Brand view= new Brand(this, true);
        view.pack();
        view.setLocationRelativeTo(null);
        view.setTitle("Brand Management Table.");
        view.setVisible(true);
    }//GEN-LAST:event_brandActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new DashboardPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JMenuItem AddFile;
    private javax.swing.JMenuItem AddFileProps;
    private javax.swing.JButton DeleteAllBtn;
    private javax.swing.JButton EditProductbtn;
    private javax.swing.JPanel MenuPop;
    private javax.swing.JPanel Panel1;
    public static javax.swing.JTable ProductDataTable;
    private javax.swing.JTextField SearchData;
    private javax.swing.JTree SideBar;
    private javax.swing.JButton ViewProductTable;
    private javax.swing.JButton brand;
    private javax.swing.JButton deleteproductbtn;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu37;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu39;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem100;
    private javax.swing.JMenuItem jMenuItem101;
    private javax.swing.JMenuItem jMenuItem102;
    private javax.swing.JMenuItem jMenuItem103;
    private javax.swing.JMenuItem jMenuItem104;
    private javax.swing.JMenuItem jMenuItem105;
    private javax.swing.JMenuItem jMenuItem106;
    private javax.swing.JMenuItem jMenuItem107;
    private javax.swing.JMenuItem jMenuItem108;
    private javax.swing.JMenuItem jMenuItem109;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem110;
    private javax.swing.JMenuItem jMenuItem111;
    private javax.swing.JMenuItem jMenuItem112;
    private javax.swing.JMenuItem jMenuItem113;
    private javax.swing.JMenuItem jMenuItem114;
    private javax.swing.JMenuItem jMenuItem115;
    private javax.swing.JMenuItem jMenuItem116;
    private javax.swing.JMenuItem jMenuItem117;
    private javax.swing.JMenuItem jMenuItem118;
    private javax.swing.JMenuItem jMenuItem119;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem120;
    private javax.swing.JMenuItem jMenuItem121;
    private javax.swing.JMenuItem jMenuItem122;
    private javax.swing.JMenuItem jMenuItem123;
    private javax.swing.JMenuItem jMenuItem124;
    private javax.swing.JMenuItem jMenuItem125;
    private javax.swing.JMenuItem jMenuItem126;
    private javax.swing.JMenuItem jMenuItem127;
    private javax.swing.JMenuItem jMenuItem128;
    private javax.swing.JMenuItem jMenuItem129;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem130;
    private javax.swing.JMenuItem jMenuItem131;
    private javax.swing.JMenuItem jMenuItem132;
    private javax.swing.JMenuItem jMenuItem133;
    private javax.swing.JMenuItem jMenuItem134;
    private javax.swing.JMenuItem jMenuItem135;
    private javax.swing.JMenuItem jMenuItem136;
    private javax.swing.JMenuItem jMenuItem137;
    private javax.swing.JMenuItem jMenuItem138;
    private javax.swing.JMenuItem jMenuItem139;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem140;
    private javax.swing.JMenuItem jMenuItem141;
    private javax.swing.JMenuItem jMenuItem142;
    private javax.swing.JMenuItem jMenuItem143;
    private javax.swing.JMenuItem jMenuItem144;
    private javax.swing.JMenuItem jMenuItem145;
    private javax.swing.JMenuItem jMenuItem146;
    private javax.swing.JMenuItem jMenuItem147;
    private javax.swing.JMenuItem jMenuItem148;
    private javax.swing.JMenuItem jMenuItem149;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem150;
    private javax.swing.JMenuItem jMenuItem151;
    private javax.swing.JMenuItem jMenuItem152;
    private javax.swing.JMenuItem jMenuItem153;
    private javax.swing.JMenuItem jMenuItem154;
    private javax.swing.JMenuItem jMenuItem155;
    private javax.swing.JMenuItem jMenuItem156;
    private javax.swing.JMenuItem jMenuItem157;
    private javax.swing.JMenuItem jMenuItem158;
    private javax.swing.JMenuItem jMenuItem159;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem160;
    private javax.swing.JMenuItem jMenuItem161;
    private javax.swing.JMenuItem jMenuItem162;
    private javax.swing.JMenuItem jMenuItem163;
    private javax.swing.JMenuItem jMenuItem164;
    private javax.swing.JMenuItem jMenuItem165;
    private javax.swing.JMenuItem jMenuItem166;
    private javax.swing.JMenuItem jMenuItem167;
    private javax.swing.JMenuItem jMenuItem168;
    private javax.swing.JMenuItem jMenuItem169;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem170;
    private javax.swing.JMenuItem jMenuItem171;
    private javax.swing.JMenuItem jMenuItem172;
    private javax.swing.JMenuItem jMenuItem173;
    private javax.swing.JMenuItem jMenuItem174;
    private javax.swing.JMenuItem jMenuItem175;
    private javax.swing.JMenuItem jMenuItem176;
    private javax.swing.JMenuItem jMenuItem177;
    private javax.swing.JMenuItem jMenuItem178;
    private javax.swing.JMenuItem jMenuItem179;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem180;
    private javax.swing.JMenuItem jMenuItem181;
    private javax.swing.JMenuItem jMenuItem182;
    private javax.swing.JMenuItem jMenuItem183;
    private javax.swing.JMenuItem jMenuItem184;
    private javax.swing.JMenuItem jMenuItem185;
    private javax.swing.JMenuItem jMenuItem186;
    private javax.swing.JMenuItem jMenuItem187;
    private javax.swing.JMenuItem jMenuItem188;
    private javax.swing.JMenuItem jMenuItem189;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem190;
    private javax.swing.JMenuItem jMenuItem191;
    private javax.swing.JMenuItem jMenuItem192;
    private javax.swing.JMenuItem jMenuItem193;
    private javax.swing.JMenuItem jMenuItem194;
    private javax.swing.JMenuItem jMenuItem195;
    private javax.swing.JMenuItem jMenuItem196;
    private javax.swing.JMenuItem jMenuItem197;
    private javax.swing.JMenuItem jMenuItem198;
    private javax.swing.JMenuItem jMenuItem199;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem200;
    private javax.swing.JMenuItem jMenuItem201;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem74;
    private javax.swing.JMenuItem jMenuItem75;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem77;
    private javax.swing.JMenuItem jMenuItem78;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem81;
    private javax.swing.JMenuItem jMenuItem82;
    private javax.swing.JMenuItem jMenuItem83;
    private javax.swing.JMenuItem jMenuItem84;
    private javax.swing.JMenuItem jMenuItem85;
    private javax.swing.JMenuItem jMenuItem86;
    private javax.swing.JMenuItem jMenuItem87;
    private javax.swing.JMenuItem jMenuItem88;
    private javax.swing.JMenuItem jMenuItem89;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem90;
    private javax.swing.JMenuItem jMenuItem91;
    private javax.swing.JMenuItem jMenuItem92;
    private javax.swing.JMenuItem jMenuItem93;
    private javax.swing.JMenuItem jMenuItem94;
    private javax.swing.JMenuItem jMenuItem95;
    private javax.swing.JMenuItem jMenuItem96;
    private javax.swing.JMenuItem jMenuItem97;
    private javax.swing.JMenuItem jMenuItem98;
    private javax.swing.JMenuItem jMenuItem99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator26;
    private javax.swing.JPopupMenu.Separator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JPopupMenu.Separator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator33;
    private javax.swing.JPopupMenu.Separator jSeparator34;
    private javax.swing.JPopupMenu.Separator jSeparator35;
    private javax.swing.JPopupMenu.Separator jSeparator36;
    private javax.swing.JPopupMenu.Separator jSeparator37;
    private javax.swing.JPopupMenu.Separator jSeparator38;
    private javax.swing.JPopupMenu.Separator jSeparator39;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator40;
    private javax.swing.JPopupMenu.Separator jSeparator41;
    private javax.swing.JPopupMenu.Separator jSeparator42;
    private javax.swing.JPopupMenu.Separator jSeparator43;
    private javax.swing.JPopupMenu.Separator jSeparator44;
    private javax.swing.JPopupMenu.Separator jSeparator45;
    private javax.swing.JPopupMenu.Separator jSeparator46;
    private javax.swing.JPopupMenu.Separator jSeparator47;
    private javax.swing.JPopupMenu.Separator jSeparator48;
    private javax.swing.JPopupMenu.Separator jSeparator49;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator50;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JPopupMenu promptsMenu;
    // End of variables declaration//GEN-END:variables
}
