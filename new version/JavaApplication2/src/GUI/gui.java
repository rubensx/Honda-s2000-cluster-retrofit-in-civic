package GUI;

import SerialPort.Serial;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class gui extends javax.swing.JFrame {

    //Arrays for engine coolant temperature conversion
    ArrayList<Integer> temps = new ArrayList<Integer>();
    ArrayList<Integer> adcs = new ArrayList<Integer>();
 
    /**
     * Creates new form gui
     */
    public gui() {        
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        
        //temp vs adc value arrays
        temps.add(20); adcs.add(562);
        temps.add(21); adcs.add(554);
        temps.add(22); adcs.add(547);
        temps.add(23); adcs.add(539);
        temps.add(24); adcs.add(530);
        temps.add(25); adcs.add(519);
        temps.add(26); adcs.add(505);
        temps.add(27); adcs.add(491);
        temps.add(28); adcs.add(478);
        temps.add(29); adcs.add(466);
        temps.add(30); adcs.add(456);
        temps.add(31); adcs.add(446);
        temps.add(32); adcs.add(437);
        temps.add(33); adcs.add(428);
        temps.add(34); adcs.add(419);
        temps.add(35); adcs.add(410);
        temps.add(36); adcs.add(401);
        temps.add(37); adcs.add(391);
        temps.add(38); adcs.add(382);
        temps.add(39); adcs.add(372);
        temps.add(40); adcs.add(362);
        temps.add(41); adcs.add(352);
        temps.add(42); adcs.add(342);
        temps.add(43); adcs.add(333);
        temps.add(44); adcs.add(324);
        temps.add(45); adcs.add(316);
        temps.add(46); adcs.add(308);
        temps.add(47); adcs.add(300);
        temps.add(48); adcs.add(293);
        temps.add(49); adcs.add(286);
        temps.add(50); adcs.add(279);
        temps.add(51); adcs.add(272);
        temps.add(52); adcs.add(265);
        temps.add(53); adcs.add(258);
        temps.add(54); adcs.add(252);
        temps.add(55); adcs.add(245);
        temps.add(56); adcs.add(239);
        temps.add(57); adcs.add(232);
        temps.add(58); adcs.add(225);
        temps.add(59); adcs.add(219);
        temps.add(60); adcs.add(212);
        temps.add(61); adcs.add(206);
        temps.add(62); adcs.add(200);
        temps.add(63); adcs.add(194);
        temps.add(64); adcs.add(188);
        temps.add(65); adcs.add(182);
        temps.add(66); adcs.add(177);
        temps.add(67); adcs.add(172);
        temps.add(68); adcs.add(167);
        temps.add(69); adcs.add(162);
        temps.add(70); adcs.add(157);
        temps.add(71); adcs.add(153);
        temps.add(72); adcs.add(148);
        temps.add(73); adcs.add(144);
        temps.add(74); adcs.add(139);
        temps.add(75); adcs.add(135);
        temps.add(76); adcs.add(131);
        temps.add(77); adcs.add(126);
        temps.add(78); adcs.add(122);
        temps.add(79); adcs.add(118);
        temps.add(80); adcs.add(113);
        temps.add(81); adcs.add(108);
        temps.add(82); adcs.add(103);
        temps.add(83); adcs.add(98);
        temps.add(84); adcs.add(93);
        temps.add(85); adcs.add(87);
        temps.add(86); adcs.add(81);
        temps.add(87); adcs.add(75);
        temps.add(88); adcs.add(70);
        temps.add(89); adcs.add(66);
        temps.add(90); adcs.add(62);
        temps.add(91); adcs.add(59);
        temps.add(92); adcs.add(56);
        temps.add(93); adcs.add(54);
        temps.add(94); adcs.add(52);
        temps.add(95); adcs.add(50);
        temps.add(96); adcs.add(48);
        temps.add(97); adcs.add(47);
        temps.add(98); adcs.add(45);
        temps.add(99); adcs.add(44);
        temps.add(100); adcs.add(43);
        temps.add(101); adcs.add(42);
        temps.add(102); adcs.add(41);
        temps.add(103); adcs.add(40);
        temps.add(104); adcs.add(39);
        temps.add(105); adcs.add(38);
        temps.add(106); adcs.add(37);
        temps.add(107); adcs.add(37);
        temps.add(108); adcs.add(36);
        temps.add(109); adcs.add(35);
        temps.add(110); adcs.add(34);
        temps.add(111); adcs.add(34);
        temps.add(112); adcs.add(33);
        temps.add(113); adcs.add(33);
        temps.add(114); adcs.add(32);
        temps.add(115); adcs.add(31);
        temps.add(116); adcs.add(31);
        temps.add(117); adcs.add(30);
        temps.add(118); adcs.add(30);
        temps.add(119); adcs.add(29);
        temps.add(120); adcs.add(28);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner3 = new javax.swing.JSpinner();
        factorSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bar1Spinner = new javax.swing.JSpinner();
        bar2Spinner = new javax.swing.JSpinner();
        bar4Spinner = new javax.swing.JSpinner();
        bar3Spinner = new javax.swing.JSpinner();
        bar5Spinner = new javax.swing.JSpinner();
        bar6Spinner = new javax.swing.JSpinner();
        setConfigBtn = new javax.swing.JButton();
        readConfigBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        factorSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(99.99f), Float.valueOf(0.01f)));
        factorSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                factorSpinnerStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle Speed Sensor scaling factor");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("    Bar 1");

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("    Bar 2");

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("    Bar 3");

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("    Bar 4");

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("    Bar 5");

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("    Bar 6");

        bar1Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        bar2Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        bar4Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        bar3Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        bar5Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        bar6Spinner.setModel(new javax.swing.SpinnerNumberModel(20, 20, 120, 1));

        setConfigBtn.setText("Set Config");
        setConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConfigBtnActionPerformed(evt);
            }
        });

        readConfigBtn.setText("Read Config");
        readConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readConfigBtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Engine Coolant Temperature gauge");

        jLabel10.setFont(new java.awt.Font("Corbel", 3, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("cluster retrofit 1.0");

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Created by Pablo Buenaposada");

        jLabel13.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("                                              Degree Celsius scale (Cº)");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/s2000logo.jpg"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/gauge.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel11)
                .add(36, 36, 36)
                .add(jButton1))
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(bar1Spinner))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(readConfigBtn)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(setConfigBtn))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(bar2Spinner)
                                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(bar3Spinner)
                                            .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(bar4Spinner)
                                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(bar5Spinner)
                                            .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(bar6Spinner)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(factorSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(36, 36, 36)
                                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 214, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(10, 10, 10))
                    .add(layout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(65, 65, 65)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel13)
                    .add(jLabel15))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jLabel14))
                .add(18, 18, 18)
                .add(jLabel1)
                .add(16, 16, 16)
                .add(factorSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel15)
                .add(0, 0, 0)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel13)
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel3)
                                    .add(jLabel4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(bar1Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(bar2Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(bar5Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jLabel7)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                            .add(jLabel6)
                                            .add(jLabel5)))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(bar3Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(bar4Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel8)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(bar6Spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(18, 27, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(readConfigBtn)
                            .add(setConfigBtn))
                        .add(18, 18, 18)
                        .add(jLabel11))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(135, 135, 135)
                        .add(jButton1)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void factorSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_factorSpinnerStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_factorSpinnerStateChanged

    private int celsius2ADC(int temp){
        return adcs.get(temps.indexOf(temp));
    }
    
    private int ADC2Celsius(int adc){
        return temps.get(adcs.indexOf(adc));
    }
    
    private boolean checkBarsValues(){
        int temp1 = Integer.parseInt(bar1Spinner.getValue().toString());
        int temp2 = Integer.parseInt(bar2Spinner.getValue().toString());
        int temp3 = Integer.parseInt(bar3Spinner.getValue().toString());
        int temp4 = Integer.parseInt(bar4Spinner.getValue().toString());
        int temp5 = Integer.parseInt(bar5Spinner.getValue().toString());
        int temp6 = Integer.parseInt(bar6Spinner.getValue().toString());
        if ((temp1 < temp2) && (temp2 < temp3) && (temp3 < temp4) && (temp4 < temp5) && (temp5 < temp6)){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void setConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setConfigBtnActionPerformed
        
        if(checkBarsValues()){        
            Serial serialPort = new Serial();
            try{
                serialPort.configPort("/dev/tty.usbserial","aa");
                Float factor = (Float)factorSpinner.getValue();
                factor = factor*100;
                System.out.println("VSSSET"+factor.intValue()+Character.toString('\n'));
                serialPort.write("VSSSET"+factor.intValue()+Character.toString('\n'));
                Thread.sleep(800);
                System.out.print(serialPort.read());        
            
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error with the USB communication","Error",JOptionPane.ERROR_MESSAGE);
            }
            try {
                serialPort.closePort();
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            int temp1 = Integer.parseInt(bar1Spinner.getValue().toString());
            int temp2 = Integer.parseInt(bar2Spinner.getValue().toString());
            int temp3 = Integer.parseInt(bar3Spinner.getValue().toString());
            int temp4 = Integer.parseInt(bar4Spinner.getValue().toString());
            int temp5 = Integer.parseInt(bar5Spinner.getValue().toString());
            int temp6 = Integer.parseInt(bar6Spinner.getValue().toString());        
        
            temp1 = celsius2ADC(temp1);
            temp2 = celsius2ADC(temp2);
            temp3 = celsius2ADC(temp3);
            temp4 = celsius2ADC(temp4);
            temp5 = celsius2ADC(temp5);
            temp6 = celsius2ADC(temp6); 

            String bar1 = String.format("%04d",temp1); 
            String bar2 = String.format("%04d",temp2); 
            String bar3 = String.format("%04d",temp3); 
            String bar4 = String.format("%04d",temp4); 
            String bar5 = String.format("%04d",temp5); 
            String bar6 = String.format("%04d",temp6);             

            Serial serialPort2 = new Serial();
            try{
                serialPort2.configPort("/dev/tty.usbserial","aa");
                serialPort2.write("ECTSET"+bar1+bar2+bar3+bar4+bar5+bar6+Character.toString('\n'));
                Thread.sleep(800);
                String input = serialPort2.read();
                System.out.print(input);
                if(input.endsWith("ECTOK")){
                    JOptionPane.showMessageDialog(this, "Done!","Result",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "No feedback from the USB device, probably no settings uploaded","Result",JOptionPane.WARNING_MESSAGE);
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error with the USB communication","Error",JOptionPane.ERROR_MESSAGE);
            }
            try {
                serialPort2.closePort();
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{
            JOptionPane.showMessageDialog(this, "All the temperatures must be higher than their previous one","Seems that we have a problem",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_setConfigBtnActionPerformed

    private void readConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readConfigBtnActionPerformed
        
        Serial serialPort = new Serial();
        try {
            serialPort.configPort("/dev/tty.usbserial","aa");
            serialPort.write("VSSREAD"+Character.toString('\n'));
            Thread.sleep(800);
            String received = serialPort.read();   
            System.out.println(received);
            int factorHigh = Integer.parseInt(received.substring(9,11));
            int factorLow = Integer.parseInt(received.substring(11,received.length()-2));            
            factorSpinner.setValue((float)((factorHigh*100)+factorLow)/100); 
            
        } catch (Exception ex) {            
            JOptionPane.showMessageDialog(this, "Error with the USB communication","Error",JOptionPane.ERROR_MESSAGE);
        }
        try {
            serialPort.closePort();
        } catch (IOException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Serial serialPort2 = new Serial();    
        try {
            serialPort2.configPort("/dev/tty.usbserial","aa");
            serialPort2.write("ECTREAD"+Character.toString('\n'));
            Thread.sleep(800);
            String received = serialPort.read(); 
            System.out.println(received);
            String[] split = received.substring(9).split("\\.");            
            bar1Spinner.setValue(ADC2Celsius(Integer.parseInt(split[0])));
            bar2Spinner.setValue(ADC2Celsius(Integer.parseInt(split[1])));
            bar3Spinner.setValue(ADC2Celsius(Integer.parseInt(split[2])));
            bar4Spinner.setValue(ADC2Celsius(Integer.parseInt(split[3])));
            bar5Spinner.setValue(ADC2Celsius(Integer.parseInt(split[4])));
            bar6Spinner.setValue(ADC2Celsius(Integer.parseInt(split[5].substring(0, split[5].length()-2))));
            JOptionPane.showMessageDialog(this, "Done!","Result",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error with the USB communication","Error",JOptionPane.ERROR_MESSAGE);
        }        
        try {
            serialPort2.closePort();
        } catch (IOException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_readConfigBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Serial serialPort = new Serial();
        try {
            serialPort.configPort("/dev/tty.usbserial","aa");
            serialPort.write("ECTNOW"+Character.toString('\n'));
            Thread.sleep(800);
            String received = serialPort.read();   
            System.out.println(received);            
        } catch (Exception ex) {            
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            serialPort.closePort();
        } catch (IOException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner bar1Spinner;
    private javax.swing.JSpinner bar2Spinner;
    private javax.swing.JSpinner bar3Spinner;
    private javax.swing.JSpinner bar4Spinner;
    private javax.swing.JSpinner bar5Spinner;
    private javax.swing.JSpinner bar6Spinner;
    private javax.swing.JSpinner factorSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JButton readConfigBtn;
    private javax.swing.JButton setConfigBtn;
    // End of variables declaration//GEN-END:variables
}
