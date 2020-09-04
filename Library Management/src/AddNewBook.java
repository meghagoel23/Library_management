import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AddNewBook extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    String query;

   
    public AddNewBook() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
     private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel1.setText("Book Id");

        txt2.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setText("Book Name");

        txt3.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Author");

        txt4.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel4.setText("Stream");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel5.setText("Class");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        c3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Stream", "Commerce", "Science", "Arts" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); 
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Add a New Book");

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Issue Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Return Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Book Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2)
                            .addComponent(txt3)
                            .addComponent(txt4)
                            .addComponent(c3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(528, 528, 528))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4)
                        .addGap(45, 45, 45)
                        .addComponent(jButton5)))
                .addGap(45, 45, 45)
                .addComponent(jButton6)
                .addGap(41, 41, 41)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(25, 25, 25))
        );

        pack();
    }

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(c3.getSelectedItem()=="Science")
        {
            c4.removeAllItems();
            c4.addItem("Select Class");c4.addItem("FYBScCS");c4.addItem("SYBScCS");c4.addItem("TYBScCS");
        }
        if(c3.getSelectedItem()=="Arts")
        {
            c4.removeAllItems();
            c4.addItem("Select Class");c4.addItem("FYBA");c4.addItem("SYBA");c4.addItem("TYBA");
        }
        if(c3.getSelectedItem()=="Commerce")
        {
            c4.removeAllItems();
            c4.addItem("Select Class");c4.addItem("FYBCom");c4.addItem("SYBCom");c4.addItem("TYBCom");
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(txt2.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book id"); 
        else if(txt3.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book name"); 
        else if(txt3.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter author name"); 
        else if(c3.getSelectedItem().equals("Select Stream"))
            JOptionPane.showMessageDialog(this,"Please select stream");
        else if(c4.getSelectedItem().equals("Select Class"))
            JOptionPane.showMessageDialog(this,"Please select class");    
        else
        {
        try
        {
        connect();
        query="insert into books values('"+txt2.getText()+"','"+txt3.getText()+"','"+txt4.getText()+"','"+c3.getSelectedItem()+"','"+c4.getSelectedItem()+"','YES');";
        stmt.executeUpdate(query);
        
        disconnect();
        JOptionPane.showMessageDialog(this,"New book added to Library");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        c3.setSelectedIndex(0);
        c4.removeAllItems();
        c4.addItem("Select Class");
        
        }
        catch(SQLException e)
        {
            if(e.getErrorCode()==1062)
                JOptionPane.showMessageDialog(this,"BookId is a primary key\nduplicate entry is not allowed\nit should be unique");
            else
                JOptionPane.showMessageDialog(this,"connection error");
        }
                }
       
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    	BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBook().setVisible(true);
            }
        });
    }

    public void connect()
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","root","Megha@1234");  
            stmt=con.createStatement(); 
        }
        catch(Exception e)
        { 
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"connection error");
        }
    }
    public void disconnect()
    {
        try
        {
           con.close(); 
        }
        catch(Exception e)
        {}

    }
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    
}
