package lithium.poi.api;

public interface IPointsOfInterest {
	void registerPoiListener(PoiEvent.Type type, IPoiListener poiListener);
}
