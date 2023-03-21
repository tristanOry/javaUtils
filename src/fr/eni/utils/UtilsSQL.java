package fr.eni.utils;
import java.sql.Date;
import java.time.LocalDate;
public class UtilsSQL {

	public static final int EPOCH_DAY_TO_MS = 24 * 3600 * 1000; 

	/**
	 * 
	 * @param date une sql.date
	 * @return une LocalDate
	 */
	public static LocalDate sqlDateToLocal (Date date) {
		return LocalDate.ofEpochDay(date.getTime()/EPOCH_DAY_TO_MS);
	}

	/**
	 * 
	 * @param date une LocalDate
	 * @return une sql.date
	 */
	public static Date localDateToSql(LocalDate date) {
		return new Date(date.toEpochDay() * EPOCH_DAY_TO_MS);
	}
}