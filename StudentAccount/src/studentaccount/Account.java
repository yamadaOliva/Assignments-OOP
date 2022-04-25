package studentaccount;
import java.util.*;

import javax.swing.JOptionPane;
public class Account {
	private String name;
	private double money;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name,double money) {
		this.name = name;
		this.money = money;
		System.out.println("Name: " +this.name+"\nTotal: "+this.money+"VND");
	}
	public void money_out() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien muon rut: ");
		double value = sc.nextDouble();
		if(value<this.money) {
		setMoney(this.money-value);
		System.out.println("Tai khoan hien tai: "+getMoney()+"VND");
		} else {
			JOptionPane.showMessageDialog(null,"Khong du tien");
		}
	}
	public void money_in() {
		System.out.print("Nhap so tien muon gui: ");
		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		setMoney(this.money+value);
		System.out.println("Tai khoan hien tai: "+getMoney()+"VND");
	}
	public void display() {
		System.out.println("Name: " +this.name+"\nTotal: "+this.money+"VND");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
