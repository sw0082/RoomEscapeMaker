package roomescapemaker.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.image.Image;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;


public class RoomScene {
	
	public final StringProperty sceneName = new SimpleStringProperty();
	public final ObjectProperty<Image> backGroundImage = new SimpleObjectProperty<Image>();
	private ObservableList<RoomObject> roomObjectList = FXCollections.observableArrayList();
	
	public RoomScene(String sceneName, Image backGroundImage) {
		this.sceneName.set(sceneName);
		this.backGroundImage.set(backGroundImage);
	}
	
	public String getSceneName() {
		return sceneName.get();
	}
	
	public void setSceneName(String sceneName) {
		this.sceneName.set(sceneName);
	}
	
	public StringProperty sceneNameProperty() {
		return sceneName;
	}
	
	public Image getBackGroundImage() {
		return backGroundImage.get();
	}
	
	public void setBackGroundImage(Image backGroundImage) {
		this.backGroundImage.set(backGroundImage);
	}
	
	public ObjectProperty<Image> backGroundImageProperty() {
		return backGroundImage;
	}
	
	public ObservableList<RoomObject> getRoomObjectList(){
		return roomObjectList;
	}
	
	public void addRoomObject(String objectName) {
		roomObjectList.add(new RoomObject(objectName));
	}
	
	public RoomObject getRoomObject(int index) {
		return roomObjectList.get(index);
	}
	
	public void removeRoomObject(int index) {
		roomObjectList.remove(index);
	}
	
}