
package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Direction implements Serializable {// , Parcelable

	@SerializedName("startTime")
	@Expose
	private String startTime;
	@SerializedName("stopTime")
	@Expose
	private String stopTime;
	@SerializedName("minimumFrequency")
	@Expose
	private String minimumFrequency;
	@SerializedName("maximumFrequency")
	@Expose
	private String maximumFrequency;
	// public final static Parcelable.Creator<Direction> CREATOR = new
	// Creator<Direction>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public Direction createFromParcel(Parcel in) {
	// return new Direction(in);
	// }
	//
	// public Direction [] newArray(int size) {
	// return (new Direction[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = -5784047572928960281L;

	// protected Direction(Parcel in) {
	// this.startTime = ((String) in.readValue((String.class.getClassLoader())));
	// this.stopTime = ((String) in.readValue((String.class.getClassLoader())));
	// this.minimumFrequency = ((String)
	// in.readValue((String.class.getClassLoader())));
	// this.maximumFrequency = ((String)
	// in.readValue((String.class.getClassLoader())));
	// }

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Direction() {
	}

	/**
	 * 
	 * @param startTime
	 * @param minimumFrequency
	 * @param maximumFrequency
	 * @param stopTime
	 */
	public Direction(String startTime, String stopTime, String minimumFrequency, String maximumFrequency) {
		super();
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.minimumFrequency = minimumFrequency;
		this.maximumFrequency = maximumFrequency;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Direction withStartTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public Direction withStopTime(String stopTime) {
		this.stopTime = stopTime;
		return this;
	}

	public String getMinimumFrequency() {
		return minimumFrequency;
	}

	public void setMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
	}

	public Direction withMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
		return this;
	}

	public String getMaximumFrequency() {
		return maximumFrequency;
	}

	public void setMaximumFrequency(String maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
	}

	public Direction withMaximumFrequency(String maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(startTime);
	// dest.writeValue(stopTime);
	// dest.writeValue(minimumFrequency);
	// dest.writeValue(maximumFrequency);
	// }

	public int describeContents() {
		return 0;
	}

}
