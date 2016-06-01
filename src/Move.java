import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;


public class Move extends JPanel{
	/**
	 * 
	 */
	/**
	 * 
	 */
	public static JFrame appp;
	public static BufferedImage stop;
	public static BufferedImage re1,re2,re3,re4,re18,re28,re38,re48;
	public static BufferedImage beijing;
	public static BufferedImage da1,da2,da3,da4,da5,da6,da38,da48,da58,da68;
	public static BufferedImage huo1,huo2;
	public static BufferedImage jump1,jump2,jump18,jump28,jumps1,jumps2,jumps18,jumps28;
	public static BufferedImage xin,bumb,bullet;
	public static BufferedImage yan1,yan2;
	public static BufferedImage boom1,boom2,boom3,boom4;
	public static BufferedImage jiguang1,jiguang2,jiguang3,jiguang4;
	public static BufferedImage hit,hit1,yuan,huoxing,wu,zdk;
	public static BufferedImage jinru,londing;
	public static BufferedImage slei,sxin,sxiang,ssu,stiao,sfang,shuo,entrench,huojian1,huojian2,huojian3,huojian4;
	public static BufferedImage lei1,lei2,lei3,lei4,lei5,lei6;
	public static BufferedImage one,two,three;
	
	private int i=250;		//起始位置
	private int y=-490;		//起始位置
	private  int focu=0;		//焦点
	private int b=0;			//子弹键
	private int a=1;   	//控制人物左右图
	private int j2ump=0;   //控制二连跳
	private int j8ump=0;   //控制二连跳
	private int as=0;  	 //as用来在限定时间内获得一次子弹发射位置
	private int bs=0;        //控制发射子弹间隔
	private int cs=0;		//控制子弹运动的方向
	private int ds=0;		//控制huo
	private int es=0;		//控制发子弹倒退
	private int aUP=0;		//控制上键按键时间
	private int aDOWN=0;		//控制下键按键时间
	private int huan=0;		//换枪
	private int huan3=0;		//换枪限制
	private int ii= 0;	//抢子弹初始位置
	private int yy= 0;	//子弹初始位置
	private int az=0;	//手枪子弹初始位置
	private int bz=0;	//手枪子弹初始位置
	private int cz=0;	//手枪子弹初始位置
	private int dz=0;	//手枪子弹初始位置
	private int ez=0;	//手枪子弹初始位置
	private int fz=0;	//手枪子弹初始位置
	private int gz=0;	//手枪子弹初始位置
	private int hz=0;	//手枪子弹初始位置
	private int azy=0;	//手枪子弹初始位置
	private int bzy=0;	//手枪子弹初始位置
	private int czy=0;	//手枪子弹初始位置
	private int dzy=0;	//手枪子弹初始位置
	private int ezy=0;	//手枪子弹初始位置
	private int fzy=0;	//手枪子弹初始位置
	private int gzy=0;	//手枪子弹初始位置
	private int hzy=0;	//手枪子弹初始位置
	private int aw=0;	//中枪子弹消失
	private int bw=0;	//中枪子弹消失
	private int cw=0;	//中枪子弹消失
	private int dw=0;	//中枪子弹消失
	private int ew=0;	//中枪子弹消失
	private int fw=0;	//中枪子弹消失
	private int gw=0;	//中枪子弹消失
	private int hw=0;	//中枪子弹消失
	private int azu1=0;	      //中枪效果
	private int bzu1=0;	
	private int czu1=0;	
	private int dzu1=0;	
	private int ezu1=0;	
	private int fzu1=0;	
	private int gzu1=0;	
	private int hzu1=0;	
	private int azu2=0;	
	private int bzu2=0;	
	private int czu2=0;	
	private int dzu2=0;	
	private int ezu2=0;	
	private int fzu2=0;	
	private int gzu2=0;	
	private int hzu2=0;	
	
	public static int over1= 0;	//子弹初始位置
	
	private int i8=720;		//起始位置
	private int y8=-490;		//起始位置
	private int b8=0;			//子弹键
	private int a8=0;   	//控制人物左右图
	private int as8=0;  	 //as用来在限定时间内获得一次子弹发射位置
	private int bs8=0;        //控制发射子弹间隔
	private int cs8=0;		//控制子弹运动的方向
	private int ds8=0;		//控制huo
	private int es8=0;		//控制发子弹倒退
	private int aUP8=0;		//控制上键按键时间
	private int aDOWN8=0;		//控制下键按键时间
	private int huan8=0;		//换枪
	private int huan38=0;		//换枪限制
	private int ii8= 0;	//枪子弹初始位置
	private int yy8= 0;	//子弹初始位置
	private int az8=0;	//手枪子弹初始位置
	private int bz8=0;	//手枪子弹初始位置
	private int cz8=0;	//手枪子弹初始位置
	private int dz8=0;	//手枪子弹初始位置
	private int ez8=0;	//手枪子弹初始位置
	private int fz8=0;	//手枪子弹初始位置
	private int gz8=0;	//手枪子弹初始位置
	private int hz8=0;	//手枪子弹初始位置
	private int azy8=0;	//手枪子弹初始位置
	private int bzy8=0;	//手枪子弹初始位置
	private int czy8=0;	//手枪子弹初始位置
	private int dzy8=0;	//手枪子弹初始位置
	private int ezy8=0;	//手枪子弹初始位置
	private int fzy8=0;	//手枪子弹初始位置
	private int gzy8=0;	//手枪子弹初始位置
	private int hzy8=0;	//手枪子弹初始位置
	private int aw8=0;	//中枪子弹消失
	private int bw8=0;	//中枪子弹消失
	private int cw8=0;	//中枪子弹消失
	private int dw8=0;	//中枪子弹消失
	private int ew8=0;	//中枪子弹消失
	private int fw8=0;	//中枪子弹消失
	private int gw8=0;	//中枪子弹消失
	private int hw8=0;	//中枪子弹消失
	private int azu18=0;	      //中枪效果
	private int bzu18=0;	
	private int czu18=0;	
	private int dzu18=0;	
	private int ezu18=0;	
	private int fzu18=0;	
	private int gzu18=0;	
	private int hzu18=0;	
	private int azu28=0;	
	private int bzu28=0;	
	private int czu28=0;	
	private int dzu28=0;	
	private int ezu28=0;	
	private int fzu28=0;	
	private int gzu28=0;	
	private int hzu28=0;	
	
	public static int over8= 0;	
	
	private int nu,song;     //随机new数
	private int cccc=0;
	public static int aa1=5;        //双方血，炸弹，弹药
	public  static int aa8=5;
	public static  int bb1=3;
	public static int bb8=3;
	public static int cc1=6;
	public static int cc12=8;
	public static int cca1=0;         //用于手枪上子弹时间限制
	public static int ccb1=0;            //用于手枪发射数量限制
	public static int cc13=0;
	public static int cc8=6;
	public static int cc82=8;
	public static int cca8=0;         //用于手枪上子弹时间限制
	public static int ccb8=0;            //用于手枪发射数量限制
	public static int cc83=0;
	
	private int zzz=0;          //控制sm音乐
	private int zzzz=0;
	
	private int uu1=0;      //中枪后退控制
	private int uu2=0;
	private int uu3=0;
	private int uui=0;    //中枪效果
	private int uuy=0;
	private int uu4=0;
	
	private int uu18=0;        //中枪后退控制
	private int uu28=0;
	private int uu38=0;
	private int uui8=0;    //中枪效果
	private int uuy8=0;
	private int uu48=0;
	
	private int usm=0;    //总线程计算
	
	private int left=0;        //控制按下左右移动
	private int left8=0;
	private int le=0;
	private int le1=0;
	private int ri8=0;
	private int ri=0;
	private int right=0;
	private int right8=0;
	
	private int leia=0;       //1人雷
	private int leib=0;
	private int leii=0;
	private int leiy=0;
	private int leiii=0;
	private int leiyy=0;
	private int bombta=0;
	private int bombtb=0;
	
	private int zdkx=0;     //1人子弹壳
	private int zdky=0;
	
	private int leia8=0;       //2人雷
	private int leib8=0;
	private int leii8=0;
	private int leiy8=0;
	private int leiii8=0;
	private int leiyy8=0;
	private int bombta8=0;
	private int bombtb8=0;
	
	private int zdkx8=0;     //2人子弹壳
	private int zdky8=0;
	
	private int buji=0;
	private int songx=0;
	private int songy=-100;
	private int bujitime=0;      //补给箱自动消失时间
	
	private int bujit=0;     
	private int speed=0;   
	private int speed8=0;   
	
	private int tiao=0;   
	private int tiao8=0;   
	
	private int protect=1;
	private int protect8=1;
	
	private int rocket=0;
	private int rocketup=0;
	private int rocketup1=0;
	private int rocketup81=0;
	private int rocketup8=0;
	private int rocket8=0;
	
