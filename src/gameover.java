import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;



public class gameover extends JPanel implements ActionListener{
	static JButton jj;	
	public static BufferedImage xing,over,win;
	static{             //加载图片
		try{
			xing=ImageIO.read(gameover.class.getResource("xing.png"));
			over=ImageIO.read(gameover.class.getResource("over.png"));
			win=ImageIO.read(gameover.class.getResource("win.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public gameover(){
		
		
		
		jj=new JButton("");         //退出按钮
		jj.setContentAreaFilled(false);
		jj.setBorder(null);
		jj.addActionListener(this);

        if(Move.aa8==0||story.aa8==0){
        	new  music("music/ctwin.wav");          //胜利声音
			music.ac.play();
        }
        if(Move.aa1==0||story.aa8==1){
        	new  music("music/terwin.wav");          //胜利声音
			music.ac.play();
        }
	}
	public void paint(Graphics g){
		g.drawImage(over,0,0,636,637,null);
		
		
		Font v1=new Font("",Font.ITALIC,40);   //为什么开始白窗口？
		g.setFont(v1);
		if(Move.aa1==0||Move.aa8==0){
			g.drawString(""+Move.over8,360,250);
			g.drawString(""+Move.over1,520,250);
			g.drawString(""+Move.over1,360,500);
			g.drawString(""+Move.over8,520,500);
		}
		else if(story.aa1==0||story.aa8==0){
			g.drawString(""+story.over8,360,250);
			g.drawString(""+story.over1,520,250);
			g.drawString(""+story.over1,360,500);
			g.drawString(""+story.over8,520,500);
		}
		
		if(Move.aa1>Move.aa8||story.aa1>story.aa8){
			Font v2=new Font("",Font.ITALIC,40);   //为什么开始白窗口？
			g.setColor(Color.red);
			g.setFont(v2);
			g.drawString("CTWIN",170,50);
			if(Move.over1>=3&&Move.over1<=4||story.over1>=3&&story.over1<=4){
				g.drawImage(xing,420,280,60,60,null);
			
			}
			else if(Move.over1>=1&&Move.over1<=2||story.over1>=1&&story.over1<=2){
				g.drawImage(xing,385,280,60,60,null);
				g.drawImage(xing,455,280,60,60,null);
			
			}
			else if(Move.over1==0||story.over1==0){
				g.drawImage(xing,360,270,60,60,null);
				g.drawImage(xing,420,290,60,60,null);
				g.drawImage(xing,480,270,60,60,null);
				
			}
			g.drawImage(win,105,190,100,53,null);
        }
		else if(Move.aa1<Move.aa8||story.aa1<story.aa8){
        	g.setColor(Color.red);
        	g.drawString("TERWIN",160,50);
        	if(Move.over8>=3&&Move.over8<=4||story.over8>=3&&story.over8<=4){
				g.drawImage(xing,420,530,60,60,null);
				
        	}
        	else if(Move.over8>=3&&Move.over8<=4||story.over8>=3&&story.over8<=4){
				g.drawImage(xing,385,530,60,60,null);
				g.drawImage(xing,455,530,60,60,null);
				
			}
        	else if(Move.over8==0||story.over8==0){
				g.drawImage(xing,360,520,60,60,null);
				g.drawImage(xing,420,540,60,60,null);
				g.drawImage(xing,480,520,60,60,null);
				
			}
			g.drawImage(win,98,440,100,53,null);
        }
      
		
	}
	public void actionPerformed(ActionEvent e){
        if (e.getSource()==jj){ 
        	new  music("music/getGun.wav");          //换枪的声音
 			music.ac.play();
            new Start();
            if(Move.aa1==0||Move.aa8==0)
            	Move.appp.dispose();
            else if(story.aa1==0||story.aa8==0)
            	story.appp.dispose();
            if(Start.mu==0){
            	new  music("music/tl.wav");
            	music.ac.loop();
            }
            else if(Start.mu==1){
            	new  music("music/tl.wav");
            	music.ac.loop();
            	music.ac.stop();
            }
           
      }
    }
//	public static void main (String a[]){
//		JFrame appp = new JFrame("小小枪战1.0");
//		gameover g1=new gameover();
//		appp.add(g1);
//    	appp.setSize(637,665); 
//    	appp.setLocationRelativeTo(null);
//    	appp.setResizable(false);
//    	appp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
//    	appp.setVisible(true);
//    	appp.add(gameover.jj);
//	}
}
