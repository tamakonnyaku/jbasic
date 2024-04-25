package p01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Viewer extends JFrame {
	private Image img;

	public Viewer() {
		try {
			img = ImageIO.read(new File("C:/ku/gazou/monster01.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(new FlowLayout());
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (img != null) {
			g.drawImage(img, 150, 50, this);
		}
	}

	public static void main(String[] args) {
		Viewer f = new Viewer();
		Container c = f.getContentPane();
		JPanel p = new JPanel();
		JLabel l = new JLabel("文字");
		l.setFont(new Font("フォント", Font.PLAIN, 5));
		l.setForeground(Color.red);
		p.add(l);
		//c.add(p, borderlayout.CENTER);
		
	}
}