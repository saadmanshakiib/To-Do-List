package TO_DO_LIST;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class homepage extends JFrame implements ActionListener, MouseListener {

    homepage(){
        Font f = new Font("Roboto",Font.BOLD+Font.ITALIC,35);
        Font f2 = new Font("Arial",Font.BOLD,20);
       // Color lightblue = new Color(51, 160, 255);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setTitle("HomePage");

        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);

        JLabel name = new JLabel();
        name.setText("Title  : ");
        name.setBounds(50,100,100,40);
        name.setFont(f2);
        name.setForeground(Color.BLACK);
        c.add(name);
        JTextField nf = new JTextField();
        nf.setBounds(130,100,220,40);
        nf.setHorizontalAlignment(JTextField.CENTER);
        nf.setFont(f2);
        c.add(nf);

        JLabel time = new JLabel();
        time.setText("Time : ");
        time.setBounds(50,150,100,40);
        time.setFont(f2);
        time.setForeground(Color.BLACK);
        c.add(time);
        JTextField tf = new JTextField();
        tf.setBounds(130,150,220,40);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f2);
        c.add(tf);

        JLabel todo = new JLabel();
        todo.setText("TO-DO : ");
        todo.setBounds(50,200,120,40);
        todo.setForeground(Color.BLACK);
        todo.setFont(f2);
        c.add(todo);

        JTextArea todof = new JTextArea();
        todof.setLineWrap(true);
        todof.setWrapStyleWord(true);
        todof.setBounds(50,250,600,220);
        todof.setFont(f2);
        c.add(todof);


        JButton add = new JButton();
        add.setText("ADD");
        add.setBounds(680,490,80,40);
        add.setBackground(Color.GREEN);
        add.setFont(f2);
        c.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nf.getText();
                String time = tf.getText();
                String TO_DO = todof.getText();
                todo t = new todo(name,time,TO_DO);
                t.setALL(name,time,TO_DO);
                JOptionPane.showMessageDialog(null,"Added To Note");
                setVisible(false);
            }
        });
        add.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                add.setBackground(Color.BLACK);
                add.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                add.setBackground(Color.GREEN);
                add.setForeground(Color.BLACK);

            }
        });

        JButton exit = new JButton();
        exit.setText("EXIT");
        exit.setBounds(550,490,100,40);
        exit.setBackground(Color.RED);
        exit.setFont(f2);
        c.add(exit);
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                exit.setBackground(Color.BLACK);
                exit.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setBackground(Color.RED);
                exit.setForeground(Color.BLACK);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame f = new frame();
                f.setVisible(true);
                setVisible(false);
            }
        });
    }

public  static void main(String[] a){
        homepage h = new homepage();
        h.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
