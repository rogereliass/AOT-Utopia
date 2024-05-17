package game.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.ResourceBundle;

import game.engine.base.Wall;
import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LaneController {

	Lane lane;
	ArrayList<TitanView> titansInLane = new ArrayList<TitanView>();
	WallView wallView ;
	WeaponLaneView weaponLane;
	AnchorPane lanePane;
	HBox fullLaneView; //ALL COMPONENTS OF THE LANE
	private ImageView lostLane;
	
	
	public LaneController(Lane lane) {
		this.lane = lane;
		this.wallView = new WallView(lane); 
		this.weaponLane = new WeaponLaneView(lane.getWeapons());
		
		if(lane==null || lane.isLaneLost()) {
			lane.getTitans().clear();
			lostLane.setOpacity(0.0);
		}
			
		this.lanePane = new AnchorPane();
		this.fullLaneView = new HBox();
		lanePane.setMaxWidth(700);
		lanePane.setMaxHeight(450);
		fullLaneView.setMaxWidth(700);
		fullLaneView.setMaxHeight(450);
		
		
		fullLaneView.getChildren().addAll(weaponLane.getGridPane(),wallView.getWallBox(),lanePane);
		
		//lanePane.setStyle(null);
//		AnchorPane.setLeftAnchor(wallView.getWallBox(), 0.0);
//		AnchorPane.setLeftAnchor(weaponLane.getGridPane(), 100.0);
		//Image laneImg = new Image(getClass().getResourceAsStream("wall.png"));
        //lostLane = new ImageView(laneImg);
		updateTitansViews();
		
	}

	public void refreshLane(Lane newLane) {
		this.lane = newLane;
		
		if(lane==null || lane.isLaneLost()) {
			//lanePane.getChildren().add(lostLane);
			
			
			
		} else {
			WallView.updateWall(lane.getLaneWall());
			weaponLane = new WeaponLaneView(lane.getWeapons());
			updateTitansViews();		
		}
	}

	private void updateTitansViews() {
		titansInLane.clear();
		PriorityQueue<Titan> queue = lane.getTitans();
		for(Titan currTitan : queue) {
			titansInLane.add(new TitanView(currTitan));
		}
		
		for(TitanView currTitan : titansInLane) {
			int rndm = (int)Math.random()*70;
			currTitan.getTitanBox().setTranslateX(currTitan.getTitan().getDistance()*20+rndm);
			currTitan.getTitanBox().setTranslateY(-30);
			lanePane.getChildren().add(currTitan.getTitanBox());
			AnchorPane.setLeftAnchor(currTitan, 0.0);
		}
		
	}

	public Lane getLane() {
		return lane;
	}

	public ArrayList<TitanView> getTitansInLane() {
		return titansInLane;
	}

	public AnchorPane getLanePane() {
		return lanePane;
	}

	public void setLanePane(AnchorPane lanePane) {
		this.lanePane = lanePane;
	}

	public HBox getFullLaneView() {
		return fullLaneView;
	}

	public void setFullLaneView(HBox fullLaneView) {
		this.fullLaneView = fullLaneView;
	}

	
	
}
