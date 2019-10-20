package matwx.dumpster.fire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import matwx.dumpster.fire.interfaces.Coach;
import matwx.dumpster.fire.interfaces.DateTime;
import matwx.dumpster.fire.utils.DateTimeUtils;

@Component
public class BaseballCoach implements Coach, DateTime {

	private DateTimeUtils dateTimeUtils;

	@Autowired
	public void setDateTimeUtils(DateTimeUtils dateTimeUtils) {
		this.dateTimeUtils = dateTimeUtils;
	}

	@Override
	public String practiceWorkout() {

		return "Baseball Practice";
	}

	@Override
	public String getCurrentTime() {
		return dateTimeUtils.getCurrentTime();
	}

}
