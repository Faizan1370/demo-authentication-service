package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_calendars database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_calendars")
@NamedQuery(name="CmpQrtzCalendar.findAll", query="SELECT c FROM CmpQrtzCalendar c")
public class CmpQrtzCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	private String calendar;

	@Column(name="calendar_name")
	private String calendarName;

	public CmpQrtzCalendar() {
	}

	public String getCalendar() {
		return this.calendar;
	}

	public void setCalendar(String calendar) {
		this.calendar = calendar;
	}

	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

}