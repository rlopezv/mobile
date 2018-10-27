package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StopLine implements Serializable {// , Parcelable

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("line")
	@Expose
	private String line;
	@SerializedName("headerA")
	@Expose
	private String headerA;
	@SerializedName("headerB")
	@Expose
	private String headerB;
	@SerializedName("direction")
	@Expose
	private String direction;
	@SerializedName("TipoDia")
	@Expose
	private String tipoDia;
	@SerializedName("dayType")
	@Expose
	private String dayType;
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
	// public final static Parcelable.Creator<StopLine> CREATOR=new
	// Creator<StopLine>(){

	// @SuppressWarnings({"unchecked"})public Line createFromParcel(Parcel
	// in){return new Line(in);}
	//
	// public Line[]newArray(int size){return(new StopLine[size]);}
	//
	// };
	private final static long serialVersionUID = 8525335728896865012L;

	// protected StopLine(Parcel in) {
	// this.name = ((String) in.readValue((String.class.getClassLoader())));
	// this.line = ((String) in.readValue((String.class.getClassLoader())));
	// this.headerA = ((String) in.readValue((String.class.getClassLoader())));
	// this.headerB = ((String) in.readValue((String.class.getClassLoader())));
	// this.direction = ((String) in.readValue((String.class.getClassLoader())));
	// this.tipoDia = ((String) in.readValue((String.class.getClassLoader())));
	// this.dayType = ((String) in.readValue((String.class.getClassLoader())));
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
	public StopLine() {
	}

	/**
	 *
	 * @param startTime
	 * @param tipoDia
	 * @param minimumFrequency
	 * @param direction
	 * @param name
	 * @param maximumFrequency
	 * @param line
	 * @param dayType
	 * @param headerA
	 * @param stopTime
	 * @param headerB
	 */
	public StopLine(String name, String line, String headerA, String headerB, String direction, String tipoDia,
			String dayType, String startTime, String stopTime, String minimumFrequency, String maximumFrequency) {
		super();
		this.name = name;
		this.line = line;
		this.headerA = headerA;
		this.headerB = headerB;
		this.direction = direction;
		this.tipoDia = tipoDia;
		this.dayType = dayType;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.minimumFrequency = minimumFrequency;
		this.maximumFrequency = maximumFrequency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StopLine withName(String name) {
		this.name = name;
		return this;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public StopLine withLine(String line) {
		this.line = line;
		return this;
	}

	public String getHeaderA() {
		return headerA;
	}

	public void setHeaderA(String headerA) {
		this.headerA = headerA;
	}

	public StopLine withHeaderA(String headerA) {
		this.headerA = headerA;
		return this;
	}

	public String getHeaderB() {
		return headerB;
	}

	public void setHeaderB(String headerB) {
		this.headerB = headerB;
	}

	public StopLine withHeaderB(String headerB) {
		this.headerB = headerB;
		return this;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public StopLine withDirection(String direction) {
		this.direction = direction;
		return this;
	}

	public String getTipoDia() {
		return tipoDia;
	}

	public void setTipoDia(String tipoDia) {
		this.tipoDia = tipoDia;
	}

	public StopLine withTipoDia(String tipoDia) {
		this.tipoDia = tipoDia;
		return this;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public StopLine withDayType(String dayType) {
		this.dayType = dayType;
		return this;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public StopLine withStartTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public StopLine withStopTime(String stopTime) {
		this.stopTime = stopTime;
		return this;
	}

	public String getMinimumFrequency() {
		return minimumFrequency;
	}

	public void setMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
	}

	public StopLine withMinimumFrequency(String minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
		return this;
	}

	public String getMaximumFrequency() {
		return maximumFrequency;
	}

	public void setMaximumFrequency(String maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
	}

	public StopLine withMaximumFrequency(String maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(name);
	// dest.writeValue(line);
	// dest.writeValue(headerA);
	// dest.writeValue(headerB);
	// dest.writeValue(direction);
	// dest.writeValue(tipoDia);
	// dest.writeValue(dayType);
	// dest.writeValue(startTime);
	// dest.writeValue(stopTime);
	// dest.writeValue(minimumFrequency);
	// dest.writeValue(maximumFrequency);
	// }

	public int describeContents() {
		return 0;
	}

	@Override
	public String toString() {
		return "StopLine [name=" + name + ", line=" + line + ", headerA=" + headerA + ", headerB=" + headerB
				+ ", direction=" + direction + ", tipoDia=" + tipoDia + ", dayType=" + dayType + ", startTime="
				+ startTime + ", stopTime=" + stopTime + ", minimumFrequency=" + minimumFrequency
				+ ", maximumFrequency=" + maximumFrequency + "]";
	}

}
