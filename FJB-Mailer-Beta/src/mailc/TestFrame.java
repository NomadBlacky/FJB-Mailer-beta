package mailc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class TestFrame extends JFrame {


	public TestFrame() {

		setSize(600, 400);

		JPanel panel = new JPanel();

		MigLayout layout = new MigLayout(
				"wrap 3", 			// 全体的なレイアウト設定(layoutConstraints)
				"[200][200][200]", 	// 列のセル指定(colConstraints)
				"[100][100][100]"	// 行のセル指定(rowConstraints)
		);
		// パネルにレイアウトのインスタンスを設定
		panel.setLayout(layout);

		// パネルにコンポーネントを追加していく
		panel.add(new JButton("1A"), "");
		panel.add(new JButton("1B"), "");
		panel.add(new JButton("1C"), "");

		panel.add(new JButton("2A"), "");
		panel.add(new JButton("2B"), "");
		panel.add(new JButton("2C"), "");

		panel.add(new JButton("3A"), "");
		panel.add(new JButton("3A"), "");
		panel.add(new JButton("3A"), "");

		// 自身(TestFrame)にパネルを追加する
		this.add(panel);
	}


	public static void main(String[] args) {

		TestFrame testFrame = new TestFrame();

		// 画面の中央に表示させる
		testFrame.setLocationRelativeTo(null);
		testFrame.setVisible(true);
	}
}
