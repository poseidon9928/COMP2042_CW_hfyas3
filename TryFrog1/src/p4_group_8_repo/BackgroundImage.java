package p4_group_8_repo;

import javafx.scene.image.Image;

/**
 * A base class for adding background to the game
 * @author Amit Saha
 *
 */
public class BackgroundImage extends Actor{

	@Override
	public void act(long now) {
		
		
	}
	
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 900, true, true));
		
	}

}
