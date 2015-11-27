/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.busqueda.ArbolBusqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.EstrategiaBusqueda;
import com.unmsm.busqueda.NodoDeBusqueda;
import com.unmsm.busqueda.informada.costouniforme.BusquedaCostoUniforme;
import com.unmsm.busqueda.noinformada.BusquedaBFS;
import com.unmsm.busqueda.noinformada.BusquedaDFS;
import com.unmsm.ochotorres.Alfil;
import com.unmsm.ochotorres.EstadoOchoPiezas;
import com.unmsm.ochotorres.Pieza;
import com.unmsm.ochotorres.Reina;
import com.unmsm.ochotorres.Tablero;
import com.unmsm.ochotorres.Torre;
import java.awt.Toolkit;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Aplicacion8Torres extends javax.swing.JFrame {

    EstrategiaBusqueda estrategia;
    ArbolBusqueda arbolBusqueda;
    private Iterador iterador;
    Pieza pieza;
    /**
     * Creates new form Aplicacion8Torres
     */
    public Aplicacion8Torres() {
        initComponents();
        IconUtil.ponerIcono(anterior, "/com/unmsm/ochotorres/interfazgrafica/imagenes/anterior.jpg");
        IconUtil.ponerIcono(posterior, "/com/unmsm/ochotorres/interfazgrafica/imagenes/posterior.jpg");
             
        tableroLimpio();
    }

    public void tableroLimpio() {
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        ocho.setVisible(false);
        siete.setVisible(false);
        seis.setVisible(false);
        cinco.setVisible(false);
        cuatro.setVisible(false);
        tres.setVisible(false);
        dos.setVisible(false);
        uno.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tableroPresenter = new com.unmsm.ochotorres.interfazgrafica.TableroPresenter();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        posterior = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tipoArbol = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoPieza = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        fila = new javax.swing.JLabel();
        dimension = new javax.swing.JTextField();
        crearTablero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));
        panel.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        tableroPresenter.setPreferredSize(new java.awt.Dimension(0, 402));

        javax.swing.GroupLayout tableroPresenterLayout = new javax.swing.GroupLayout(tableroPresenter);
        tableroPresenter.setLayout(tableroPresenterLayout);
        tableroPresenterLayout.setHorizontalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        tableroPresenterLayout.setVerticalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        posterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        a.setText("a");

        b.setText("b");

        c.setText("c");

        d.setText("d");

        e.setText("e");

        f.setText("f");

        g.setText("g");

        h.setText("h");

        ocho.setText("8");

        siete.setText("7");

        seis.setText("6");

        cinco.setText("5");

        cuatro.setText("4");

        tres.setText("3");

        dos.setText("2");

        uno.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tableroPresenter, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tableroPresenter, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a)
                        .addComponent(b)
                        .addComponent(c)
                        .addComponent(d)
                        .addComponent(e)
                        .addComponent(f)
                        .addComponent(g)
                        .addComponent(h))
                    .addGap(18, 18, 18)
                    .addComponent(uno)
                    .addGap(31, 31, 31)
                    .addComponent(dos)
                    .addGap(32, 32, 32)
                    .addComponent(tres)
                    .addGap(35, 35, 35)
                    .addComponent(cuatro)
                    .addGap(36, 36, 36)
                    .addComponent(cinco)
                    .addGap(35, 35, 35)
                    .addComponent(seis)
                    .addGap(35, 35, 35)
                    .addComponent(siete)
                    .addGap(34, 34, 34)
                    .addComponent(ocho)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(posterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        panel.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        tipoArbol.setBackground(new java.awt.Color(153, 153, 153));
        tipoArbol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BFS", "DFS", "Costo Uniforme", "DFS Limitado", "A*", "Goloso" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoja arbol de busqueda");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione Pieza");

        tipoPieza.setBackground(new java.awt.Color(153, 153, 153));
        tipoPieza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Torre", "Reina", "Alfil" }));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(tipoArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscar)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        panel.add(jPanel2, java.awt.BorderLayout.EAST);

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel1.setPreferredSize(new java.awt.Dimension(40, 40));
        jToolBar1.add(jLabel1);

        fila.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        fila.setText("DIMENSION DEL TABLERO :");
        jToolBar1.add(fila);

        dimension.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dimension.setMinimumSize(new java.awt.Dimension(6, 30));
        dimension.setPreferredSize(new java.awt.Dimension(50, 30));
        dimension.setRequestFocusEnabled(false);
        dimension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dimensionKeyTyped(evt);
            }
        });
        jToolBar1.add(dimension);

        crearTablero.setBackground(new java.awt.Color(204, 204, 255));
        crearTablero.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        crearTablero.setForeground(new java.awt.Color(51, 51, 51));
        crearTablero.setText("CREAR TABLERO");
        crearTablero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearTablero.setFocusable(false);
        crearTablero.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        crearTablero.setPreferredSize(new java.awt.Dimension(160, 30));
        crearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTableroActionPerformed(evt);
            }
        });
        jToolBar1.add(crearTablero);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 40));
        jToolBar1.add(jLabel2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        jToolBar1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTableroActionPerformed
        // TODO add your handling code here:
        String n = dimension.getText();
        int dimensionTablero = 0;
        try {
            dimensionTablero = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESAR DIMENSION CORRECTA!!");
        }

        if (dimensionTablero > 0 && dimensionTablero < 9) {
            Tablero.DIMENSION = dimensionTablero;
            Tablero tableroModelo = new Tablero();
            tableroPresenter.construirEnBaseA(tableroModelo);

            switch (dimensionTablero) {
                case 1:
                    a.setVisible(true);
                    b.setVisible(false);
                    c.setVisible(false);
                    d.setVisible(false);
                    e.setVisible(false);
                    f.setVisible(false);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(false);
                    cinco.setVisible(false);
                    cuatro.setVisible(false);
                    tres.setVisible(false);
                    dos.setVisible(false);
                    uno.setVisible(true);
                    break;

                case 2:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(false);
                    d.setVisible(false);
                    e.setVisible(false);
                    f.setVisible(false);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(false);
                    cinco.setVisible(false);
                    cuatro.setVisible(false);
                    tres.setVisible(false);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 3:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(false);
                    e.setVisible(false);
                    f.setVisible(false);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(false);
                    cinco.setVisible(false);
                    cuatro.setVisible(false);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 4:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(true);
                    e.setVisible(false);
                    f.setVisible(false);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(false);
                    cinco.setVisible(false);
                    cuatro.setVisible(true);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 5:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(true);
                    e.setVisible(true);
                    f.setVisible(false);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(false);
                    cinco.setVisible(true);
                    cuatro.setVisible(true);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 6:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(true);
                    e.setVisible(true);
                    f.setVisible(true);
                    g.setVisible(false);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(false);
                    seis.setVisible(true);
                    cinco.setVisible(true);
                    cuatro.setVisible(true);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 7:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(true);
                    e.setVisible(true);
                    f.setVisible(true);
                    g.setVisible(true);
                    h.setVisible(false);
                    ocho.setVisible(false);
                    siete.setVisible(true);
                    seis.setVisible(true);
                    cinco.setVisible(true);
                    cuatro.setVisible(true);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;

                case 8:
                    a.setVisible(true);
                    b.setVisible(true);
                    c.setVisible(true);
                    d.setVisible(true);
                    e.setVisible(true);
                    f.setVisible(true);
                    g.setVisible(true);
                    h.setVisible(true);
                    ocho.setVisible(true);
                    siete.setVisible(true);
                    seis.setVisible(true);
                    cinco.setVisible(true);
                    cuatro.setVisible(true);
                    tres.setVisible(true);
                    dos.setVisible(true);
                    uno.setVisible(true);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "INGRESAR DIMENSION ENTRE 1 - 8");
        }
    }//GEN-LAST:event_crearTableroActionPerformed

    private void dimensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimensionKeyTyped
        // PERMITE QUE SOLO SE ACEPTEN NUMEROS Y DE HASTA 20 DIGITOS, CADA VEZ QUE SE TIPEA EN ESTE TEXTFIELD 
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        int k = (int) evt.getKeyChar();
    }//GEN-LAST:event_dimensionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        arbolBusqueda = new ArbolBusqueda(obtenerEstrategia());
        pieza = obtenerPieza();
        Camino caminoSolucion = arbolBusqueda.buscar(new EstadoOchoPiezas(tableroPresenter.getTableroModelo(), pieza));
        if (caminoSolucion.empty()) {
            JOptionPane.showMessageDialog(this, "!Error! No se encontró una solución!", "No hay solucion", JOptionPane.ERROR_MESSAGE);
        } else {
            
//            :;iterador = caminoSolucion.listIterator();
            mostrarSolucion(caminoSolucion);
            iterador = new Iterador(caminoSolucion.getCamino(),caminoSolucion.tamaño());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if(iterador.hasPrevious()){
            NodoDeBusqueda nodoBusqueda = (NodoDeBusqueda)iterador.previous();
            EstadoOchoPiezas estadoOchoPiezas = ((EstadoOchoPiezas) nodoBusqueda.getEstadoActual());
            tableroPresenter.construirEnBaseA(estadoOchoPiezas.getTablero());
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void posteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posteriorActionPerformed
        if(iterador.hasNext()){
            NodoDeBusqueda nodoBusqueda = (NodoDeBusqueda)iterador.next();
            EstadoOchoPiezas estadoOchoPiezas = ((EstadoOchoPiezas) nodoBusqueda.getEstadoActual());
            tableroPresenter.construirEnBaseA(estadoOchoPiezas.getTablero());
        }
    }//GEN-LAST:event_posteriorActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion8Torres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel c;
    private javax.swing.JLabel cinco;
    private javax.swing.JButton crearTablero;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel d;
    private javax.swing.JTextField dimension;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel fila;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel ocho;
    private javax.swing.JPanel panel;
    private javax.swing.JButton posterior;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private com.unmsm.ochotorres.interfazgrafica.TableroPresenter tableroPresenter;
    private javax.swing.JComboBox tipoArbol;
    private javax.swing.JComboBox tipoPieza;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables

    //TODO Llevar a clase Factory. Acabar: Costo Uniforme DFS Limitado A* Goloso
    private EstrategiaBusqueda obtenerEstrategia() {
        String tipo = (String) tipoArbol.getSelectedItem();
        EstrategiaBusqueda estrategiaBusqueda = null;
        switch (tipo) {
            case "BFS":
                estrategiaBusqueda = new BusquedaBFS();
                break;
            case "DFS":
                estrategiaBusqueda = new BusquedaDFS();
                break;
            case "Costo Uniforme":
                estrategiaBusqueda = new BusquedaCostoUniforme();
                break;
        }
        return estrategiaBusqueda;
    }
    
    private Pieza obtenerPieza() {
        String tipo = (String) tipoPieza.getSelectedItem();
        Pieza piezaBusqueda = null;
        switch (tipo) {
            case "Torre":
                piezaBusqueda = new Torre();
                break;
            case "Reina":
                piezaBusqueda = new Reina();
                break;
            case "Alfil":
                piezaBusqueda = new Alfil();
                break;
        }
        return piezaBusqueda;
    }

    private void mostrarSolucion(Camino caminoSolucion) {
        new Thread() {
            @Override
            public void run() {
                for (NodoDeBusqueda nodoBusqueda : caminoSolucion) {
                    EstadoOchoPiezas estadoOchoPiezas = ((EstadoOchoPiezas) nodoBusqueda.getEstadoActual());
                    tableroPresenter.construirEnBaseA(estadoOchoPiezas.getTablero());
                    esperar(1);
                }
            }
        }.start();
    }

    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
        }
    }
    
    
    class Iterador implements Iterator<NodoDeBusqueda>{
        private Integer posicion;
        private List<NodoDeBusqueda> camino;
        
        public Iterador(){
            posicion = 0;
        }
        
        public Iterador(List list, Integer tamaño){
            posicion = tamaño;
            this.camino = list;
            Collections.reverse(this.camino);
        }

        @Override
        public boolean hasNext() {
            if (posicion < camino.size()) { return true; }
            else { return false; }
        }

        @Override
        public NodoDeBusqueda next() {
            posicion++;
            return camino.get(posicion-1);
        }
        
        public boolean hasPrevious(){
            if (posicion > 0) { return true; }
            else { return false; }
        }
        
        public NodoDeBusqueda previous(){
            posicion--;
            return camino.get(posicion);
        }
    }
}
