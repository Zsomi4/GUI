import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	JLabel felirat;
	JLabel nevjLabel;
	JButton mehetGomb;
	JTextField bevitel;

	public MainFrame() {
		setComponents();
		setWindow();
	}

	public void setComponents() {
		felirat = new JLabel("Felirat!");
		felirat.setBounds(30, 30, 100, 30);		
		nevjLabel = new JLabel();
		nevjLabel.setText("Zsomi");
		
		Dimension dim = new Dimension(30, 70);
		Point point = new Point(30, 70);
		nevjLabel.setSize(dim);
		nevjLabel.setLocation(point);

		mehetGomb = new JButton("Mehet");
		mehetGomb.setBounds(30, 110, 70, 30);
		mehetGomb.addActionListener(event -> mehetGombClick());

		bevitel = new JTextField();
		bevitel.setBounds(30, 150, 120, 30);
		bevitel.getText();
	}

	public void setWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		nevjLabel.setBounds(30, 70, 100, 30);
		setVisible(true);
		setTitle("GUI Kezelés");
		add(felirat);
		add(nevjLabel);
		add(mehetGomb);
		add(bevitel);
		setLayout(null);
		setResizable(false);
	}
	public void mehetGombClick() {
		String szoveg = bevitel.getText();
		setTitle(szoveg);
		bevitel.setText("");
	}

}
