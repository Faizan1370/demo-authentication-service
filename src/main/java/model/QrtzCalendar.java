package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_calendars database table.
 * 
 */
@Entity
@Table(name="qrtz_calendars")
@NamedQuery(name="QrtzCalendar.findAll", query="SELECT q FROM QrtzCalendar q")
public class QrtzCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	private String calendar;

	@Column(name="calendar_name")
	private String calendarName;

	public QrtzCalendar() {
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