import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Photo extends JFrame {
	static int[][] inImage = new int[512][512];
	static int[][] outImage = new int[512][512];

	Container contentPane;

	public static void main(String[] args) throws Exception {
		
		loadImage();

		new Photo();
	}
	// ���� �̹��� ������ �о �޸� ���� �迭�� ����
	static public void loadImage() throws Exception {
		int i, k;

		File inFp; // ���� �ڵ�
		FileInputStream inFs; // ���� ��Ʈ�� �ڵ�
		inFp = new File("data/prince.raw");
		// �о�� ���� ��Ʈ�� (1byte�� ����)
		inFs = new FileInputStream(inFp.getPath());
		
		// ���� 4 ������ �� �ٷ� �ڵ��ϸ� �Ʒ��� ����
		// FileInputStream inFs = new FileInputStream(new File("data/prince.raw"));

		// ���� --> �޸� �迭�� �ȼ��� ����
		for (i = 0; i < 512; i++) {
			for (k = 0; k < 512; k++) {
				inImage[i][k] = inFs.read(); // 1byte�� ����
				outImage[i][k] = inImage[i][k];
			}
		}
		inFs.close();
	}
	// ���� ó�� ���α׷� ��ü ȭ�� ������
	// ������ - �޴��߰�, �ǳ� ����
	Photo() {
		setTitle("���� ó�� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		// �޴� �߰�
		addMenu();
		// �г� �߰�
		DrawImage panel = new DrawImage();
		contentPane.add(panel, BorderLayout.CENTER);
		// ������ â�� �޴��� Ʋ�� ���� ����Ͽ� ũ�� ����
		setSize(8 + 512 + 8, 25 + 31 + 512 + 8);
		setVisible(true);
		displayImage();
	}
	// ���α׷� ���� ���� ǥ�� ����
	// �г� --> ��,��� �̹��� ���
	class DrawImage extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int R, G, B;
			int i, k;
			for (i = 0; i < 512; i++) {
				for (k = 0; k < 512; k++) {
					R = G = B = (int) outImage[i][k];
					g.setColor(new Color(R, G, B));
					// �簢�� �׸���(����, ����, ����, ����)
					g.drawRect(k, i, 1, 1);
				}
			}
		}
	}
	// ���� ǥ�� ������ contentPain �����̳ʿ� �߰�
	// �̹��� ���÷���
	void displayImage() {
		Graphics g = contentPane.getGraphics();
		contentPane.paintAll(g);
	}
	// �޴� ���� �� �޴� �� ��� ����

	public void addMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu photoMenu = new JMenu("����ó��");
		menuBar.add(photoMenu);

		JMenuItem equalAction = new JMenuItem("������ ����");
		JMenuItem negativeAction = new JMenuItem("������ ����");
		JMenuItem mirror1Action = new JMenuItem("�¿��Ī ����");
		JMenuItem mirror2Action = new JMenuItem("���ϴ�Ī ����");
		JMenuItem saveAction = new JMenuItem("����");
		JMenuItem exitAction = new JMenuItem("Exit");

		photoMenu.add(equalAction);
		photoMenu.add(negativeAction);
		photoMenu.add(mirror1Action);
		photoMenu.add(mirror2Action);
		photoMenu.addSeparator();
		photoMenu.add(saveAction);
		photoMenu.add(exitAction);

		// �����̹��� ó��
		equalAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				equal();
			}
		});
		// ���� ���� ó��
		negativeAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				negative();
			}
		});
		// �¿� ��Ī ó��
		mirror1Action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mirror1();
			}
		});
		// ���� ��Ī ó��
		mirror2Action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mirror2();
			}
		});
		// ���� ����
		saveAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveImage();
			}
		});
		exitAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	// ���� �̹��� ���÷��� 
	// ���� �̹��� ���÷��� 
	void equal() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[i][k];

		displayImage();
	}
	// ���� �̹��� ���÷��� 
	// ���� �̹��� ���÷��� 
	void negative() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = 255 - inImage[i][k];

		displayImage();
	}
	// �¿� ��Ī �̹��� ���÷���
	// �¿� ��Ī �̹��� ���÷���
	void mirror1() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[i][511 - k];

		displayImage();
	}
	// ���� ��Ī �̹��� ���÷���
	// ���� ��Ī �̹��� ���÷���
	void mirror2() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[511 - i][k];

		displayImage();
	}
	// �̹��� ó�� ��� ���� ����
	public void saveImage() {
		int i, k;
		String newFname = "data/result.raw";
		File outFp; // ���� �ڵ�
		FileOutputStream outFs; // ���� ��Ʈ�� �ڵ�
		outFp = new File(newFname);

		// ������ ���� ��ũ��
		try {
			outFs = new FileOutputStream(outFp.getPath());
			// �޸� --> ����
			for (i = 0; i < 512; i++) {
				for (k = 0; k < 512; k++) {
					outFs.write(outImage[i][k]);
				}
			}
			outFs.close();
			// �˾� �޽��� â ����(��� ������Ʈ, �޽���, Ÿ��Ʋ, ������)
			JOptionPane.showMessageDialog(null, "���� ���� ����", "���� ����", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




