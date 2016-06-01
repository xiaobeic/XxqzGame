import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;

public class help extends JFrame implements ActionListener{

	
	JButton nextbutton;
    JButton preButton;
    Panel cardPanel=new Panel();
    Panel controlpaPanela=new Panel();
    Panel controlpaPanelb=new Panel();
    CardLayout card=new CardLayout();
    ImageIcon help0= new ImageIcon(help.class.getResource("help0.png"));
    ImageIcon help1 = new ImageIcon(help.class.getResource("help1.png"));
    ImageIcon help2 = new ImageIcon(help.class.getResource("help2.png"));
    ImageIcon help3 = new ImageIcon(help.class.getResource("help3.png"));
    ImageIcon help4 = new ImageIcon(help.class.getResource("help4.png"));
    ImageIcon left = new ImageIcon(help.class.getResource("left.png"));
    ImageIcon right= new ImageIcon(help.class.getResource("right.png"));
    public help() {
           super("小小枪战1.0");
           setSize(900, 450);
           setLocationRelativeTo(null);
           setVisible(true);
           setResizable(false);
           
           cardPanel.setLayout(card); 
           controlpaPanela.setLayout(new GridLayout(1,1));               //设置布局
           controlpaPanelb.setLayout(new GridLayout(1,1));
           controlpaPanela.setPreferredSize(new Dimension(80,70));      //设置面板大小 
           controlpaPanelb.setPreferredSize(new Dimension(80,70));
           Container c=getContentPane();                 
           c.add(cardPanel,BorderLayout.CENTER);
           c.add(controlpaPanela,BorderLayout.EAST);
           c.add(controlpaPanelb,BorderLayout.WEST);
           
           nextbutton=new JButton("",right);
	       preButton=new JButton("",left);
	       nextbutton.addActionListener(this);
	       preButton.addActionListener(this);
           controlpaPanela.add(nextbutton);                    //吧按钮加到面板上
           controlpaPanelb.add(preButton);      
           
           cardPanel.add(new JButton("",help0));
           cardPanel.add(new JButton("",help1));             //
           cardPanel.add(new JButton("",help2)); 
           cardPanel.add(new JButton("",help3));
           cardPanel.add(new JButton("",help4));
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==nextbutton){ 
               card.next(cardPanel); 
               new  music("music/change.wav");          //换枪的声音
   			music.ac.play();
        }
       if (e.getSource()==preButton){
               card.previous(cardPanel);
               new  music("music/change.wav");          //换枪的声音
   			music.ac.play();
       }
    }
 }