	private int stime=0;          //吃道具后提示
	private int stimes=0;
	private int stimex=9999;
	private int stimey=9999;
	static{             //加载图片
		try{
			re1=ImageIO.read(Move.class.getResource("re1.png"));
			re2=ImageIO.read(Move.class.getResource("re2.png"));
			re3=ImageIO.read(Move.class.getResource("re3.png"));
			re4=ImageIO.read(Move.class.getResource("re4.png"));
			huo1=ImageIO.read(Move.class.getResource("huo1.png"));
			huo2=ImageIO.read(Move.class.getResource("huo2.png"));
			stop=ImageIO.read(Move.class.getResource("stop.jpg"));
			beijing=ImageIO.read(Move.class.getResource("beijing.png"));
			da1=ImageIO.read(Move.class.getResource("da1.png"));
			da2=ImageIO.read(Move.class.getResource("da2.png"));
			da3=ImageIO.read(Move.class.getResource("da3.png"));
			da4=ImageIO.read(Move.class.getResource("da4.png"));
			da5=ImageIO.read(Move.class.getResource("da5.png"));
			da6=ImageIO.read(Move.class.getResource("da6.png"));
			da58=ImageIO.read(Move.class.getResource("da58.png"));
			da68=ImageIO.read(Move.class.getResource("da68.png"));
			jump1=ImageIO.read(Move.class.getResource("jump1.png"));
			jump2=ImageIO.read(Move.class.getResource("jump2.png"));
			xin=ImageIO.read(Move.class.getResource("xin.png"));
			bumb=ImageIO.read(Move.class.getResource("bumb.png"));
			bullet=ImageIO.read(Move.class.getResource("bullet.png"));
			yan1=ImageIO.read(Move.class.getResource("yan1.png"));
			yan2=ImageIO.read(Move.class.getResource("yan2.png"));
			boom1=ImageIO.read(Move.class.getResource("boom1.png"));
			boom2=ImageIO.read(Move.class.getResource("boom2.png"));
			boom3=ImageIO.read(Move.class.getResource("boom3.png"));
			boom4=ImageIO.read(Move.class.getResource("boom4.png"));
			jiguang1=ImageIO.read(Move.class.getResource("jiguang1.png"));
			jiguang2=ImageIO.read(Move.class.getResource("jiguang2.png"));
			jiguang3=ImageIO.read(Move.class.getResource("jiguang3.png"));
			jiguang4=ImageIO.read(Move.class.getResource("jiguang4.png"));
			hit=ImageIO.read(Move.class.getResource("hit.png"));
			hit1=ImageIO.read(Move.class.getResource("hit1.png"));
			huoxing=ImageIO.read(Move.class.getResource("huoxing.png"));
			wu=ImageIO.read(Move.class.getResource("wu.png"));
			zdk=ImageIO.read(Move.class.getResource("zdk.png"));
			jinru=ImageIO.read(Move.class.getResource("jinru.jpg"));
			re18=ImageIO.read(Move.class.getResource("re18.png"));
			re28=ImageIO.read(Move.class.getResource("re28.png"));
			re38=ImageIO.read(Move.class.getResource("re38.png"));
			re48=ImageIO.read(Move.class.getResource("re48.png"));
			da38=ImageIO.read(Move.class.getResource("da38.png"));
			da48=ImageIO.read(Move.class.getResource("da48.png"));
			jump18=ImageIO.read(Move.class.getResource("jump18.png"));
			jump28=ImageIO.read(Move.class.getResource("jump28.png"));
			jumps1=ImageIO.read(Move.class.getResource("jumps1.png"));
			jumps2=ImageIO.read(Move.class.getResource("jumps2.png"));
			jumps18=ImageIO.read(Move.class.getResource("jumps18.png"));
			jumps28=ImageIO.read(Move.class.getResource("jumps28.png"));
			yuan=ImageIO.read(Move.class.getResource("yuan.png"));
			
			lei1=ImageIO.read(Move.class.getResource("lei1.png"));
			lei2=ImageIO.read(Move.class.getResource("lei2.png"));
			lei3=ImageIO.read(Move.class.getResource("lei3.png"));
			lei4=ImageIO.read(Move.class.getResource("lei4.png"));
			lei5=ImageIO.read(Move.class.getResource("lei5.png"));
			lei6=ImageIO.read(Move.class.getResource("lei6.png"));
			
			londing=ImageIO.read(Move.class.getResource("londing.png"));
			slei=ImageIO.read(Move.class.getResource("slei.png"));
			sxin=ImageIO.read(Move.class.getResource("sxin.png"));
			sxiang=ImageIO.read(Move.class.getResource("sxiang.png"));
			ssu=ImageIO.read(Move.class.getResource("ssu.png"));
			stiao=ImageIO.read(Move.class.getResource("stiao.png"));
			sfang=ImageIO.read(Move.class.getResource("sfang.png"));
			shuo=ImageIO.read(Move.class.getResource("shuo.png"));
			entrench=ImageIO.read(Move.class.getResource("entrench.png"));
			huojian1=ImageIO.read(Move.class.getResource("huojian1.png"));
			huojian2=ImageIO.read(Move.class.getResource("huojian2.png"));
			huojian3=ImageIO.read(Move.class.getResource("huojian3.png"));
			huojian4=ImageIO.read(Move.class.getResource("huojian4.png"));
			
			one=ImageIO.read(Move.class.getResource("one.png"));
			two=ImageIO.read(Move.class.getResource("two.png"));
			three=ImageIO.read(Move.class.getResource("three.png"));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Move(){
		new myThread().start();
		addFocusListener(new FocusListener(){            
			public void focusGained(FocusEvent e){
				 focu=1;                    //处理焦点，以控制鼠标离开游戏时暂停游戏
				 if(Start.mu==0){     //处理焦点，以控制鼠标离开游戏时暂停音乐
					 	Random Number=new Random();
					 	nu=Number.nextInt(3);
					 	if(nu==0){
					 		new music2("music/zhu1.wav");
					 		music2.ad.loop();
					 	}
					 	if(nu==1){
					 		new music2("music/zhu2.wav");
					 		music2.ad.loop();
					 	}
					 	if(nu==2){
					 		new music2("music/zhu3.wav");
					 		music2.ad.loop();
					 	}
				 }
				 if(Start.mu==1){
					 if(zzz==0)
						 music.ac.stop();
					 if(zzz!=0)
						 music2.ad.stop();
					 zzz++;
				 }
			}
			public void focusLost(FocusEvent e){
				 focu=2;
				 music2.ad.stop();
				 left=0;//控制按下左右移动
				 right=0;
				 le=le1=0;
				 left8=0;//控制按下左右移动
				 right8=0;
				 ri=ri8=0;
			}
		});
	}


	public void paint(Graphics g)
	 {
		if(focu==1){
			usm++;
			if(y<-10)         //防止一直上跳
				y+=9;
			if(y8<-10)
				y8+=9;
	   		if(tiao!=0){          //吃到跳跃道具 
	   			tiao++;
	   			if(tiao==1500)
	   				tiao=0;
	   		}
	   		if(tiao8!=0){          //吃到跳跃道具 
	   			tiao8++;
	   			if(tiao8==1500)
	   				tiao8=0;
	   		}
			
			if(left==1){     //移动速度
				i-=2;
				if(speed!=0){
					i-=1;
					speed++;
					if(speed==1500)
						speed=0;
				}
			}
			if(right==1){
				i+=2;
				if(speed!=0){
					i+=1;
					speed++;
					if(speed==1500)
						speed=0;
				}
			}
			if(left8==1){
				i8-=2;
				if(speed8!=0){
					i8-=1;
					speed8++;
					if(speed8==1500)
						speed8=0;
				}
			}
			if(right8==1){
				i8+=2;
				if(speed8!=0){
					i8+=1;
					speed8++;
					if(speed8==1500)
						speed8=0;
				}
			}
			
			if(cca1>=1){             //机枪上子弹时间间隔
				cca1++;
				if(cca1==400&&cc12==0){
					cc12=8;
					ccb1=0;
					cca1=0;
				}
			}
			if(cca8>=1){
				cca8++;
				if(cca8==400&&cc82==0){
					cc82=8;
					ccb8=0;
					cca8=0;
				}
			}
			
			
			if(usm<=120){        //话进入界面
				g.drawImage(jinru,0,0,1400,700,null);
				g.drawImage(londing,870,620,191,32,null);
			}
			
			if(usm>120){
				g.drawImage(beijing,0,-5,1100,700,null);      //首先画
				
				
				if(usm>230&&usm<330){        //倒计时
					g.drawImage(three,480,30,90,180,null);
					if(usm==240){
						new  music("music/Count3.wav");
						music.ac.play();
					}
				}
				if(usm>380&&usm<480){
					g.drawImage(two,450,30,150,210,null);
					if(usm==390){
						new  music("music/Count2.wav");
						music.ac.play();
					}
				}
				if(usm>530&&usm<630){
					g.drawImage(one,500,45,70,160,null);
					if(usm==540){
						new  music("music/Count1.wav");
						music.ac.play();
					}
				}
				
				
				if(buji==0){                             //补给
					Random Num=new Random();
					song=Num.nextInt(12000)+1;
					if(song==1||song==2||song==3||song==4||song==5||song==6||song==7){
						Random N=new Random();           //横坐标
						songx=N.nextInt(750)+100;
						buji=1;
					}
				}
			 	if(song==1){
			 		
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)          //画补给线随机落的台阶
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(bujitime<1200)
			 			g.drawImage(slei,songx,songy+20,null);
			 		if(bujitime>=1200){
		 				buji=0;
			 			song=999999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==2){
			 		
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(sxin,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==3){
			 		
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(sxiang,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==4){
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(ssu,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==5){
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(stiao,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==6){
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(sfang,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	else if(song==7){
			 		songy+=3;
			 		if(songx%10==0||songx%10==1)
			 			if(songy==158){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==2||songx%10==3)
			 			if(songy==248){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==4||songx%10==5)
			 			if(songy==338){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==6||songx%10==7)
			 			if(songy==428){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
			 		if(songx%10==8||songx%10==9)
			 			if(songy==518){
			 				songy-=3;
			 				bujit=1;
			 				bujitime++;
			 			}
		 			if(bujitime<1200)
		 				g.drawImage(shuo,songx,songy+20,null);
		 			if(bujitime>=1200){
		 				buji=0;
			 			song=9999;
			 			songy=-100;
			 			bujitime=0;
		 			}
			 	}
			 	
			 	if(songx-50<i&&songx+50>i&&songy-50<y&&songy+50>y&&buji==1&&bujit==1){
		 				if(song==1){
		 					bb1++;
		 				}
		 				if(song==2){
		 					aa1++;
		 				}
		 				if(song==3){
		 					cc1=6;
		 					cc12=8;
		 					ccb1=0;
		 					cc13=0;
		 				}
		 				if(song==4){
		 					speed=1;
		 				}
		 				if(song==5){
		 					tiao=1;
		 				}
		 				if(song==6){
		 					protect=1;
		 				}
		 				if(song==7){
		 					rocket=1;
		 				}
		 				stime=1;
		 				stimes=song;
		 				new  music("music/getd.wav");          //吃道具的声音
	 					music.ac.play();
		 				buji=0;
		 				bujit=0;
		 				song=999999;
		 				stimex=songx;
		 				stimey=songy;
		 				songy=-100;
		 				cc13=0;
		 		}
			 
		 		if(songx-50<i8&&songx+50>i8&&songy-50<y8&&songy+50>y8&&buji==1&&bujit==1){
		 				if(song==1)
		 					bb8++;
		 				if(song==2)
		 					aa8++;
		 				if(song==3){
		 					cc8=6;
		 					cc82=8;
		 					cc83=0;
		 					ccb8=0;
		 				}
		 				if(song==4){
		 					speed8=1;
		 				}
		 				if(song==5){
		 					tiao8=1;
		 				}
		 				if(song==6){
		 					protect8=1;
		 				}
		 				if(song==7){
		 					rocket8=1;
		 				}
		 				stime=1;
		 				stimes=song;
		 				new  music("music/getd.wav");          //吃道具的声音
	 					music.ac.play();
		 				bujit=0;
		 				buji=0;
		 				song=999999;
		 				stimex=songx;
		 				stimey=songy;
		 				songy=-100;
		 		}
		 		
		 		if(stime!=0){           //补给提示
		 			stime++;
		 			Font vv=new Font("",Font.BOLD,15);  
					g.setFont(vv);
					g.setColor(Color.black);
		 			if(stimes==1)
		 				g.drawString("手雷",stimex,stimey);
		 			else if(stimes==2)
		 				g.drawString("生命",stimex,stimey);
		 			else if(stimes==3){
		 				g.drawString("弹药",stimex,stimey);
	 				}
		 			else if(stimes==4){
		 				g.drawString("加速",stimex,stimey);
	 				}
		 			else if(stimes==5){
		 				g.drawString("超级跳跃",stimex,stimey);
	 				}
		 			else if(stimes==6){
		 				g.drawString("防护罩",stimex,stimey);
	 				}
		 			else if(stimes==7){
		 				g.drawString("火箭",stimex,stimey);
	 				}
		 			if(stime>200)
		 				stime=0;
		 		}
		 		
		 		
		 		
		 		if(protect!=0){                                   //画防护罩
		 			protect++;
					g.drawImage(entrench,i-27,y-20,130,130,null);
					if(protect==1500)
						protect=0;
				}
				if(protect8!=0){
					protect8++;
					g.drawImage(entrench,i8-27,y8-20,130,130,null);
					if(protect8==1500)
						protect8=0;
				}
				
				if(rocketup1==1){              //画火箭
					rocketup++;
					y-=6;
					if(a==1)
						g.drawImage(huojian3,i,y+60,34,59,null);
					if(a==0)
						g.drawImage(huojian4,i+45,y+60,34,59,null);
					if(rocketup>=2000){
						rocket=0;
						rocketup=0;
						rocketup1=0;
					}
				}
				if(rocketup81==1){
					rocketup8++;
					y8-=6;
					if(a8==1)
						g.drawImage(huojian3,i8,y8+60,34,59,null);
					if(a8==0)
						g.drawImage(huojian4,i8+45,y8+60,34,59,null);
					if(rocketup8>=2000){
						rocket8=0;
						rocketup8=0;
						rocketup81=0;
					}
				}
				if(a==1&&rocket==1)            
					g.drawImage(huojian1,i,y+10,34,71,null);
				if(a==0&&rocket==1)
					g.drawImage(huojian2,i+45,y+10,34,71,null);
				if(a8==1&&rocket8==1)
					g.drawImage(huojian1,i8,y8+10,34,71,null);
				if(a8==0&&rocket8==1)
					g.drawImage(huojian2,i8+45,y8+10,34,71,null);
				
				
				if(aa1!=1)                           //画心，炸弹，子弹数量
					g.drawImage(xin,20,15,null);
				if(aa1==1&&usm%2==0)
					g.drawImage(xin,20,15,null);
				if(aa8==1&&usm%2==0)
					g.drawImage(xin,830,15,null);
				if(aa8!=1)
					g.drawImage(xin,830,15,null);
				g.drawImage(bumb,100,15,null);
				g.drawImage(bumb,910,15,null);
				g.drawImage(bullet,180,15,null);
				g.drawImage(bullet,990,15,null);
			
				Font v1=new Font("",Font.ITALIC,30);   //为什么开始白窗口？
				g.setFont(v1);
				g.setColor(Color.yellow);
				g.drawString(""+aa1,70,50);
				g.drawString(""+aa8,880,50);
				g.drawString(""+bb1,150,50);
				g.drawString(""+bb8,960,50);
				if(huan%2==0)
					g.drawString(""+cc1,230,50);
				if(huan%2==1)
					g.drawString(""+cc12,230,50);
				if(huan8%2==0)
					g.drawString(""+cc8,1040,50);
				if(huan8%2==1)
					g.drawString(""+cc82,1040,50);
			
				Font v2=new Font("",Font.CENTER_BASELINE,20);   //为什么开始白窗口？
				g.setFont(v2);
				g.setColor(Color.RED);
	//人物1	
				
			
	
			
			if(i>0&&i<85||i>880&&i<1000)
				y+=3;
			y+=3;        //开始一直自动下落
			if(i<=0)               //控制人物不出边界
				i+=8;
			if(i>=1000)
				i-=8;
			if(y==140){
				if(i>=160&&i<=440||i>=540&&i<=810)       //处理在台阶上不下落，不在台阶上自动下落
					y-=3;
				else{
					y+=3;
					if(rocketup1==1)
						y-=3;
				}
			}
			
			if(y==230){                     //处理在台阶上不下落，不在台阶上自动下落
				if(i>=85&&i<=880)
					y-=3;
				else{
					y+=3;
					if(rocketup1==1)
						y-=3;
				}
			}
			
			
			if(y==320){                       //处理在台阶上不下落，不在台阶上自动下落
				if(i>=310&&i<=670)
					y-=3;
				else{
					y+=3;
					if(rocketup1==1)
						y-=3;
				}
			}
			
			if(y==410){                              //处理在台阶上不下落，不在台阶上自动下落
				if(i>=95&&i<=880)
					y-=3;
				else{
					y+=3;
					if(rocketup1==1)
						y-=3;
				}
			}
			
			if(y==500){                           //处理在台阶上不下落，不在台阶上自动下落
				if(i>=160&&i<=430||i>=550&&i<=810)
					y-=3;
				else{
					y+=3;
					if(rocketup1==1)
						y-=3;
				}
			}
			if(y>=750){                           //处理每次人物死亡
				if(aa1>=1){
					if(aa1>1){
						new  music("music/dead1.wav");          //死亡声音
						music.ac.play();
					}
					aa1--;
					over1++;
					bb1=3;
					cc1=6;
					cc12=8;
					ccb1=0;
					i=250;
					y=-2890;
					left=0;
					right=0;
					le=le1=0;
					a=1;
					huan=0;
					cc13=0;
					bombta8=0;
					bombtb8=0;
					speed=0;
					tiao=0;
					protect=1;
					rocket=0;
					rocketup=0;
					rocketup1=0;
					yy=99999;
				}
				if(aa1==0){
					//prepare.ap.setVisible(false);
					
					Start.ap.dispose();               
					appp = new JFrame("小小枪战1.0");
					gameover g1=new gameover();
					appp.add(g1);
					appp.setSize(637,665);
			    	appp.setLocationRelativeTo(null);
			    	appp.setResizable(false);
			    	appp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			    	appp.setVisible(true);
			    	appp.add(gameover.jj);
				}
					
			}
			
			
			if(aUP>0&&aUP<=100){          //跳跃
				if(aUP<=34){
					aUP++;
			   		y-=6;
			   		if(tiao!=0)
			   			y-=3;
				}
				else
					aUP++;
				if(aUP==100)
					j2ump=0;
			}
			
			
			if(aDOWN>0&&aDOWN<=40){          //下落
				aDOWN++;
			}
			
			
			if(leia>0&&leia<=200){        //左雷
				if(leia==1){
					leii=i;
					leiy=y;
					leii-=10;
				}
				if(leia>0&&leia<45){
					leii-=3;
					leiy-=1;
				}
				if(leia>=45&&leia<=160){
					leii-=3;
					leiy+=1;
				}
				if(leiy==170&&leia>80){
					if(leii>=160&&leii<=440||leii>=540&&leii<=810){
						leii+=1;
						leiy-=1;
					}	
				}
				if(leiy==260&&leia>80){                     
					if(leii>=85&&leii<=880){
						leii+=1;
						leiy-=1;
					}
				}
				if(leiy==350&&leia>80){                       
					if(leii>=310&&leii<=670){
						leii+=1;
						leiy-=1;
					}				
				}				
				if(leiy==440&&leia>80){                              
					if(leii>=95&&leii<=880){
						leii+=1;
						leiy-=1;
					}					
				}	
				if(leiy==530&&leia>80){                           
					if(leii>=160&&leii<=430||leii>=550&&leii<=810){
						leii+=1;
						leiy-=1;
					}	
				}
				if(leia>0&&leia<20)
					g.drawImage(lei1,leii,leiy,null);
				if(leia>=20&&leia<40)
					g.drawImage(lei2,leii,leiy,null);
				if(leia>=40&&leia<60)
					g.drawImage(lei3,leii,leiy,null);
				if(leia>=60&&leia<80)
					g.drawImage(lei4,leii,leiy,null);
				if(leia>=80&&leia<100)
					g.drawImage(lei5,leii,leiy,null);
				if(leia>=100&&leia<120)
					g.drawImage(lei6,leii,leiy,null);
				if(leia>=120&&leia<140)
					g.drawImage(lei1,leii,leiy,null);
				if(leia>=140&&leia<160)
					g.drawImage(lei2,leii,leiy,null);						
												
				if(leia==160){
					new  music("music/bomb.wav");          //雷爆炸的声音
					 music.ac.play();
				}
				if(leia>160&&leia<170)
					g.drawImage(boom1,leii-40,leiy,null);
				if(leia>=170&&leia<180)
					g.drawImage(boom2,leii-50,leiy,null);
				if(leia>=180&&leia<190){
					g.drawImage(boom3,leii-60,leiy,null);
					g.drawImage(yuan,leii-70,leiy-55,null);
					g.drawImage(huoxing,leii-100,leiy+70,null);
					g.drawImage(huoxing,leii+20,leiy+20,null);
					g.drawImage(huoxing,leii+80,leiy-90,null);
					g.drawImage(huoxing,leii+52,leiy-55,null);
					g.drawImage(huoxing,leii-11,leiy+90,null);
					g.drawImage(wu,leii-80,leiy+50,null);
					g.drawImage(wu,leii+88,leiy+20,null);
					g.drawImage(wu,leii+55,leiy-90,null);
				}
				if(leia>=190&&leia<200){
					g.drawImage(boom4,leii-70,leiy,null);
					g.drawImage(yuan,leii-70,leiy-55,null);
					g.drawImage(huoxing,leii-70,leiy+60,null);
					g.drawImage(huoxing,leii-60,leiy-55,null);
					g.drawImage(huoxing,leii+50,leiy+90,null);
					g.drawImage(huoxing,leii+69,leiy-75,null);
					g.drawImage(huoxing,leii+90,leiy+85,null);
					g.drawImage(wu,leii-10,leiy+100,null);
					g.drawImage(wu,leii+71,leiy+80,null);
					g.drawImage(wu,leii-55,leiy-70,null);
				}
				
				leia++;
				if(leii-200<i8&&leii+200>i8&&leiy-200<y8&&leiy+200>y8&&leia==200){
					bombta=1;	
					leia=0;
				}
				if(leia==200)
					leia=0;
			}
			if(bombta>0&&bombta<=100){
				if(leii>i8){
					i8-=5;
					if(protect8!=0)                        //有防护道具时
						i8+=3;
				}
				if(leii<i8){
					i8+=5;
					if(protect8!=0)
						i8-=3;
				}
				if(leiy>y8&&bombta<50){
					y8-=6;
					if(protect8!=0)
						y8+=3;
					if(leii-100<i8&&leii+100>i8){
						y8-=9;
						if(protect8!=0)
							y8+=6;
					}
				}
				bombta++;
				if(bombta==100)
					bombta=0;
				
			}
			
			
			
			if(leib>0&&leib<=200){             //右雷
				if(leib==1){
					leiii=i;
					leiyy=y;
					leii+=30;
				}
				if(leib>0&&leib<45){
					leiii+=3;
					leiyy-=1;
				}
				if(leib>=45&&leib<=160){
					leiii+=3;
					leiyy+=1;
				}
				if(leiyy==170&&leib>80){
					if(leiii>=160&&leiii<=440||leiii>=540&&leiii<=810){
						leiii+=1;
						leiyy-=1;
					}	
				}
				if(leiyy==260&&leib>80){                     
					if(leiii>=85&&leiii<=880){
						leiii+=1;
						leiyy-=1;
					}
				}
				if(leiyy==350&&leib>80){                       
					if(leii>=310&&leii<=670){
						leiii+=1;
						leiyy-=1;
					}				
				}				
				if(leiyy==440&&leib>80){                              
					if(leiii>=95&&leiii<=880){
						leiii+=1;
						leiyy-=1;
					}					
				}	
				if(leiyy==530&&leib>80){                           
					if(leiii>=160&&leiii<=430||leiii>=550&&leiii<=810){
						leiii+=1;
						leiyy-=1;
					}	
				}
				
				if(leib>0&&leib<20)
					g.drawImage(lei1,leiii+30,leiyy,null);
				if(leib>=20&&leib<40)
					g.drawImage(lei2,leiii+30,leiyy,null);
				if(leib>=40&&leib<60)
					g.drawImage(lei3,leiii+30,leiyy,null);
				if(leib>=60&&leib<80)
					g.drawImage(lei4,leiii+30,leiyy,null);
				if(leib>=80&&leib<100)
					g.drawImage(lei5,leiii+30,leiyy,null);
				if(leib>=100&&leib<120)
					g.drawImage(lei6,leiii+30,leiyy,null);
				if(leib>=120&&leib<140)
					g.drawImage(lei1,leiii+30,leiyy,null);
				if(leib>=140&&leib<160)
					g.drawImage(lei2,leiii+30,leiyy,null);	
				
				if(leib==160){
					new  music("music/bomb.wav");          //雷爆炸的声音
					 music.ac.play();
				}
				if(leib>160&&leib<170)
					g.drawImage(boom1,leiii-40,leiyy,null);
				if(leib>=170&&leib<180)
					g.drawImage(boom2,leiii-50,leiyy,null);
				if(leib>=180&&leib<190){
					g.drawImage(boom3,leiii-60,leiyy,null);
					g.drawImage(yuan,leiii-70,leiyy-55,null);
					g.drawImage(huoxing,leiii-100,leiyy+70,null);
					g.drawImage(huoxing,leiii+20,leiyy+20,null);
					g.drawImage(huoxing,leiii+80,leiyy-90,null);
					g.drawImage(huoxing,leiii+52,leiyy-55,null);
					g.drawImage(huoxing,leiii-11,leiyy+90,null);
					g.drawImage(wu,leiii-80,leiyy+50,null);
					g.drawImage(wu,leiii+88,leiyy+20,null);
					g.drawImage(wu,leiii+55,leiyy-90,null);
				}
				if(leib>=190&&leib<200){
					g.drawImage(boom4,leiii-70,leiyy,null);
					g.drawImage(yuan,leiii-70,leiyy-55,null);
					g.drawImage(huoxing,leiii-70,leiyy+60,null);
					g.drawImage(huoxing,leiii-60,leiyy-55,null);
					g.drawImage(huoxing,leiii+50,leiyy+90,null);
					g.drawImage(huoxing,leiii+69,leiyy-75,null);
					g.drawImage(huoxing,leiii+90,leiyy+85,null);
					g.drawImage(wu,leiii-10,leiyy+100,null);
					g.drawImage(wu,leiii+71,leiyy+80,null);
					g.drawImage(wu,leiii-55,leiyy-70,null);
				}
				leib++;
				if(leiii-200<i8&&leiii+200>i8&&leiyy-200<y8&&leiyy+200>y8&&leib==200){
					bombtb=1;	
					leib=0;
				}
				if(leib==200)
					leib=0;
			}
			if(bombtb>0&&bombtb<=100){
				if(leiii>i8){
					i8-=5;
					if(protect8!=0)
						i8+=3;
				}
				if(leiii<i8){
					i8+=5;
					if(protect8!=0)
						i8-=3;
				}
				if(leiyy>y8&&bombtb<50){
					y8-=6;
					if(protect8!=0)
						y8+=3;
					if(leiii-100<i8&&leiii+100>i8){
						y8-=9;
						if(protect8!=0)
							y8+=6;
					}
				}
				bombtb++;
				if(bombtb==100)
					bombtb=0;
				
			}
			
			
			if(a==0){
				if(bs>10&&bs<40&&huan%2==0){
					
					g.drawString("反恐精英",i+5,y-15);
					g.drawImage(da4,i-60,y,null);    
					if(es==0){
						i+=60;
						es++;
					}
				}
				else
					if(aUP>=1&&aUP<=38){
						g.drawString("反恐精英",i+5,y-15);
						if(huan%2==0)
							g.drawImage(jump1,i-30,y,null);
						if(huan%2==1)
							g.drawImage(jumps1,i-50,y,null);
					}
					else{
						if(huan%2==0){
							g.drawString("反恐精英",i+5,y-15);
							g.drawImage(re2,i-60,y,null);       
						}
						if(huan%2==1){
							g.drawString("反恐精英",i+5,y-15);          
							g.drawImage(re4,i-70,y,null);
						}
					}
				if(bs==80&&huan%2==0){
					new  music("music/getGun.wav");          //炮的声音
					music.ac.play();
				}
				if(bs==130){                        
					huan3=0;
				}
			}
			if(a==1){
				if(bs>3&&bs<40&&huan%2==0){
					g.drawString("反恐精英",i+5,y-15);
					g.drawImage(da3,i,y,null);
					if(es==0){
						i-=60;
						es++;
					}
				}
				else
					if(aUP>=1&&aUP<=38){
						g.drawString("反恐精英",i+5,y-15);
						if(huan%2==0)
							g.drawImage(jump2,i-15,y,null);
						if(huan%2==1)
							g.drawImage(jumps2,i,y,null);
					}
					else{
						if(huan%2==0){
							g.drawString("反恐精英",i+5,y-15);
							g.drawImage(re1,i,y,null);
						}
						if(huan%2==1){
							g.drawString("反恐精英",i+5,y-15);
							g.drawImage(re3,i+12,y,null);
						}
					}
				if(bs==80&&huan%2==0){                        
					new  music("music/getGun.wav");          //炮的声音
					music.ac.play();
				}
				if(bs==130){                        
					huan3=0;
				}
			}
			if(b==1){
				if(as==0&&huan%2==0){            //as用来在限定时间内获得一次子弹发射位置
					ii=i;            //获得子弹的发射位置
					yy=y;
					ii-=100;
					yy+=22;
					as++;
					cs=a;
				}
				if(as==0&&huan%2==1){            //as用来在限定时间内获得一次子弹发射位置
					ccb1++;
					i-=100;
					y+=22;
					if(ccb1==1){
						az=i;            //获得子弹的发射位置
						azy=y;
						if(a==0)
							aw=1;
						if(a==1){
							aw=2;
						}
					}
					if(ccb1==2){
						bz=i;            //获得子弹的发射位置
						bzy=y;
						if(a==0)
							bw=1;
						if(a==1)
							bw=2;
					}
					if(ccb1==3){
						cz=i;            //获得子弹的发射位置
						czy=y;
						if(a==0)
							cw=1;
						if(a==1)
							cw=2;
					}
					if(ccb1==4){
						dz=i;            //获得子弹的发射位置
						dzy=y;
						if(a==0)
							dw=1;
						if(a==1)
							dw=2;
					}
					if(ccb1==5){
						ez=i;            //获得子弹的发射位置
						ezy=y;
						if(a==0)
							ew=1;
						if(a==1)
							ew=2;
					}
					if(ccb1==6){
						fz=i;            //获得子弹的发射位置
						fzy=y;
						if(a==0)
							fw=1;
						if(a==1)
							fw=2;
					}
					if(ccb1==7){
						gz=i;            //获得子弹的发射位置
						gzy=y;
						if(a==0)
							gw=1;
						if(a==1)
							gw=2;
					}
					if(ccb1==8){
						hz=i;            //获得子弹的发射位置
						hzy=y;
						if(a==0)
							hw=1;
						if(a==1)
							hw=2;
					}
					i+=100;	
					y-=22;
					as++;
					cs=a;
				}
				

				if(aw==1){
					g.drawImage(da5,az-40,azy+25,null);
					az-=5;
				}
				if(bw==1){
					g.drawImage(da5,bz-40,bzy+25,null);
					bz-=5;
				}	
				if(cw==1){
					g.drawImage(da5,cz-40,czy+25,null);
					cz-=5;
				}
				if(dw==1){
					g.drawImage(da5,dz-40,dzy+25,null);
					dz-=5;
				}
				if(ew==1){
					g.drawImage(da5,ez-40,ezy+25,null);
					ez-=5;
				}
				if(fw==1){
					g.drawImage(da5,fz-40,fzy+25,null);
					fz-=5;
				}
				if(gw==1){
					g.drawImage(da5,gz-40,gzy+25,null);
					gz-=5;
				}
				if(hw==1){
					g.drawImage(da5,hz-40,hzy+25,null);
					hz-=5;
				}
				if(aw==2){       //
					g.drawImage(da6,az+220,azy+25,null);
					az+=5;
				}
				if(bw==2){
					g.drawImage(da6,bz+220,bzy+25,null);
					bz+=5;
				}	
				if(cw==2){
					g.drawImage(da6,cz+220,czy+25,null);
					cz+=5;
				}
				if(dw==2){
					g.drawImage(da6,dz+220,dzy+25,null);
					dz+=5;
				}
				if(ew==2){
					g.drawImage(da6,ez+220,ezy+25,null);
					ez+=5;
				}
				if(fw==2){
					g.drawImage(da6,fz+220,fzy+25,null);
					fz+=5;
				}
				if(gw==2){
					g.drawImage(da6,gz+220,gzy+25,null);
					gz+=5;
				}
				if(hw==2){
					g.drawImage(da6,hz+220,hzy+25,null);
					hz+=5;
				}
				
				if(aw==2||aw==3||bw==2||bw==3||cw==2||cw==3||dw==2||dw==3||ew==2||ew==3||fw==2||fw==3||gw==2||gw==3||hw==2||hw==3){      //左中枪效果
					if(i8<az+200&&i8>=az+180&&y8<azy&&azy<y8+68||azu1>0&&azu1<60){
						System.out.println("sss");
						aw=3;
						if(azu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
						}
						azu1++;
						if(azu1>=1&&azu1<60){
							g.drawImage(hit,az+150,azy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(azu1==1)
							az=99999;
						if(azu1==59)
							azu1=0;
					}
   				  	if(i8<bz+200&&i8>=bz+180&&y8<bzy&&bzy<y8+68||bzu1>0&&bzu1<60){
   				  		bw=3;
   				  	System.out.println("sdddddddds");
   				  		if(bzu1<60){
   				  			i8+=6;
   				  		if(protect8!=0)
							i8-=4;
   				  		}
   				  		bzu1++;
   				  		if(bzu1>=1&&bzu1<60){
   				  			g.drawImage(hit,bz+150,bzy,null);
   				  			g.drawImage(hit1,i8-40,y8,null);
   				  		}
   				  		if(bzu1==1)
   				  			bz=99999;
   				  		if(bzu1==59)
   				  			bzu1=0;
   				  	}
					if(i8<cz+200&&i8>=cz+180&&y8<czy&&czy<y8+68||czu1>0&&czu1<60){
						System.out.println("sss发的发的发的");
						cw=3;
						if(czu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						czu1++;
						if(czu1>=1&&czu1<60){
							g.drawImage(hit,cz+150,czy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(czu1==1)
							cz=99999;
						if(czu1==59)
							czu1=0;
					}
					if(i8<dz+200&&i8>=dz+180&&y8<dzy&&dzy<y8+68||dzu1>0&&dzu1<60){
						dw=3;
						if(dzu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						dzu1++;
						if(dzu1>=1&&dzu1<60){
							g.drawImage(hit,dz+150,dzy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(dzu1==1)
							dz=99999;
						if(dzu1==59)
							dzu1=0;
					}
					if(i8<ez+200&&i8>=ez+180&&y8<ezy&&ezy<y8+68||ezu1>0&&ezu1<60){
						ew=3;
						if(ezu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						ezu1++;
						if(ezu1>=1&&ezu1<60){
							g.drawImage(hit,ez+150,ezy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(ezu1==1)
							ez=99999;
						if(ezu1==59)
							ezu1=0;
					}
					if(i8<fz+200&&i8>=fz+180&&y8<fzy&&fzy<y8+68||fzu1>0&&fzu1<60){
						fw=3;
						if(fzu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						fzu1++;
						if(fzu1>=1&&fzu1<60){
							g.drawImage(hit,fz+150,fzy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(fzu1==1)
							fz=99999;
						if(fzu1==59)
							fzu1=0;
					}
					if(i8<gz+200&&i8>=gz+180&&y8<gzy&&gzy<y8+68||gzu1>0&&gzu1<60){
						gw=3;
						if(gzu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						gzu1++;
						if(gzu1>=1&&gzu1<60){
							g.drawImage(hit,gz+150,gzy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(gzu1==1)
							gz=99999;
						if(gzu1==59)
							gzu1=0;
					}
					if(i8<hz+200&&i8>=hz+180&&y8<hzy&&hzy<y8+68||hzu1>0&&hzu1<60){
						hw=3;
						if(hzu1<60){
							i8+=6;
							if(protect8!=0)
								i8-=4;
	   				  	}
						hzu1++;
						if(hzu1>=1&&hzu1<60){
							g.drawImage(hit,hz+150,hzy,null);
							g.drawImage(hit1,i8-40,y8,null);
						}
						if(hzu1==1)
							hz=99999;
						if(hzu1==59)
							hzu1=0;
					}
				}
					
				
				
				if(aw==1||aw==4||bw==1||bw==4||cw==1||cw==4||dw==1||dw==4||ew==1||ew==4||fw==1||fw==4||gw==1||gw==4||hw==1||hw==4){             //右中枪效果
					if(i8<az&&i8>=az-20&&y8<azy&&azy<y8+68||azu2>0&&azu2<60){
						aw=4;
						if(azu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						azu2++;
						if(azu2>=1&&azu2<60){
							g.drawImage(hit,az+100,azy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(azu2==1)
							az=99999;
						if(azu2==59)
							azu2=0;
					}
					if(i8<bz&&i8>=bz-20&&y8<bzy&&bzy<y8+68||bzu2>0&&bzu2<60){
						bw=4;
						if(bzu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						bzu2++;
						if(bzu2>=1&&bzu2<60){
							g.drawImage(hit,bz+100,bzy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(bzu2==1)
							bz=99999;
						if(bzu2==59)
							bzu2=0;
					}
					if(i8<cz&&i8>=cz-20&&y8<czy&&czy<y8+68||czu2>0&&czu2<60){
						cw=4;
						if(czu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						czu2++;
						if(czu2>=1&&czu2<60){
							g.drawImage(hit,cz+100,czy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(czu2==1)
							cz=99999;
						if(czu2==59)
							czu2=0;
					}
					if(i8<dz&&i8>=dz-20&&y8<dzy&&dzy<y8+68||dzu2>0&&dzu2<60){
						dw=4;
						if(dzu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						dzu2++;
						if(dzu2>=1&&dzu2<60){
							g.drawImage(hit,dz+100,dzy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(dzu2==1)
							dz=99999;
						if(dzu2==59)
							dzu2=0;
					}
					if(i8<ez&&i8>=ez-20&&y8<ezy&&ezy<y8+68||ezu2>0&&ezu2<60){
						ew=4;
						if(ezu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						ezu2++;
						if(ezu2>=1&&ezu2<60){
							g.drawImage(hit,ez+100,ezy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(ezu2==1)
							ez=99999;
						if(ezu2==59)
							ezu2=0;
					}
					if(i8<fz&&i8>=fz-20&&y8<fzy&&fzy<y8+68||fzu2>0&&fzu2<60){
						fw=4;
						if(fzu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						fzu2++;
						if(fzu2>=1&&fzu2<60){
							g.drawImage(hit,fz+100,fzy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(fzu2==1)
							fz=99999;
						if(fzu2==59)
							fzu2=0;
					}
					if(i8<gz&&i8>=gz-20&&y8<gzy&&gzy<y8+68||gzu2>0&&gzu2<60){
						gw=4;
						if(gzu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						gzu2++;
						if(gzu2>=1&&gzu2<60){
							g.drawImage(hit,gz+100,gzy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(gzu2==1)
							gz=99999;
						if(gzu2==59)
							gzu2=0;
					}
					if(i8<hz&&i8>=hz-20&&y8<hzy&&hzy<y8+68||hzu2>0&&hzu2<60){
						hw=4;
						if(hzu2<60){
							i8-=6;
							if(protect8!=0)
								i8+=4;
	   				  	}
						hzu2++;
						if(hzu2>=1&&hzu2<60){
							g.drawImage(hit,hz+100,hzy,null);
							g.drawImage(hit1,i8+50,y8,null);
						}
						if(hzu2==1)
							hz=99999;
						if(hzu2==59)
							hzu2=0;
					}
				}
				
				if(as==1){                 
					if(cs==0){               //左右
						if(huan%2==0&&cc13!=1){
							if(uu4==0){
								g.drawImage(da1,ii,yy,null);
								g.drawImage(yan1,ii+70,yy+14,null);			
							}	
							if(i8<ii&&ii<i8+40&&y8<yy&&yy<y8+68||uu1>0&&uu1<40){
								yy=9999;
								uu4=1;
								if(uu1<40){
									i8-=12;
									if(protect8!=0)
										i8+=10;
									uu1++;
								}
								if(uu1==1){
									new  music("music/bomb.wav");          //中炮的声音
									music.ac.play();
								}
								if(uu3==0){          //中枪效果
									uui=ii;
									uuy=yy;
									uu3=1;
								}
								if(uu1<10)
									g.drawImage(boom1,uui,uuy,null);
								if(uu1>=10&&uu1<20)
									g.drawImage(boom2,uui,uuy,null);
								if(uu1>=20&&uu1<30){
									g.drawImage(boom3,uui,uuy,null);
									g.drawImage(yuan,uui,uuy-55,null);
									g.drawImage(huoxing,uui-100,uuy+70,null);
									g.drawImage(huoxing,uui+20,uuy+20,null);
									g.drawImage(huoxing,uui+80,uuy-90,null);
									g.drawImage(huoxing,uui+52,uuy-55,null);
									g.drawImage(huoxing,uui-11,uuy+90,null);
									g.drawImage(wu,uui-80,uuy+50,null);
									g.drawImage(wu,uui+88,uuy+20,null);
									g.drawImage(wu,uui+55,uuy-90,null);
								}
								if(uu1>=30&&uu1<40){
									g.drawImage(boom4,uui,uuy,null);
									g.drawImage(yuan,uui,uuy-40,null);
									g.drawImage(huoxing,uui-70,uuy+60,null);
									g.drawImage(huoxing,uui-60,uuy-55,null);
									g.drawImage(huoxing,uui+50,uuy+90,null);
									g.drawImage(huoxing,uui+69,uuy-75,null);
									g.drawImage(huoxing,uui+90,uuy+85,null);
									g.drawImage(wu,uui-10,uuy+100,null);
									g.drawImage(wu,uui+71,uuy+80,null);
									g.drawImage(wu,uui-55,uuy-70,null);
								}
								if(uu1>=1&&uu1<30){
									g.drawImage(hit,ii+40,yy,null);
									g.drawImage(hit1,i8-55,y8,null);
								}
							}
						}
						if(ds<=10&&huan%2==0){
							g.drawImage(huo1,ii,yy,null);
						}
						else if(ds<=10&&huan%2==1){
							g.drawImage(jiguang1,i-120,y+30,null);
						}
						ds++;
						if(huan%2==1){
							if(zdkx==0){
								zdkx=i;
								zdky=y;
							}
							if(ds<20){
								zdkx+=3;
								zdky-=3;
							}
							if(ds>=15){
								zdkx+=2;
								zdky+=6;
							}
							g.drawImage(zdk,zdkx-10,zdky-10,null);
						}	
						ii-=5;             //控制子弹速度
					}
					if(cs==1){
						ii+=200;
						if(huan%2==0&&cc13!=1){
							if(uu4==0){				
								g.drawImage(da2,ii,yy,null);
								g.drawImage(yan2,ii-70,yy+14,null);		
							}
							if(i8<ii&&ii<i8+140&&y8<yy&&yy<y8+68||uu2>0&&uu2<40){    //中枪
								yy=9999;
								uu4=1;
								if(uu2<40){
									i8+=12;
									if(protect8!=0)
										i8-=10;
									uu2++;
								}
								if(uu2==1){
									new  music("music/bomb.wav");          //中炮的声音
									music.ac.play();
								}
								if(uu3==0){          //中枪效果
									uui=ii;
									uuy=yy;
									uu3=1;
								}
								if(uu2<10)
									g.drawImage(boom1,uui,uuy,null);
								if(uu2>=10&&uu2<20)
									g.drawImage(boom2,uui,uuy,null);
								if(uu2>=20&&uu2<30){
									g.drawImage(boom3,uui,uuy,null);
									g.drawImage(yuan,uui,uuy-55,null);
									g.drawImage(huoxing,uui-100,uuy+70,null);
									g.drawImage(huoxing,uui+20,uuy+20,null);
									g.drawImage(huoxing,uui+80,uuy-90,null);
									g.drawImage(huoxing,uui+52,uuy-55,null);
									g.drawImage(huoxing,uui-11,uuy+90,null);
									g.drawImage(wu,uui-80,uuy+50,null);
									g.drawImage(wu,uui+88,uuy+20,null);
									g.drawImage(wu,uui+55,uuy-90,null);
									
								}
								if(uu2>=30&&uu2<40){
									g.drawImage(boom4,uui,uuy,null);
									g.drawImage(yuan,uui,uuy-55,null);
									g.drawImage(huoxing,uui-70,uuy+60,null);
									g.drawImage(huoxing,uui-60,uuy-55,null);
									g.drawImage(huoxing,uui+50,uuy+90,null);
									g.drawImage(huoxing,uui+69,uuy-75,null);
									g.drawImage(huoxing,uui+90,uuy+85,null);
									g.drawImage(wu,uui-10,uuy+100,null);
									g.drawImage(wu,uui+71,uuy+80,null);
									g.drawImage(wu,uui-55,uuy-70,null);
								}
								if(uu2>=1&&uu2<30){
									g.drawImage(hit,ii-40,yy,null);
									g.drawImage(hit1,i8-40,y8,null);
								}
							}
						}
						if(ds<=10&&huan%2==0){
							g.drawImage(huo2,ii,yy,null);
						}	
						else if(ds<=10&&huan%2==1){
							g.drawImage(jiguang2,i+130,y+30,null);
						}
						ds++;
						if(huan%2==1){
							if(zdkx==0){
								zdkx=i;
								zdky=y;
							}
							if(ds<20){
								zdkx-=3;
								zdky-=3;
							}
							if(ds>=15){
								zdkx-=2;
								zdky+=6;
							}
							g.drawImage(zdk,zdkx+50,zdky-10,null);
						}
						ii-=200;
						ii+=5;
					}			
					bs++;
				}
			}	

			
//人物2			
			g.setColor(Color.GREEN);
			
			if(i8>0&&i8<85||i8>880&&i8<1000)
				y8+=3;
			y8+=3;        //开始一直自动下落
			if(i8<=0)               //控制人物不出边界
				i8+=8;
			if(i8>=1000)
				i8-=8;
			if(y8==140){
				if(i8>=160&&i8<=440||i8>=540&&i8<=810)       //处理在台阶上不下落，不在台阶上自动下落
					y8-=3;
				else{
					y8+=3;
					if(rocketup81==1)
						y8-=3;
				}
			}
			
			if(y8==230){                     //处理在台阶上不下落，不在台阶上自动下落
				if(i8>=85&&i8<=880)
					y8-=3;
				else{
					y8+=3;
					if(rocketup81==1)
						y8-=3;
				}
			}
			
			
			if(y8==320){                       //处理在台阶上不下落，不在台阶上自动下落
				if(i8>=310&&i8<=670)
					y8-=3;
				else{
					y8+=3;
					if(rocketup81==1)
						y8-=3;
				}
			}
			
			if(y8==410){                              //处理在台阶上不下落，不在台阶上自动下落
				if(i8>=95&&i8<=880)
					y8-=3;
				else{
					y8+=3;
					if(rocketup81==1)
						y8-=3;
				}
			}
			
			if(y8==500){                           //处理在台阶上不下落，不在台阶上自动下落
				if(i8>=160&&i8<=430||i8>=550&&i8<=810)
					y8-=3;
				else{
					y8+=3;
					if(rocketup81==1)
						y8-=3;
				}
			}
			if(y8>=750){                     //处理每次人物死亡
				if(aa8>=1){
					if(aa8>1){
						new  music("music/dead2.wav");          //死亡声音
						music.ac.play();
					}
					aa8--;
					over8++;
					bb8=3;
					cc8=6;
					cc82=8;
					i8=720;
					y8=-2890;
					left8=0;
					right8=0;
					ri=ri8=0;
					a8=0;
					huan8=0;
					cc83=0;
					bombta=0;
					bombtb=0;
					ccb8=0;
					speed8=0;
					tiao8=0;
					protect8=1;
					rocket8=0;
					rocketup8=0;
					rocketup81=0;
					yy8=99999;
				}
				if(aa8==0){
					Start.ap.dispose();
					appp = new JFrame("小小枪战1.0");
					gameover g1=new gameover();
					appp.add(g1);
			    	appp.setSize(637,665); 
			    	appp.setLocationRelativeTo(null);
			    	appp.setResizable(false);
			    	appp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			    	appp.setVisible(true);
			    	appp.add(gameover.jj);
				}
			}
			if(aUP8>0&&aUP8<=100){          //跳跃
				if(aUP8<=34){
					aUP8++;
			   		y8-=6;
			   		if(tiao8!=0)
			   			y8-=3;
				}
				else
					aUP8++;
				if(aUP8==100)
					j8ump=0;
			}
			if(aDOWN8>0&&aDOWN8<=40){          //下落
				aDOWN8++;
			}
			
			
			
			if(leia8>0&&leia8<=200){        //左雷
				if(leia8==1){
					leii8=i8;
					leiy8=y8;
					leii8-=10;
				}
				if(leia8>0&&leia8<45){
					leii8-=3;
					leiy8-=1;
				}
				if(leia8>=45&&leia8<=160){
					leii8-=3;
					leiy8+=1;
				}
				if(leiy8==170&&leia8>80){
					if(leii8>=160&&leii8<=440||leii8>=540&&leii8<=810){
						leii8+=1;
						leiy8-=1;
					}	
				}
				if(leiy8==260&&leia8>80){                     
					if(leii8>=85&&leii8<=880){
						leii8+=1;
						leiy8-=1;
					}
				}
				if(leiy8==350&&leia8>80){                       
					if(leii8>=310&&leii8<=670){
						leii8+=1;
						leiy8-=1;
					}				
				}				
				if(leiy8==440&&leia8>80){                              
					if(leii8>=95&&leii8<=880){
						leii8+=1;
						leiy8-=1;
					}					
				}	
				if(leiy8==530&&leia8>80){                           
					if(leii8>=160&&leii8<=430||leii8>=550&&leii8<=810){
						leii8+=1;
						leiy8-=1;
					}	
				}
				
				if(leia8>0&&leia8<20)
					g.drawImage(lei1,leii8,leiy8,null);
				if(leia8>=20&&leia8<40)
					g.drawImage(lei2,leii8,leiy8,null);
				if(leia8>=40&&leia8<60)
					g.drawImage(lei3,leii8,leiy8,null);
				if(leia8>=60&&leia8<80)
					g.drawImage(lei4,leii8,leiy8,null);
				if(leia8>=80&&leia8<100)
					g.drawImage(lei5,leii8,leiy8,null);
				if(leia8>=100&&leia8<120)
					g.drawImage(lei6,leii8,leiy8,null);
				if(leia8>=120&&leia8<140)
					g.drawImage(lei1,leii8,leiy8,null);
				if(leia8>=140&&leia8<160)
					g.drawImage(lei2,leii8,leiy8,null);	
				if(leia8==160){
					new  music("music/bomb.wav");          //雷爆炸的声音
					 music.ac.play();
				}
				if(leia8>160&&leia8<170)
					g.drawImage(boom1,leii8-40,leiy8,null);
				if(leia8>=170&&leia8<180)
					g.drawImage(boom2,leii8-50,leiy8,null);
				if(leia8>=180&&leia8<190){
					g.drawImage(boom3,leii8-60,leiy8,null);
					g.drawImage(yuan,leii8-70,leiy8-55,null);
					g.drawImage(huoxing,leii8-100,leiy8+70,null);
					g.drawImage(huoxing,leii8+20,leiy8+20,null);
					g.drawImage(huoxing,leii8+80,leiy8-90,null);
					g.drawImage(huoxing,leii8+52,leiy8-55,null);
					g.drawImage(huoxing,leii8-11,leiy8+90,null);
					g.drawImage(wu,leii8-80,leiy8+50,null);
					g.drawImage(wu,leii8+88,leiy8+20,null);
					g.drawImage(wu,leii8+55,leiy8-90,null);
				}
				if(leia8>=190&&leia8<200){
					g.drawImage(boom4,leii8-70,leiy8,null);
					g.drawImage(yuan,leii8-70,leiy8-55,null);
					g.drawImage(huoxing,leii8-70,leiy8+60,null);
					g.drawImage(huoxing,leii8-60,leiy8-55,null);
					g.drawImage(huoxing,leii8+50,leiy8+90,null);
					g.drawImage(huoxing,leii8+69,leiy8-75,null);
					g.drawImage(huoxing,leii8+90,leiy8+85,null);
					g.drawImage(wu,leii8-10,leiy8+100,null);
					g.drawImage(wu,leii8+71,leiy8+80,null);
					g.drawImage(wu,leii8-55,leiy8-70,null);
				}
				leia8++;
				if(leii8-200<i&&leii8+200>i&&leiy8-200<y&&leiy8+200>y&&leia8==200){
					bombta8=1;	
					leia8=0;
				}
				if(leia8==200)
					leia8=0;
			}
		if(bombta8>0&&bombta8<=100){
			if(leii8>i){
				i-=5;
				if(protect!=0)
					i+=3;
			}
			if(leii8<i){
				i+=5;
				if(protect!=0)
					i-=3;
			}
			if(leiy8>y&&bombta8<50){
				y-=6;
				if(protect!=0)
					y+=3;
				if(leii8-100<i&&leii8+100>i){
					y-=9;
					if(protect!=0)
						y+=6;
				}
			}
			bombta8++;
			if(bombta8==100)
				bombta8=0;
			
		}
			
			
			if(leib8>0&&leib8<=200){             //右雷
				if(leib8==1){
					leiii8=i8;
					leiyy8=y8;
					leiii8+=30;
				}
				if(leib8>0&&leib8<45){
					leiii8+=3;
					leiyy8-=1;
				}
				if(leib8>=45&&leib8<=160){
					leiii8+=3;
					leiyy8+=1;
				}
				if(leiyy8==170&&leib8>80){
					if(leiii8>=160&&leiii8<=440||leiii8>=540&&leiii8<=810){
						leiii8+=1;
						leiyy8-=1;
					}	
				}
				if(leiyy8==260&&leib8>80){                     
					if(leiii8>=85&&leiii8<=880){
						leiii8+=1;
						leiyy8-=1;
					}
				}
				if(leiyy8==350&&leib8>80){                       
					if(leii8>=310&&leii8<=670){
						leiii8+=1;
						leiyy8-=1;
					}				
				}				
				if(leiyy8==440&&leib8>80){                              
					if(leiii8>=95&&leiii8<=880){
						leiii8+=1;
						leiyy8-=1;
					}					
				}	
				if(leiyy8==530&&leib8>80){                           
					if(leiii8>=160&&leiii8<=430||leiii8>=550&&leiii8<=810){
						leiii8+=1;
						leiyy8-=1;
					}	
				}
				if(leib8>0&&leib8<20)
					g.drawImage(lei1,leiii8,leiyy8,null);
				if(leib8>=20&&leib8<40)
					g.drawImage(lei2,leiii8,leiyy8,null);
				if(leib8>=40&&leib8<60)
					g.drawImage(lei3,leiii8,leiyy8,null);
				if(leib8>=60&&leib8<80)
					g.drawImage(lei4,leiii8,leiyy8,null);
				if(leib8>=80&&leib8<100)
					g.drawImage(lei5,leiii8,leiyy8,null);
				if(leib8>=100&&leib8<120)
					g.drawImage(lei6,leiii8,leiyy8,null);
				if(leib8>=120&&leib8<140)
					g.drawImage(lei1,leiii8,leiyy8,null);
				if(leib8>=140&&leib8<160)
					g.drawImage(lei2,leiii8,leiyy8,null);	
				if(leib8==160){
					new  music("music/bomb.wav");          //雷爆炸的声音
					 music.ac.play();
				}
				if(leib8>160&&leib8<170)
					g.drawImage(boom1,leiii8-40,leiyy8,null);
				if(leib8>=170&&leib8<180)
					g.drawImage(boom2,leiii8-50,leiyy8,null);
				if(leib8>=180&&leib8<190){
					g.drawImage(boom3,leiii8-60,leiyy8,null);
					g.drawImage(yuan,leiii8-70,leiyy8-55,null);
					g.drawImage(huoxing,leiii8-100,leiyy8+70,null);
					g.drawImage(huoxing,leiii8+20,leiyy8+20,null);
					g.drawImage(huoxing,leiii8+80,leiyy8-90,null);
					g.drawImage(huoxing,leiii8+52,leiyy8-55,null);
					g.drawImage(huoxing,leiii8-11,leiyy8+90,null);
					g.drawImage(wu,leiii8-80,leiyy8+50,null);
					g.drawImage(wu,leiii8+88,leiyy8+20,null);
					g.drawImage(wu,leiii8+55,leiyy8-90,null);
				}
				if(leib8>=190&&leib8<200){
					g.drawImage(boom4,leiii8-70,leiyy8,null);
					g.drawImage(yuan,leiii8-70,leiyy8-55,null);
					g.drawImage(huoxing,leiii8-70,leiyy8+60,null);
					g.drawImage(huoxing,leiii8-60,leiyy8-55,null);
					g.drawImage(huoxing,leiii8+50,leiyy8+90,null);
					g.drawImage(huoxing,leiii8+69,leiyy8-75,null);
					g.drawImage(huoxing,leiii8+90,leiyy8+85,null);
					g.drawImage(wu,leiii8-10,leiyy8+100,null);
					g.drawImage(wu,leiii8+71,leiyy8+80,null);
					g.drawImage(wu,leiii8-55,leiyy8-70,null);
				}
				leib8++;
				if(leiii8-200<i&&leiii8+200>i&&leiyy8-200<y&&leiyy8+200>y&&leib8==200){
					bombtb8=1;	
					leib8=0;
				}
				if(leib8==200)
					leib8=0;
				
			}
			
		if(bombtb8>0&&bombtb8<=100){
			if(leiii8>i){
				i-=5;
				if(protect!=0)
					i+=3;
			}
			if(leiii8<i){
				i+=5;
				if(protect!=0)
					i-=3;
			}
			if(leiyy8>y&&bombtb8<50){
				y-=6;
				if(protect!=0)
					y+=3;
				if(leiii8-100<i&&leiii8+100>i){
					y-=9;
					if(protect!=0)
						y+=6;
				}
			}
			bombtb8++;
			if(bombtb8==100)
				bombtb8=0;
		}
			
			
			if(a8==0){
				if(bs8>10&&bs8<40&&huan8%2==0){
					g.drawString("恐怖分子",i8+5,y8-15);
					g.drawImage(da48,i8-60,y8,null);
					if(es8==0){
						i8+=60;
						es8++;
					}
				}
				else
					if(aUP8>=1&&aUP8<=38){
						g.drawString("恐怖分子",i8+5,y8-15);
						if(huan8%2==0)
							g.drawImage(jump18,i8-45,y8,null);
						if(huan8%2==1)
							g.drawImage(jumps18,i8-20,y8-20,null);
					}
					else{
						if(huan8%2==0){
							g.drawString("恐怖分子",i8+5,y8-15);
							g.drawImage(re28,i8-60,y8,null);
						}
						if(huan8%2==1){
							g.drawString("恐怖分子",i8+5,y8-15);
							g.drawImage(re48,i8-60,y8+3,null);
						}
					}
				if(bs8==80&&huan8%2==0){
					new  music("music/getGun.wav");          //炮的声音
					music.ac.play();
				}
				if(bs8==130){                        
					huan38=0;
				}
			}
			if(a8==1){
				if(bs8>3&&bs8<40&&huan8%2==0){
					g.drawString("恐怖分子",i8+5,y8-15);
					g.drawImage(da38,i8,y8,null);
					if(es8==0){
						i8-=60;
						es8++;
					}
				}
				else
					if(aUP8>=1&&aUP8<=38){
						g.drawString("恐怖分子",i8+5,y8-15);
						if(huan8%2==0)
							g.drawImage(jump28,i8-15,y8,null);
						if(huan8%2==1)
							g.drawImage(jumps28,i8-15,y8-20,null);
					}
					else{
						if(huan8%2==0){
							g.drawString("恐怖分子",i8+5,y8-15);
							g.drawImage(re18,i8,y8,null);
						}
						if(huan8%2==1){
							g.drawString("恐怖分子",i8+5,y8-15);
							g.drawImage(re38,i8+5,y8+3,null);
						}
					}
				if(bs8==80&&huan8%2==0){                        
					new  music("music/getGun.wav");          //炮的声音
					music.ac.play();
				}
				if(bs8==130){                        
					huan38=0;
				}
			}
			if(b8==1){
				if(as8==0&&huan8%2==0){            //as用来在限定时间内获得一次子弹发射位置
					ii8=i8;            //获得子弹的发射位置
					yy8=y8;
					ii8-=100;
					yy8+=22;
					as8++;
					cs8=a8;
				}
				if(as8==0&&huan8%2==1){
					ccb8++;
					i8-=100;
					y8+=22;
					if(ccb8==1){
						
						az8=i8;            //获得子弹的发射位置
						azy8=y8;
						if(a8==0)
							aw8=1;
						if(a8==1)
							aw8=2;
					
					}
					if(ccb8==2){
						bz8=i8;            //获得子弹的发射位置
						bzy8=y8;
						if(a8==0)
							bw8=1;
						if(a8==1)
							bw8=2;
					
					}
					if(ccb8==3){
						cz8=i8;            //获得子弹的发射位置
						czy8=y8;
						if(a8==0)
							cw8=1;
						if(a8==1)
							cw8=2;
					}
					if(ccb8==4){
						dz8=i8;            //获得子弹的发射位置
						dzy8=y8;
						if(a8==0)
							dw8=1;
						if(a8==1)
							dw8=2;
					}
					if(ccb8==5){
						ez8=i8;            //获得子弹的发射位置
						ezy8=y8;
						if(a8==0)
							ew8=1;
						if(a8==1)
							ew8=2;
					}
					if(ccb8==6){
						fz8=i8;            //获得子弹的发射位置
						fzy8=y8;
						if(a8==0)
							fw8=1;
						if(a8==1)
							fw8=2;
					}
					if(ccb8==7){
						gz8=i8;            //获得子弹的发射位置
						gzy8=y8;
						if(a8==0)
							gw8=1;
						if(a8==1)
							gw8=2;
					}
					if(ccb8==8){
						hz8=i8;            //获得子弹的发射位置
						hzy8=y8;
						if(a8==0)
							hw8=1;
						if(a8==1)
							hw8=2;
					}
					i8+=100;	
					y8-=22;
					as8++;
					cs8=a8;
				}
				if(aw8==1){
					g.drawImage(da58,az8,azy8+25,null);
					az8-=5;
					
				}
				if(bw8==1){
					g.drawImage(da58,bz8,bzy8+25,null);
					bz8-=5;
				}	
				if(cw8==1){
					g.drawImage(da58,cz8,czy8+25,null);
					cz8-=5;
				}
				if(dw8==1){
					g.drawImage(da58,dz8,dzy8+25,null);
					dz8-=5;
				}
				if(ew8==1){
					g.drawImage(da58,ez8,ezy8+25,null);
					ez8-=5;
				}
				if(fw8==1){
					g.drawImage(da58,fz8,fzy8+25,null);
					fz8-=5;
				}
				if(gw8==1){
					g.drawImage(da58,gz8,gzy8+25,null);
					gz8-=5;
				}
				if(hw8==1){
					g.drawImage(da58,hz8,hzy8+25,null);
					hz8-=5;
				}
				if(aw8==2){
					g.drawImage(da68,az8+220,azy8+25,null);
					az8+=5;
				}
				if(bw8==2){
					g.drawImage(da68,bz8+220,bzy8+25,null);
					bz8+=5;
				}	
				if(cw8==2){
					g.drawImage(da68,cz8+220,czy8+25,null);
					cz8+=5;
				}
				if(dw8==2){
					g.drawImage(da68,dz8+220,dzy8+25,null);
					dz8+=5;
				}
				if(ew8==2){
					g.drawImage(da68,ez8+220,ezy8+25,null);
					ez8+=5;
				}
				if(fw8==2){
					g.drawImage(da68,fz8+220,fzy8+25,null);
					fz8+=5;
				}
				if(gw8==2){
					g.drawImage(da68,gz8+220,gzy8+25,null);
					gz8+=5;
				}
				if(hw8==2){
					g.drawImage(da68,hz8+220,hzy8+25,null);
					hz8+=5;
				}
				
				if(aw8==2||aw8==3||bw8==2||bw8==3||cw8==2||cw8==3||dw8==2||dw8==3||ew8==2||ew8==3||fw8==2||fw8==3||gw8==2||gw8==3||hw8==2||hw8==3){      //左中枪效果
					if(i<az8+200&&i>=az8+180&&y<azy8&&azy8<y+68||azu18>0&&azu18<60){
						aw8=3;
						if(azu18<60){
							i+=6;
							if(protect!=0)
								i-=4;
						}
						azu18++;
						if(azu18>=1&&azu18<60){
							g.drawImage(hit,az8+150,azy8,null);
							g.drawImage(hit1,i-40,y,null);
						}
						if(azu18==1)
							az8=99999;
						if(azu18==59)
							azu18=0;
					}
   				  	if(i<bz8+200&&i>=bz8+180&&y<bzy8&&bzy8<y+68||bzu18>0&&bzu18<60){
   				  		bw8=3;
   				  		if(bzu18<60){
   				  			i+=6;
   				  			if(protect!=0)
   				  				i-=4;
   				  		}
   				  		bzu18++;
   				  		if(bzu18>=1&&bzu18<60){
   				  			g.drawImage(hit,bz8+150,bzy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(bzu18==1)
   				  			bz8=99999;
   				  		if(bzu18==59)
   				  			bzu18=0;
   				  	}
	   				 if(i<cz8+200&&i>=cz8+180&&y<czy8&&czy8<y+68||czu18>0&&czu18<60){
					  		cw8=3;
					  		if(czu18<60){
					  			i+=6;
					  			if(protect!=0)
									i-=4;
		   				  	}
					  		czu18++;
					  		if(czu18>=1&&czu18<60){
					  			g.drawImage(hit,cz8+150,czy8,null);
					  			g.drawImage(hit1,i-40,y,null);
					  		}
					  		if(czu18==1)
					  			cz8=99999;
					  		if(czu18==59)
	   				  			czu18=0;
					  	}
	   				if(i<dz8+200&&i>=dz8+180&&y<dzy8&&dzy8<y+68||dzu18>0&&dzu18<60){
   				  		dw8=3;
   				  		if(dzu18<60){
   				  			i+=6;
   				  			if(protect!=0)
							i-=4;
   				  		}
   				  		dzu18++;
   				  		if(dzu18>=1&&dzu18<60){
   				  			g.drawImage(hit,dz8+150,dzy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(dzu18==1)
   				  			dz8=99999;
   				  		if(dzu18==59)
				  			dzu18=0;
   				  	}
	   				if(i<ez8+200&&i>=ez8+180&&y<ezy8&&ezy8<y+68||ezu18>0&&ezu18<60){
   				  		ew8=3;
   				  		if(ezu18<60){
   				  			i+=6;
   				  			if(protect!=0)
   				  				i-=4;
   				  		}
   				  		ezu18++;
   				  		if(ezu18>=1&&ezu18<60){
   				  			g.drawImage(hit,ez8+150,ezy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(ezu18==1)
   				  			ez8=99999;
   				  		if(ezu18==59)
				  			ezu18=0;
   				  	}
	   				if(i<fz8+200&&i>=fz8+180&&y<fzy8&&fzy8<y+68||fzu18>0&&fzu18<60){
   				  		fw8=3;
   				  		if(fzu18<60){
   				  			i+=6;
   				  			if(protect!=0)
   				  				i-=4;
   				  		}
   				  		fzu18++;
   				  		if(fzu18>=1&&fzu18<60){
   				  			g.drawImage(hit,fz8+150,fzy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(fzu18==1)
   				  			fz8=99999;
   				  		if(fzu18==59)
				  			fzu18=0;
   				  	}
	   				if(i<gz8+200&&i>=gz8+180&&y<gzy8&&gzy8<y+68||gzu18>0&&gzu18<60){
   				  		gw8=3;
   				  		if(gzu18<60){
   				  			i+=6;
   				  			if(protect!=0)
   				  				i-=4;
   				  		}
   				  		gzu18++;
   				  		if(gzu18>=1&&gzu18<60){
   				  			g.drawImage(hit,gz8+150,gzy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(gzu18==1)
   				  			gz8=99999;
   				  		if(gzu18==59)
				  			gzu18=0;
   				  	}
	   				if(i<hz8+200&&i>=hz8+180&&y<hzy8&&hzy8<y+68||hzu18>0&&hzu18<60){
   				  		hw8=3;
   				  		if(hzu18<60){
   				  			i+=6;
   				  			if(protect!=0)
   				  				i-=4;
   				  		}
   				  		hzu18++;
   				  		if(hzu18>=1&&hzu18<60){
   				  			g.drawImage(hit,hz8+150,hzy8,null);
   				  			g.drawImage(hit1,i-40,y,null);
   				  		}
   				  		if(hzu18==1)
   				  			hz8=99999;
   				  		if(hzu18==59)
				  			hzu18=0;
   				  	}
				}
					
				
				
				if(aw8==1||aw8==4||bw8==1||bw8==4||cw8==1||cw8==4||dw8==1||dw8==4||ew8==1||ew8==4||fw8==1||fw8==4||gw8==1||gw8==4||hw8==1||hw8==4){             //右中枪效果
					if(i<az8&&i>=az8-20&&y<azy8&&azy8<y+68||azu28>0&&azu28<60){
						aw8=4;
						if(azu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						azu28++;
						if(azu28>=1&&azu28<60){
							g.drawImage(hit,az8+100,azy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(azu28==1)
							az8=99999;
						if(azu28==59)
							azu28=0;
					}
					if(i<bz8&&i>=bz8-20&&y<bzy8&&bzy8<y+68||bzu28>0&&bzu28<60){
						bw8=4;
						if(bzu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						bzu28++;
						if(bzu28>=1&&bzu28<60){
							g.drawImage(hit,bz8+100,bzy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(bzu28==1)
							bz8=99999;
						if(bzu28==59)
							bzu28=0;
					}
					if(i<cz8&&i>=cz8-20&&y<czy8&&czy8<y+68||czu28>0&&czu28<60){
						cw8=4;
						if(czu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						czu28++;
						if(czu28>=1&&czu28<60){
							g.drawImage(hit,cz8+100,czy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(czu28==1)
							cz8=99999;
						if(czu28==59)
							czu28=0;
					}
					if(i<dz8&&i>=dz8-20&&y<dzy8&&dzy8<y+68||dzu28>0&&dzu28<60){
						dw8=4;
						if(dzu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						dzu28++;
						if(dzu28>=1&&dzu28<60){
							g.drawImage(hit,dz8+100,dzy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(dzu28==1)
							dz8=99999;
						if(dzu28==59)
							dzu28=0;
					}
					if(i<ez8&&i>=ez8-20&&y<ezy8&&ezy8<y+68||ezu28>0&&ezu28<60){
						ew8=4;
						if(ezu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						ezu28++;
						if(ezu28>=1&&ezu28<60){
							g.drawImage(hit,ez8+100,ezy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(ezu28==1)
							ez8=99999;
						if(ezu28==59)
							ezu28=0;
					}
					if(i<fz8&&i>=fz8-20&&y<fzy8&&fzy8<y+68||fzu28>0&&fzu28<60){
						fw8=4;
						if(fzu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						fzu28++;
						if(fzu28>=1&&fzu28<60){
							g.drawImage(hit,fz8+100,fzy8,null);
							g.drawImage(hit1,i+50,y8,null);
						}
						if(fzu28==1)
							fz8=99999;
						if(fzu28==59)
							fzu28=0;					}
					if(i<gz8&&i>=gz8-20&&y<gzy8&&gzy8<y+68||gzu28>0&&gzu28<60){
						gw8=4;
						if(gzu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						gzu28++;
						if(gzu28>=1&&gzu28<60){
							g.drawImage(hit,gz8+100,gzy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(gzu28==1)
							gz8=99999;
						if(gzu28==59)
							gzu28=0;
					}
					if(i<hz8&&i>=hz8-20&&y<hzy8&&hzy8<y+68||hzu28>0&&hzu28<60){
						hw8=4;
						if(hzu28<60){
							i-=6;
							if(protect!=0)
								i+=4;
	   				  		}
						hzu28++;
						if(hzu28>=1&&hzu28<60){
							g.drawImage(hit,hz8+100,hzy8,null);
							g.drawImage(hit1,i+50,y,null);
						}
						if(hzu28==1)
							hz8=99999;
						if(hzu28==59)
							hzu28=0;
					}
				}
				
				
				
				if(as8==1){
					if(cs8==0){
						if(huan8%2==0&&cc83!=1){
							if(uu48==0){
								
								g.drawImage(da1,ii8,yy8,null);
								g.drawImage(yan1,ii8+70,yy8+14,null);
								
							}
							if(i<ii8&&ii8<i+40&&y<yy8&&yy8<y+68||uu18>0&&uu18<40){
								yy8=9999;
								uu48=1;
								if(uu18<40){
									i-=12;
									if(protect!=0)
										i+=10;
									uu18++;
								}
								if(uu18==1){
									new  music("music/bomb.wav");          //中炮的声音
									music.ac.play();
								}
								if(uu38==0){          //中枪效果
									uui8=ii8;
									uuy8=yy8;
									uu38=1;
								}
								if(uu18<10)
									g.drawImage(boom1,uui8,uuy8,null);
								if(uu18>=10&&uu18<20)
									g.drawImage(boom2,uui8,uuy8,null);
								if(uu18>=20&&uu18<30){
									g.drawImage(boom3,uui8,uuy8,null);
									g.drawImage(yuan,uui8,uuy8-55,null);
									g.drawImage(huoxing,uui8-100,uuy8+70,null);
									g.drawImage(huoxing,uui8+20,uuy8+20,null);
									g.drawImage(huoxing,uui8+80,uuy8-90,null);
									g.drawImage(huoxing,uui8+52,uuy8-55,null);
									g.drawImage(huoxing,uui8-11,uuy8+90,null);
									g.drawImage(wu,uui8-80,uuy8+50,null);
									g.drawImage(wu,uui8+88,uuy8+20,null);
									g.drawImage(wu,uui8+55,uuy8-90,null);
								}
								if(uu18>=30&&uu18<40){
									g.drawImage(boom4,uui8,uuy8,null);
									g.drawImage(yuan,uui8,uuy8-55,null);
									g.drawImage(huoxing,uui8-70,uuy8+60,null);
									g.drawImage(huoxing,uui8-60,uuy8-55,null);
									g.drawImage(huoxing,uui8+50,uuy8+90,null);
									g.drawImage(huoxing,uui8+69,uuy8-75,null);
									g.drawImage(huoxing,uui8+90,uuy8+85,null);
									g.drawImage(wu,uui8-10,uuy8+100,null);
									g.drawImage(wu,uui8+71,uuy8+80,null);
									g.drawImage(wu,uui8-55,uuy8-70,null);
								}
								if(uu18>=1&&uu18<30){
									g.drawImage(hit,ii8+40,yy8,null);
									g.drawImage(hit1,i+40,y,null);
								}
							}
						}

						if(ds8<=10&&huan8%2==0){
							g.drawImage(huo1,ii8,yy8,null);
						}
						else if(ds8<=10&&huan8%2==1){
							g.drawImage(jiguang3,i8-100,y8+35,null);
						}
						ds8++;
						if(huan8%2==1){
							if(zdkx8==0){
								zdkx8=i8;
								zdky8=y8;
							}
							if(ds8<20){
								zdkx8+=3;
								zdky8-=3;
							}
							if(ds8>=15){
								zdkx8+=2;
								zdky8+=6;
							}
							g.drawImage(zdk,zdkx8-10,zdky8-10,null);
						}
						ii8-=5;             //控制子弹速度
					}
					if(cs8==1){
						ii8+=200;
						if(huan8%2==0&&cc83!=1){
							if(uu48==0){
								
								g.drawImage(da2,ii8,yy8,null);
								g.drawImage(yan2,ii8-70,yy8+14,null);
								
							}
							if(i<ii8&&ii8<i+140&&y<yy8&&yy8<y+68||uu28>0&&uu28<40){
								yy8=9999;
								uu48=1;
								if(uu28<40){
									i+=12;
									if(protect!=0)
										i-=10;
									uu28++;
								}
								if(uu28==1){
									new  music("music/bomb.wav");          //中炮的声音
									music.ac.play();
								}
								if(uu38==0){          //中枪效果
									uui8=ii8;
									uuy8=yy8;
									uu38=1;
								}
								if(uu28<10)
									g.drawImage(boom1,uui8,uuy8,null);
								if(uu28>=10&&uu28<20)
									g.drawImage(boom2,uui8,uuy8,null);
								if(uu28>=20&&uu28<30){
									g.drawImage(boom3,uui8,uuy8,null);
									g.drawImage(yuan,uui8,uuy8-55,null);
									g.drawImage(huoxing,uui8-100,uuy8+70,null);
									g.drawImage(huoxing,uui8+20,uuy8+20,null);
									g.drawImage(huoxing,uui8+80,uuy8-90,null);
									g.drawImage(huoxing,uui8+52,uuy8-55,null);
									g.drawImage(huoxing,uui8-11,uuy8+90,null);
									g.drawImage(wu,uui8-80,uuy8+50,null);
									g.drawImage(wu,uui8+88,uuy8+20,null);
									g.drawImage(wu,uui8+55,uuy8-90,null);
								}
								if(uu28>=30&&uu28<40){
									g.drawImage(boom4,uui8,uuy8,null);
									g.drawImage(yuan,uui8,uuy8-55,null);
									g.drawImage(huoxing,uui8-70,uuy8+60,null);
									g.drawImage(huoxing,uui8-60,uuy8-55,null);
									g.drawImage(huoxing,uui8+50,uuy8+90,null);
									g.drawImage(huoxing,uui8+69,uuy8-75,null);
									g.drawImage(huoxing,uui8+90,uuy8+85,null);
									g.drawImage(wu,uui8-10,uuy8+100,null);
									g.drawImage(wu,uui8+71,uuy8+80,null);
									g.drawImage(wu,uui8-55,uuy8-70,null);
								}
								if(uu28>=1&&uu28<30){
									g.drawImage(hit,ii8-40,yy8,null);
									g.drawImage(hit1,i-40,y,null);
								}

							}
						}

						if(ds8<=10&&huan8%2==0){
							g.drawImage(huo2,ii8,yy8,null);
						}	
						else if(ds8<=10&&huan8%2==1){
							g.drawImage(jiguang4,i8+120,y8+35,null);		
						}
						ds8++;
						if(huan8%2==1){
							if(zdkx8==0){
								zdkx8=i8;
								zdky8=y8;
							}
							if(ds8<20){
								zdkx8-=3;
								zdky8-=3;
							}
							if(ds8>=15){
								zdkx8-=2;
								zdky8+=6;
							}
							g.drawImage(zdk,zdkx8+50,zdky8-10,null);
						}
						ii8-=200;
						ii8+=5;
					}			
					bs8++;
				}
			}
		}
		
	   }
		if(focu==2){
			 g.drawImage(stop,0,0,1100,680,null);
			 music.ac.stop();
		}
	 }
	public void action(){    
		 KeyAdapter k=new KeyAdapter(){

			public void keyReleased(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_UP){
					rocketup81=0;
				}
				if(e.getKeyCode() == KeyEvent.VK_W){
					rocketup1=0;
				}
			 }
			public void keyPressed(KeyEvent e)
			 {  
				
				if(e.getKeyCode() == KeyEvent.VK_S){//处理下键
					if(aDOWN==0||aDOWN>40){					
						aDOWN=1;
						y+=3;
						if(y==500)                       //处理最下层按下键不会掉落
							y-=3;
						if(y==410)                         //处理最下层按下键不会掉落
							if(i>90&&i<190||i>420&&i<570||i>790&&i<890)            
								y-=3;
						new  music("music/down.wav");          //跳跃的声音
						music.ac.play();
					}
				}
				 if(e.getKeyCode() == KeyEvent.VK_A&&y>0){//处理左键
					 le1=0;
					 le++;
					 if(le==1){
						 a=0;
						 i-=10;
						left=1;
						right=0;
					 }
				 }
				 if(e.getKeyCode() == KeyEvent.VK_D&&y>0){//处理右键
					 le=0;
					 le1++;
					 if(le1==1){
						 i+=10;
						 a=1;
						 left=0;
						 right=1;
					 }
				 }
				 if(e.getKeyCode() == KeyEvent.VK_W){//处理上键
					 if(rocket==0){
						 if(aUP==0&&j2ump<2||aUP>40&&j2ump<2){
							 j2ump++;
							 aUP=1;
							 new  music("music/jump.wav");          //跳跃的声音
							 music.ac.play();
						 }
					 }
					 if(rocket==1){
						 rocketup1=1;
					}
				 }
				 if(e.getKeyCode() == KeyEvent.VK_U){//处理人物停止移动
					 left=0;//控制按下左右移动
					 right=0;
					 le=le1=0;
			 }
				 if(e.getKeyCode() == KeyEvent.VK_F5&&cccc==1){//处理背景音乐键,开
					 if(zzzz==0)
						 music.ac.stop();
					 if(zzzz!=0)
						 music2.ad.stop();
					 zzzz++;
					 cccc=0;
					 if(nu==0){
					 	new music2("music/zhu1.wav");
					 	music2.ad.loop();
					 }
					 if(nu==1){
					 	new music2("music/zhu2.wav");
					 	music2.ad.loop();
					 }
					 if(nu==2){
						 	new music2("music/zhu3.wav");
						 	music2.ad.loop();
					}
					Start.mu=0;
				 }
				 if(e.getKeyCode() == KeyEvent.VK_F6){//处理背景音乐键，关
					 	cccc=1;
					 	 music.ac.stop();
						 music2.ad.stop();
						 Start.mu=1;
				 }
				 if(e.getKeyCode() == KeyEvent.VK_H){//换枪
					 if(huan3==0){
						 huan++;
						 new  music("music/change.wav");          //换枪的声音
						 music.ac.play();
					 }
				 }
				 if(e.getKeyCode() == KeyEvent.VK_I&&bb1!=0&&leia==0&&leib==0&&usm>640){         //扔雷
					 if(a==0)
						 leia=1;
					 if(a==1)
						 leib=1;
					 bb1--;
					 new  music("music/le.wav");          //扔雷声音
					 music.ac.play();
				 }
				 if(e.getKeyCode() == KeyEvent.VK_J&&usm>640){//处理子弹键
					 if(bs==0||bs>130&&huan%2==0){             //控制发射子弹间隔
						 if(huan%2==0&&cc13!=1){
							 new  music("music/pao.wav");          //炮的声音
							 music.ac.play();
						 } 
						 	if(huan%2==0){
							 if(cc1>0){
								 cc1--;
								 huan3=1;
								 b=1;
								 as=0;
								 bs=0;
								 cs=0;
								 ds=0;
								 es=0;
								 
								uu1=0;             //中枪后退控制
								uu2=0;
								uu18=0;
								uu28=0;
								uu4=0;
								uu48=0;
								uu3=0;
								uu38=0;
							 }
							 else if(cc1==0)
								 cc13=1;
						 }
					 }
					 if(bs==0||bs>40&&huan%2==1){  
						 if(huan%2==1&&cc12!=0){
							 new  music("music/bull.wav");          //手枪的声音
							 music.ac.play();
							 zdkx=0;
						 }
						 if(huan%2==1&&cc12!=0){
							 if(cc12!=0){
								 cc12--;
								 cca1=1;
							 }
							 
							 huan3=1;
							 b=1;
							 as=0;
							 bs=0;
							 cs=0;
							 ds=0;
							 es=0;
											
							 
							uu1=0;             //中枪后退控制
							uu2=0;
							uu18=0;
							uu28=0;
							uu4=0;
							uu48=0;
							uu3=0;
							uu38=0;
						 }
						 
					 }
				 }
				 
				 if(e.getKeyCode() == KeyEvent.VK_DOWN){//处理下键
						if(aDOWN8==0||aDOWN8>40){
							aDOWN8=1;
							y8+=3;
							if(y8==500)                       //处理最下层按下键不会掉落
								y8-=3;
							if(y8==410)                         //处理最下层按下键不会掉落
								if(i8>90&&i8<190||i8>420&&i8<570||i8>790&&i8<890)            
									y8-=3;
							new  music("music/down.wav");          //跳跃的声音
							music.ac.play();
						}
					}
					 if(e.getKeyCode() == KeyEvent.VK_LEFT&&y8>0){//处理左键
						 ri8=0;
						 ri++;
						 if(ri==1){ 
							 a8=0;
							 
							 i8-=10;
							 left8=1;
							 right8=0;
						 }
					 }
					 if(e.getKeyCode() == KeyEvent.VK_RIGHT&&y8>0){//处理右键
						 ri=0;
						 ri8++;
						 if(ri8==1){
							 i8+=10;
							 
							 a8=1;
							left8=0;
							right8=1;
						 }
					 }
					 if(e.getKeyCode() == KeyEvent.VK_UP){//处理上键
						 if(rocket8==0){
							 if(aUP8==0&&j8ump<2||aUP8>40&&j8ump<2){
								 j8ump++;
								 aUP8=1;
								 new  music("music/jump.wav");          //跳跃的声音
								 music.ac.play();
							 }
						 }
						 if(rocket8==1){
						 	rocketup81=1;
						 }
					 }
					 if(e.getKeyCode() == KeyEvent.VK_NUMPAD3){//处理人物停止移动
							 left8=0;//控制按下左右移动
							 right8=0;
							 ri=ri8=0;
					 }
					 if(e.getKeyCode() == KeyEvent.VK_ADD &&bb8!=0&&leia8==0&&leib8==0&&usm>640){           //扔雷
						 if(a8==0)
							 leia8=1;
						 if(a8==1)
							 leib8=1;
						 bb8--;
						 new  music("music/le.wav");          //扔雷声音
						 music.ac.play();
					 }
					 if(e.getKeyCode() == KeyEvent.VK_DECIMAL){//换枪
						 if(huan38==0){
							huan8++;
						 	new  music("music/change.wav");          //换枪的声音
						 	music.ac.play();
					 	}
					 }
					 if(e.getKeyCode() == KeyEvent.VK_ENTER&&usm>640){//处理子弹键
						 if(bs8==0||bs8>130&&huan8%2==0){             //控制发射子弹间隔
							 if(huan8%2==0&&cc83!=1){
								 new  music("music/pao.wav");          //炮的声音
								 music.ac.play();
							 }
							 if(huan8%2==0){
								 if(cc8>0){
									 cc8--;
								 
									 huan38=1;
									 b8=1;
								 
									 as8=0;
									 bs8=0;
									 cs8=0;
									 ds8=0;
									 es8=0;
								 
									 uu1=0;             //中枪后退控制
									 uu2=0;
									 uu18=0;
									 uu28=0;
									 uu3=0;
									 uu38=0;
									 uu4=0;
									 uu48=0;
								 }
								 else if(cc8==0)
									 cc83=1;
							 }
						 }
						 if(bs8==0||bs8>40&&huan8%2==1){  
							if(huan8%2==1&&cc82!=0){
								 new  music("music/mp5.wav");          //手枪的声音
								 music.ac.play();
								 zdkx8=0;
							 }
							if(huan8%2==1&&cc82!=0){
								 if(cc82!=0){
									 cc82--;
									 cca8=1;
								 }			 
								 	huan38=1;
								 	b8=1;
								 	as8=0;
								 	bs8=0;
								 	cs8=0;
								 	ds8=0;
								 	es8=0;
								 

								 	uu1=0;             //中枪后退控制
								 	uu2=0;
								 	uu18=0;
								 	uu28=0;
								 	uu3=0;
									uu38=0;
									uu4=0;
									uu48=0;
							 }
							 
							 
							
						 }
					 }
					 
			 }
			
		};
		
		 this.requestFocus();
		 this.addKeyListener(k); //添加监听器
	 }
	
	class myThread extends Thread{
		  public void run(){
			  while(true)
			  {
				  try{
					  Thread.sleep(8);
				  }
				  catch (InterruptedException e){
					  e.printStackTrace();
				  }
				  repaint();
			  }
		  }		  
		}
}