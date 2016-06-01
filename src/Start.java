import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Start extends JPanel  implements ActionListener {
	static JFrame app;
	static JFrame ap;
	public ImageIcon background,began1,began2,quit,help;
	private JPanel imagePanel;
	private JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static int mu=0;
	
	public Start()
	{
		app=new JFrame("小小枪战1.0");
		app.setSize(1000,630);
		app.setLocationRelativeTo(this);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
		
		
		Container c=app.getContentPane();
		c.setLayout(null);
		
		
		
		began1 = new ImageIcon(Start.class.getResource("began1.png"));
		began2 = new ImageIcon(Start.class.getResource("began2.png"));
		quit= new ImageIcon(Start.class.getResource("quit.png"));
		help= new ImageIcon(Start.class.getResource("help.png"));
		background = new ImageIcon(Start.class.getResource("back.jpg"));
		
		jb1=new JButton("",began1);
		jb1.setBounds(250,540,190,55);
		jb1.setContentAreaFilled(false);
		c.add(jb1);
		jb1.addActionListener(this);
		
		jb2=new JButton("",began2);		
		jb2.setBounds(550,540,190,55);
		jb2.setContentAreaFilled(false);
		c.add(jb2);
		jb2.addActionListener(this);
		
		ImageIcon labak = new ImageIcon(Start.class.getResource("labak.png"));
		ImageIcon labag = new ImageIcon(Start.class.getResource("labag.png"));
		jb3=new JButton("",labak);         //音乐按钮
		jb3.setBounds(20,530,65,60);
		jb3.setContentAreaFilled(false);
		jb3.setEnabled(true);
		jb3.setBorder(null);
		c.add(jb3);
		jb3.addActionListener(this);
		
		jb4=new JButton("",labag);         //音乐按钮
		jb4.setBounds(90,530,65,60);
		jb4.setContentAreaFilled(false);
		jb4.setBorder(null);
		c.add(jb4);
		jb4.addActionListener(this);
		
		jb5=new JButton("",quit);         //退出按钮
		jb5.setBounds(900,525,70,65);
		jb5.setContentAreaFilled(false);
		jb5.setBorder(null);
		c.add(jb5);
		jb5.addActionListener(this);
		
		jb6=new JButton("",help);         //help按钮
		jb6.setBounds(820,525,70,65);
		jb6.setContentAreaFilled(false);
		jb6.setBorder(null);
		c.add(jb6);
		jb6.addActionListener(this);
		
		JLabel label = new JLabel(background);     // 把背景图片显示在一个标签里面
		label.setBounds(-20, -15,1030,635);
		imagePanel = (JPanel) app.getContentPane();  // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
		imagePanel.setOpaque(false);
		app.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));   //将背景标签添加到app的LayeredPane面板里
		app.setResizable(false);
		
		
		
		app.addFocusListener(new FocusListener(){             
				public void focusGained(FocusEvent e){
					new  music("music/tl.wav");
					music.ac.loop(); 
					
				}
				public void focusLost(FocusEvent e){
					music.ac.stop();
				}
			});	
		}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==jb1){         //挑战模式
			app.dispose();
			music.ac.stop();
			
			new  music("music/getGun.wav");          //换枪的声音
			music.ac.play();
			
			Move.aa1=5;        //每new一个窗口回复双方血，炸弹，弹药
			Move.aa8=5;
			Move.bb1=3;
			Move.bb8=3;
			Move.cc1=6;
			Move.cc8=6;
			Move.cc12=8;
			Move.cc82=8;
			Move.cc13=0;
			Move.cc83=0;
			Move.over1=0;
			Move.over8=0;
			Move.ccb1=0;
			Move.ccb8=0;
			
			story.aa1=5;        //每new一个窗口回复双方血，炸弹，弹药
			story.aa8=5;
			story.bb1=3;
			story.bb8=3;
			story.cc1=6;
			story.cc8=6;
			story.cc12=8;
			story.cc82=8;
			story.cc13=0;
			story.cc83=0;
			story.over1=0;
			story.over8=0;
			story.ccb1=0;
			story.ccb8=0;
			
			ap=new JFrame("小小枪战1.0");
			Move t=new Move();
			ap.add(t);
			ap.setSize(1100,700);
			ap.setLocationRelativeTo(this);
			ap.setVisible(true);
			ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ap.setResizable(false);
			t.action();
		}
		if(e.getSource()==jb2){                   //故事模式
			app.dispose();
			music.ac.stop();
			
			new  music("music/getGun.wav");          //换枪的声音
			music.ac.play();
			
			story.aa1=5;        //每new一个窗口回复双方血，炸弹，弹药
			story.aa8=5;
			story.bb1=3;
			story.bb8=3;
			story.cc1=6;
			story.cc8=6;
			story.cc12=8;
			story.cc82=8;
			story.cc13=0;
			story.cc83=0;
			story.over1=0;
			story.over8=0;
			story.ccb1=0;
			story.ccb8=0;
			
			Move.aa1=5;        //每new一个窗口回复双方血，炸弹，弹药
			Move.aa8=5;
			Move.bb1=3;
			Move.bb8=3;
			Move.cc1=6;
			Move.cc8=6;
			Move.cc12=8;
			Move.cc82=8;
			Move.cc13=0;
			Move.cc83=0;
			Move.over1=0;
			Move.over8=0;
			Move.ccb1=0;
			Move.ccb8=0;
			
			ap=new JFrame("小小枪战1.0");
			story t=new story();
			ap.add(t);
			ap.setSize(1100,700);
			ap.setLocationRelativeTo(this);
			ap.setVisible(true);
			ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ap.setResizable(false);
			t.action();
		}
		if(e.getSource()==jb3){                   //音乐按钮
				music.ac.stop();
				new  music("music/tl.wav");
				music.ac.loop();
				mu=0;
				
		}
		if(e.getSource()==jb4){                   //音乐
				music.ac.stop();
				mu=1;
				
		}
		if(e.getSource()==jb5){                   //退出游戏
			System.exit(0);
		}
		if(e.getSource()==jb6){                   //帮助
			new help();
			new  music("music/reload.wav");          //换枪的声音
			music.ac.play();
		}
	}
	public static void main(String a[]){
		new Start();
		new  music("music/tl.wav");
		music.ac.loop();
		
	}
}
