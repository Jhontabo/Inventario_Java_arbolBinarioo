/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Jhontabo
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Vista1 = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_stockD = new javax.swing.JLabel();
        lbl_iconEliminar = new javax.swing.JLabel();
        JText_Codigo = new javax.swing.JTextField();
        JText_Cantidad = new javax.swing.JTextField();
        JText_StockD = new javax.swing.JTextField();
        JText_Precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Vista2 = new javax.swing.JPanel();
        Vista3 = new javax.swing.JPanel();
        Vista4 = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        btn_nuevaVenta = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_proovedores = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigo.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl_codigo.setText("Codigo");

        lbl_cantidad.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl_cantidad.setText("Cantidad");

        lbl_precio.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl_precio.setText("Precio");

        lbl_stockD.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl_stockD.setText("Stock disponible");

        lbl_iconEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N

        JText_Precio.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        javax.swing.GroupLayout Vista1Layout = new javax.swing.GroupLayout(Vista1);
        Vista1.setLayout(Vista1Layout);
        Vista1Layout.setHorizontalGroup(
            Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista1Layout.createSequentialGroup()
                .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Vista1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(JText_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Vista1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lbl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JText_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGap(23, 23, 23)
                .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vista1Layout.createSequentialGroup()
                        .addComponent(JText_StockD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lbl_iconEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_stockD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(Vista1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Vista1Layout.setVerticalGroup(
            Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad)
                    .addComponent(lbl_precio)
                    .addComponent(lbl_stockD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_iconEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JText_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JText_StockD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JText_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", Vista1);

        javax.swing.GroupLayout Vista2Layout = new javax.swing.GroupLayout(Vista2);
        Vista2.setLayout(Vista2Layout);
        Vista2Layout.setHorizontalGroup(
            Vista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        Vista2Layout.setVerticalGroup(
            Vista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", Vista2);

        javax.swing.GroupLayout Vista3Layout = new javax.swing.GroupLayout(Vista3);
        Vista3.setLayout(Vista3Layout);
        Vista3Layout.setHorizontalGroup(
            Vista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        Vista3Layout.setVerticalGroup(
            Vista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", Vista3);

        javax.swing.GroupLayout Vista4Layout = new javax.swing.GroupLayout(Vista4);
        Vista4.setLayout(Vista4Layout);
        Vista4Layout.setHorizontalGroup(
            Vista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        Vista4Layout.setVerticalGroup(
            Vista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", Vista4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 890, 420));

        BarraLateral.setBackground(new java.awt.Color(89, 113, 231));
        BarraLateral.setForeground(new java.awt.Color(255, 255, 255));

        btn_nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N
        btn_nuevaVenta.setText("Nueva Venta");

        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cliente.png"))); // NOI18N
        btn_clientes.setText("Clientes");

        btn_proovedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mensajero.png"))); // NOI18N
        btn_proovedores.setText("Proveedor");

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Productos.png"))); // NOI18N
        btn_productos.setText("Productos");

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_nuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_proovedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btn_nuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_proovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JTextField JText_Cantidad;
    private javax.swing.JTextField JText_Codigo;
    private javax.swing.JTextField JText_Precio;
    private javax.swing.JTextField JText_StockD;
    private javax.swing.JPanel Vista1;
    private javax.swing.JPanel Vista2;
    private javax.swing.JPanel Vista3;
    private javax.swing.JPanel Vista4;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_nuevaVenta;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_proovedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_iconEliminar;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_stockD;
    // End of variables declaration//GEN-END:variables
}