package utils;

import static java.time.temporal.TemporalAdjusters.firstDayOfYear;
import static java.time.temporal.TemporalAdjusters.lastDayOfYear;
import static org.apache.logging.log4j.LogManager.getLogger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import logger.LogReporter;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

public class DateUtil {
    private static final Logger LOGGER = getLogger ();
    public static        Date   _date;

    public static boolean isDateInGivenFormat (String date, String format) {
        _date = null;
        try {
            _date = new SimpleDateFormat (format).parse (date);
            return true;
        } catch (ParseException ex) {
            LOGGER.warn ("Given date is not in the given format.");
            return false;
        }
    }

    public static boolean isInputDateOlderThanOutputDate (String inputDate, String outputDate, String format) {
        Date _inputDate;
        Date _outputDate;
        try {
            _inputDate = new SimpleDateFormat (format).parse (inputDate);
            _outputDate = new SimpleDateFormat (format).parse (outputDate);
            int diff = _inputDate.compareTo (_outputDate);
            return diff >= 0;
        } catch (ParseException e) {
            LOGGER.warn ("Given date is not in the given format.");
            return false;
        }
    }

    public static boolean isInputDateNewerThanOutputDate (String inputDate, String outputDate, String format) {
        Date _inputDate;
        Date _outputDate;
        try {
            _inputDate = new SimpleDateFormat (format).parse (inputDate);
            _outputDate = new SimpleDateFormat (format).parse (outputDate);
            int diff = _inputDate.compareTo (_outputDate);
            return diff <= 0;
        } catch (ParseException e) {
            LOGGER.warn ("Given date is not in the given format.");
            return false;
        }
    }

    public static boolean isGivenDateIsOfCurrentMonth (String date, String format) {
        LOGGER.traceEntry ();
        Date _givenDate;
        try {
            _givenDate = new SimpleDateFormat (format).parse (date);
            final var givenMonth = new SimpleDateFormat ("MMM").format (_givenDate);
            final var expMonth = new SimpleDateFormat ("MMM").format (new Date ());
            return LOGGER.traceExit (givenMonth.equals (expMonth));
        } catch (ParseException e) {
            LOGGER.warn ("Given date is not in the given format.");
            return LOGGER.traceExit (false);
        }
    }

    /**
     * This method is used to get the future date of given month difference.
     *
     * @param month
     *
     * @return
     */
    public static String getFutureDate (int month) {
        Calendar now = Calendar.getInstance ();
        // Add days to current date using Calendar.add method
        now.add (Calendar.MONTH, month);
        return ((now.get (Calendar.MONTH) + 1) + "/" + now.get (Calendar.DATE) + "/" + now.get (Calendar.YEAR));
    }

    public static String getCurrentSystemDate (String format) {
        DateFormat dateFormat = new SimpleDateFormat (format);
        return (dateFormat.format (new Date ()));
    }

    /**
     * This method is used to get the number of days between two given dates.
     *
     * @param dateBeforeString
     * @param dateAfterString
     *
     * @return
     */
    public static long getNoOfDaysBetween (String dateBeforeString, String dateAfterString) {
        LocalDate dateBefore = LocalDate.parse (dateBeforeString);
        LocalDate dateAfter = LocalDate.parse (dateAfterString);
        return ChronoUnit.DAYS.between (dateBefore, dateAfter);
    }

    public static boolean isNextDateOlderThanPrevDate(String prevDate, String nextDate, String format) {
        Date _prevDate;
        Date _nextDate;
        try {
            _prevDate = new SimpleDateFormat(format).parse(prevDate);
            _nextDate = new SimpleDateFormat(format).parse(nextDate);
            int diff = _prevDate.compareTo(_nextDate);
            LogReporter.INFO("diff" +diff);
            return diff >= 0;
        } catch (ParseException e) {
            LOGGER.warn("Given date is not in the given format.");
            return false;
        }
    }

    public static boolean isNextDateNewerThanPrevDate(String prevDate, String nextDate, String format) {
        Date _prevDate;
        Date _nextDate;
        try {
            _prevDate = new SimpleDateFormat(format).parse(prevDate);
            _nextDate = new SimpleDateFormat(format).parse(nextDate);
            int diff = _prevDate.compareTo(_nextDate);
            LogReporter.INFO("diff" +diff);
            return diff <= 0;
        } catch (ParseException e) {
            LOGGER.warn("Given date is not in the given format.");
            return false;
        }
    }


