package hust.soict.hedspi.aims.media;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	protected static int nbMedia = 0;
	
	public Media() {
		
	}
	
	public Media(String title) {
		this.id = Count();
		this.title = title;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = Count();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	private int Count() {
		nbMedia++;
		return nbMedia;
	}
	
    public boolean isMatch(String title) {
    	if (getTitle().equals(title))
    		return true;
    	else
    		return false;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object o) {
		Media tmp = (Media)o;
		if(this.getTitle() == tmp.getTitle())
			return true;
		else return false;
	}

	@Override
	public String toString() {
		return "Media: " + (this.getId()+1) + ". " + this.getTitle() +
				" - " + this.getCategory() + ": " + this.getCost() + "$\n";
	}
	
}
