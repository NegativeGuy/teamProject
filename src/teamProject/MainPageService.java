package teamProject;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainPageService {
	
	Parent root;
	ImageView fxImageView;
	Image image;
	int bookNum=3;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void arrowClick(int arrClk) {
		fxImageView = (ImageView)root.lookup("#viewBook");
		if(arrClk==0) {
			bookNum--;
			if(bookNum<1) {
				bookNum=5;
			}
			image = new Image(getClass().getResource("/teamProject/books/book"+bookNum+".png").toExternalForm());
			fxImageView.setImage(image);
			//System.out.println("왼쪽 클릭");
		}else {
			bookNum++;
			if(bookNum>5) {
				bookNum=1;
			}
			image = new Image(getClass().getResource("/teamProject/books/book"+bookNum+".png").toExternalForm());
			fxImageView.setImage(image);
			//System.out.println("오른쪽 클릭");
		}
	}
}
