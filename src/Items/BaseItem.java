package Items;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class BaseItem {

	private int itemSize;
	
	
	private int itemsPerLine;
	private int spriteWidth = 34;
	private int spriteHeight = 34;
	
	private BufferedImage itemSheet;
	private Items[][] items;
	
	public BaseItem(int itemSize) {
		this.itemSize = itemSize;
		
		
	}

	public void loadItems(String path) throws IOException{
		itemSheet = ImageIO.read(getClass().getResourceAsStream(path));
		
		
		itemsPerLine = itemSheet.getWidth() / itemSize;
		items = new Items[2][itemsPerLine];
		
		BufferedImage subimage;
		for(int col = 0; col < itemsPerLine; col++) {
			subimage = itemSheet.getSubimage(
					col * itemSize,
					0,
					itemSize,
					itemSize
				);
			/*
			items[0][col] = new Items(subimage, Items.CONSOMMABLE);
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
				);
			items[1][col] = new Items(subimage, Items.CONSOMMABLE);
		
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
				);
			items[2][col] = new Items(subimage, Items.POTIONS);
		
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
					);
			items[3][col] = new Items(subimage, Items.POTIONS);
			
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
					);
			items[4][col] = new Items(subimage, Items.WEAPONS);
			
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
					);
			items[5][col] = new Items(subimage, Items.WEAPONS);
			
			subimage = itemSheet.getSubimage(
					col * itemSize,
					itemSize,
					itemSize,
					itemSize
					);
			items[6][col] = new Items(subimage, Items.POTIONS);
		
		
		}*/
		
		
		}
	
	
	}
	
}
