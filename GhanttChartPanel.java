import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GhanttChartPanel extends JPanel{

	JScrollPane GhanttchartScroll;
	public InformationPanel information;
	public GhanttChartPanel() {
		setBackground(Color.green);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	
	public void ScrollSetting(JScrollPane GhanttchartScroll) {
		this.GhanttchartScroll = GhanttchartScroll;
	}
	
	public void adding(JLabel FCFSName) {				// 지워야 함
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		panel.setBackground(Color.BLUE);
		JLabel label = new JLabel(FCFSName.getText());
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		label.setOpaque(true);
		label.setBackground(Color.yellow);
		panel.setPreferredSize(new Dimension(60, 120));
		add(panel);
		revalidate();
		GhanttchartScroll.getHorizontalScrollBar().setValue(GhanttchartScroll.getHorizontalScrollBar().getMaximum());
	}
	public void InformationRelay(double TT, double WT, double NTT, String Row) {
		int row = Integer.parseInt(Row);
		information.ChangeInformation(TT, WT, NTT, row);
	}
}
