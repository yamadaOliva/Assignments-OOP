package Week1;
import java.awt.Dialog;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import java.time.*;
public class oder {
	public static final int MAX_NUMBERS_ORDERD = 10;
	private LocalDate inputDate;
	private DigitalVideoDisc itemOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERD];
	public static int qtyOrdered = 0;
	public LocalDate getTime() {
		return this.inputDate;
	}
	public oder() {
		inputDate = LocalDate.now();
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBERS_ORDERD) {
		this.itemOdered[qtyOrdered] = new DigitalVideoDisc();
		this.itemOdered[qtyOrdered] = disc;
		qtyOrdered++;
		}
		else JOptionPane.showMessageDialog(null, "full slot");
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(dvdList.length + qtyOrdered < MAX_NUMBERS_ORDERD ) {
			for(int i = 0;i<dvdList.length;++i) {
				this.itemOdered[qtyOrdered++] = dvdList[i];
			}
		}else {
			JOptionPane.showMessageDialog(null, "full slot");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered + 2 < MAX_NUMBERS_ORDERD) {
			this.itemOdered[qtyOrdered++] = dvd1;
			this.itemOdered[qtyOrdered++] = dvd2;
		}else {
			JOptionPane.showMessageDialog(null, "full slot");
		}
	}
	public void addDigitalVideoDisc(int quantity) {
		if(quantity + qtyOrdered < MAX_NUMBERS_ORDERD) {
			for(int i = 0;i<quantity;++i) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Title"+i+":" );
				String box = sc.next();
				DigitalVideoDisc ptr = new DigitalVideoDisc(box);
				this.itemOdered[qtyOrdered++] = ptr;
			}
		}else {
			JOptionPane.showMessageDialog(null, "full slot");
		}
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
	public void display() {
		System.out.println("Ngay tao: "+this.getTime());
		for(int i = 0;i<qtyOrdered;++i) {
			System.out.println("Number " + i + ":" + itemOdered[i].getTitle() );
		}
		System.out.println("Total:"+totalCost()+"$");
	}
}
