import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class medium2 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JLabel statusLabel1;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        medium2 swingControlDemo = new medium2();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));

        //menu at top
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel
        statusLabel = new JLabel("label", JLabel.CENTER);
        statusLabel.setSize(350, 100);


    }

    private void showEventDemo() {

        JButton Button1 = new JButton("Button 1");
        JButton Button2 = new JButton("Button 2");
        JButton Button3 = new JButton("Button 3");
        JButton Button4 =  new JButton("Button 4");
        JButton Button5 =  new JButton("Button 5");
        JButton Button6 =  new JButton("Button 6");
        JButton Button7 =  new JButton("Button 7");
        JButton Button8 =  new JButton("Button 8");
        JButton Button9 =  new JButton("Button 9");
        JButton Button10 =  new JButton("Button 10");




        //    Button1.addActionListener(new ButtonClickListener());
        //    Button2.addActionListener(new ButtonClickListener());
        //    Button3.addActionListener(new ButtonClickListener())
        //  Button4.addActionListener(new ButtonClickListener());
        //Button5.addActionListener(new ButtonClickListener());

        mainFrame.setVisible(true);
        mainFrame.add(Button1);
        mainFrame.add(Button2);
        mainFrame.add(Button3);
        mainFrame.add(Button4);
        controlPanel.add(statusLabel, BorderLayout.CENTER);
        controlPanel.add(Button9, BorderLayout.EAST);
        controlPanel.add(Button10, BorderLayout.SOUTH);
        mainFrame.add(controlPanel);
        mainFrame.add(Button5);
        mainFrame.add(Button6);
        mainFrame.add(Button7);
        mainFrame.add(Button8);


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