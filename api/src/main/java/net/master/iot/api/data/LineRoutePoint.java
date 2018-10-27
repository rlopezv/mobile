package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineRoutePoint implements Serializable {// , Parcelable {

	@SerializedName("line")
	@Expose
	private String line;
	@SerializedName("secDetail")
	@Expose
	private String secDetail;
	@SerializedName("orderDetail")
	@Expose
	private String orderDetail;
	@SerializedName("node")
	@Expose
	private String node;
	@SerializedName("distance")
	@Expose
	private Integer distance;
	@SerializedName("distancePreviousStop")
	@Expose
	private Integer distancePreviousStop;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;
	// public final static Parcelable.Creator<ResultValue> CREATOR = new
	// Creator<ResultValue>() {
	//
	// @SuppressWarnings({ "unchecked" })
	// public ResultValue createFromParcel(Parcel in) {
	// return new ResultValue(in);
	// }
	//
	// public ResultValue[] newArray(int size) {
	// return (new ResultValue[size]);
	// }
	//
	// };
	private final static long serialVersionUID = 6493176177071074604L;

	// protected ResultValue(Parcel in) {
	// this.line = ((String) in.readValue((String.class.getClassLoader())));
	// this.secDetail = ((String) in.readValue((String.class.getClassLoader())));
	// this.orderDetail = ((String) in.readValue((String.class.getClassLoader())));
	// this.node = ((String) in.readValue((String.class.getClassLoader())));
	// this.distance = ((Integer) in.readValue((Integer.class.getClassLoader())));
	// this.distancePreviousStop = ((Integer)
	// in.readValue((Integer.class.getClassLoader())));
	// this.name = ((String) in.readValue((String.class.getClassLoader())));
	// this.latitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// this.longitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public LineRoutePoint() {
	}

	/**
	 *
	 * @param distance
	 * @param node
	 * @param orderDetail
	 * @param distancePreviousStop
	 * @param name
	 * @param secDetail
	 * @param line
	 * @param longitude
	 * @param latitude
	 */
	public LineRoutePoint(String line, String secDetail, String orderDetail, String node, Integer distance,
			Integer distancePreviousStop, String name, Double latitude, Double longitude) {
		super();
		this.line = line;
		this.secDetail = secDetail;
		this.orderDetail = orderDetail;
		this.node = node;
		this.distance = distance;
		this.distancePreviousStop = distancePreviousStop;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public LineRoutePoint withLine(String line) {
		this.line = line;
		return this;
	}

	public String getSecDetail() {
		return secDetail;
	}

	public void setSecDetail(String secDetail) {
		this.secDetail = secDetail;
	}

	public LineRoutePoint withSecDetail(String secDetail) {
		this.secDetail = secDetail;
		return this;
	}

	public String getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

	public LineRoutePoint withOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
		return this;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public LineRoutePoint withNode(String node) {
		this.node = node;
		return this;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public LineRoutePoint withDistance(Integer distance) {
		this.distance = distance;
		return this;
	}

	public Integer getDistancePreviousStop() {
		return distancePreviousStop;
	}

	public void setDistancePreviousStop(Integer distancePreviousStop) {
		this.distancePreviousStop = distancePreviousStop;
	}

	public LineRoutePoint withDistancePreviousStop(Integer distancePreviousStop) {
		this.distancePreviousStop = distancePreviousStop;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LineRoutePoint withName(String name) {
		this.name = name;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public LineRoutePoint withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public LineRoutePoint withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(line);
	// dest.writeValue(secDetail);
	// dest.writeValue(orderDetail);
	// dest.writeValue(node);
	// dest.writeValue(distance);
	// dest.writeValue(distancePreviousStop);
	// dest.writeValue(name);
	// dest.writeValue(latitude);
	// dest.writeValue(longitude);
	// }

	public int describeContents() {
		return 0;
	}

}