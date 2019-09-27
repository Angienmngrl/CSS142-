package printqueue;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 * Main class with the GUI content that is used throughout to build the program
 * into a functioning one utility project
 *
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class PrintQueueSimulationGUI extends javax.swing.JFrame {

    private static final int NUMBER_OF_SERVERS = 4;
    private static final double MEAN_INTERARRIVAL_TIME = 10.0;
    private static final int DURATION = 110;
    private static int jobSize = 10;
    private static StringBuffer buffer = new StringBuffer();

    /**
     * Automatic call of the form through the built in library of the IDE
     * Netbeans
     */
    public PrintQueueSimulationGUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberOfPrintersJLabel = new javax.swing.JLabel();
        interarrivalJLabel = new javax.swing.JLabel();
        meanDurationJLabel = new javax.swing.JLabel();
        jobZiseJLabel = new javax.swing.JLabel();
        queueJScrollBar = new javax.swing.JScrollPane();
        queueJTextArea = new javax.swing.JTextArea();
        displayQueueJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        printFormJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numberOfPrinterJSpinner = new javax.swing.JSpinner();
        durationJSpinner = new javax.swing.JSpinner();
        jobSizeJSpinner = new javax.swing.JSpinner();
        interArrivalJSpinner = new javax.swing.JSpinner();
        queueJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        firstJSeperator = new javax.swing.JPopupMenu.Separator();
        printFormJMenuItem = new javax.swing.JMenuItem();
        printQueueJMenuItem = new javax.swing.JMenuItem();
        secondJSeperator = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Queue Simulation");

        numberOfPrintersJLabel.setText("Please choose the number of printers:");
        numberOfPrintersJLabel.setToolTipText("Label for number of printers text field");

        interarrivalJLabel.setText("Select a mean interarrival time:");
        interarrivalJLabel.setToolTipText("Label for interarrival time text field");

        meanDurationJLabel.setText("Select a mean duration for each job");
        meanDurationJLabel.setToolTipText("Mean duration text label");

        jobZiseJLabel.setText("Select job size:");
        jobZiseJLabel.setToolTipText("Mean duration text label");

        queueJTextArea.setColumns(20);
        queueJTextArea.setRows(5);
        queueJTextArea.setToolTipText("Here will be displayed the printing queue");
        queueJScrollBar.setViewportView(queueJTextArea);

        displayQueueJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        displayQueueJButton.setMnemonic('D');
        displayQueueJButton.setText("Display result");
        displayQueueJButton.setToolTipText("Display your end of the process");
        displayQueueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayQueueJButtonActionPerformed(evt);
            }
        });

        exitJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitJButton.setMnemonic('x');
        exitJButton.setText("Exit");
        exitJButton.setToolTipText("Exit your Queue");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });

        printFormJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        printFormJButton.setMnemonic('P');
        printFormJButton.setText("Print");
        printFormJButton.setToolTipText("Print Form");
        printFormJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJButtonActionPerformed(evt);
            }
        });

        clearJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearJButton.setText("Clear");
        clearJButton.setToolTipText("Clear the queue process");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Print Queue Simulation");
        jLabel1.setToolTipText("Title: Print Queue Simulation");

        numberOfPrinterJSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 1, 10, 1));
        numberOfPrinterJSpinner.setToolTipText("Select number of printers");

        durationJSpinner.setModel(new javax.swing.SpinnerNumberModel(80, 10, 100, 1));
        durationJSpinner.setToolTipText("Select mean duration");

        jobSizeJSpinner.setModel(new javax.swing.SpinnerNumberModel(80, 10, 100, 1));
        jobSizeJSpinner.setToolTipText("Select job size");

        interArrivalJSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 1, 10, 1));
        interArrivalJSpinner.setToolTipText("Select interarrival time");

        queueJMenuBar.setToolTipText("Queue Menu Bar");

        fileJMenu.setText("File");
        fileJMenu.setToolTipText("Clear, Print Form, Print Queue, and Exit");

        clearJMenuItem.setMnemonic('l');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clear Queue");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);
        fileJMenu.add(firstJSeperator);

        printFormJMenuItem.setMnemonic('F');
        printFormJMenuItem.setText("Print Form");
        printFormJMenuItem.setToolTipText("Print Form of program");
        printFormJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printFormJMenuItem);

        printQueueJMenuItem.setMnemonic('C');
        printQueueJMenuItem.setText("Print Queue");
        printQueueJMenuItem.setToolTipText("Print Queue Information");
        printQueueJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printQueueJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printQueueJMenuItem);
        fileJMenu.add(secondJSeperator);

        exitJMenuItem.setMnemonic('x');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Exit program");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        queueJMenuBar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("Get help here");

        aboutJMenuItem.setMnemonic('b');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("Display About Form");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        queueJMenuBar.add(helpJMenu);

        setJMenuBar(queueJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queueJScrollBar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobZiseJLabel)
                            .addComponent(meanDurationJLabel)
                            .addComponent(interarrivalJLabel)
                            .addComponent(numberOfPrintersJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfPrinterJSpinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(interArrivalJSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(durationJSpinner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jobSizeJSpinner, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayQueueJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(clearJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(printFormJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfPrintersJLabel)
                    .addComponent(numberOfPrinterJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interarrivalJLabel)
                    .addComponent(interArrivalJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meanDurationJLabel)
                    .addComponent(durationJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobZiseJLabel)
                    .addComponent(jobSizeJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(queueJScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayQueueJButton)
                    .addComponent(printFormJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearJButton)
                    .addComponent(exitJButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     * Method: displayQueueJButtonActionPerformed Displays the Printer Queue
     * Simulation in a JTextArea
     *
     * @param evt ActionEvent
     */
    private void displayQueueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayQueueJButtonActionPerformed
        // TODO add your handling code here:
        int interval = Integer.parseInt(interArrivalJSpinner.getValue().toString());
        int numberServers = Integer.parseInt(numberOfPrinterJSpinner.getValue().toString());
        int jobSize = Integer.parseInt(jobSizeJSpinner.getValue().toString());
        int duration = Integer.parseInt(durationJSpinner.getValue().toString());

        Server[] servers = new Server[NUMBER_OF_SERVERS];
        Queue clients = new Queue();
        Random myRandom = new Random(MEAN_INTERARRIVAL_TIME);

        for (int i = 0; i < NUMBER_OF_SERVERS; i++) {
            servers[i] = new Server();
        }
        int timeOfNextArrival = myRandom.intNextExponential();
        for (int t = 0; t < DURATION; t++) {
            if (t == timeOfNextArrival) {
                clients.enqueue(new Client(t));
                print(clients);
                timeOfNextArrival += myRandom.intNextExponential();
            }
            for (int i = 0; i < NUMBER_OF_SERVERS; i++) {
                if (servers[i].isFree()) {
                    if (!clients.isEmpty()) {
                        servers[i].beginServing((Client) clients.dequeue(), t);
                        print(clients);
                    }
                } else if (t == servers[i].getTimeServiceEnds()) {
                    servers[i].endServing(t);
                }

            }
        }
        queueJTextArea.setText(buffer.toString());

    }//GEN-LAST:event_displayQueueJButtonActionPerformed
    /**
     * Method: exitJButtonActionPerformed Allows the program to exit the program
     *
     * @return void
     * @param evt ActionEvent
     */
    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitJButtonActionPerformed
    /**
     * Method: printFormJMenuItemActionPerformed Description: print form
     *
     * @return void
     * @param evt ActionEvent
     */
    private void printFormJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJMenuItemActionPerformed

        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printFormJMenuItemActionPerformed
    /**
     * Method: printQueueJMenuItemActionPerformed Description: Prints queue
     * information
     *
     * @return void
     * @param evt ActionEvent
     */
    private void printQueueJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printQueueJMenuItemActionPerformed

        printFormJButtonActionPerformed(evt);
    }//GEN-LAST:event_printQueueJMenuItemActionPerformed
    /**
     * Description: Prints the information that is available
     *
     * @return void
     * @param evt ActionEvent
     */
    private void printFormJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJButtonActionPerformed
        try {
            // TODO add your handling code here:
            queueJTextArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrintQueueSimulationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_printFormJButtonActionPerformed
    /**
     * Method: clearJButtonActionPerformed Allows the program to clear the
     * program
     *
     * @return void
     * @param evt ActionEvent
     */
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // TODO add your handling code here:
        queueJTextArea.setText("");
        numberOfPrinterJSpinner.setValue(0);
        durationJSpinner.setValue(0);
        jobSizeJSpinner.setValue(0);
        interArrivalJSpinner.setValue(0);
    }//GEN-LAST:event_clearJButtonActionPerformed
    /**
     * Method: aboutJMenuItemActionPerformed Allows the program to display the
     * about form
     *
     * @return void
     * @param evt
     */
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        // TODO add your handling code here:
        About myAbout = new About(this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**
     * Method: clearJMenuItemActionPerformed Resets the program
     *
     * @param evt
     * @return void
     */
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed

        clearJButtonActionPerformed(evt);
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**
     * Method: exitJMenuItemActionPerformed Allows the program to exit the
     * program
     *
     * @return void
     * @param evt ActionEvent
     */
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_exitJMenuItemActionPerformed
    /**
     * Method: print Description: Decides whether the queue is empty or not and
     * displays accordingly
     *
     * @param myQueue Queue
     * @return myQueue.print()
     */
    private static void print(Queue queue) {
        if (queue.isEmpty()) {
            displayText("Queue is now empty");
        } else {
            displayText("The queue now contains" + " jobs: [" + queue.print() + "]");
        }

    }

    /**
     * Method: displayText Applies a short and simple appendation of the
     * JTextArea
     *
     * @param text String
     */
    public static void displayText(String text) {
        buffer.append(text + "\n");
    }

    public static void main(String args[]) {
        Splash sp = new Splash(2000);
        sp.showSplash();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintQueueSimulationGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JButton displayQueueJButton;
    private javax.swing.JSpinner durationJSpinner;
    private javax.swing.JButton exitJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator firstJSeperator;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JSpinner interArrivalJSpinner;
    private javax.swing.JLabel interarrivalJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jobSizeJSpinner;
    private javax.swing.JLabel jobZiseJLabel;
    private javax.swing.JLabel meanDurationJLabel;
    private javax.swing.JSpinner numberOfPrinterJSpinner;
    private javax.swing.JLabel numberOfPrintersJLabel;
    private javax.swing.JButton printFormJButton;
    private javax.swing.JMenuItem printFormJMenuItem;
    private javax.swing.JMenuItem printQueueJMenuItem;
    private javax.swing.JMenuBar queueJMenuBar;
    private javax.swing.JScrollPane queueJScrollBar;
    private javax.swing.JTextArea queueJTextArea;
    private javax.swing.JPopupMenu.Separator secondJSeperator;
    // End of variables declaration//GEN-END:variables
}
