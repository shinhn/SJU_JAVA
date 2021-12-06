package ksh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KSH_03 {
	
	static class myGUI extends JFrame{
		myGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Calcurator");
			
			// JPanel
			// ���� â�� ��ư â�� �κκ����� ���� 
			JPanel jp1 = new JPanel();
			JPanel jp2 = new JPanel();
			
			// jp1 
			JLabel label = new JLabel("0", JLabel.RIGHT);
			label.setFont(new Font("serif",Font.BOLD,50));
			jp1.add(label);
			
			// jp2 
			jp2.setLayout(new GridLayout(4,4,1,1));
			JButton[] btn = new JButton[16];
			
			
			
			// buttons 
			btn[0] = new JButton("7");
			btn[1] = new JButton("8");
			btn[2] = new JButton("9");
			btn[3] = new JButton("+");
			btn[3].setBackground(Color.GRAY);
			
			btn[4] = new JButton("4");
			btn[5] = new JButton("5");
			btn[6] = new JButton("6");
			btn[7] = new JButton("-");
			btn[7].setBackground(Color.GRAY);
			
			btn[8] = new JButton("1");
			btn[9] = new JButton("2");
			btn[10] = new JButton("3");
			btn[11] = new JButton("*");
			btn[11].setBackground(Color.GRAY);
			
			btn[12] = new JButton("0");
			btn[13] = new JButton("AC");
			btn[14] = new JButton("=");
			btn[15] = new JButton("/");
			btn[15].setBackground(Color.GRAY);
			
			
			
			for(int i=0;i<16;i++) {
				// mac�� ��� ��ư�� mac default ��ư���� �����Ǿ� �ֱ� ������ 
				// �Ʒ��� ���� �ڵ带 �ٿ���� ��ư�� ������ �ٲ� 
				// ��ó : https://sunylog.tistory.com/entry/Mac-OS-button-background
				btn[i].setOpaque(true);
				btn[i].setBorderPainted(false);
				
				jp2.add(btn[i]);
			}
			
			jp1.setLayout(new BorderLayout());
			add(label, BorderLayout.NORTH);
			add(jp2, BorderLayout.CENTER);
			
			
			// ��ư �̺�Ʈ 
			for(int i=0;i<16;i++) {
				btn[i].addActionListener(new ActionListener() {
					public  void actionPerformed(ActionEvent e) {
						
						try {
							
							JButton b = (JButton)e.getSource();
							String text = b.getText();
							String oldText = label.getText();
							String newText;
							
							
							if(text == "AC") {
								newText = "0";
							}
							else if(text == "=") {
								
								int op_idx=0;
								char op = '+';
								for(int j=0;j<oldText.length();j++) {
									if(oldText.charAt(j) == '+' || oldText.charAt(j) == '-' || oldText.charAt(j) == '*' || oldText.charAt(j) == '/') {
										op_idx = j;
										op = oldText.charAt(j);
										break;
									}
								}
								
								String num1="", num2="";
								for(int j=0;j<op_idx;j++) {
									num1 = num1 + oldText.charAt(j);
								}
								for(int j=op_idx+1;j<oldText.length();j++) {
									num2 = num2 + oldText.charAt(j);
								}
								
								double ans=0;
								if(op=='+') ans =  Double.parseDouble(num1) + Double.parseDouble(num2);
								if(op=='-') ans =  Double.parseDouble(num1) - Double.parseDouble(num2);
								if(op=='*') ans =  Double.parseDouble(num1) * Double.parseDouble(num2);
								if(op=='/') ans =  Double.parseDouble(num1) / Double.parseDouble(num2);
							
								
								if(Double.isFinite(ans)) newText = Double.toString(ans);
								else newText = "���Ѵ� �� �Դϴ�. ACŰ�� ���� ����� �ٽ� �Է����ּ���." ;
							}
							else {
								newText = oldText + text;
							}
							
							
							label.setText(newText);
							
						} catch (java.lang.NumberFormatException e2) {
							System.out.println("����� ���� �����ϴ�.");
						}

						
					}
					
				});
			}
			
			
			setSize(350, 300);
			setVisible(true);
			
		}
	}

	public static void main(String[] args) {
		
		new myGUI();

	}

}
