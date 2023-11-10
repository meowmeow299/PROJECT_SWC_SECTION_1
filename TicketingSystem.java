
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.io.*;

public class TicketingSystem extends javax.swing.JFrame
{
    private LinkedList<CustomerInformation> customerList;
    private Queue<CustomerInformation> counter1Queue;
    private Queue<CustomerInformation> counter2Queue;
    private Queue<CustomerInformation> counter3Queue;
    private Stack<CustomerInformation> paidCustomers;
    private static TicketingSystem ticketingSystemInstance;
    
    public TicketingSystem() 
    {
        initComponents();
        customerList = new LinkedList<>();
        counter1Queue = new LinkedList<>();
        counter2Queue = new LinkedList<>();
        counter3Queue = new LinkedList<>();
        paidCustomers = new Stack<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DisplayArea = new java.awt.TextArea();
        Counter1Button = new javax.swing.JButton();
        Counter2Button = new javax.swing.JButton();
        Counter3Button = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        loadDataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(178, 224, 244));

        DisplayArea.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        Counter1Button.setBackground(new java.awt.Color(255, 204, 204));
        Counter1Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Counter1Button.setText("COUNTER 1");
        Counter1Button.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 102), new java.awt.Color(204, 0, 0)));
        Counter1Button.addActionListener(new java.awt.event.ActionListener()
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    Counter1ButtonActionPerformed(evt);
                }
            });

        Counter2Button.setBackground(new java.awt.Color(255, 204, 204));
        Counter2Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Counter2Button.setText("COUNTER 2");
        Counter2Button.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 102), new java.awt.Color(204, 0, 0)));
        Counter2Button.addActionListener(new java.awt.event.ActionListener() 
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    Counter2ButtonActionPerformed(evt);
                }
            });

        Counter3Button.setBackground(new java.awt.Color(255, 204, 204));
        Counter3Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Counter3Button.setText("COUNTER 3");
        Counter3Button.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 102), new java.awt.Color(204, 0, 0)));
        Counter3Button.addActionListener(new java.awt.event.ActionListener() 
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    Counter3ButtonActionPerformed(evt);
                }
            });

        PayButton.setBackground(new java.awt.Color(153, 255, 153));
        PayButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PayButton.setText("PAY");
        PayButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 102), new java.awt.Color(0, 153, 51)));
        PayButton.addActionListener(new java.awt.event.ActionListener() 
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    PayButtonActionPerformed(evt);
                }
            });

        nextPage.setBackground(new java.awt.Color(255, 204, 51));
        nextPage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextPage.setText("SHOW PAID CUSTOMER");
        nextPage.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 51), new java.awt.Color(204, 153, 0)));
        nextPage.addActionListener(new java.awt.event.ActionListener() 
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    nextPageActionPerformed(evt);
                }
            });

        loadDataButton.setBackground(new java.awt.Color(204, 204, 255));
        loadDataButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loadDataButton.setText("LOAD DATA");
        loadDataButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
        loadDataButton.addActionListener(new java.awt.event.ActionListener() 
        {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    loadDataButtonActionPerformed(evt);
                }
            });

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("WHIMPSY WORLD TICKETING SYSTEM");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(155, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Counter1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Counter2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Counter3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(DisplayArea, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(loadDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Counter1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Counter2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Counter3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(DisplayArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }  

    //set the limit of customers in a counter
    private static final int maxCustomers = 5; 

    //read and load data from input file in each counter 
    private void loadCustomerDataFromFile(String filePath) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(";");
                String custId = data[0];
                String custName = data[1];
                String custNum = data[2];
                int tixQtt = Integer.parseInt(data[3]);
                double tixAmount = Double.parseDouble(data[4]);
                String purchaseDate = data[5];

                CustomerInformation customer = new CustomerInformation(custId, custName, custNum, tixQtt, tixAmount, purchaseDate);
                customerList.add(customer);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    //display the output
    private void displayCustomersInTextArea(Queue<CustomerInformation> queue) 
    {
        StringBuilder displayText = new StringBuilder();
        for (CustomerInformation customer : queue) 
        {
            displayText.append(customer.toString()).append("\n");
        }
        DisplayArea.setText(displayText.toString());
    }

    //counter 1 process
    private void Counter1ButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        processCustomersForCounter(counter1Queue);
    }                                              

    //counter 2 process
    private void Counter2ButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        processCustomersForCounter(counter2Queue);
    }                                              

    //counter 3 process
    private void Counter3ButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        processCustomersForCounter(counter3Queue);
    }                                              

    //processes in a counter
    private void processCustomersForCounter(Queue<CustomerInformation> counterQueue)
    {
        int customersProcessed = 0;
        while (!customerList.isEmpty() && customersProcessed < MAX_CUSTOMERS && counterQueue.size() < MAX_CUSTOMERS) 
        {
            CustomerInformation customer = customerList.poll();
        if (customer.getTixQtt() <= 5 && counterQueue != counter3Queue) 
        {
            //customers that bought 5 tix and less will go to counter 1 and 2
            counterQueue.add(customer);
            customersProcessed++;
        } 
        else if (customer.getTixQtt() > 5 && counterQueue == counter3Queue) 
        {
            //customers that bought more than 5 tix will go to counter 3
            counterQueue.add(customer);
            customersProcessed++;
        } 
        else 
        {
            customerList.add(customer);
        }
    }
    //display the output
    displayCustomersInTextArea(counterQueue);
    }

    //payment process in counter
    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        payCustomers(counter1Queue);
        payCustomers(counter2Queue);
        payCustomers(counter3Queue);
    }

    //set the limit of customer for each counter
    private static final int MAX_CUSTOMERS = 5;

    private void payCustomers(Queue<CustomerInformation> counterQueue) 
    {
        while (!counterQueue.isEmpty()) 
        {
        CustomerInformation customer = counterQueue.poll();
        customer.setPaid(true);
        paidCustomers.push(customer);
    }
        displayCustomersInTextArea(counterQueue);
        //clearing the processed customer from queue
        counterQueue.clear();
    }

    //tosave processed cust as paidCust and to go to next page
    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) 
    {
        completeStack cs = new completeStack(this, paidCustomers);
        cs.setVisible(true);
        this.dispose();
    }

    public static TicketingSystem getInstance()
    {
        if (ticketingSystemInstance == null) 
        {
            ticketingSystemInstance = new TicketingSystem();
        }
        return ticketingSystemInstance;
    }

    //to read and load data from input file
    private void loadDataButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        String filePath = "customerList.txt";
        loadCustomerDataFromFile(filePath);
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        TicketingSystem ticketingSystem = TicketingSystem.getInstance();
        completeStack cs = new completeStack(ticketingSystem, ticketingSystem.paidCustomers);
        cs.setVisible(true);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(TicketingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(TicketingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(TicketingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(TicketingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
                public void run() 
                {
                    new TicketingSystem().setVisible(true);
                }
            });
    }

    public StringBuilder getPaidCustomersAsString() 
    {
        StringBuilder displayText = new StringBuilder();
        for (CustomerInformation customer : paidCustomers)
        {
            System.out.print(paidCustomers.size());
            displayText.append(customer.toString()).append("\n");
        }
        return displayText;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Counter1Button;
    private javax.swing.JButton Counter2Button;
    private javax.swing.JButton Counter3Button;
    private java.awt.TextArea DisplayArea;
    private javax.swing.JButton PayButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loadDataButton;
    private javax.swing.JButton nextPage;
    // End of variables declaration                   
}