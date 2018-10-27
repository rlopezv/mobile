
package net.master.iot.api.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Line implements Serializable {// , Parcelable

	@SerializedName("lineId")
	@Expose
	private String lineId;
	@SerializedName("label")
	@Expose
	private String label;
	@SerializedName("headerA")
	@Expose
	private String headerA;
	@SerializedName("headerB")
	@Expose
	private String headerB;
	@SerializedName("dayType")
	@Expose
	private List<DayType> dayType = new ArrayList<DayType>();
	// public final static Parcelable.Creator<Line> CREATOR = new Creator<Line>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public Line createFromParcel(Parcel in) {
	// return new Line(in);
	// }
	//
	// public Line[] newArray(int size) {
	// return (new Line[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = -3289492997110756627L;

	// protected Line(Parcel in) {
	// this.lineId = ((String) in.readValue((String.class.getClassLoader())));
	// this.label = ((String) in.readValue((String.class.getClassLoader())));
	// this.headerA = ((String) in.readValue((String.class.getClassLoader())));
	// this.headerB = ((String) in.readValue((String.class.getClassLoader())));
	// in.readList(this.dayType,
	// (net.es.upm.miot.madridtrafficcameras.DayType.class.getClassLoader()));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Line() {
	}

	/**
	 *
	 * @param label
	 * @param dayType
	 * @param headerA
	 * @param lineId
	 * @param headerB
	 */
	public Line(String lineId, String label, String headerA, String headerB, List<DayType> dayType) {
		super();
		this.lineId = lineId;
		this.label = label;
		this.headerA = headerA;
		this.headerB = headerB;
		this.dayType = dayType;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public Line withLineId(String lineId) {
		this.lineId = lineId;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Line withLabel(String label) {
		this.label = label;
		return this;
	}

	public String getHeaderA() {
		return headerA;
	}

	public void setHeaderA(String headerA) {
		this.headerA = headerA;
	}

	public Line withHeaderA(String headerA) {
		this.headerA = headerA;
		return this;
	}

	public String getHeaderB() {
		return headerB;
	}

	public void setHeaderB(String headerB) {
		this.headerB = headerB;
	}

	public Line withHeaderB(String headerB) {
		this.headerB = headerB;
		return this;
	}

	public List<DayType> getDayType() {
		return dayType;
	}

	public void setDayType(List<DayType> dayType) {
		this.dayType = dayType;
	}

	public Line withDayType(List<DayType> dayType) {
		this.dayType = dayType;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(lineId);
	// dest.writeValue(label);
	// dest.writeValue(headerA);
	// dest.writeValue(headerB);
	// dest.writeList(dayType);
	// }

	public int describeContents() {
		return 0;
	}

	@Override
	public String toString() {
		return "Line [lineId=" + lineId + ", label=" + label + ", headerA=" + headerA + ", headerB=" + headerB
				+ ", dayType=" + dayType + "]";
	}

}
