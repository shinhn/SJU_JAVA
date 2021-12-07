import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem_37_img_random {
	
	static String[] imageName = 
		{
				"eclair.jpg", "froyo.jpg", "gingerbread.jpg",
				"honeycomb.jpg", "icecream.jpg", "jellybean.jpg",
				"kitkat.jpg", "lollipop.jpg", "marshmallow.jpg"
		};
	
	static ImageIcon[] img = new ImageIcon[9];
	static JButton[] btn = new JButton[9];
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이미지 랜덤 정렬");
			
			JMenuBar menuBar = new JMenuBar();
			JMenu myMenu = new JMenu("내 메뉴");
			
			JMenuItem mixItem = new JMenuItem("이미지 섞기");
			JMenuItem closeItem = new JMenuItem("닫기");
			
			setJMenuBar(menuBar);
			menuBar.add(myMenu);
			
			myMenu.add(mixItem);
			myMenu.add(closeItem);
			
			mixItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_SPACE);
					}catch(Exception e) {
						
					}
				}
			});
			
			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			
			this.setLayout(new GridLayout(3,3,10,10));
			
			this.addKeyListener(new KeyAdapter() {
				public void KeyReleased(KeyEvent e) {
					getContentPane().removeAll();
					
					int randNum[] = makeRandom();
					
					for(int i=0;i<9;i++) {
						img[i] = new ImageIcon("image/android/" + imageName[randNum[i]]);
						btn[i] = new JButton(img[i]);
						MyGUI.this.add(btn[i]);
					}
					
					validate();
				}
			});
			
			setSize(256, 256);
			setVisible(true);
			
		}
	}
	
	public static int[] makeRandom() {
		// 섞일 9개의 숫자를 구한다 
		int[] rand = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int i,k,num;
		char dupl = 'N';
		
		for(i=0;i<9;) {
			num = (int) ((Math.random() * 9));
			
			for(k=0;k<9;k++) {
				if(rand[k] == num)dupl='Y';
			}
			
			if(dupl == 'N')rand[i++] = num;
			else dupl = 'N';
		}
		
		return rand;
	}

	public static void main(String[] args) {
		
		new MyGUI();

	}

}
