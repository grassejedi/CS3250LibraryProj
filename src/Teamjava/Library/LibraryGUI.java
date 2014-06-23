/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author tyler
 */
public class LibraryGUI extends javax.swing.JFrame
{
    private Circulation circulationDesk;
    private boolean openFileButtonEnabled = false;
    private boolean patronCheckOutandInBtnEnabled = false;
    private DefaultListModel availBooksListModel;
    private DefaultListModel checkedOutBooksListModel;
    
    /**
     * Creates new form LibraryGUI
     */
    public LibraryGUI()
    {
        availBooksListModel = new DefaultListModel();
        checkedOutBooksListModel = new DefaultListModel();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        libraryFileChooser = new javax.swing.JFileChooser();
        libraryInfoPanel = new javax.swing.JPanel();
        OpenLibraryFileBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        allBooksTxtArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        overdueBooksTxtArea = new javax.swing.JTextArea();
        currentDateLabel = new javax.swing.JLabel();
        advanceDateBtn = new javax.swing.JButton();
        saveAndExitFileBtn = new javax.swing.JButton();
        patronInfoPanel = new javax.swing.JPanel();
        patronNameComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patronAvailBooksList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        checkedOutBooksList = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        checkOutBtn = new javax.swing.JButton();
        checkInBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        statusTxtField = new javax.swing.JTextField();

        libraryFileChooser.setDialogTitle("Open Library File");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Java Library");

        libraryInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Library Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        OpenLibraryFileBtn.setText("Open");
        OpenLibraryFileBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OpenLibraryFileBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Select File:");

        jLabel8.setText("Current Date:");

        jLabel1.setText("All Books:");

        jLabel4.setText("Overdue Books:");

        allBooksTxtArea.setEditable(false);
        allBooksTxtArea.setColumns(20);
        allBooksTxtArea.setRows(5);
        jScrollPane5.setViewportView(allBooksTxtArea);

        overdueBooksTxtArea.setEditable(false);
        overdueBooksTxtArea.setColumns(20);
        overdueBooksTxtArea.setRows(5);
        jScrollPane6.setViewportView(overdueBooksTxtArea);

        currentDateLabel.setText("1/1/14");

        advanceDateBtn.setText("Advance Date");
        advanceDateBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                advanceDateBtnActionPerformed(evt);
            }
        });

        saveAndExitFileBtn.setText("Save and Exit");
        saveAndExitFileBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveAndExitFileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout libraryInfoPanelLayout = new javax.swing.GroupLayout(libraryInfoPanel);
        libraryInfoPanel.setLayout(libraryInfoPanelLayout);
        libraryInfoPanelLayout.setHorizontalGroup(
            libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                        .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(226, 226, 226)
                                .addComponent(jLabel4))
                            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OpenLibraryFileBtn)
                                    .addComponent(saveAndExitFileBtn))
                                .addGap(161, 161, 161)
                                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(advanceDateBtn)
                                    .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        libraryInfoPanelLayout.setVerticalGroup(
            libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(OpenLibraryFileBtn)
                    .addComponent(jLabel8)
                    .addComponent(currentDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advanceDateBtn)
                    .addComponent(saveAndExitFileBtn))
                .addGap(23, 23, 23)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        patronInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patron Info/Checkout", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        patronNameComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                patronNameComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Patron:");

        patronAvailBooksList.setModel(availBooksListModel);
        patronAvailBooksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(patronAvailBooksList);

        jLabel3.setText("Available Books:");

        checkedOutBooksList.setModel(checkedOutBooksListModel);
        checkedOutBooksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(checkedOutBooksList);

        jLabel9.setText("Checked Out Books:");

        checkOutBtn.setText("Check Out");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkOutBtnActionPerformed(evt);
            }
        });

        checkInBtn.setText("Check In");
        checkInBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patronInfoPanelLayout = new javax.swing.GroupLayout(patronInfoPanel);
        patronInfoPanel.setLayout(patronInfoPanelLayout);
        patronInfoPanelLayout.setHorizontalGroup(
            patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkOutBtn)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patronInfoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkInBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patronInfoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patronNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patronInfoPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(93, 93, 93))
        );
        patronInfoPanelLayout.setVerticalGroup(
            patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patronNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInBtn)
                    .addComponent(checkOutBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel5.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(libraryInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusTxtField))
                    .addComponent(patronInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(libraryInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(patronInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patronNameComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_patronNameComboBoxActionPerformed
    {//GEN-HEADEREND:event_patronNameComboBoxActionPerformed
        if(openFileButtonEnabled)
        {
            updateAvailPatronBooks();
            updateCheckedOutPatronBooks();
            patronCheckOutandInBtnEnabled = true;
        }
    }//GEN-LAST:event_patronNameComboBoxActionPerformed

    private void OpenLibraryFileBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OpenLibraryFileBtnActionPerformed
    {//GEN-HEADEREND:event_OpenLibraryFileBtnActionPerformed

        int returnVal = libraryFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = libraryFileChooser.getSelectedFile();
            
            circulationDesk = new Circulation();
            setStatus();
            currentDateLabel.setText(circulationDesk.printCurrentDate());
            setStatus();
            circulationDesk.setBookFileName(file.getAbsolutePath());
            setStatus();
            updateAllBooksTxtArea(circulationDesk.listAllBooks());
            setStatus();
            updateOverdueBooksTxtArea(circulationDesk.listOverdueBooks());
            setStatus();
            updatePatronComboBox(circulationDesk.listAllPatrons());
            openFileButtonEnabled = true;
            
            //libaryCatalog = new Catalog(file.getAbsolutePath()); 
            //libaryCatalog.populateCatalog();
            //updateAllBooksTxtArea();
            //allBooksTxtArea.setText(libaryCatalog.allBooksStatus());
            //overdueBooksTxtArea.setText(libaryCatalog.displayOverDueBooks());
        }
    }//GEN-LAST:event_OpenLibraryFileBtnActionPerformed

    private void updateAvailPatronBooks()
    {
        availBooksListModel.removeAllElements();
        String selectedPatron = patronNameComboBox.getSelectedItem().toString();
        List<Book> booksAvailableList = circulationDesk.
                booksAvailableToPatron(selectedPatron);

        for(Book books : booksAvailableList)
        {
            availBooksListModel.addElement(books.getBookTitle());
        }
    }
    
    private void updateCheckedOutPatronBooks()
    {
        checkedOutBooksListModel.removeAllElements();
        String selectedPatron = patronNameComboBox.getSelectedItem().toString();
        List<Book> booksCheckedOutList = circulationDesk.
                listCheckedOutByPatron(selectedPatron);

        for(Book books : booksCheckedOutList)
        {
            checkedOutBooksListModel.addElement(books.getBookTitle());
        }
    }
    
    private void setStatus()
    {
        statusTxtField.setText(circulationDesk.printStatus());
    }
    
    private void updateAllBooksTxtArea(List<Book> books)
    {
        StringBuilder text = new StringBuilder();
        for (Book book : books)
        {
            text.append(book.getBookTitle());
            text.append("\n");
        }
        allBooksTxtArea.setText(text.toString());
    }
    
    private void updateOverdueBooksTxtArea(List<Book> books)
    {
        StringBuilder text = new StringBuilder();
        for (Book book : books)
        {
            text.append(book.getBookTitle());
            text.append("\n");
        }
        overdueBooksTxtArea.setText(text.toString());
    }
    
    private void updatePatronComboBox(List<Patron> patrons)
    {
        for(Patron patron : patrons)
        {
            patronNameComboBox.addItem(patron.getName());
        }
    }
    
    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkOutBtnActionPerformed
    {//GEN-HEADEREND:event_checkOutBtnActionPerformed
        if(patronCheckOutandInBtnEnabled)
        {
            if(availBooksListModel.isEmpty())
            {
                displayError("Maximum allowed number of checked out books has"
                        + " been reached!  Please check in some books.");
            }
            else
            {
    //            System.out.println(patronAvailBooksList.getSelectedValue().toString());
    //            System.out.println(patronNameComboBox.getSelectedItem().toString());
                circulationDesk.checkOut(patronAvailBooksList.getSelectedValue().toString(), 
                        patronNameComboBox.getSelectedItem().toString());
                updateCheckedOutPatronBooks();
                updateAvailPatronBooks();
                if(availBooksListModel.isEmpty())
                {
                    displayError("Maximum allowed number of checked out books has"
                        + " been reached!  Please check in some books.");
                    statusTxtField.setText("Maximum allowed number of checked out books has"
                        + " been reached!  Please check in some books.");
                }
                else
                {
                    setStatus();
                }
            }
        }
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void advanceDateBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_advanceDateBtnActionPerformed
    {//GEN-HEADEREND:event_advanceDateBtnActionPerformed
        if(openFileButtonEnabled)
        {
            circulationDesk.advanceOneDay();
            currentDateLabel.setText(circulationDesk.printCurrentDate());
            updateAllBooksTxtArea(circulationDesk.listAllBooks());
            updateOverdueBooksTxtArea(circulationDesk.listOverdueBooks());
            setStatus();
        }
        
    }//GEN-LAST:event_advanceDateBtnActionPerformed

    private void saveAndExitFileBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveAndExitFileBtnActionPerformed
    {//GEN-HEADEREND:event_saveAndExitFileBtnActionPerformed
        if(openFileButtonEnabled)
        {
            circulationDesk.Exit();
            this.dispose();
        }
    }//GEN-LAST:event_saveAndExitFileBtnActionPerformed

    private void checkInBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkInBtnActionPerformed
    {//GEN-HEADEREND:event_checkInBtnActionPerformed
        //String selectedBookToCheckin = checkedOutBooksList.getSelectedIndex();
        if(patronCheckOutandInBtnEnabled)
        {
            if(checkedOutBooksList.getSelectedValue() != null)
            {
                circulationDesk.checkIn(checkedOutBooksList.getSelectedValue().toString(), 
                        patronNameComboBox.getSelectedItem().toString());
                updateCheckedOutPatronBooks();
                updateAvailPatronBooks();
                setStatus();
            }
        }
    }//GEN-LAST:event_checkInBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LibraryGUI().setVisible(true);
            }
        });
    }
    
    public static synchronized void displayError(String status)
    {
        JOptionPane.showMessageDialog(null, status,
        "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenLibraryFileBtn;
    private javax.swing.JButton advanceDateBtn;
    private javax.swing.JTextArea allBooksTxtArea;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JList checkedOutBooksList;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JFileChooser libraryFileChooser;
    private javax.swing.JPanel libraryInfoPanel;
    private javax.swing.JTextArea overdueBooksTxtArea;
    private javax.swing.JList patronAvailBooksList;
    private javax.swing.JPanel patronInfoPanel;
    private javax.swing.JComboBox patronNameComboBox;
    private javax.swing.JButton saveAndExitFileBtn;
    private static javax.swing.JTextField statusTxtField;
    // End of variables declaration//GEN-END:variables

    
}
