package matwx.dumpster.fire.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DateTimeUtils {

	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss");
		return sdf.format(date);
	}

}
