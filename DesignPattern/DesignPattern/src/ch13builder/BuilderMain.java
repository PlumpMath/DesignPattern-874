package ch13builder;

import java.awt.Frame;
import java.awt.Graphics;

public class BuilderMain extends Frame{
  private int x;
  private int y;
  private boolean drawOval;//为true时绘制

  //测试入口函数
  public static void main(String []args)
  {
	  new BuilderMain().print();
  }

  //构造函数,初始化x、y坐标，设置drawOval变量为false，设置窗体大小
  public BuilderMain()
  {
	  x = 200;
	  y = 200;
	  drawOval = false;
	  this.setSize(400,400);
	  this.setVisible(true);
  }

  public void print(){
    //在调用S类实例的print方法时,画一个以属性X,Y为起点的宽高为10的圆.
	  drawOval = true;  //设置drawOval变量为true
	  repaint();    //调用刷新画面方法
  }

  public void paint(Graphics g)
  {
   //为true时绘制
	  if(drawOval) {
		  PersonThinBuilder ptb = new PersonThinBuilder(g);
		  PersonDirector pThin = new PersonDirector(ptb);
		  pThin.CreatePerson();
		  PersonFatBuilder pfb = new PersonFatBuilder(g);
		  PersonDirector pFat = new PersonDirector(pfb);
		  pFat.CreatePerson();
	  }
  }
} 
