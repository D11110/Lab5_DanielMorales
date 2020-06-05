/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_danielmorales;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jmi_addSuper.setEnabled(false);
        jmi_addVillano.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSuper = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreSuper = new javax.swing.JTextField();
        tf_debilidadSuper = new javax.swing.JTextField();
        tf_poderSuper = new javax.swing.JTextField();
        tf_fuerzaSuper = new javax.swing.JFormattedTextField();
        tf_agFisicaSuper = new javax.swing.JFormattedTextField();
        tf_agMentalSuper = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cb_escuadronSuper = new javax.swing.JComboBox<>();
        addVillanos = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tf_nombreVillano = new javax.swing.JTextField();
        tf_debilidadVillano = new javax.swing.JTextField();
        tf_poderVillano = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_fuerzaVillano = new javax.swing.JFormattedTextField();
        tf_agFisicaVillano = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_agMentalVillano = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        cb_escuadronVillano = new javax.swing.JComboBox<>();
        addEscuadron = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_nombreEscuadron = new javax.swing.JTextField();
        tf_lugarEscuadron = new javax.swing.JTextField();
        cb_tipoEscuadron = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        listarSuperheroes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSupers = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_addSuper = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_addVillano = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        addSuper.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Poder:");

        jLabel4.setText("Debilidad:");

        jLabel6.setText("Fuerza:");

        jLabel7.setText("Agilidad Fisica:");

        jLabel8.setText("Agilidad Mental:");

        tf_fuerzaSuper.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_fuerzaSuper.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_fuerzaSuperFocusLost(evt);
            }
        });

        tf_agFisicaSuper.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_agFisicaSuper.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_agFisicaSuperFocusLost(evt);
            }
        });

        tf_agMentalSuper.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_agMentalSuper.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_agMentalSuperFocusLost(evt);
            }
        });

        jButton1.setText("Agregar Superheroe");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel14.setText("Escuadron:");

        javax.swing.GroupLayout addSuperLayout = new javax.swing.GroupLayout(addSuper.getContentPane());
        addSuper.getContentPane().setLayout(addSuperLayout);
        addSuperLayout.setHorizontalGroup(
            addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSuperLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addSuperLayout.createSequentialGroup()
                        .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(tf_nombreSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_debilidadSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_poderSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fuerzaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_agFisicaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_escuadronSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addSuperLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_agMentalSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        addSuperLayout.setVerticalGroup(
            addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSuperLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombreSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_poderSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_debilidadSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_escuadronSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addSuperLayout.createSequentialGroup()
                        .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_fuerzaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_agFisicaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_agMentalSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        addVillanos.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel9.setText("Agilidad Fisica:");

        jLabel10.setText("Agilidad Mental:");

        jButton2.setText("Agregar Villano");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel5.setText("Nombre:");

        jLabel11.setText("Poder:");

        jLabel12.setText("Debilidad:");

        tf_fuerzaVillano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_fuerzaVillano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_fuerzaVillanoFocusLost(evt);
            }
        });

        tf_agFisicaVillano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_agFisicaVillano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_agFisicaVillanoFocusLost(evt);
            }
        });

        jLabel13.setText("Fuerza:");

        tf_agMentalVillano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tf_agMentalVillano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_agMentalVillanoFocusLost(evt);
            }
        });

        jLabel1.setText("Escuadron:");

        javax.swing.GroupLayout addVillanosLayout = new javax.swing.GroupLayout(addVillanos.getContentPane());
        addVillanos.getContentPane().setLayout(addVillanosLayout);
        addVillanosLayout.setHorizontalGroup(
            addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVillanosLayout.createSequentialGroup()
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addVillanosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombreVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_debilidadVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_poderVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb_escuadronVillano, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(addVillanosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_agFisicaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_agMentalVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fuerzaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        addVillanosLayout.setVerticalGroup(
            addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVillanosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombreVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_poderVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_debilidadVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_escuadronVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_fuerzaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_agFisicaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(addVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_agMentalVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        addEscuadron.setMinimumSize(new java.awt.Dimension(500, 500));
        addEscuadron.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel15.setText("Nombre:");

        jLabel16.setText("Lugar de base:");

        jLabel17.setText("Tipo:");

        cb_tipoEscuadron.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Superheroes", "Villanos" }));

        jButton3.setText("Crear escuadron");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addEscuadronLayout = new javax.swing.GroupLayout(addEscuadron.getContentPane());
        addEscuadron.getContentPane().setLayout(addEscuadronLayout);
        addEscuadronLayout.setHorizontalGroup(
            addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEscuadronLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(tf_nombreEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lugarEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipoEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        addEscuadronLayout.setVerticalGroup(
            addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEscuadronLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nombreEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_lugarEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_tipoEscuadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        listarSuperheroes.setMinimumSize(new java.awt.Dimension(500, 500));

        jScrollPane2.setViewportView(listaSupers);

        javax.swing.GroupLayout listarSuperheroesLayout = new javax.swing.GroupLayout(listarSuperheroes.getContentPane());
        listarSuperheroes.getContentPane().setLayout(listarSuperheroesLayout);
        listarSuperheroesLayout.setHorizontalGroup(
            listarSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarSuperheroesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        listarSuperheroesLayout.setVerticalGroup(
            listarSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarSuperheroesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Superheroes");

        jmi_addSuper.setText("Agregar superheroe");
        jmi_addSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_addSuperActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_addSuper);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Villanos");

        jmi_addVillano.setText("Agregar villano");
        jmi_addVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_addVillanoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_addVillano);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Visualizar");

        jMenuItem1.setText("Listar superheroes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Listar villanos");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Escuadrones");

        jMenuItem4.setText("Agregar escuadron");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_addSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_addSuperActionPerformed
        // TODO add your handling code here:
        addSuper.setVisible(true);
        superHeroesCont = 100;

        //Agregar escuadrones al dialog de agregar superheroe

    }//GEN-LAST:event_jmi_addSuperActionPerformed

    private void tf_fuerzaSuperFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_fuerzaSuperFocusLost
        // TODO add your handling code here://VERIFICAR FUERZA SUPERHEROE
        if (Integer.parseInt(tf_fuerzaSuper.getText()) < 100) {
            superHeroesCont -= Integer.parseInt(tf_fuerzaSuper.getText());
        }
    }//GEN-LAST:event_tf_fuerzaSuperFocusLost

    int superHeroesCont;
    int villanosCont;
    ArrayList superheroes = new ArrayList();

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try { // AGREGAR SUPERHEROES
            String nombre = tf_nombreSuper.getText();
            String poder = tf_poderSuper.getText();
            String debilidad = tf_debilidadSuper.getText();
            EscuadronSuperheroes escuadron = (EscuadronSuperheroes) cb_escuadronSuper.getSelectedItem();
            int fuerza = Integer.parseInt(tf_fuerzaSuper.getText());
            int agFisica = Integer.parseInt(tf_agFisicaSuper.getText());
            int agMental = Integer.parseInt(tf_agMentalSuper.getText());

            Superheroe se = new Superheroe(nombre, poder, debilidad, escuadron, fuerza, agFisica, agMental);
            superheroes.add(se);
            ((EscuadronSuperheroes) escuadron).getMiembros().add(se);

            DefaultListModel modelo = (DefaultListModel) listaSupers.getModel();
            modelo.addElement(se);
            listaSupers.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(addSuper, "Ha ocurrido un error en los datos");
        }

        JOptionPane.showMessageDialog(addSuper, "Superheroe agregado exitosamente");


    }//GEN-LAST:event_jButton1MouseClicked

    private void tf_agFisicaSuperFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_agFisicaSuperFocusLost
        // TODO add your handling code here: //VERIFICAR FISICA SUPERHEROE
        if (superHeroesCont - Integer.parseInt(tf_agFisicaSuper.getText()) < 0) {
            JOptionPane.showMessageDialog(addSuper, "Valor no permitido, se paso del limite de habilidades por superheroe");
            tf_agFisicaSuper.setText("");
        } else {
            superHeroesCont -= Integer.parseInt(tf_agFisicaSuper.getText());

        }
    }//GEN-LAST:event_tf_agFisicaSuperFocusLost

    private void tf_agMentalSuperFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_agMentalSuperFocusLost
        // TODO add your handling code here://VERIFICAR MENTAL SUPERHEROE
        if (superHeroesCont - Integer.parseInt(tf_agMentalSuper.getText()) < 0) {
            JOptionPane.showMessageDialog(addSuper, "Valor no permitido, se paso del limite de habilidades por superheroe");
            tf_agMentalSuper.setText("");
        } else if ((100 - (Integer.parseInt(tf_fuerzaSuper.getText())) - (Integer.parseInt(tf_agFisicaSuper.getText())) - (Integer.parseInt(tf_agMentalSuper.getText())) != 0)) {
            JOptionPane.showMessageDialog(addSuper, "Necesita ser igual a 100 Restante " + superHeroesCont);
        }
    }//GEN-LAST:event_tf_agMentalSuperFocusLost

    private void jmi_addVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_addVillanoActionPerformed
        // TODO add your handling code here:
        addVillanos.setVisible(true);
        villanosCont = 100;


    }//GEN-LAST:event_jmi_addVillanoActionPerformed

    ArrayList villanos = new ArrayList();

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here://AGREGAR VILLANO
        try {
            String nombre = tf_nombreVillano.getText();
            String poder = tf_poderVillano.getText();
            String debilidad = tf_debilidadVillano.getText();
            EscuadronVillanos escuadron = (EscuadronVillanos) cb_escuadronVillano.getSelectedItem();
            int fuerza = Integer.parseInt(tf_fuerzaVillano.getText());
            int agFisica = Integer.parseInt(tf_agFisicaVillano.getText());
            int agMental = Integer.parseInt(tf_agMentalVillano.getText());

            Villano v = new Villano(nombre, poder, debilidad, escuadron, fuerza, agFisica, agMental);
            villanos.add(v);
            ((EscuadronVillanos) escuadron).getMiembros().add(v);

            JOptionPane.showMessageDialog(addSuper, "Villano agregado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(addSuper, "Ha ocurrido un error en los datos");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void tf_fuerzaVillanoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_fuerzaVillanoFocusLost
        // TODO add your handling code here:
        if (Integer.parseInt(tf_fuerzaVillano.getText()) < 100) {
            villanosCont -= Integer.parseInt(tf_fuerzaVillano.getText());
        }
    }//GEN-LAST:event_tf_fuerzaVillanoFocusLost

    private void tf_agFisicaVillanoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_agFisicaVillanoFocusLost
        // TODO add your handling code here:
        if (villanosCont - Integer.parseInt(tf_agFisicaVillano.getText()) < 0) {
            JOptionPane.showMessageDialog(addVillanos, "Valor no permitido, se paso del limite de habilidades por villano");
            tf_agFisicaVillano.setText("");
        } else {
            villanosCont -= Integer.parseInt(tf_agFisicaVillano.getText());

        }
    }//GEN-LAST:event_tf_agFisicaVillanoFocusLost

    private void tf_agMentalVillanoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_agMentalVillanoFocusLost
        // TODO add your handling code here:
        if (villanosCont - Integer.parseInt(tf_agMentalVillano.getText()) < 0) {
            JOptionPane.showMessageDialog(addVillanos, "Valor no permitido, se paso del limite de habilidades por superheroe");
            tf_agMentalVillano.setText("");
        } else if ((100 - (Integer.parseInt(tf_fuerzaVillano.getText())) - (Integer.parseInt(tf_agFisicaVillano.getText())) - (Integer.parseInt(tf_agMentalVillano.getText())) != 0)) {
            JOptionPane.showMessageDialog(addVillanos, "Necesita ser igual a 100 Restante " + villanosCont);
        }
    }//GEN-LAST:event_tf_agMentalVillanoFocusLost

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        addEscuadron.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public String listar(String tipo) {
        String acum = "";

        if (tipo.equalsIgnoreCase("Superheroes")) {
            for (int i = 0; i < superheroes.size(); i++) {
                acum += ((Superheroe) superheroes.get(i)).getNombre() + " \n";
            }
        } else if (tipo.equalsIgnoreCase("Villanos")) {
            for (int i = 0; i < villanos.size(); i++) {
                acum += ((Villano) villanos.get(i)).getNombre() + " \n";
            }
        }

        return acum;
    }

    ArrayList escuadrones = new ArrayList();

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try { // AGREGAR ESCUADRON 
            String nombre = tf_nombreEscuadron.getText();
            String lugar = tf_lugarEscuadron.getText();
            String tipo = cb_tipoEscuadron.getSelectedItem().toString();
            if (tipo.equalsIgnoreCase("Superheroes")) {
                EscuadronSuperheroes esc = new EscuadronSuperheroes(nombre, lugar, tipo);
                escuadrones.add(esc);

                DefaultComboBoxModel modeloSuper = (DefaultComboBoxModel) cb_escuadronSuper.getModel();
                modeloSuper.addElement(esc);
                cb_escuadronSuper.setModel(modeloSuper);
                jmi_addSuper.setEnabled(true);
                JOptionPane.showMessageDialog(addEscuadron, "Escuadron de superheroes creado exitosamente");
            } else if (tipo.equalsIgnoreCase("Villanos")) {
                EscuadronVillanos esv = new EscuadronVillanos(nombre, lugar, tipo);
                escuadrones.add(esv);
                jmi_addVillano.setEnabled(true);

                DefaultComboBoxModel modeloVillano = (DefaultComboBoxModel) cb_escuadronVillano.getModel();

                modeloVillano.addElement(esv);
                cb_escuadronVillano.setModel(modeloVillano);
                JOptionPane.showMessageDialog(addEscuadron, "Escuadron de villanos creado exitosamente");

            }

            tf_nombreEscuadron.setText("");
            tf_lugarEscuadron.setText("");
            cb_tipoEscuadron.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(addEscuadron, "Ha ocurrido un error en los datos");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        listarSuperheroes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog addEscuadron;
    private javax.swing.JDialog addSuper;
    private javax.swing.JDialog addVillanos;
    private javax.swing.JComboBox<String> cb_escuadronSuper;
    private javax.swing.JComboBox<String> cb_escuadronVillano;
    private javax.swing.JComboBox<String> cb_tipoEscuadron;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmi_addSuper;
    private javax.swing.JMenuItem jmi_addVillano;
    private javax.swing.JList<String> listaSupers;
    private javax.swing.JDialog listarSuperheroes;
    private javax.swing.JFormattedTextField tf_agFisicaSuper;
    private javax.swing.JFormattedTextField tf_agFisicaVillano;
    private javax.swing.JFormattedTextField tf_agMentalSuper;
    private javax.swing.JFormattedTextField tf_agMentalVillano;
    private javax.swing.JTextField tf_debilidadSuper;
    private javax.swing.JTextField tf_debilidadVillano;
    private javax.swing.JFormattedTextField tf_fuerzaSuper;
    private javax.swing.JFormattedTextField tf_fuerzaVillano;
    private javax.swing.JTextField tf_lugarEscuadron;
    private javax.swing.JTextField tf_nombreEscuadron;
    private javax.swing.JTextField tf_nombreSuper;
    private javax.swing.JTextField tf_nombreVillano;
    private javax.swing.JTextField tf_poderSuper;
    private javax.swing.JTextField tf_poderVillano;
    // End of variables declaration//GEN-END:variables
}
