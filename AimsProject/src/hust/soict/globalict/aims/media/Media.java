package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =  new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =  new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) { // If they refer to the same object in memory
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) { // Check for null and class type
	        return false;
	    }
		Media media = (Media) obj;
		if(this.getTitle().equals(media.getTitle())) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}

}
