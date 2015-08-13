package Items;

import java.awt.image.BufferedImage;

public abstract class Items {
	
	
	private BufferedImage image;
	private int type;
	
	//items types
	
	public static final int CONSOMMABLE = 0;
	public static final int POTIONS = 1;
	public static final int WEAPONS = 2;
	public static final int ARMORS = 3;
	
	
	public Items(BufferedImage image, int type) {
		this.image = image;
		this.type = type;
	
	}
	
	
	//getters
	public BufferedImage getImage(){
		return image;
	}

	public int getType(){
		return type;
	}
	
	
}
