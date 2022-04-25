package Week1;

import java.awt.Dialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class oder {
	public static final int MAX_NUMBERS_ORDERD = 10;
	private DigitalVideoDisc itemOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERD];
	public static int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBERS_ORDERD) {
		this.itemOdered[qtyOrdered] = new DigitalVideoDisc();
		this.itemOdered[qtyOrdered] = disc;
		JOptionPane.showMessageDialog(null, "add "+this.itemOdered[qtyOrdered].getTitle()+" success");
		qtyOrdered++;
		}
		else JOptionPane.showMessageDialog(null, "full slot");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int k = 0;
		for(int i = 0;i<qtyOrdered;++i) {
			if(disc.equals(itemOdered[i])) k=i;
		}
		for(int i = k-1;i<qtyOrdered-1;++i) {
			itemOdered[i] = itemOdered[i+1];
		}
		qtyOrdered++;
	}
	public float totalCost() {
		float total= 0;
		for (int i=0;i<qtyOrdered;++i) {
			total+=itemOdered[i].getCost();
		}
		return total;
	}
}
