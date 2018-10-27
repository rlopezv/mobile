package net.master.iot.api.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineGeoRoute implements Serializable {// , Parcelable {

	@SerializedName("resultCode")
	@Expose
	private Integer resultCode;
	@SerializedName("resultDescription")
	@Expose
	private String resultDescription;
	@SerializedName("resultValues")
	@Expose
	private List<LineRoutePoint> resultValues = new ArrayList<LineRoutePoint>();
	// public final static Parcelable.Creator<LineGeoRoute> CREATOR = new
	// Creator<LineGeoRoute>() {
	//
	// @SuppressWarnings({ "unchecked" })
	// public LineGeoRoute createFromParcel(Parcel in) {
	// return new LineGeoRoute(in);
	// }
	//
	// public LineGeoRoute[] newArray(int size) {
	// return (new LineGeoRoute[size]);
	// }
	//
	// };
	private final static long serialVersionUID = 8203776966104271495L;

	// protected LineGeoRoute(Parcel in) {
	// this.resultCode = ((Integer) in.readValue((Integer.class.getClassLoader())));
	// this.resultDescription = ((String)
	// in.readValue((String.class.getClassLoader())));
	// in.readList(this.resultValues,
	// (net.master.iot.api.data.ResultValue.class.getClassLoader()));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public LineGeoRoute() {
	}

	/**
	 *
	 * @param resultValues
	 * @param resultCode
	 * @param resultDescription
	 */
	public LineGeoRoute(Integer resultCode, String resultDescription, List<LineRoutePoint> resultValues) {
		super();
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
		this.resultValues = resultValues;
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public LineGeoRoute withResultCode(Integer resultCode) {
		this.resultCode = resultCode;
		return this;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	public LineGeoRoute withResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
		return this;
	}

	public List<LineRoutePoint> getResultValues() {
		return resultValues;
	}

	public void setResultValues(List<LineRoutePoint> resultValues) {
		this.resultValues = resultValues;
	}

	public LineGeoRoute withResultValues(List<LineRoutePoint> resultValues) {
		this.resultValues = resultValues;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(resultCode);
	// dest.writeValue(resultDescription);
	// dest.writeList(resultValues);
	// }

	public int describeContents() {
		return 0;
	}

}