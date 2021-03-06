package uk.ac.ox.cs.ensm.ui.charts;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.jfree.ui.RefineryUtilities;

import uk.ac.ox.cs.ensm.EvolutionaryNSM;

/**
 * Thread that controls the norm utility chart frame 
 * 
 * @author "Javier Morales (jmorales@iiia.csic.es)"
 *
 */
public class GameFrequenciesChartThread 
extends Thread implements WindowListener {
	
	//---------------------------------------------------------------------------
	// Attributes
	//---------------------------------------------------------------------------
	
	private GameFrequenciesChartFrame chart;	
	private boolean refresh;
	
	//---------------------------------------------------------------------------
	// Methods
	//---------------------------------------------------------------------------
	
	/**
	 * Constructor
	 * 
	 * @param trafficInstitutions
	 */
	public GameFrequenciesChartThread(EvolutionaryNSM ensm) {
		this.refresh = false;
		
		chart = new GameFrequenciesChartFrame(ensm.getNormativeGamesNetwork());
		chart.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		chart.pack();
    
		RefineryUtilities.centerFrameOnScreen(chart);
	}
	
	/**
	 * Allow the GUI to be updated
	 */
	public void allowRefreshing() {
		synchronized(this) {
			this.refresh = true;
		}
	}
	
	/**
	 * Run method. Refreshes the frame until the infinite
	 */
	@Override
	public void run() {
		this.chart.setVisible(true);
		
		while(true) {
			if(this.refresh) {
				this.chart.refresh();
			}
			try {
	      Thread.currentThread();
				Thread.sleep(Integer.MAX_VALUE);	
	    }
			catch (InterruptedException e) {}
		}
	}

	@Override
  public void windowOpened(WindowEvent e) {}

	@Override
  public void windowClosed(WindowEvent e) {}

	@Override
  public void windowIconified(WindowEvent e) {}

	@Override
  public void windowDeiconified(WindowEvent e) {}

	@Override
  public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
  public void windowClosing(WindowEvent e) {
	  JFrame frame = (JFrame)e.getSource();
	  frame.setVisible(false);
  }
}

