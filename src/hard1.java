import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hard1 implements ActionListener {
    private JFrame mainFrame;

    private JLabel top01;
    private JLabel top02;
    private JLabel top03;
    private JLabel top04;
    private JLabel top05;
    private JLabel topRight;
    private JLabel zero1;
    private JLabel zero2;
    private JLabel zero3;
    private JLabel zero4;
    private JLabel zero5;

    private JPanel upperLeftPanel;
    private JPanel upperRightPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel bottomStrip;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;


    public hard1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        hard1 hard = new hard1();
        hard.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));


        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        //end menu at top

        //top
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1,2)); //set the layout of the pannel

        //upper left
        upperLeftPanel = new JPanel();
        upperLeftPanel.setLayout(new GridLayout(3,3)); //set the layout of the pannel

        //upper right
        upperRightPanel = new JPanel();
        upperRightPanel.setLayout(new GridLayout(2,1)); //set the layout of the pannel

        //bottom
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout()); //set the layout of the pannel

        //bottom strip
        bottomStrip = new JPanel();
        bottomStrip.setLayout(new GridLayout(1,9)); //set the layout of the pannel

        //typing area
        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);


        //make labels
        top01 = new JLabel("Top 0");
        top01.setHorizontalAlignment(JLabel.CENTER);
        top02 = new JLabel("Top 0");
        top02.setHorizontalAlignment(JLabel.CENTER);
        top03 = new JLabel("Top 0");
        top03.setHorizontalAlignment(JLabel.CENTER);
        top04 = new JLabel("Top 0");
        top04.setHorizontalAlignment(JLabel.CENTER);
        top05 = new JLabel("Top 0");
        top05.setHorizontalAlignment(JLabel.CENTER);
        topRight = new JLabel("Top Right");
        topRight.setHorizontalAlignment(JLabel.CENTER);
        zero1 = new JLabel("0");
        zero1.setHorizontalAlignment(JLabel.CENTER);
        zero2 = new JLabel("0");
        zero2.setHorizontalAlignment(JLabel.CENTER);
        zero3 = new JLabel("0");
        zero3.setHorizontalAlignment(JLabel.CENTER);
        zero4 = new JLabel("0");
        zero4.setHorizontalAlignment(JLabel.CENTER);
        zero5 = new JLabel("0");
        zero5.setHorizontalAlignment(JLabel.CENTER);

        mainFrame.add(mb);  //add menu bar
        mainFrame.setJMenuBar(mb); //set menu bar

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

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
    private void showEventDemo() {

        //make buttons
        JButton top1 = new JButton("Top 1");
        JButton top2 = new JButton("Top 2");
        JButton top3 = new JButton("Top 3");
        JButton top4 = new JButton("Top 4");
        JButton one1 = new JButton("1");
        JButton one2 = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");

        //top left
        upperLeftPanel.add(top01);
        upperLeftPanel.add(top1);
        upperLeftPanel.add(top02);
        upperLeftPanel.add(top2);
        upperLeftPanel.add(top03);
        upperLeftPanel.add(top3);
        upperLeftPanel.add(top04);
        upperLeftPanel.add(top4);
        upperLeftPanel.add(top05);

        //top right
        upperRightPanel.add(topRight);
        upperRightPanel.add(one1);

        //top
        topPanel.add(upperLeftPanel);
        topPanel.add(upperRightPanel);

        //bottom strip
        bottomStrip.add(zero1);
        bottomStrip.add(one2);
        bottomStrip.add(zero2);
        bottomStrip.add(two);
        bottomStrip.add(zero3);
        bottomStrip.add(three);
        bottomStrip.add(zero4);
        bottomStrip.add(four);
        bottomStrip.add(zero5);

        //bottom
        bottomPanel.add(ta, BorderLayout.CENTER);//add typing area
        bottomPanel.add(bottomStrip, BorderLayout.SOUTH);

        //mainframe
        mainFrame.add(topPanel);
        mainFrame.add(bottomPanel);

        mainFrame.setVisible(true);
    }
}

