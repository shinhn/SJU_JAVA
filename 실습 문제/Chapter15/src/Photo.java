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
	// 원본 이미지 파일을 읽어서 메모리 상의 배열에 저장
	static public void loadImage() throws Exception {
		int i, k;

		File inFp; // 파일 핸들
		FileInputStream inFs; // 파일 스트림 핸들
		inFp = new File("data/prince.raw");
		// 읽어올 파일 스트림 (1byte씩 읽음)
		inFs = new FileInputStream(inFp.getPath());
		
		// 위의 4 라인을 한 줄로 코딩하면 아래와 같음
		// FileInputStream inFs = new FileInputStream(new File("data/prince.raw"));

		// 파일 --> 메모리 배열에 픽셀값 저장
		for (i = 0; i < 512; i++) {
			for (k = 0; k < 512; k++) {
				inImage[i][k] = inFs.read(); // 1byte씩 읽음
				outImage[i][k] = inImage[i][k];
			}
		}
		inFs.close();
	}
	// 사진 처리 프로그램 전체 화면 생성자
	// 생성자 - 메뉴추가, 판넬 부착
	Photo() {
		setTitle("사진 처리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		// 메뉴 추가
		addMenu();
		// 패널 추가
		DrawImage panel = new DrawImage();
		contentPane.add(panel, BorderLayout.CENTER);
		// 윈도우 창의 메뉴나 틀의 폭을 고려하여 크기 조절
		setSize(8 + 512 + 8, 25 + 31 + 512 + 8);
		setVisible(true);
		displayImage();
	}
	// 프로그램 내에 사진 표시 영역
	// 패널 --> 입,출력 이미지 출력
	class DrawImage extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int R, G, B;
			int i, k;
			for (i = 0; i < 512; i++) {
				for (k = 0; k < 512; k++) {
					R = G = B = (int) outImage[i][k];
					g.setColor(new Color(R, G, B));
					// 사각형 그리기(가로, 세로, 넓이, 높이)
					g.drawRect(k, i, 1, 1);
				}
			}
		}
	}
	// 사진 표시 영역을 contentPain 컨테이너에 추가
	// 이미지 디스플레이
	void displayImage() {
		Graphics g = contentPane.getGraphics();
		contentPane.paintAll(g);
	}
	// 메뉴 구성 및 메뉴 별 기능 연결

	public void addMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu photoMenu = new JMenu("사진처리");
		menuBar.add(photoMenu);

		JMenuItem equalAction = new JMenuItem("동일한 사진");
		JMenuItem negativeAction = new JMenuItem("반전된 사진");
		JMenuItem mirror1Action = new JMenuItem("좌우대칭 사진");
		JMenuItem mirror2Action = new JMenuItem("상하대칭 사진");
		JMenuItem saveAction = new JMenuItem("저장");
		JMenuItem exitAction = new JMenuItem("Exit");

		photoMenu.add(equalAction);
		photoMenu.add(negativeAction);
		photoMenu.add(mirror1Action);
		photoMenu.add(mirror2Action);
		photoMenu.addSeparator();
		photoMenu.add(saveAction);
		photoMenu.add(exitAction);

		// 동일이미지 처리
		equalAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				equal();
			}
		});
		// 반전 영상 처리
		negativeAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				negative();
			}
		});
		// 좌우 대칭 처리
		mirror1Action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mirror1();
			}
		});
		// 상하 대칭 처리
		mirror2Action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mirror2();
			}
		});
		// 파일 저장
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
	// 원본 이미지 디스플레이 
	// 원본 이미지 디스플레이 
	void equal() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[i][k];

		displayImage();
	}
	// 반전 이미지 디스플레이 
	// 반전 이미지 디스플레이 
	void negative() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = 255 - inImage[i][k];

		displayImage();
	}
	// 좌우 대칭 이미지 디스플레이
	// 좌우 대칭 이미지 디스플레이
	void mirror1() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[i][511 - k];

		displayImage();
	}
	// 상하 대칭 이미지 디스플레이
	// 상하 대칭 이미지 디스플레이
	void mirror2() {
		int i, k;
		for (i = 0; i < 512; i++)
			for (k = 0; k < 512; k++)
				outImage[i][k] = inImage[511 - i][k];

		displayImage();
	}
	// 이미지 처리 결과 파일 저장
	public void saveImage() {
		int i, k;
		String newFname = "data/result.raw";
		File outFp; // 파일 핸들
		FileOutputStream outFs; // 파일 스트림 핸들
		outFp = new File(newFname);

		// 저장할 파일 스크림
		try {
			outFs = new FileOutputStream(outFp.getPath());
			// 메모리 --> 파일
			for (i = 0; i < 512; i++) {
				for (k = 0; k < 512; k++) {
					outFs.write(outImage[i][k]);
				}
			}
			outFs.close();
			// 팝업 메시지 창 생성(대상 컴포넌트, 메시지, 타이틀, 아이콘)
			JOptionPane.showMessageDialog(null, "파일 저장 성공", "파일 저장", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




