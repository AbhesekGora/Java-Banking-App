package finalAssignment;

import javax.swing.*;
import java.util.LinkedList;
import java.awt.Insets;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;



public class GUI extends javax.swing.JFrame {
    private LinkedList<Account> filteredAccounts = new LinkedList<>();
    private LinkedList<Account> accounts;

    public GUI() {
        initComponents();
        outputArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        
    }
   
public GUI(LinkedList<Account> accounts) {
    initComponents(); // This loads the design
    this.accounts = accounts;
    jList1.setModel(new DefaultListModel<>());

    outputArea.setMargin(new Insets(23, 100, 23, 100));

    outputArea.setText("Please type in the search field to find accounts.");
    }
    private void refreshOutputArea() {
         StringBuilder sb = new StringBuilder();

    for (Account acc : accounts) {
        String fullName = (acc.getFirstName() + " " + acc.getLastName()).replaceAll("[^\\x20-\\x7E]", "");
        sb.append(String.format("Account Number: %-10d Account Name: %-25s Amount: $%-10.2f\n",
                acc.getAccountNumber(), fullName, acc.getBalance()));
    }
    outputArea.setText(sb.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        depositField = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        withdrawField = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnShowAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        accountnumberField = new javax.swing.JTextField();
        accountnumerField1 = new javax.swing.JTextField();
        fromField = new javax.swing.JTextField();
        toField = new javax.swing.JTextField();
        transferField = new javax.swing.JTextField();
        transferButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank App");
        setBackground(new java.awt.Color(153, 153, 153));

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        depositField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        depositField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositFieldActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(0, 82, 162));
        btnDeposit.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        withdrawField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        withdrawField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawFieldActionPerformed(evt);
            }
        });

        btnWithdraw.setBackground(new java.awt.Color(0, 82, 162));
        btnWithdraw.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        btnShowAll.setBackground(new java.awt.Color(0, 153, 153));
        btnShowAll.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnShowAll.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAll.setText("Show All Accounts");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setOpaque(false);
        jScrollPane1.setViewportView(outputArea);

        accountnumberField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        accountnumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnumberFieldActionPerformed(evt);
            }
        });

        accountnumerField1.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        accountnumerField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnumerField1ActionPerformed(evt);
            }
        });

        fromField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        fromField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromFieldActionPerformed(evt);
            }
        });

        toField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        toField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFieldActionPerformed(evt);
            }
        });

        transferField.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N

        transferButton.setBackground(new java.awt.Color(0, 82, 162));
        transferButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        transferButton.setForeground(new java.awt.Color(255, 255, 255));
        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(0, 102, 51));
        createButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 0, 0));
        deleteButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 2, 10)); // NOI18N
        jLabel1.setText("Search  ");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel2.setText("Account Number   :");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel3.setText("Amount  :");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel4.setText("Source");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel5.setText("Destination");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel6.setText("Action    :");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel7.setText("Banking System GUI");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalAssignment/bankicon.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(depositField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accountnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeposit)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnWithdraw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transferButton)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accountnumerField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(withdrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(transferField)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(92, 92, 92)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountnumerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(depositField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeposit)
                    .addComponent(btnWithdraw)
                    .addComponent(transferButton)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
         if (!evt.getValueIsAdjusting()) {
            int selectedIndex = jList1.getSelectedIndex();
            boolean isSearchActive = !searchField.getText().trim().isEmpty();

            if (isSearchActive) { // Current mode is "Search Active"
                if (selectedIndex != -1) { // Item selected from filtered list
                    if (!filteredAccounts.isEmpty() && selectedIndex < filteredAccounts.size()) {// Display ONLY the selected filtered item in outputArea
                        Account selectedAccount = filteredAccounts.get(selectedIndex);
                        StringBuilder sb = new StringBuilder();
                        String fullName = (selectedAccount.getFirstName() + " " + selectedAccount.getLastName()).replaceAll("[^\\x20-\\x7E]", "");
                        sb.append(String.format("Account Number: %-10d Account Name: %-25s Amount: $%10.2f\n",
                                selectedAccount.getAccountNumber(), fullName, selectedAccount.getBalance()));
                        outputArea.setText(sb.toString());
                    } else {
                         outputArea.setText("Error: Selection out of sync with filtered data.");
                    }
                } else { // No item selected WHILE search is active
                    if (jList1.getModel().getSize() == 0 && !searchField.getText().trim().isEmpty()) { // Search returned no results
                        outputArea.setText("No matching accounts found for your search.");
                    } else { // Search has results, but nothing is selected (or search field just cleared and model is updating)
                       
                        if (!searchField.getText().trim().isEmpty()){// If search field still has text and list has items, prompt to select.
                            outputArea.setText("Select an account from the search results.");
                        } else {
                            refreshOutputArea();
                        }
                    }
                }
            } else { 
                refreshOutputArea();
            }
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void depositFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositFieldActionPerformed

    }//GEN-LAST:event_depositFieldActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
       String accNumStr = accountnumberField.getText().trim();
    String amountStr = depositField.getText().trim();

    if (!accNumStr.isEmpty() && !amountStr.isEmpty()) {
        try {
            int accNum = Integer.parseInt(accNumStr);
            double amount = Double.parseDouble(amountStr);

            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Amount must be greater than 0.");
                return;
            }
            for (Account acc : accounts) {
                if (acc.getAccountNumber() == accNum) {
                    acc.setBalance(acc.getBalance() + amount);
                    JOptionPane.showMessageDialog(this, "Deposit successful.");

                    String fullName = (acc.getFirstName() + " " + acc.getLastName()).replaceAll("[^\\x20-\\x7E]", ""); // Show only the updated account
                    String accountInfo = String.format("Account Number: %-10d Account Name: %-25s Amount: $%10.2f\n",
                            acc.getAccountNumber(), fullName, acc.getBalance());
                    outputArea.setText(accountInfo);

                    // Clear fields
                    accountnumberField.setText("");
                    depositField.setText("");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Account not found.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please fill in both fields.");
    } 
    }//GEN-LAST:event_btnDepositActionPerformed

    private void withdrawFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawFieldActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
    String accNumStr = accountnumerField1.getText().trim();
    String amountStr = withdrawField.getText().trim();

    if (!accNumStr.isEmpty() && !amountStr.isEmpty()) {
        try {
            int accNum = Integer.parseInt(accNumStr);
            double amount = Double.parseDouble(amountStr);

            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Amount must be greater than 0.");
                return;
            }
            for (Account acc : accounts) {
                if (acc.getAccountNumber() == accNum) {
                    if (acc.getBalance() >= amount) {
                        acc.setBalance(acc.getBalance() - amount);
                        JOptionPane.showMessageDialog(this, "Withdrawal successful.");

                        // Show only the updated account
                        String fullName = (acc.getFirstName() + " " + acc.getLastName()).replaceAll("[^\\x20-\\x7E]", "");
                        String accountInfo = String.format("Account Number: %-10d Account Name: %-25s Amount: $%10.2f\n",
                                acc.getAccountNumber(), fullName, acc.getBalance());
                        outputArea.setText(accountInfo);
                        
                        accountnumerField1.setText("");// Clear fields
                        withdrawField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insufficient funds.");
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Account not found.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please fill in both fields.");
    }
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
          String query = searchField.getText().toLowerCase().trim();
        DefaultListModel<String> filteredModel = new DefaultListModel<>();
        filteredAccounts.clear(); // Clear previous filter results

        if (accounts != null) {
            for (Account acc : accounts) {
                String fullName = (acc.getFirstName() + " " + acc.getLastName()).toLowerCase();
                if (fullName.contains(query)) {
                    filteredModel.addElement(acc.getFirstName() + " " + acc.getLastName());
                    filteredAccounts.add(acc);
                }
            }
        }
        jList1.setModel(filteredModel); // This will often trigger jList1ValueChanged

        // Explicitly handle the case where the list becomes empty due to filtering
        if (query.isEmpty()) {
        } else if (filteredModel.isEmpty()) { // To be safe, you can force an update if the list model change doesn't trigger it adequately
            outputArea.setText("No matching accounts found for your search.");
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
         searchField.setText(""); // Clear search field
    filteredAccounts.clear(); // Clear any filtered results
    jList1.setModel(new DefaultListModel<>()); // Keep list empty
    jList1.clearSelection(); // Clear selection
    refreshOutputArea(); // Show all accounts in the output area
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void accountnumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountnumberFieldActionPerformed

    private void accountnumerField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnumerField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountnumerField1ActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
         String fromStr = fromField.getText().trim();
    String toStr = toField.getText().trim();
    String amountStr = transferField.getText().trim();

    if (fromStr.isEmpty() || toStr.isEmpty() || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    try {
        int fromAccNum = Integer.parseInt(fromStr);
        int toAccNum = Integer.parseInt(toStr);
        double amount = Double.parseDouble(amountStr);

        if (amount <= 0) {
            JOptionPane.showMessageDialog(this, "Amount must be greater than 0.");
            return;
        }

        Account fromAcc = null;
        Account toAcc = null;

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == fromAccNum) {
                fromAcc = acc;
            }
            if (acc.getAccountNumber() == toAccNum) {
                toAcc = acc;
            }
        }

        if (fromAcc == null || toAcc == null) {
            JOptionPane.showMessageDialog(this, "One or both account numbers not found.");
            return;
        }

        if (fromAcc.getBalance() < amount) {
            JOptionPane.showMessageDialog(this, "Insufficient balance in source account.");
            return;
        }

        // Perform transfer
        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance() + amount);

        JOptionPane.showMessageDialog(this, "Transfer successful.");

        // Show updated info for both accounts
        String fromName = (fromAcc.getFirstName() + " " + fromAcc.getLastName()).replaceAll("[^\\x20-\\x7E]", "");
        String toName = (toAcc.getFirstName() + " " + toAcc.getLastName()).replaceAll("[^\\x20-\\x7E]", "");
        String output = String.format(
            "FROM ACCOUNT:\nAccount Number: %-10d Account Name: %-25s Amount: $%10.2f\n\n" +
            "TO ACCOUNT:\nAccount Number: %-10d Account Name: %-25s Amount: $%10.2f\n",
            fromAcc.getAccountNumber(), fromName, fromAcc.getBalance(),
            toAcc.getAccountNumber(), toName, toAcc.getBalance()
        );
        outputArea.setText(output);
        fromField.setText("");  // Clear fields
        toField.setText("");
        transferField.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
    }
    }//GEN-LAST:event_transferButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
      String firstName = JOptionPane.showInputDialog(this, "Enter First Name:");
    if (firstName == null || firstName.trim().isEmpty()) return;

    String lastName = JOptionPane.showInputDialog(this, "Enter Last Name:");
    if (lastName == null || lastName.trim().isEmpty()) return;

    String balanceStr = JOptionPane.showInputDialog(this, "Enter Initial Balance:");
    if (balanceStr == null || balanceStr.trim().isEmpty()) return;

    try {
        double balance = Double.parseDouble(balanceStr);
        if (balance < 0) {
            JOptionPane.showMessageDialog(this, "Balance cannot be negative.");
            return;
        }

        int newAccountNumber = accounts.isEmpty() ? 1 : accounts.getLast().getAccountNumber() + 1;
// Create account with correct argument order
        Account newAccount = new Account(firstName.trim(), lastName.trim(), newAccountNumber, balance);
        accounts.add(newAccount);
        JOptionPane.showMessageDialog(this, "Account created successfully!");
        refreshOutputArea();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid balance entered.");
    }
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      String accountNumStr = JOptionPane.showInputDialog(this, "Enter Account Number to delete:");
    if (accountNumStr == null || accountNumStr.trim().isEmpty()) return;
    try {
        int accNum = Integer.parseInt(accountNumStr.trim());
        // Ask for full name for additional validation
        String fullName = JOptionPane.showInputDialog(this, "Enter Full Name of Account Holder (First Last):");
        if (fullName == null || fullName.trim().isEmpty()) return;
        String[] nameParts = fullName.trim().split(" ");
        if (nameParts.length < 2) {
            JOptionPane.showMessageDialog(this, "Please enter both first and last names.");
            return;
        }
        String firstName = nameParts[0].trim();
        String lastName = nameParts[1].trim();

        // Find and validate account
        Account found = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNum &&
                acc.getFirstName().equalsIgnoreCase(firstName) &&
                acc.getLastName().equalsIgnoreCase(lastName)) {
                found = acc;
                break;
            }
        }

        if (found != null) {
            accounts.remove(found);
            JOptionPane.showMessageDialog(this, "Account deleted successfully!");
            refreshOutputArea();
        } else {
            JOptionPane.showMessageDialog(this, "No matching account found with that number and name.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid account number entered.");
    }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void toFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toFieldActionPerformed

    private void fromFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromFieldActionPerformed
public static void main(String args[]) {
        LinkedList<Account> testAccounts = new LinkedList<>();
       testAccounts.add(new Account("Alice", "Smith", 1, 500.0));
testAccounts.add(new Account("Bob", "Johnson", 2, 750.0));
testAccounts.add(new Account("Charlie", "Brown", 3, 300.0));


        java.awt.EventQueue.invokeLater(() -> new GUI(testAccounts).setVisible(true));
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountnumberField;
    private javax.swing.JTextField accountnumerField1;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JTextField fromField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField toField;
    private javax.swing.JButton transferButton;
    private javax.swing.JTextField transferField;
    private javax.swing.JTextField withdrawField;
    // End of variables declaration//GEN-END:variables
}
