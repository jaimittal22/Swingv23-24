import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class easy2 implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public easy2() {
            prepareGUI();
        }

        public static void main(String[] args) {
            easy2 swingControlDemo = new easy2();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());

            //menu at top
            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });

            mainFrame.setVisible(true);
        }

        private void showEventDemo() {

            JButton Button1 = new JButton("Button 1");
            JButton Button2 = new JButton("Button 2");
            JButton Button3 = new JButton("Button 3");
            JButton Button4 =  new JButton("Button 4");
            JButton Button5 =  new JButton("Button 5");

            Button1.setActionCommand("Button 1");
            Button2.setActionCommand("Button 2");
            Button3.setActionCommand("Button 3");
            Button4.setActionCommand("Button 4");
            Button5.setActionCommand("Button 5");


            //    Button1.addActionListener(new ButtonClickListener());
            //    Button2.addActionListener(new ButtonClickListener());
            //    Button3.addActionListener(new ButtonClickListener())
            //  Button4.addActionListener(new ButtonClickListener());
            //Button5.addActionListener(new ButtonClickListener());

            mainFrame.add(Button1, BorderLayout.NORTH);
            mainFrame.add(Button2, BorderLayout.SOUTH);
            mainFrame.add(Button3, BorderLayout.EAST);
            mainFrame.add(Button4, BorderLayout.WEST);
            mainFrame.add(Button5, BorderLayout.CENTER);

            mainFrame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cut)
                ta.cut();
            if (e.getSource() == paste)
                ta.paste();
            if (e.getSource() == copy)
                ta.copy();
            if (e.getSource() == selectAll)
                ta.selectAll();
        }


    }




