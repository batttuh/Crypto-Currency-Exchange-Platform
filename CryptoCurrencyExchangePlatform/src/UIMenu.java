/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class UIMenu extends javax.swing.JFrame {

    /**
     * Creates new form UIMenu
     */
    public UIMenu() {
        initComponents();
        MarketPanel.setVisible(true);
        All.setVisible(true);
        Metaverse.setVisible(false);
        DEFI.setVisible(false);
        FanToken.setVisible(false);
     
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MarketPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        All = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Metaverse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        DEFI = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        FanToken = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        WalletPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        TransferPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4970774.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Market");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Transfer");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setText("----------------------");

        jLabel6.setText("----------------------");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Wallet");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("----------------------");

        jLabel7.setText("----------------------");

        jLabel8.setText("----------------------");

        jLabel10.setText("----------------------");

        jLabel11.setFont(new java.awt.Font("Arial", 2, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COİN MARKET");

        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jPanel2.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout AllLayout = new javax.swing.GroupLayout(All);
        All.setLayout(AllLayout);
        AllLayout.setHorizontalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        AllLayout.setVerticalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        jPanel2.add(All, "card2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout MetaverseLayout = new javax.swing.GroupLayout(Metaverse);
        Metaverse.setLayout(MetaverseLayout);
        MetaverseLayout.setHorizontalGroup(
            MetaverseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        MetaverseLayout.setVerticalGroup(
            MetaverseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MetaverseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(Metaverse, "card3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout DEFILayout = new javax.swing.GroupLayout(DEFI);
        DEFI.setLayout(DEFILayout);
        DEFILayout.setHorizontalGroup(
            DEFILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        DEFILayout.setVerticalGroup(
            DEFILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DEFILayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(DEFI, "card4");

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Price", "24h change", "24 volume", "Market Cap"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Double.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout FanTokenLayout = new javax.swing.GroupLayout(FanToken);
        FanToken.setLayout(FanTokenLayout);
        FanTokenLayout.setHorizontalGroup(
            FanTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        FanTokenLayout.setVerticalGroup(
            FanTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FanTokenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(FanToken, "card5");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("All");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Metaverse");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("DEFI");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Fan Token");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MarketPanelLayout = new javax.swing.GroupLayout(MarketPanel);
        MarketPanel.setLayout(MarketPanelLayout);
        MarketPanelLayout.setHorizontalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addGap(203, 203, 203)
                .addComponent(jLabel17)
                .addGap(242, 242, 242)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(70, 70, 70))
            .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MarketPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MarketPanelLayout.setVerticalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MarketPanelLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.add(MarketPanel);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fiat and Spot balance");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("151.511");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Spot balance");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("150.120");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Fiat Balance");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("51.515");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Amount", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout WalletPanelLayout = new javax.swing.GroupLayout(WalletPanel);
        WalletPanel.setLayout(WalletPanelLayout);
        WalletPanelLayout.setHorizontalGroup(
            WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WalletPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(WalletPanelLayout.createSequentialGroup()
                        .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(WalletPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(354, 354, 354)
                                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20))))
                        .addGap(132, 132, 132))))
        );
        WalletPanelLayout.setVerticalGroup(
            WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(WalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(WalletPanel);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wallet.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/876784.png"))); // NOI18N

        jTextField1.setText("Coin amount");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout TransferPanelLayout = new javax.swing.GroupLayout(TransferPanel);
        TransferPanel.setLayout(TransferPanelLayout);
        TransferPanelLayout.setHorizontalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(232, 232, 232)
                .addComponent(jLabel22)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        TransferPanelLayout.setVerticalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferPanelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel24))
                    .addGroup(TransferPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel3.add(TransferPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(114, 114, 114))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Metaverse.setVisible(false);
        DEFI.setVisible(false);
        FanToken.setVisible(false);
        All.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        Metaverse.setVisible(true);
        DEFI.setVisible(false);
        FanToken.setVisible(false);
        All.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        Metaverse.setVisible(false);
        DEFI.setVisible(true);
        FanToken.setVisible(false);
        All.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        Metaverse.setVisible(false);
        DEFI.setVisible(false);
        FanToken.setVisible(true);
        All.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        UIDashBord uıBord=new UIDashBord();
        uıBord.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        MarketPanel.setVisible(true);
        WalletPanel.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        MarketPanel.setVisible(false);
        WalletPanel.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel All;
    private javax.swing.JPanel DEFI;
    private javax.swing.JPanel FanToken;
    private javax.swing.JPanel MarketPanel;
    private javax.swing.JPanel Metaverse;
    private javax.swing.JPanel TransferPanel;
    private javax.swing.JPanel WalletPanel;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
