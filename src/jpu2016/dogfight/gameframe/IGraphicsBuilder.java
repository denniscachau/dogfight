package jpu2016.dogfight.gameframe;

public interface IGraphicsBuilder {
	public void applyModelToGraphic (Graphics graphic, ImageObserver observer) {}
	public int getGlobalWidth() {
		return 1;
	}
	public int getGlobalHeight() {
		return 1;
	}
}
 