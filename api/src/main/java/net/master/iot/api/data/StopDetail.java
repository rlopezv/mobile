package net.master.iot.api.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StopDetail implements Serializable {// , Parcelable {

	@SerializedName("longitude")
	@Expose
	private Double longitude;
	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("stop")
	@Expose
	private List<Stop> stop = new ArrayList<Stop>();
	// public final static Parcelable.Creator<StopDetail> CREATOR = new
	// Creator<StopDetail>() {
	//
	// @SuppressWarnings({ "unchecked" })
	// public StopDetail createFromParcel(Parcel in) {
	// return new StopDetail(in);
	// }
	//
	// public StopDetail[] newArray(int size) {
	// return (new StopDetail[size]);
	// }
	//
	// };
	private final static long serialVersionUID = -7697115673956407599L;

	// protected StopDetail(Parcel in) {
	// this.longitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// this.latitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// in.readList(this.stop,
	// (net.master.iot.api.data.Stop.class.getClassLoader()));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public StopDetail() {
	}

	/**
	 *
	 * @param stop
	 * @param longitude
	 * @param latitude
	 */
	public StopDetail(Double longitude, Double latitude, List<Stop> stop) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.stop = stop;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public StopDetail withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public StopDetail withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public List<Stop> getStop() {
		return stop;
	}

	public void setStop(List<Stop> stop) {
		this.stop = stop;
	}

	public StopDetail withStop(List<Stop> stop) {
		this.stop = stop;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(longitude);
	// dest.writeValue(latitude);
	// dest.writeList(stop);
	// }

	public int describeContents() {
		return 0;
	}

}