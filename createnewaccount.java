package TO_DO_LIST;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class createnewaccount extends JFrame implements ActionListener, MouseListener {
    createnewaccount(){
        Font f = new Font("Roboto",Font.BOLD+Font.ITALIC,35);
        Font f2 = new Font("Arial",Font.BOLD,20);
        Color lightblue = new Color(51, 160, 255);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setTitle("HomePage");

        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);

        JLabel n = new JLabel();
        n.setText("Email : ");
        n.setBounds(70,150,80,40);
        n.setFont(f2);
        c.add(n);
        JTextField nf = new JTextField();
        nf.setBounds(210,150,200,40);
        nf.setHorizontalAlignment(JTextField.CENTER);
        c.add(nf);

        JLabel p = new JLabel();
        p.setText("Password : ");
        p.setBounds(70,210,120,40);
        p.setFont(f2);
        c.add(p);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(210,210,200,40);
        pf.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf);


        JLabel cp = new JLabel();
        cp.setText(" Confirm Password : ");
        cp.setBounds(10,275,220,40);
        cp.setFont(f2);
        c.add(cp);
        JPasswordField cpf = new JPasswordField();
        cpf.setBounds(210,275,200,40);
        cpf.setHorizontalAlignment(JTextField.CENTER);
        c.add(cpf);

        JPanel P = new JPanel();
        P.setBounds(450,0,800,600);
        P.setBackground(lightblue);
        P.setLayout(null);
        c.add(P);

        JLabel a = new JLabel();
        a.setText("CREATE");
        a.setBounds(20,200,200,40);
        a.setFont(f);
        P.add(a);

        JLabel a2 = new JLabel();
        a2.setText("NEW");
        a2.setBounds(70,250,200,40);
        a2.setFont(f);
        P.add(a2);

        JLabel a3 = new JLabel();
        a3.setText("ACCOUNT");
        a3.setBounds(120,300,200,40);
        a3.setFont(f);
        P.add(a3);

        JLabel gender  = new JLabel();
        gender.setText("Gender : ");
        gender.setBounds(70,325,100,40);
        gender.setFont(f2);
        c.add(gender);


        JRadioButton g = new JRadioButton();
        g.setText("Male");
        g.setBounds(210,325,100,40);
        g.setFont(f2);
        c.add(g);

        JRadioButton fe = new JRadioButton();
        fe.setText("Female");
        fe.setBounds(320,325,100,40);
        fe.setFont(f2);
        c.add(fe);

        ButtonGroup bg = new ButtonGroup();
        bg.add(g);
        bg.add(fe);

        JButton s = new JButton();
        s.setText("SIGN UP");
        s.setBounds(280,420,120,40);
        s.setBackground(Color.GREEN);
        s.setFont(f2);
        c.add(s);
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!nf.getText().isEmpty() && !pf.getText().isEmpty() && pf.getText().compareTo(cpf.getText())==0) {
                    String email = nf.getText();
                    String pass = pf.getText();
                    Account account = new Account(email, pass);
                   // account.Add(email, pass);
                    if(account.Check(email, pass)) {
                        JOptionPane.showMessageDialog(null, "Account Already Exists");
                    }
                    else if (!account.Check(email, pass)) {
                        account.Add();
                        JOptionPane.showMessageDialog(null, "New Account Has Been Created");
                        homepage h = new homepage();
                        h.setVisible(true);
                        setVisible(false);
                    }
                }
               else {
                   JOptionPane.showMessageDialog(null,"Something Went Wrong!");
                   nf.setText("");
                   pf.setText("");
                   cpf.setText("");
                }

                }
        });
        s.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                s.setBackground(lightblue);
                s.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                s.setBackground(Color.GREEN);
                s.setForeground(Color.BLACK);
            }
        });

        JButton e = new JButton();
        e.setText("EXIT");
        e.setBounds(100,420,120,40);
        e.setBackground(Color.RED);
        e.setFont(f2);
        c.add(e);
        e.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e1){}

            @Override
            public void mousePressed(MouseEvent e1) {}

            @Override
            public void mouseReleased(MouseEvent e1) {}

            @Override
            public void mouseEntered(MouseEvent e1) {
                e.setBackground(lightblue);
                e.setForeground(Color.BLACK);

            }

            @Override
            public void mouseExited(MouseEvent e1) {
                e.setBackground(Color.RED);
                e.setForeground(Color.BLACK);

            }
        });


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

    public static  void main(String[] a){
        createnewaccount c = new createnewaccount();
        c.setVisible(true);
    }
}

