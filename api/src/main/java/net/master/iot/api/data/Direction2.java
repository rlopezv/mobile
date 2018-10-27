
package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Direction2 implements Serializable {// , Parcelable

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
	// public final static Parcelable.Creator<Direction2> CREATOR = new
	// Creator<Direction2>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public Direction2 createFromParcel(Parcel in) {
	// return new Direction2(in);
	// }
	//
	// public Direction2 [] newArray(int size) {
	// return (new Direction2[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = 6298422473990595942L;

	// protected Direction2(Parcel in) {
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
	public Direction2() {
	}

	/**
	 * 
	 * @param startTime
	 * @param minimumFrequency
	 * @param maximumFrequency
	 * @param stopTime
	 */
	public Direction2(String startTime, String stopTime, String minimumFrequency, String maximumFrequency) {
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

	public Direction2 withStartTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public Direction2 withStopTime(String stopTime) {
		this.stopTime = stopTime;
		return this;
	}

	public String getMinimumFrequency() {
		return minimumFrequency;
	}

	public void setMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
	}

	public Direction2 withMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
		return this;
	}

	public String getMaximumFrequency() {
		return maximumFrequency;
	}

	public void setMaximumFrequency(String maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
	}

	public Direction2 withMaximumFrequency(String maximumFrequency) {
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
