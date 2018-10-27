
package net.master.iot.api.data;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

public class Stop implements Serializable {// , Parcelable

	@SerializedName("stopId")
	@Expose
	private String stopId;
	@SerializedName("pmv")
	@Expose
	private Integer pmv;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("postalAddress")
	@Expose
	private String postalAddress;
	@SerializedName("longitude")
	@Expose
	private Double longitude;
	@SerializedName("latitude")
	@Expose
	private Double latitude;

	@SerializedName("line")
	@Expose
	@JsonAdapter(LineJsonAdapter.class)
	private List<StopLine> line;

	@SerializedName("lineId")
	@Expose
	@JsonAdapter(LineIdJsonAdapter.class)
	private List<String> lineId;

	// public final static Parcelable.Creator<Stop> CREATOR = new Creator<Stop>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public Stop createFromParcel(Parcel in) {
	// return new Stop(in);
	// }
	//
	// public Stop[] newArray(int size) {
	// return (new Stop[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = -1065096060713286595L;

	// protected Stop(Parcel in) {
	// this.stopId = ((String) in.readValue((String.class.getClassLoader())));
	// this.pmv = ((Integer) in.readValue((Integer.class.getClassLoader())));
	// this.name = ((String) in.readValue((String.class.getClassLoader())));
	// this.postalAddress = ((String)
	// in.readValue((String.class.getClassLoader())));
	// this.longitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// this.latitude = ((Double) in.readValue((Double.class.getClassLoader())));
	// in.readList(this.lineId, (java.lang.String.class.getClassLoader()));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Stop() {
	}

	/**
	 *
	 * @param pmv
	 * @param stopId
	 * @param name
	 * @param postalAddress
	 * @param longitude
	 * @param latitude
	 * @param lineId
	 */
	public Stop(String stopId, Integer pmv, String name, String postalAddress, Double longitude, Double latitude,
			String[] lineId) {
		super();
		this.stopId = stopId;
		this.pmv = pmv;
		this.name = name;
		this.postalAddress = postalAddress;
		this.longitude = longitude;
		this.latitude = latitude;
		// this.lineId = lineId;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public Stop withStopId(String stopId) {
		this.stopId = stopId;
		return this;
	}

	public Integer getPmv() {
		return pmv;
	}

	public void setPmv(Integer pmv) {
		this.pmv = pmv;
	}

	public Stop withPmv(Integer pmv) {
		this.pmv = pmv;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stop withName(String name) {
		this.name = name;
		return this;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public Stop withPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Stop withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Stop withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public List<StopLine> getLine() {
		return line;
	}

	public void setLine(List<StopLine> line) {
		this.line = line;
	}

	public Stop withLine(List<StopLine> line) {
		this.line = line;
		return this;
	}

	public List<String> getLineId() {
		return lineId;
	}

	public void setLineId(List<String> lineId) {
		this.lineId = lineId;
	}

	public Stop withLineId(List<String> lineId) {
		this.lineId = lineId;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(stopId);
	// dest.writeValue(pmv);
	// dest.writeValue(name);
	// dest.writeValue(postalAddress);
	// dest.writeValue(longitude);
	// dest.writeValue(latitude);
	// dest.writeList(lineId);
	// }

	public int describeContents() {
		return 0;
	}

	@Override
	public String toString() {
		return "Stop [stopId=" + stopId + ", pmv=" + pmv + ", name=" + name + ", postalAddress=" + postalAddress
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", line=" + line + ", lineId=" + lineId + "]";
	}

	static class LineIdJsonAdapter implements JsonSerializer<List<String>>, JsonDeserializer<List<String>> {

		@Override
		public JsonElement serialize(List<String> list, Type t, JsonSerializationContext jsc) {
			if (list.size() == 1) {
				return jsc.serialize(list.get(0));
			} else {
				return jsc.serialize(list);
			}
		}

		@Override
		public List<String> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext jsc)
				throws JsonParseException {
			List<String> result;

			if (json.isJsonArray()) {
				result = jsc.deserialize(json, typeOfT);
			} else {
				result = new ArrayList<>();
				result.add((String) jsc.deserialize(json, String.class));
			}
			return result;
		}

	}

	static class LineJsonAdapter implements JsonSerializer<List<StopLine>>, JsonDeserializer<List<StopLine>> {

		@Override
		public JsonElement serialize(List<StopLine> list, Type t, JsonSerializationContext jsc) {
			if (list.size() == 1) {
				return jsc.serialize(list.get(0));
			} else {
				return jsc.serialize(list);
			}
		}

		@Override
		public List<StopLine> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext jsc)
				throws JsonParseException {
			List<StopLine> result;

			if (json.isJsonArray()) {
				result = jsc.deserialize(json, typeOfT);
			} else {
				result = new ArrayList<>();
				result.add((StopLine) jsc.deserialize(json, StopLine.class));
			}
			return result;
		}

	}

}
