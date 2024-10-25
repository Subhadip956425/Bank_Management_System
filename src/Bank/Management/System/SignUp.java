package Bank.Management.System;

import com.toedter.calendar.JDateChooser;
import Bank.Ccon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    JDateChooser dateChooser;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 900L) + 1000L;
    String first = " " + Math.abs(first4);
    
    SignUp() {
        super("Applicatip Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM No." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 100, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setBounds(100, 240, 200, 30);
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Railway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setBounds(100, 340, 200, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Railway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);
        
        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450, 440, 100, 30);
        m2.setBackground(new Color(222, 255, 228));
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(635, 440, 100, 30);
        m3.setBackground(new Color(222, 255, 228));
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Railway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Railway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Railway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Railway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 13);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String Fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor()).getText();
        String gender = null;
        if(r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m3.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (this.textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Ccon con1 = new Ccon();
                String q = "Insert into signup values('"+ formno +"', '"+ name +"', '"+ Fname +"', '"+ dob +"', '"+ gender +"', '"+ email +"', '"+ marital +"', '"+ address +"', '"+ city +"', '"+ pincode +"', '"+ state +"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                this.setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}