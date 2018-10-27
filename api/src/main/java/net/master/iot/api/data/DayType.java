
package net.master.iot.api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DayType implements Serializable {// , Parcelable

	@SerializedName("dayTypeId")
	@Expose
	private String dayTypeId;
	@SerializedName("direction1")
	@Expose
	private Direction direction1;
	@SerializedName("direction2")
	@Expose
	private Direction direction2;
	// public final static Parcelable.Creator<DayType> CREATOR = new
	// Creator<DayType>() {
	//
	//
	// @SuppressWarnings({
	// "unchecked"
	// })
	// public DayType createFromParcel(Parcel in) {
	// return new DayType(in);
	// }
	//
	// public DayType[] newArray(int size) {
	// return (new DayType[size]);
	// }
	//
	// }
	// ;
	private final static long serialVersionUID = 2149164008903381102L;

	// protected DayType(Parcel in) {
	// this.dayTypeId = ((String) in.readValue((String.class.getClassLoader())));
	// this.direction1 = ((Direction)
	// in.readValue((Direction.class.getClassLoader())));
	// this.direction2 = ((Direction)
	// in.readValue((Direction.class.getClassLoader())));
	// }

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public DayType() {
	}

	public DayType(String dayTypeId, Direction direction1, Direction direction2) {
		super();
		this.dayTypeId = dayTypeId;
		this.direction1 = direction1;
		this.direction2 = direction2;
	}

	public String getDayTypeId() {
		return dayTypeId;
	}

	public void setDayTypeId(String dayTypeId) {
		this.dayTypeId = dayTypeId;
	}

	public DayType withDayTypeId(String dayTypeId) {
		this.dayTypeId = dayTypeId;
		return this;
	}

	public Direction getDirection1() {
		return direction1;
	}

	public void setDirection1(Direction direction1) {
		this.direction1 = direction1;
	}

	public DayType withDirection1(Direction direction1) {
		this.direction1 = direction1;
		return this;
	}

	public Direction getDirection2() {
		return direction2;
	}

	public void setDirection2(Direction direction2) {
		this.direction2 = direction2;
	}

	public DayType withDirection2(Direction direction2) {
		this.direction2 = direction2;
		return this;
	}

	// public void writeToParcel(Parcel dest, int flags) {
	// dest.writeValue(dayTypeId);
	// dest.writeValue(direction1);
	// dest.writeValue(direction2);
	// }

	public int describeContents() {
		return 0;
	}

}
