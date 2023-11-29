import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class HtmlLayout implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea KeyWord; //typing area
    private JTextArea URL; //typing area
    private JLabel Results;
    private JPanel Top;
    private JPanel Bottom;
    private int WIDTH=800;
    private int HEIGHT=700;


    public HtmlLayout() {
        prepareGUI();
    }

    public static void main(String[] args) {
        HtmlLayout swingControlDemo = new HtmlLayout();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,1));

        //menu at top
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton Button1 = new JButton("Search");
        KeyWord = new JTextArea("KeyWord:");
        URL = new JTextArea("URL:");
        Results = new JLabel("Results:");
        Top = new JPanel();
         Top.setLayout(new GridLayout(1,3));
         Bottom = new JPanel();
        Top.setLayout(new GridLayout(1,1));
        Button1.setActionCommand("Search");


        //    Button1.addActionListener(new ButtonClickListener());
        //    Button2.addActionListener(new ButtonClickListener());
        //    Button3.addActionListener(new ButtonClickListener())
        //  Button4.addActionListener(new ButtonClickListener());
        //Button5.addActionListener(new ButtonClickListener());
      Top.add(KeyWord);
      Top.add(URL);
      Top.add(Button1);
      Bottom.add(Results);

       mainFrame.add(Top);

        mainFrame.add(Bottom);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            URL.cut();
            KeyWord.cut();

        if (e.getSource() == paste)
            URL.paste();
        KeyWord.paste();

        if (e.getSource() == copy)
            URL.copy();
        KeyWord.copy();

        if (e.getSource() == selectAll)
            URL.selectAll();
        KeyWord.selectAll();

    }



}


