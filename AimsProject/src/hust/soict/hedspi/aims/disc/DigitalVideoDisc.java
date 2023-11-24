package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Media {

    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    // Create constructor method
    public DigitalVideoDisc() {
    	super();
	}

    public DigitalVideoDisc(String title) {
		setTitle(title);
		setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		setTitle(title);
		setCategory(category);
		setCost(cost);
		setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		setTitle(title);
		setCategory(category);
		this.director = director;
		setCost(cost);
		setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
		setCost(cost);
		setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
    
    public String toString() {
    	return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
    	 + " - " + this.getLength() + " - " + this.getCost() + "$\n";
    }
    public boolean isMatch(String title) {
    	if (getTitle().equals(title))
    		return true;
    	else
    		return false;
    }
    
    // Create accessors and mutators
    public String getDirector() {
        return director;
    }
    
    public int getLength() {
        return length;
    }
    
	// set to change in TestPassingParameter.java
    public void setDirector(String director) {
        this.director = director;
    }
    
    public void setLength (int length){
        this.length = length;
    }
    
}
