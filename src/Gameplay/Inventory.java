package Gameplay;

import java.awt.Graphics;

import Entities.Player;

public class Inventory {

	private Player player;
	
	
	public Inventory(Player player) {
		this.player = player;
	}
	
	public void draw(Graphics g){
		
	}
	
	public void tick(){
		
	}

}
//faire un getter ToucheIEnclench�e() boolean dans player et une methode render ici � appeler dans GameState avec des ticks avec un if dans GameState