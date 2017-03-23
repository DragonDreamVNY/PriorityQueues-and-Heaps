
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Assignment 04 - Priority Queue
 * A&E Patient priority queue and heap application
 * for Algorithms and Data Structures - LIT
 * @author k00223361 VINCENT LEE [DragonDream]
 */
public class PatientQueueGUI extends javax.swing.JFrame {
    PriorityQueue queue = new PriorityQueue(30); //create new queue for small A+E
    //private Patient nextPatient = patients.patientsWaiting[0];
    
    /*** Creates new form PatientQueueGUI ***/
    public PatientQueueGUI() {
        initComponents();
        
//        Patient p1 = new Patient( "vinny", 2 );
//        queue.enQueue(p1);
//        
//        Patient p2 = new Patient( "kevin", 3 );
//        queue.enQueue(p2);
        
        //System.out.println("current queue size : " + link.size());
        //statusOut_textField.setText( "Number of Patients in Queue : " + Integer.toString(queue.size()) );
        numberPatients_label.setText( Integer.toString(queue.size()) );
        //statusOut_textField.setText( "Next Patient is : " + p1.getPatientName() );
        patientName_textField.requestFocus(true); // focus input text field on run   
        
        
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
        patientLabel = new javax.swing.JLabel();
        priorityLabel = new javax.swing.JLabel();
        addPatient_btn = new javax.swing.JButton();
        callPatient_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        patientName_textField = new javax.swing.JTextField();
        priority_textField = new javax.swing.JTextField();
        statusOut_textField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        waitingList_txtArea = new javax.swing.JTextArea();
        patientsWaitingLabel = new javax.swing.JLabel();
        numberPatients_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        patientLabel.setText("Patient Name");

        priorityLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        priorityLabel.setText("Priority (1-5)");

        addPatient_btn.setBackground(new java.awt.Color(255, 204, 153));
        addPatient_btn.setText("Add Patient to Queue");
        addPatient_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatient_btnActionPerformed(evt);
            }
        });

        callPatient_btn.setBackground(new java.awt.Color(102, 255, 255));
        callPatient_btn.setText("Call Next Patient");
        callPatient_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callPatient_btnActionPerformed(evt);
            }
        });

        priority_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priority_textFieldActionPerformed(evt);
            }
        });

        statusOut_textField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        waitingList_txtArea.setColumns(20);
        waitingList_txtArea.setRows(5);
        jScrollPane1.setViewportView(waitingList_txtArea);

        patientsWaitingLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        patientsWaitingLabel.setText("Patients in Waiting Area :");

        numberPatients_label.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(patientsWaitingLabel)
                .addGap(18, 18, 18)
                .addComponent(numberPatients_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientsWaitingLabel)
                    .addComponent(numberPatients_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(statusOut_textField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addPatient_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(callPatient_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priorityLabel)
                            .addComponent(patientLabel))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientName_textField)
                            .addComponent(priority_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priority_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(callPatient_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPatient_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusOut_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void callPatient_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callPatient_btnActionPerformed
        // Call next Patient, dequeue the current, display next patient name with highest prioritty (root)
        queue.deQueue( Heap.patientsWaitingArr[0] ); //remove the root (highest priority instance of Patient)
        
        //return top priority patient at patientsHeap.patientsWaitingArr[0].getPatientName();
        statusOut_textField.setText( "Next Patient is : " + queue.nextPriority() );
        
        numberPatients_label.setText( Integer.toString(queue.size()) ); // update label number of Patients in Q
        waitingList_txtArea.setText( queue.printQueue() ); //update waiting area with current waiting Q
        
        if( queue.size()  == 0){
            statusOut_textField.setText(" "); // update the "next patient name" field
        }
    }//GEN-LAST:event_callPatient_btnActionPerformed

    private void addPatient_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatient_btnActionPerformed
        // add a patient with priortiy sort to PriorityQueue
        // Patient( int name, int priority)
        String patientName =  patientName_textField.getText();
        int patientPriority = Integer.parseInt( priority_textField.getText());
        
        if( patientPriority > 0 && patientPriority < 6){

            Patient newPatient = new Patient( patientName, patientPriority );
            queue.enQueue(newPatient); //insert new patient with (name & priority attributes)

            statusOut_textField.setText( "Next Patient is : " + queue.nextPriority() );

            numberPatients_label.setText( Integer.toString(queue.size()) ); 

            waitingList_txtArea.setText( queue.printQueue() ); 
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a priority between 1 (low) and 5 (high)");
            priority_textField.requestFocus(true);
            
        }
        
    }//GEN-LAST:event_addPatient_btnActionPerformed

    private void priority_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priority_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priority_textFieldActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PatientQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientQueueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatient_btn;
    private javax.swing.JButton callPatient_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numberPatients_label;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField patientName_textField;
    private javax.swing.JLabel patientsWaitingLabel;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JTextField priority_textField;
    private javax.swing.JTextField statusOut_textField;
    private javax.swing.JTextArea waitingList_txtArea;
    // End of variables declaration//GEN-END:variables
}
