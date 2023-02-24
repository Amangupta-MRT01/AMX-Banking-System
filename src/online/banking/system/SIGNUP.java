/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.banking.system;

import java.util.Random;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SIGNUP extends javax.swing.JFrame {


Connection conn =null;
ResultSet rs ;
PreparedStatement pst;
    /**
     * Creates new form NewJFrame
     */
    public SIGNUP() {
        super("Create Account");
        initComponents();
        
        dbconnect.connectDb();
        randomAcc();
        randomCUST();
        randomPin();
    }
    public void randomAcc(){
        Random ra = new Random();
        Accno.setText(""+ra.nextInt(10000+1));
    }
    
    public void randomCUST(){
        Random ra = new Random();
        CustID.setText(""+ra.nextInt(1000+1));
    }
   
    public void randomPin(){
        Random ra = new Random();
        pin.setText(""+ra.nextInt(1000+1));
    }
    
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Lname = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JRadioButton();
        jbtn2 = new javax.swing.JRadioButton();
        jbtn3 = new javax.swing.JRadioButton();
        jCRpass = new javax.swing.JPasswordField();
        jCONpass = new javax.swing.JPasswordField();
        jphone = new javax.swing.JTextField();
        jpincode = new javax.swing.JTextField();
        jcity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CustID = new javax.swing.JTextField();
        DOB = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jaddress = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        balamt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Accno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 170, 30);

        jLabel2.setText("FIRST NAME :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 80, 16);

        jLabel3.setText(" LAST NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 70, 16);

        jLabel4.setText("ENTER EMIAL ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 100, 16);

        jLabel5.setText("D.O.B:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 240, 50, 16);

        jLabel6.setText("GENDER:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 270, 60, 16);

        jLabel7.setText("  CREATE PASSWORD:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 300, 140, 16);

        jLabel8.setText("CONFIRM PASSWORD:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 330, 140, 16);

        jLabel9.setText("PRIMARY MOBLIE NO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 370, 130, 20);

        jLabel10.setText("ADDRESS:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 410, 63, 16);

        jLabel13.setText("PIN CODE:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 440, 60, 10);

        jLabel14.setText("CITY :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(90, 480, 40, 16);

        Create.setBackground(new java.awt.Color(0, 0, 255));
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("SUBMIT");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        getContentPane().add(Create);
        Create.setBounds(263, 510, 80, 22);
        getContentPane().add(Lname);
        Lname.setBounds(140, 160, 179, 30);
        getContentPane().add(jemail);
        jemail.setBounds(140, 200, 179, 30);

        buttonGroup1.add(jbtn1);
        jbtn1.setText("MALE");
        getContentPane().add(jbtn1);
        jbtn1.setBounds(140, 270, 60, 20);

        buttonGroup1.add(jbtn2);
        jbtn2.setText("FEMALE");
        getContentPane().add(jbtn2);
        jbtn2.setBounds(210, 270, 80, 20);

        buttonGroup1.add(jbtn3);
        jbtn3.setText("OTHER");
        getContentPane().add(jbtn3);
        jbtn3.setBounds(300, 270, 70, 20);
        getContentPane().add(jCRpass);
        jCRpass.setBounds(160, 300, 201, 30);
        getContentPane().add(jCONpass);
        jCONpass.setBounds(160, 330, 201, 30);

        jphone.setText(" ");
        getContentPane().add(jphone);
        jphone.setBounds(140, 370, 166, 30);
        getContentPane().add(jpincode);
        jpincode.setBounds(140, 440, 106, 30);
        getContentPane().add(jcity);
        jcity.setBounds(140, 480, 106, 30);

        jLabel16.setText("Balance:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(80, 80, 50, 20);

        CustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIDActionPerformed(evt);
            }
        });
        getContentPane().add(CustID);
        CustID.setBounds(290, 40, 100, 30);

        DOB.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(DOB);
        DOB.setBounds(140, 240, 180, 22);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 510, 73, 22);

        jLabel15.setText("PIN :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(90, 520, 40, 10);

        jLabel12.setText("Customer ID:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 40, 90, 16);

        jaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddressActionPerformed(evt);
            }
        });
        getContentPane().add(jaddress);
        jaddress.setBounds(140, 400, 210, 30);

        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        getContentPane().add(pin);
        pin.setBounds(140, 520, 100, 30);
        getContentPane().add(Fname);
        Fname.setBounds(140, 120, 180, 30);
        getContentPane().add(balamt);
        balamt.setBounds(140, 80, 110, 30);

        jLabel11.setText("Account no:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 40, 70, 16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/banking/images/90df22ab443662d632838fd82f6ea38b2cba025a.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 70, 440, 490);

        Accno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccnoActionPerformed(evt);
            }
        });
        getContentPane().add(Accno);
        Accno.setBounds(80, 40, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
    
        try{
            conn=dbconnect.connectDb();
            String sql="insert into Account(Acc,CustomerID,Balance,FName,LName,Gender,PINCODE,city,pin,EMail,DOB,Address,Mob,pass) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1,Accno.getText());
            pst.setString(2,CustID.getText());
            pst.setString(3,balamt.getText());
            pst.setString(4,Fname.getText());
            pst.setString(5,Lname.getText());
            jbtn1.setActionCommand("Male");
            jbtn2.setActionCommand("Female");
            jbtn3.setActionCommand("other");
            pst.setString(6,buttonGroup1.getSelection().getActionCommand());
            pst.setString(7,jpincode.getText());
            pst.setString(8,jcity.getText()) ;
            pst.setString(9,pin.getText());
            pst.setString(10,jemail.getText());
            pst.setDate(11,convertUtilDateToSqlDate(DOB.getDate()));
            pst.setString(12,jaddress.getText());
            pst.setString(13,jphone.getText());
            char a[]=jCONpass.getPassword();
            String g=new String (a);
            System.out.println("Pass word :"+g);
            pst.setString(14,g);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Success! Account has been created");
            
            
   
      
            String sql1 = "insert into Balances(FName,LName,Acc,CustomerID,Balance,pin)values (?,?,?,?,?,?)";
            pst=(PreparedStatement)conn.prepareStatement(sql1);
            pst.setString(1,Fname.getText());
            pst.setString(2,Lname.getText());
            pst.setString(3,Accno.getText());
            pst.setString(4,CustID.getText());
            pst.setString(5,balamt.getText());
            pst.setString(6,pin.getText());
            pst.execute();
            
            
            pst.close();
            conn.close();
        }catch(Exception e){
             System.out.println("Exception in signup class : " +e);
            JOptionPane.showMessageDialog(null,e);
        }
        
        String first=Fname.getText().toString();
        String Last=Lname.getText().toString();
        String Email=jemail.getText().toString();
        String Male=jbtn1.getText().toString();
        String Female=jbtn2.getText().toString();
        String Other=jbtn3.getText().toString();
        String CreatePASS=jCRpass.getPassword().toString();
        String ConfirmPASS=jCONpass.getPassword().toString();
        String phone=jphone.getText().toString();
        String Adress=jaddress.getText().toString();
        String PinCode=jpincode.getText().toString();
        String City=jcity.getText().toString();
        if(first.equals(""))
        {
            JOptionPane.showMessageDialog(null,"First name is Mandatory");
        }
        if(Last.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Last name is Mandatory");
        }
        if(Email.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Email is Mandatory");
        }
        if(CreatePASS.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Create Password is Mandatory");
        }
        if(ConfirmPASS.equals(""))
        {
            JOptionPane.showMessageDialog(null,"COnfirmation of Password is Mandatory");
        }
        if(phone.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Phone Number is Mandatory");
        }
        if(Adress.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Address is Mandatory");
        }
        if(PinCode.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PinCode Is Mandatory");
        }
        if(City.equals(""))
        {
            JOptionPane.showMessageDialog(null,"City is Mandatory");
        }

    }//GEN-LAST:event_CreateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaddressActionPerformed

    private void CustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIDActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void AccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccnoActionPerformed

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
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGNUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accno;
    private javax.swing.JButton Create;
    private javax.swing.JTextField CustID;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField balamt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPasswordField jCONpass;
    private javax.swing.JPasswordField jCRpass;
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
    private javax.swing.JTextField jaddress;
    private javax.swing.JRadioButton jbtn1;
    private javax.swing.JRadioButton jbtn2;
    private javax.swing.JRadioButton jbtn3;
    private javax.swing.JTextField jcity;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField jpincode;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
