package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineInfo implements Serializable {// , Parcelable {

	@SerializedName("Line")
	@Expose
	private Line line;
	// public final static Parcelable.Creator<LineInfo> CREATOR = new
	// Creator<LineInfo>() {
	//
	// @SuppressWarnings({ "unchecked" })
	// public LineInfo createFromParcel(Parcel in) {
	// return new LineInfo(in);
	// }
	//
	// public LineInfo[] newArray(int size) {
	// return (new LineInfo[size]);
	// }
	//
	// };
	private final static long serialVersionUID = 5106390312973430866L;

	// protected LineInfo(Parcel in) {
	// this.line = ((Line) in.readValue((Line.class.getClassLoader())));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public LineInfo() {
	}

	/**
	 *
	 * @param line
	 */
	public LineInfo(Line line) {
		super();
		this.line = line;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public LineInfo withLine(Line line) {
		this.line = line;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(line);
	// }

	public int describeContents() {
		return 0;
	}

}