    /**
     * This method is used to get the count of days for the given month of given year.
     *
     * @param strYear
     * @param strMonthName
     *
     * @return
     */
    public static int daysCountForMonth (String strYear, String strMonthName) {
        int intYear = Integer.parseInt (strYear); // To hold the year
        int intNumDays = 0;
        if (strMonthName.contains ("Feb")) {
            if ((intYear % 4 == 0) && (intYear % 400 == 0) && !(intYear % 100 == 0)) {
                intNumDays = 29;
            } else {
                intNumDays = 28;
            }
        } else if ((strMonthName.contains ("Jan")) || (strMonthName.contains ("Mar")) || (strMonthName.contains (
            "May")) || (strMonthName.contains ("Jul")) || (strMonthName.contains ("Aug")) || (strMonthName.contains (
            "Oct")) || (strMonthName.contains ("Dec"))) {
            intNumDays = 31;
        } else {
            intNumDays = 30;
        }
        return intNumDays;
    }

    public static boolean isDateInSpecifiedRange (String itemDate, String startDateStr, String endDateStr) {
        Date startDate = parseDate (startDateStr);
        Date endDate = parseDate (endDateStr);
        Date item = parseDate (itemDate);
        return isDateInRange (item, startDate, endDate);
    }

    public static Date parseDate (String dateStr) {
        try {
            DateFormat dateFormat = new SimpleDateFormat ("MMM dd, yyyy");
            return dateFormat.parse (dateStr);
        } catch (ParseException e) {
            throw new RuntimeException ("Error parsing date: " + dateStr, e);
        }
    }

    public static boolean isDateInRange (Date date, Date startDate, Date endDate) {
        return !date.before (startDate) && !date.after (endDate);
    }

    public static boolean isGivenDateOfThisYear (String date, String format) {
        LOGGER.traceEntry ();
        Date _givenDate;
        try {
            _givenDate = new SimpleDateFormat (format).parse (date);
            Calendar calendarGiven = Calendar.getInstance ();
            calendarGiven.setTime (_givenDate);
            int givenYear = calendarGiven.get (Calendar.YEAR);
            Calendar calendarThisYear = Calendar.getInstance ();
            int thisYear = calendarThisYear.get (Calendar.YEAR);
            return LOGGER.traceExit (givenYear == thisYear);
        } catch (ParseException e) {
            LOGGER.warn ("Given date is not in the given format.");
            return LOGGER.traceExit (false);
        }
    }

    public static boolean isGivenDateOfLastYear(String date, String format) {
        LOGGER.traceEntry();
        Date _givenDate;
        try {
            _givenDate = new SimpleDateFormat(format).parse(date);
            Calendar calendarGiven = Calendar.getInstance();
            calendarGiven.setTime(_givenDate);
            int givenYear = calendarGiven.get(Calendar.YEAR);
            Calendar calendarLastYear = Calendar.getInstance();
            calendarLastYear.add(Calendar.YEAR, -1);
            int lastYear = calendarLastYear.get(Calendar.YEAR);
            return LOGGER.traceExit(givenYear == lastYear);
        } catch (ParseException e) {
            LOGGER.warn("Given date is not in the given format.");
            return LOGGER.traceExit(false);
        }
    }

    public static boolean isGivenDateOfLastMonth(String date, String format) {
        LOGGER.traceEntry();
        Date _givenDate;
        try {
            _givenDate = new SimpleDateFormat(format).parse(date);
            Calendar calendarGiven = Calendar.getInstance();
            calendarGiven.setTime(_givenDate);
            int givenMonth = calendarGiven.get(Calendar.MONTH);
            Calendar calendarLastMonth = Calendar.getInstance();
            calendarLastMonth.add(Calendar.MONTH, -1);
            int lastMonth = calendarLastMonth.get(Calendar.MONTH);
            return LOGGER.traceExit(givenMonth == lastMonth);
        } catch (ParseException e) {
            LOGGER.warn("Given date is not in the given format.");
            return LOGGER.traceExit(false);
        }
    }

    public static boolean isNextNumberGreaterOrEqual(String prevNumber, String nextNumber) {
        int diff = prevNumber.compareTo(nextNumber);
        return diff >= 0;
    }

    public static boolean isNextNumberLessOrEqual(String prevNumber, String nextNumber) {
        int diff = prevNumber.compareTo(nextNumber);
        return diff <= 0;
    }

    public static boolean isUserIDUnique(String prevID, String nextID){
        int diff = prevID.compareTo(nextID);
        return diff != 0;
    }

