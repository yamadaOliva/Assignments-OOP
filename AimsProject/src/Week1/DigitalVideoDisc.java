package Week1;
import java.time.*; 
   
import java.util.Date;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	public DigitalVideoDisc() {
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title,String category) {
		super();
		this.category = category;
		this.title = title;
	}
	public DigitalVideoDisc(String director,String title,String category) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title,String director,String category,int length,float cost) {
		super();
		this.title = title;
		this.director = director;
		this.category = category;
		this.length = length;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
