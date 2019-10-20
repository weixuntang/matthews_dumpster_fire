package matwx.dumpster.fire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import matwx.dumpster.fire.interfaces.Coach;
import matwx.dumpster.fire.interfaces.Time;
import matwx.dumpster.fire.utils.DateTimeUtils;

@Component
public class FootballCoach implements Coach, Time {

	private DateTimeUtils dateTimeUtils;

	@Autowired
	public FootballCoach(DateTimeUtils dateTimeUtils) {

		this.dateTimeUtils = dateTimeUtils;
	}

	@Override
	public String practiceWorkout() {

		return "Football Practice";
	}

	@Override
	public String getCurrentTime() {

		return dateTimeUtils.getCurrentTime();
	}

}