    /**
     * This method is used to get the month value corresponding to the given month name.
     *
     * @param strMonthName
     *
     * @return
     */
    public static int getMonthValue (String strMonthName) {
        int intMonthValue = 0;
        if (strMonthName.contains ("January")) {
            intMonthValue = 1;
        } else if (strMonthName.contains ("February")) {
            intMonthValue = 2;
        } else if (strMonthName.contains ("March")) {
            intMonthValue = 3;
        } else if (strMonthName.contains ("April")) {
            intMonthValue = 4;
        } else if (strMonthName.contains ("May")) {
            intMonthValue = 5;
        } else if (strMonthName.contains ("June")) {
            intMonthValue = 6;
        } else if (strMonthName.contains ("July")) {
            intMonthValue = 7;
        } else if (strMonthName.contains ("August")) {
            intMonthValue = 8;
        } else if (strMonthName.contains ("September")) {
            intMonthValue = 9;
        } else if (strMonthName.contains ("October")) {
            intMonthValue = 10;
        } else if (strMonthName.contains ("November")) {
            intMonthValue = 11;
        } else if (strMonthName.contains ("December")) {
            intMonthValue = 12;
        }
        return intMonthValue;
    }

    /**
     * This method is used to get the month value corresponding to the given month name.
     *
     * @param strMonthName
     *
     * @return
     */
    public static String getMonthValues (String strMonthName, String strMonthcName) {
        String sMonthValue = null;
        if (strMonthName.contains ("January")) {
            sMonthValue = "01";
        } else if (strMonthName.contains ("February")) {
            sMonthValue = "02";
        } else if (strMonthName.contains ("March")) {
            sMonthValue = "03";
        } else if (strMonthName.contains ("April")) {
            sMonthValue = "04";
        } else if (strMonthName.contains ("May")) {
            sMonthValue = "05";
        } else if (strMonthName.contains ("June")) {
            sMonthValue = "06";
        } else if (strMonthName.contains ("July")) {
            sMonthValue = "07";
        } else if (strMonthName.contains ("August")) {
            sMonthValue = "08";
        } else if (strMonthName.contains ("September")) {
            sMonthValue = "09";
        } else if (strMonthName.contains ("October")) {
            sMonthValue = "10";
        } else if (strMonthName.contains ("November")) {
            sMonthValue = "11";
        } else if (strMonthName.contains ("December")) {
            sMonthValue = "12";
        }
        return sMonthValue;
    }

