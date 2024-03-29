/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import EDD.NodoCola;
import Main.Global;
import javax.swing.DefaultListModel;

/**
 *
 * @author Diego
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    //METODOS PARA ACTUALIZAR LAS COLAS DE NICKELODEON
    public void ActualizarColaNK_1(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_1_nk().getHead();
        while (pointer != null) {
            modelo.addElement("N" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaNK_1.setModel(modelo);
    }
    public void ActualizarColaNK_2(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_2_nk().getHead();
        while (pointer != null) {
            modelo.addElement("N" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaNK_2.setModel(modelo);
    }
    public void ActualizarColaNK_3(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_3_nk().getHead();
        while (pointer != null) {
            modelo.addElement("N" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaNK_3.setModel(modelo);
    }
    public void ActualizarColaNK_Refuerzos(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getRefuerzos_nk().getHead();
        while (pointer != null) {
            modelo.addElement("N" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaNK_Refuerzos.setModel(modelo);
    }
    
    //METODOS PARA ACTUALIZAR LAS COLAS DE Cartoon network
    public void ActualizarColaCN_1(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_1_cn().getHead();
        while (pointer != null) {
            modelo.addElement("C" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaCN_1.setModel(modelo);
    }
    public void ActualizarColaCN_2(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_2_cn().getHead();
        while (pointer != null) {
            modelo.addElement("C" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaCN_2.setModel(modelo);
    }
    public void ActualizarColaCN_3(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getPrioridad_3_cn().getHead();
        while (pointer != null) {
            modelo.addElement("C" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaCN_3.setModel(modelo);
    }
    public void ActualizarColaCN_Refuerzos(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.removeAllElements();
        NodoCola pointer = Global.getRefuerzos_cn().getHead();
        while (pointer != null) {
            modelo.addElement("C" + Integer.toString(pointer.getElement().getId())+" - " +pointer.getElement().getNombre());
            pointer = pointer.getNext();
        }
        colaCN_Refuerzos.setModel(modelo);
    }
    
    public void cambiarEstadoIA(String estado){
        estadoIA.setText(estado);
    }
    
    public void actualizarPeleadores(String str) {
        peleadores.setText(str);
    }
    
    public void cambiarEstadoBatalla(String str){
        ganadormomento.setText(str);
    }
    
    public void aumentoGanadorNK(int d){
        nickelodeonScore.setText(String.valueOf(d));
        
    }
    
    public void aumentoGanadorCN(int d){
        cartoonNetworkScore.setText(String.valueOf(d));
        
    }
    
    public void actualizarListaGanadores(String str){
        ganadores.setText(str);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cartoonNetworkScore = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nickelodeonScore = new javax.swing.JLabel();
        estadoIA = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ganadormomento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        peleadores = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        colaNK_1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        colaNK_2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        colaNK_3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        colaNK_Refuerzos = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        colaCN_2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        colaCN_1 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        colaCN_3 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        colaCN_Refuerzos = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        ganadores = new javax.swing.JTextArea();
        velocidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COLA DE PRIORIDAD 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ESTADO DE LA IA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COLA DE PRIORIDAD 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("COLA DE PRIORIDAD 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COLA DE REFUERZOS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("COLA DE PRIORIDAD 2 ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("COLA DE PRIORIDAD 3");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("COLA DE REFUERZOS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VELOCIDAD DE REPRODUCCION");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        cartoonNetworkScore.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        cartoonNetworkScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartoonNetworkScore.setText("0");
        getContentPane().add(cartoonNetworkScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 80, 50));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("-");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 40, 30));

        nickelodeonScore.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        nickelodeonScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nickelodeonScore.setText("0");
        getContentPane().add(nickelodeonScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 80, 50));

        estadoIA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(estadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 220, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LISTA DE GANADORES");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        ganadormomento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(ganadormomento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 280, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("RESULTADO DE LA BATALLA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("COLA DE PRIORIDAD 1");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 20));

        peleadores.setColumns(20);
        peleadores.setRows(5);
        jScrollPane9.setViewportView(peleadores);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 260, 70));

        colaNK_1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(colaNK_1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 70));

        colaNK_2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(colaNK_2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 70));

        colaNK_3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(colaNK_3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 70));

        colaNK_Refuerzos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(colaNK_Refuerzos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 70));

        colaCN_2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(colaCN_2);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 150, 70));

        colaCN_1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(colaCN_1);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 150, 70));

        colaCN_3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(colaCN_3);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 150, 70));

        colaCN_Refuerzos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(colaCN_Refuerzos);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 150, 70));

        ganadores.setColumns(20);
        ganadores.setRows(5);
        jScrollPane10.setViewportView(ganadores);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 386, 190, 110));

        velocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.25", "0.5", "0.75", "1", "2", "5", "10", "20" }));
        velocidad.setSelectedIndex(3);
        velocidad.setToolTipText("");
        velocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadActionPerformed(evt);
            }
        });
        getContentPane().add(velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 60, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/un show mas.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 340, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void velocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadActionPerformed
        double newSimSpeed = Double.parseDouble(this.velocidad.getSelectedItem().toString());
        Global.setSimSpeed(10000/newSimSpeed);
        Global.setNextSim(10000/newSimSpeed);
        Global.setDuracionSimulacion(10000/newSimSpeed);
    }//GEN-LAST:event_velocidadActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartoonNetworkScore;
    private javax.swing.JList<String> colaCN_1;
    private javax.swing.JList<String> colaCN_2;
    private javax.swing.JList<String> colaCN_3;
    private javax.swing.JList<String> colaCN_Refuerzos;
    private javax.swing.JList<String> colaNK_1;
    private javax.swing.JList<String> colaNK_2;
    private javax.swing.JList<String> colaNK_3;
    private javax.swing.JList<String> colaNK_Refuerzos;
    private javax.swing.JLabel estadoIA;
    private javax.swing.JTextArea ganadores;
    private javax.swing.JLabel ganadormomento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel nickelodeonScore;
    private javax.swing.JTextArea peleadores;
    private javax.swing.JComboBox<String> velocidad;
    // End of variables declaration//GEN-END:variables
}
