import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener
{   JFrame jf;
	
	JButton m1_1,m1_2,m1_3,m1_4,m1_5,m2_1,m2_2,m2_3,m2_4,m2_5,m3_1,m3_2,m4_1,m5_1;
	JLabel l1,LogoColl;
	 //FlowLayout fl;

	public MainMenu()
	{
        jf=new JFrame();
		//fl=new  FlowLayout();
		jf.setLayout(null);

		l1=new JLabel("WELCOME TO MEDICAL STORE SEARCH MEDICINE");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setBounds(40,10,800,80);
		jf.add(l1);

		
		m2_1 = new JButton("Add New Medicine",new ImageIcon("images//addnew.png"));
		m2_1.setBounds(94,100,232,175);
		m2_1.setBackground(Color.magenta);
        m2_1.setForeground(Color.WHITE);
        m2_1.setFocusPainted(false);
        m2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m2_1);
		m2_2 = new JButton("Search Medicine",new ImageIcon("images//search1.png"));
		m2_2.setBounds(94,280,712,170);
		m2_2.setBackground(new Color(59, 89, 182));
        m2_2.setForeground(Color.WHITE);
        m2_2.setFocusPainted(false);
        m2_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		jf.add(m2_2);
		m2_3 = new JButton("Update Medicine",new ImageIcon("images//update.png"));
		m2_3.setBounds(335,100,232,175);
		m2_3.setBackground(Color.green);
        m2_3.setForeground(Color.WHITE);
        m2_3.setFocusPainted(false);
        m2_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m2_3);
		m2_4 = new JButton("Delete Medicine",new ImageIcon("images//delete.png"));
		m2_4.setBounds(576,100,232,175);
		m2_4.setBackground(Color.orange);
        m2_4.setForeground(Color.WHITE);
        m2_4.setFocusPainted(false);
        m2_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m2_4);
	  
		m3_1 = new JButton("Report",new ImageIcon("images//report.png"));
		m3_1.setBounds(94,456,232,175);
		m3_1.setBackground(Color.gray);
        m3_1.setForeground(Color.WHITE);
        m3_1.setFocusPainted(false);
        m3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m3_1);


		m4_1 = new JButton("About System",new ImageIcon("images//help.png"));
		m4_1.setBounds(335,456,232,175);
		//m4_1.setBounds(50,500,200,150);
		m4_1.setBackground(Color.pink);
        m4_1.setForeground(Color.WHITE);
        m4_1.setFocusPainted(false);
        m4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m4_1);

		
		m5_1 = new JButton("Exit",new ImageIcon("images//exit.png"));
		m5_1.setBounds(576,456,232,175);
		m5_1.setBackground(Color.red);
        m5_1.setForeground(Color.WHITE);
        m5_1.setFocusPainted(false);
        m5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jf.add(m5_1);

        

		m2_1.addActionListener(this);
		m2_2.addActionListener(this);
		m2_3.addActionListener(this);
		m2_4.addActionListener(this);
	  

		m3_1.addActionListener(this);
		m4_1.addActionListener(this);
		m5_1.addActionListener(this);

		jf.setTitle("Main Menu");
		jf.setLocation(20,20);
	    jf.setSize(900,700);
	    jf.setResizable(false);
		jf.getContentPane().setBackground(Color.cyan);
		jf.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae)
	{

	 

		if(ae.getSource()==m2_1)
		{
			new AddNewMedicine();
		}
		else if(ae.getSource()==m2_2)
		{
			new SearchMedicine();
		}
		else if(ae.getSource()==m2_3)
		{
			new UpdateMedicine();
		}
		else if(ae.getSource()==m2_4)
		{
			new DeleteMedicine();
		}
		

		 else if(ae.getSource()==m3_1)
		 {
		   new Report();
		 }


		else if(ae.getSource()==m4_1)
		{
	        new About();
		}

		else if(ae.getSource()==m5_1)
		{
		  System.exit(0);
		}

  }

	public static void main(String args[])
	{
		new MainMenu();
	}
}
