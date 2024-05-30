package TO_DO_LIST;

import javax.swing.*;
//import images.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class frame extends JFrame implements ActionListener, MouseListener {

frame(){

    Font f = new Font("Roboto",Font.BOLD+Font.ITALIC,35);
    Font f2 = new Font("Arial",Font.BOLD,20);
    Color lightblue = new Color(51,204,255);


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800,600);
    this.setLocationRelativeTo(null);
    this.setBackground(Color.WHITE);
    this.setTitle("LOGIN PAGE");

    Container c = new Container();
    c = getContentPane();
    c.setLayout(null);

    JPanel p = new JPanel();
    p.setBackground(lightblue);
    p.setBounds(400,0,800,600);
    p.setLayout(null);
    c.add(p);

     JLabel w = new JLabel();
     w.setText("What To-DO?");
     w.setBounds(70,190,250,50);
     w.setFont(f);
     p.add(w);

    JLabel m = new JLabel();
    m.setText("Make A Note !");
    m.setBounds(100,250,290,50);
    m.setFont(f);
    p.add(m);

    JLabel email = new JLabel();
    email.setText("*Email");
    email.setFont(f2);
    email.setBounds(100,150,100,50);
    email.setForeground(Color.BLACK);
    c.add(email);

    JTextField ef = new JTextField();
    ef.setBounds(100,200,220,40);
    ef.setHorizontalAlignment(JTextField.CENTER);
    c.add(ef);

    JLabel pass = new JLabel();
    pass.setText("*Password");
    pass.setFont(f2);
    pass.setBounds(100,240,150,50);
    pass.setForeground(Color.BLACK);
    c.add(pass);

    JPasswordField pf = new JPasswordField();
    pf.setBounds(100,280,220,40);
    pf.setHorizontalAlignment(JTextField.CENTER);
    c.add(pf);

    JButton login = new JButton();
    login.setText("Log in");
    login.setBounds(100,340,200,40);
    login.setFont(f2);
    login.setBackground(lightblue);
    login.setForeground(Color.BLACK);
    c.add(login);
    login.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
            if(ef.getText().isEmpty() && pf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email & Password Field Cant Be Empty!!");
            }
            else if(!ef.getText().isEmpty() && !pf.getText().isEmpty()){
                String name = ef.getText();
                String pass = pf.getText();
                Account account = new Account(name,pass);
                if(account.Check(name,pass)){
                    homepage h = new homepage();
                    h.setVisible(true);
                    setVisible(false);
                }
                else if(!account.Check(name,pass)){
                    JOptionPane.showMessageDialog(null,"Email & Password Doesnt Match");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Something Went Wrong");
                ef.setText("");
                pf.setText("");
            }
        }
    });
    login.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
        }
        public void mouseExited(MouseEvent m){
            login.setBackground(lightblue);
            login.setForeground(Color.BLACK);
        }
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
    });
    ///sign up button
    JButton signup = new JButton();
    signup.setText("Sign Up");
    signup.setBounds(100,400,200,40);
    signup.setFont(f2);
    signup.setBackground(lightblue);
    signup.setForeground(Color.BLACK);
    c.add(signup);
    signup.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            signup.setBackground(Color.BLACK);
            signup.setForeground(Color.WHITE);
        }
        public void mouseExited(MouseEvent m){
            signup.setBackground(lightblue);
            signup.setForeground(Color.BLACK);
        }
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
    });
    signup.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            createnewaccount c = new createnewaccount();
            c.setVisible(true);
            setVisible(false);
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
}