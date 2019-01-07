package Admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author damhiesax
 */
public class AddLoc extends javax.swing.JFrame {

    DbConnect dbcon = new DbConnect();
    ResultSetMetaData md;
    String firstname, lastname, PassWord, address, mobileNo, administrator, username, Userid;
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    Vector<String> data = new Vector<String>();
    Variables var;
    String pollid = "";
    public static String[] rowData;

    /**
     * Creates new form UserReg
     */
    public AddLoc() {
        initComponents();
        setTitle("Staff Registration Page");
        var = new Variables();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registraion");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setText("Location");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 60, 14);

        jLabel4.setText("location ref:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 70, 20);

        jLabel6.setText("State:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 140, 60, 20);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(227, 227, 227));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(120, 210, 230, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select State", "Lagos", "Ogun", "Ondo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 130, 230, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 240, 100, 27);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 240, 110, 27);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 240, 100, 27);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Add New Location");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 4, 150, 20);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 350, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select L.gvt", "agege", "mushin", "ifo", "ose", "akoko south", "akoko north", "abeokuta south", "abeokuta north", "ifako ijaye", "isolo", "app", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(120, 170, 230, 30);

        jLabel11.setText("Local Govt:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 180, 70, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 50, 230, 70);

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 40, 350, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addnew();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       clear();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField5.setText("");
        if ((jComboBox1.getSelectedIndex() != 0) && (jComboBox2.getSelectedIndex() != 0)) {
            while (checkForPresence() == true) {
                //    JOptionPane.showMessageDialog(rootPane, "user already exit");
            }
            checkForPresence();
        }
        jTextField5.setText(pollid);
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextField5.setText("");
        if ((jComboBox1.getSelectedIndex() != 0) && (jComboBox2.getSelectedIndex() != 0)) {
            while (checkForPresence() == true) {
                //    JOptionPane.showMessageDialog(rootPane, "user already exit");
            }
            checkForPresence();
        }
        jTextField5.setText(pollid);
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLoc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    void clear() {
      jTextArea1.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
    }

    void addnew() {
        String emt = "";
        
        if (jTextArea1.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Address required");
            return;
        }
        if (jTextField5.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Poll ID not set");
            return;
        } else if (jTextField5.getText().length() < 12) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Poll ID !!");
            return;
        }
        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Location state must be select");
            return;
        }
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Location Local government must select");
            return;
        }

        try {
            dbcon.ps = dbcon.con.prepareStatement("insert into poll_centers (pollid,state,localgovt,location,regdate,adminid,status) VALUES(?,?,?,?,?,?,?)");
             dbcon.ps.setString(1, jTextField5.getText());
            dbcon.ps.setString(2, jComboBox1.getSelectedItem().toString());
            dbcon.ps.setString(3, jComboBox2.getSelectedItem().toString());
            dbcon.ps.setString(4, jTextArea1.getText());
             Date d = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE HH:mm:ss dd-MMM-yyyy");
            dbcon.ps.setString(5, dateFormat.format(d.getTime()));
            dbcon.ps.setString(6, var.getUsername());
            dbcon.ps.setString(7, "0");
            dbcon.ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Poll center Added successfully..");
             log("Poll Added");
              this.dispose();
        } catch (Exception g) {
            System.out.println("Poll center not Added successful..." + g);
        }

        clear();
    }

    boolean checkForPresence() {
        int id = (int) (Math.random() * 9999);
        String newId = id + "";
        if (newId.length() == 1) {
            newId = "000" + newId;
        } else if (newId.length() == 2) {
            newId = "00" + newId;
        } else if (newId.length() == 3) {
            newId = "0" + newId;
        }
        pollid = jComboBox1.getSelectedItem().toString().substring(0, 3) + "/" + jComboBox2.getSelectedItem().toString().substring(0, 3) + "/" + newId;
       pollid=pollid.toUpperCase();
        boolean present = false;
        try {
            dbcon.rs = dbcon.st.executeQuery("select * from poll_centers where pollid='" + pollid + "'");
            if (dbcon.rs.next()) {
                present = true;
            }
        } catch (Exception g) {
            System.out.println("" + g);
        }
        return present;
    }
    void log(String event){
           try {
               Date d=new Date();
                dbcon.ps=dbcon.con.prepareStatement("INSERT INTO `voters_reg`.`log` (`transactiontype` ,`agentid` ,`systemid` ,`date` ,`status`)VALUES (?,?,?,?,?) ");
             dbcon.ps.setString(1, event);
            dbcon.ps.setString(2, var.getUsername());
            dbcon.ps.setString(3, "");//system id goes here
             SimpleDateFormat dateTime = new SimpleDateFormat("HH:mm:ss dd-MMM-yyyy");
            dbcon.ps.setString(4, dateTime.format(d.getTime()));
            dbcon.ps.setString(5, "0");
            dbcon.ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace();
           }  
      }
}
