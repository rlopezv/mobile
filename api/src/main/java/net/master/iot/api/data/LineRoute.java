
package net.master.iot.api.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineRoute implements Serializable {// , Parcelable

	@SerializedName("Line")
	@Expose
	private List<Line> line = new ArrayList<Line>();
	@SerializedName("lineId")
	@Expose
	private String lineId;
	@SerializedName("label")
	@Expose
	private String label;
	@SerializedName("destination")
	@Expose
	private String destination;
	@SerializedName("incidents")
	@Expose
	private Integer incidents;
	@SerializedName("stop")
	@Expose
	private List<Stop> stop = new ArrayList<Stop>();
	// public final static Parcelable.Creator<LineRoute> CREATOR = new
	// Creator<LineRoute>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public LineRoute createFromParcel(Parcel in) {
	// return new LineRoute(in);
	// }
	//
	// public LineRoute[] newArray(int size) {
	// return (new LineRoute[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = 3418411952724057067L;

	// protected LineRoute(Parcel in) {
	// in.readList(this.line,
	// (net.es.upm.miot.madridtrafficcameras.Line.class.getClassLoader()));
	// this.lineId = ((String) in.readValue((String.class.getClassLoader())));
	// this.label = ((String) in.readValue((String.class.getClassLoader())));
	// this.destination = ((String) in.readValue((String.class.getClassLoader())));
	// this.incidents = ((Integer) in.readValue((Integer.class.getClassLoader())));
	// in.readList(this.stop,
	// (net.es.upm.miot.madridtrafficcameras.Stop.class.getClassLoader()));
	// }

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public LineRoute() {
	}

	/**
	 * 
	 * @param incidents
	 * @param stop
	 * @param line
	 * @param label
	 * @param lineId
	 * @param destination
	 */
	public LineRoute(List<Line> line, String lineId, String label, String destination, Integer incidents,
			List<Stop> stop) {
		super();
		this.line = line;
		this.lineId = lineId;
		this.label = label;
		this.destination = destination;
		this.incidents = incidents;
		this.stop = stop;
	}

	public List<Line> getLine() {
		return line;
	}

	public void setLine(List<Line> line) {
		this.line = line;
	}

	public LineRoute withLine(List<Line> line) {
		this.line = line;
		return this;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public LineRoute withLineId(String lineId) {
		this.lineId = lineId;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public LineRoute withLabel(String label) {
		this.label = label;
		return this;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LineRoute withDestination(String destination) {
		this.destination = destination;
		return this;
	}

	public Integer getIncidents() {
		return incidents;
	}

	public void setIncidents(Integer incidents) {
		this.incidents = incidents;
	}

	public LineRoute withIncidents(Integer incidents) {
		this.incidents = incidents;
		return this;
	}

	public List<Stop> getStop() {
		return stop;
	}

	public void setStop(List<Stop> stop) {
		this.stop = stop;
	}

	public LineRoute withStop(List<Stop> stop) {
		this.stop = stop;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeList(line);
	// dest.writeValue(lineId);
	// dest.writeValue(label);
	// dest.writeValue(destination);
	// dest.writeValue(incidents);
	// dest.writeList(stop);
	// }

	public int describeContents() {
		return 0;
	}

}
