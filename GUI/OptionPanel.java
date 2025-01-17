package GUI;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Manager.ProjectManager;

public class OptionPanel extends JPanel{
	ProjectManager manager;
	
	AddPanel addpanel;
	RunPanel runpanel;
	AdditionalButtonPanel additionalbuttonpanel;
	InformationPanel informationpanel;
	GhanttChartPanel ghanttchartpanel_1;
	GhanttChartPanel ghanttchartpanel_2;
	GhanttChartPanel ghanttchartpanel_3;
	GhanttChartPanel ghanttchartpanel_4;
	ReadyQueuePanel readyQueue;
	MFQReadyQueue MFQreadyQueue;
	
	public OptionPanel(InformationPanel informationpanel, GhanttChartPanel ghanttchartpanel_1, GhanttChartPanel ghanttchartpanel_2,
			GhanttChartPanel ghanttchartpanel_3,GhanttChartPanel ghanttchartpanel_4, JLabel CoreLabel_1, JLabel CoreLabel_2,
			JLabel CoreLabel_3, JLabel CoreLabel_4,
			ReadyQueuePanel readyQueue, MFQReadyQueue MFQreadyQueue, MainPanel mainPanel, MainFrame mainFrame) {
		this.informationpanel = informationpanel;
		this.ghanttchartpanel_1 = ghanttchartpanel_1;
		this.ghanttchartpanel_2 = ghanttchartpanel_2;
		this.ghanttchartpanel_3 = ghanttchartpanel_3;
		this.ghanttchartpanel_4 = ghanttchartpanel_4;
		this.readyQueue = readyQueue;
		this.MFQreadyQueue = MFQreadyQueue;
		
		Base();
		addpanel = new AddPanel(manager);
		runpanel = new RunPanel(manager);
		additionalbuttonpanel = new AdditionalButtonPanel(manager);
		
		manager.mainPanel = mainPanel;
		manager.coreLabel_1 = CoreLabel_1;
		manager.coreLabel_2 = CoreLabel_2;
		manager.coreLabel_3 = CoreLabel_3;
		manager.coreLabel_4 = CoreLabel_4;
		manager.mainFrame = mainFrame;
		
		add(addpanel);
		add(runpanel);
		add(additionalbuttonpanel);
	}
	
	private void Base() {
		setSize(520, 300);
		setLocation(730, 10);
		setBackground(Color.WHITE);
		manager = new ProjectManager(informationpanel, readyQueue, ghanttchartpanel_1, 
				ghanttchartpanel_2, ghanttchartpanel_3, ghanttchartpanel_4,  MFQreadyQueue);
		setLayout(null);
	}
}