    public static String changeStringToDateInFormat (String inputDate, String inputFormat, String targetFormat) {
        String parsedDate = null;
        SimpleDateFormat sourceDate = new SimpleDateFormat (inputFormat);
        SimpleDateFormat targetDate = new SimpleDateFormat (targetFormat);
        try {
            Date date = sourceDate.parse (inputDate);
            parsedDate = targetDate.format (date);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        return parsedDate;
    }

    /**
     * This method is used to get the month value of corresponding given month value.
     *
     * @param monthValue
     *
     * @return
     */
    public static String getMonthName (int monthValue) {
        String monthName = null;
        if (monthValue == 1) {
            monthName = "Jan";
        } else if (monthValue == 2) {
            monthName = "Feb";
        } else if (monthValue == 3) {
            monthName = "Mar";
        } else if (monthValue == 4) {
            monthName = "Apr";
        } else if (monthValue == 5) {
            monthName = "May";
        } else if (monthValue == 6) {
            monthName = "Jun";
        } else if (monthValue == 7) {
            monthName = "Jul";
        } else if (monthValue == 8) {
            monthName = "Aug";
        } else if (monthValue == 9) {
            monthName = "Sep";
        } else if (monthValue == 10) {
            monthName = "Oct";
        } else if (monthValue == 11) {
            monthName = "Nov";
        } else if (monthValue == 12) {
            monthName = "Dec";
        }
        return monthName;
    }

    /**
     * This method is used to get the month value of corresponding given month value.
     *
     * @param monthValue
     *
     * @return
     */
    public static String getCompleteMonthName (int monthValue) {
        String monthName = null;
        if (monthValue == 1) {
            monthName = "January";
        } else if (monthValue == 2) {
            monthName = "February";
        } else if (monthValue == 3) {
            monthName = "March";
        } else if (monthValue == 4) {
            monthName = "April";
        } else if (monthValue == 5) {
            monthName = "May";
        } else if (monthValue == 6) {
            monthName = "June";
        } else if (monthValue == 7) {
            monthName = "JULY";
        } else if (monthValue == 8) {
            monthName = "August";
        } else if (monthValue == 9) {
            monthName = "September";
        } else if (monthValue == 10) {
            monthName = "October";
        } else if (monthValue == 11) {
            monthName = "November";
        } else if (monthValue == 12) {
            monthName = "December";
        }
        return monthName;
    }

    public static String getCurrentMonth () {
        String month = null;
        String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Calendar cal = Calendar.getInstance ();
        month = monthName[cal.get (Calendar.MONTH)];
        return month;
    }

    // Get Previous Month Year value as Jan 2018
    public static String getPreviousMonthYear () {
        String prevMonthYear;
        Calendar now;
        String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        now = Calendar.getInstance ();
        // Decrement Month by 1
        now.add (Calendar.MONTH, -1);
        now.get (Calendar.MONTH);
        // Decrement
        prevMonthYear = monthName[(now.get (Calendar.MONTH))] + " " + now.get (Calendar.YEAR);
        // Date
        return prevMonthYear;
    }

    /**
     * This method is used to get the next complete month.
     *
     * @return
     */
    public static String getNextCompleteMonth (int nextMonthInNumber) {
        String month = null;
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
        Calendar cal = Calendar.getInstance ();
        int num = cal.get (Calendar.MONTH) + nextMonthInNumber;
        if (num > 12) {
            num = num - 12;
        }
        month = monthName[num - 1];
        return month;
    }

    // This method is used for usage page
    public static String convertDateToMonthYear (String actualDate) {
        SimpleDateFormat month_date = new SimpleDateFormat ("MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = null;
        try {
            date = (Date) sdf.parse (actualDate);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        String month_name = month_date.format (date);
        return month_name;
    }

    // This method is used for usage page
    public static String convertDateToMonthYear (String actualDate, String format) {
        SimpleDateFormat month_date = new SimpleDateFormat ("MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf = new SimpleDateFormat (format);
        Date date = null;
        try {
            date = sdf.parse (actualDate);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        return month_date.format (date);
    }

    // This method is used to get the date before number of days
    public static String getBeforeDateFromCurrentDate (int days, String format) {
        DateFormat dateFormat = new SimpleDateFormat (format);
        Date date = new Date ();
        return dateFormat.format (new DateTime (date).minusDays (days)
            .toDate ());
    }

    /**
     * This method is used for Converting the hour format getting from the Database to the 12/24 hour format as per the
     * CSP config. Used in Usage Hourly validations
     *
     * @param actualDateTime - the date and time received from Database.
     * @param expFormat- The CSP format either 12 Hours/24 Hours that we get by the SQL Query
     *     getDateFormatMetricSettings
     *
     * @return
     */
    public static String convertIntoHourlyAmPmFormat (String actualDateTime, String expFormat) {
        String result = "";
        String actualDateformat = "yyyy-MM-dd HH:mm:ss.sss";
        String expectedHourFormat = null;
        if (expFormat.equals ("24 Hour")) {
            expectedHourFormat = "HH:mm a";
        } else {
            expectedHourFormat = "hh:mm a";
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat (actualDateformat, Locale.US); // PST`
            Date startDTE = null;
            startDTE = formatter.parse (actualDateTime);
            SimpleDateFormat requiredformat = new SimpleDateFormat (expectedHourFormat, Locale.US); // PST`
            result = requiredformat.format (startDTE);
        } catch (Exception e) {
            LOGGER.warn (e.getMessage ());
            result = actualDateTime;
        }
        return result;
    }

    public static String convertIntoSpecificDateFormat (String givenDate, String givenDateFormat, String resultFormat) {
        String result = "";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat (givenDateFormat, Locale.US); // PST`
            Date startDTE = null;
            startDTE = formatter.parse (givenDate);
            SimpleDateFormat requiredFormat = new SimpleDateFormat (resultFormat, Locale.US); // PST`
            result = requiredFormat.format (startDTE);
        } catch (Exception e) {
            LOGGER.warn (e.getMessage ());
            result = givenDate;
        }
        return result;
    }

    public static String getCurrentDateInFormat (String format) {
        String s = null;
        Date date = Calendar.getInstance ()
            .getTime ();
        DateFormat dateFormat = new SimpleDateFormat (format);
        s = dateFormat.format (date);
        return s;
    }

    public static String getFutureDateTime (int futureDay) {
        String sExpDateTime = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime now = LocalDateTime.now ();
        now = now.plusDays (futureDay);
        sExpDateTime = dtf.format (now);
        System.out.println (dtf.format (now));
        return sExpDateTime;
    }

    public static int getNoOfDaysInCurrentMonth () {
        Calendar c = Calendar.getInstance ();
        return c.getActualMaximum (Calendar.DAY_OF_MONTH);
    }

    public static String getLastMonthLastDate (String format) {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        calendar.add (Calendar.MONTH, -1);
        int max = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String getLastDayCurrentMonth (String format) {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        int max = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String get12MonthsBackStartingDate (String format) {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        calendar.add (Calendar.MONTH, -12);
        int max = calendar.getActualMinimum (1);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String getGivenMonthsBackDate (String format, int months) {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        calendar.add (Calendar.MONTH, -months);
        int max = calendar.getActualMinimum (1);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        return date;
    }

    public static String subtractMonthsFromDate (String date, int month, String dateFormat) {
        final SimpleDateFormat format = new SimpleDateFormat (dateFormat);
        Calendar calendar = Calendar.getInstance ();
        try {
            calendar.setTime (format.parse (date));
            calendar.add (Calendar.MONTH, -month);
            int max = calendar.getActualMinimum (1);
            calendar.set (Calendar.DAY_OF_MONTH, max);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        return format.format (calendar.getTime ());
    }

    public static String getGivenHourBack (String date, String actFormat, int subHour) {
        String expDate = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat (actFormat);
        Date actDate;
        try {
            actDate = new SimpleDateFormat (actFormat).parse (date);
            Calendar cal = Calendar.getInstance ();
            cal.setTime (actDate);
            cal.add (Calendar.HOUR, -subHour);
            Date oneHourBack = cal.getTime ();
            expDate = simpleDateFormat.format (oneHourBack);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        return expDate;
    }

    public static String getBackDateByGivenDays (String format, int days) {
        String date;
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        calendar.add (Calendar.DAY_OF_MONTH, -days);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String getStartDayCurrentMonth (String format) {
        String date;
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        int max = calendar.getActualMinimum (1);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String getEndDayCurrentMonth (String format) {
        String date;
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        Calendar calendar = Calendar.getInstance ();
        int max = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, max);
        Date date1 = calendar.getTime ();
        date = formatter.format (date1);
        System.out.println (date);
        return date;
    }

    public static String getStartingDayOfYear (String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern (format);
        LocalDate now = LocalDate.now ();
        LocalDate firstDay = now.with (firstDayOfYear ());
        return formatter.format (firstDay);
    }

    public static String getLastDayOfYear (String format) {
        SimpleDateFormat formatter = new SimpleDateFormat (format);
        LocalDate now = LocalDate.now ();
        LocalDate firstDay = now.with (lastDayOfYear ());
        return formatter.format (firstDay);
    }

    public static int compareTwoDates (String date1, String date2, String format) {
        SimpleDateFormat sdFormat = new SimpleDateFormat (format);
        Date d1 = null, d2 = null;
        try {
            d1 = sdFormat.parse (date1);
            d2 = sdFormat.parse (date2);
        } catch (ParseException e) {
            LOGGER.warn (e.getMessage ());
        }
        assert d1 != null;
        return d1.compareTo (d2);
    }

    public static String getCurrentTimeInGivenTimeZone (String format, String timeZone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern (format);
        LocalDateTime now = LocalDateTime.now ();
        //formatter.setTimeZone(TimeZone.getTimeZone(timeZone));
        return formatter.format (now);
    }

    public static String getCurrentUtcTime (String format) {
        // Create an instance of the SimpleDateFormat class
        SimpleDateFormat sdf = new SimpleDateFormat (format);
        // Set UTC time zone by using SimpleDateFormat class
        sdf.setTimeZone (TimeZone.getTimeZone ("UTC"));
        // Declare and initialize a date variable which we return to the main method
        String d1 = null;
        // Use try catch block to parse date in UTC time zone
        try {
            d1 = sdf.format (new Date ());
        } catch (Exception e) {
            LOGGER.warn (e.getMessage ());
            System.out.println (e.getMessage ());
        }
        return d1;
    }

    public static void getAllTimeZoneWithOffset () {
        Set<String> allZones = ZoneId.getAvailableZoneIds ();
        LocalDateTime dt = LocalDateTime.now ();
        // Create a List using the set of zones and sort it.
        List<String> zoneList = new ArrayList<> (allZones);
        Collections.sort (zoneList);
        for (String s : zoneList) {
            ZoneId zone = ZoneId.of (s);
            ZonedDateTime zdt = dt.atZone (zone);
            ZoneOffset offset = zdt.getOffset ();
            int secondsOfHour = offset.getTotalSeconds () % (60 * 60);
            String out = String.format ("%35s %10s%n", zone, offset);
            // Write only time zones that do not have a whole hour offset
            // to standard out.
            if (secondsOfHour != 0) {
                System.out.printf (out);
            }
        }
    }

    public static String getFirstDayofMonth () {
        return LocalDate.now ()
            .with (TemporalAdjusters.firstDayOfMonth ())
            .toString ();
    }

    public static String getLastDayofMonth () {
        return LocalDate.now ()
            .with (TemporalAdjusters.lastDayOfMonth ())
            .toString ();
    }
}
