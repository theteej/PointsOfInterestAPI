package lithium.poi.api;

import org.bukkit.entity.Player;

public class PoiEvent {
	// TODO: figure out how to properly javaDoc this.
	public enum Type { SELECTION_CHANGE };

	private Player _player;
	private IPoi _poi;
	private PoiEvent.Type _type;

	private PoiEvent() {}

	public static PoiEvent unselectEvent(Player player) {
		PoiEvent event = new PoiEvent();
		event._player = player;
		event._poi = null;
		event._type = PoiEvent.Type.SELECTION_CHANGE;
		return event;
	}

	public static PoiEvent selectEvent(Player player, IPoi poi) {
		PoiEvent event = new PoiEvent();
		event._player = player;
		event._poi = poi;
		event._type = PoiEvent.Type.SELECTION_CHANGE;
		return event;
	}

	/**
	 * Get a handle to the player which is related to this POI event.
	 *
	 * @return
	 */
	public Player getPlayer() {
		return _player;
	}

	/**
	 * Get the POI associated with the event.
	 *
	 * @return In the case of PoiEvent.Type.SELECTION_CHANGE, null may be returned to indicate that the player no longer
	 * has a selected POI.
	 *
	 * In the case of PoiEvent.Type.IN_RANGE_CHANGE, there will always be a POI.
	 */
	public IPoi getPoi() {
		return _poi;
	}

	/**
	 * Get the PoiEvent.Type associated with the event.
	 *
	 * @return
	 */
	public PoiEvent.Type getType() {
		return _type;
	}
}
