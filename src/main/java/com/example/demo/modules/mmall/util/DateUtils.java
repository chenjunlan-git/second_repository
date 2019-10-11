package com.example.demo.modules.mmall.util;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理
 *
 * @author heyongjie
 * @date 2018/5/2
 * @updater
 */
public class DateUtils {
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    public final static String DATE_PATTERN_CHN = "yyyy年MM月dd日";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public final static SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
    public final static SimpleDateFormat dateTimeFormat = new SimpleDateFormat(DATE_TIME_PATTERN);

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date 日期
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date    日期
     * @param pattern 格式，如：DateUtils.DATE_TIME_PATTERN
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    /**
     * 字符串转换成日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期的格式，如：DateUtils.DATE_TIME_PATTERN
     */
    public static Date stringToDate(String strDate, String pattern) {
        if (StringUtils.isBlank(strDate)) {
            return null;
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.parseLocalDateTime(strDate).toDate();
    }

    /**
     * 根据周数，获取开始日期、结束日期
     *
     * @param week 周期  0本周，-1上周，-2上上周，1下周，2下下周
     * @return 返回date[0]开始日期、date[1]结束日期
     */
    public static Date[] getWeekStartAndEnd(int week) {
        DateTime dateTime = new DateTime();
        LocalDate date = new LocalDate(dateTime.plusWeeks(week));

        date = date.dayOfWeek().withMinimumValue();
        Date beginDate = date.toDate();
        Date endDate = date.plusDays(6).toDate();
        return new Date[]{beginDate, endDate};
    }

    /**
     * 对日期的【秒】进行加/减
     *
     * @param date    日期
     * @param seconds 秒数，负数为减
     * @return 加/减几秒后的日期
     */
    public static Date addDateSeconds(Date date, int seconds) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusSeconds(seconds).toDate();
    }

    /**
     * 对日期的【分钟】进行加/减
     *
     * @param date    日期
     * @param minutes 分钟数，负数为减
     * @return 加/减几分钟后的日期
     */
    public static Date addDateMinutes(Date date, int minutes) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMinutes(minutes).toDate();
    }

    /**
     * 对日期的【小时】进行加/减
     *
     * @param date  日期
     * @param hours 小时数，负数为减
     * @return 加/减几小时后的日期
     */
    public static Date addDateHours(Date date, int hours) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusHours(hours).toDate();
    }

    /**
     * 对日期的【天】进行加/减
     *
     * @param date 日期
     * @param days 天数，负数为减
     * @return 加/减几天后的日期
     */
    public static Date addDateDays(Date date, int days) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusDays(days).toDate();
    }

    /**
     * 对日期的【周】进行加/减
     *
     * @param date  日期
     * @param weeks 周数，负数为减
     * @return 加/减几周后的日期
     */
    public static Date addDateWeeks(Date date, int weeks) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusWeeks(weeks).toDate();
    }

    /**
     * 对日期的【月】进行加/减
     *
     * @param date   日期
     * @param months 月数，负数为减
     * @return 加/减几月后的日期
     */
    public static Date addDateMonths(Date date, int months) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMonths(months).toDate();
    }

    /**
     * 对日期的【年】进行加/减
     *
     * @param date  日期
     * @param years 年数，负数为减
     * @return 加/减几年后的日期
     */
    public static Date addDateYears(Date date, int years) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(years).toDate();
    }

    /**
     * 根据传递进来的日期，获取日期当月第一天，如果日期为null,则获取当前日期当月第一天
     *
     * @param date
     * @return
     */
    public static Date getfirstDayOfMonth(String date) throws ParseException {
        Calendar c = Calendar.getInstance();

        if (StringUtils.isNotBlank(date)) {
            c.setTime(dateFormat.parse(date));
            c.set(Calendar.DAY_OF_MONTH, 1);
        } else {
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);
            c.set(Calendar.HOUR_OF_DAY, 0);
            c.set(Calendar.MINUTE, 0);
            c.set(Calendar.SECOND, 0);
            c.set(Calendar.MILLISECOND, 0);
        }

        return c.getTime();
    }

    /**
     * 根据传递进来的日期，获取日期下月第一天，如果日期为null,则获取当前日期下月第一天
     *
     * @param date
     * @return
     */
    public static Date getfirstDayOfNextMonth(String date) throws ParseException {
        Calendar c = Calendar.getInstance();

        if (StringUtils.isNotBlank(date)) {
            c.setTime(dateFormat.parse(date));
            c.add(Calendar.MONTH, 1);
            c.set(Calendar.DAY_OF_MONTH, 1);
        } else {
            c.add(Calendar.MONTH, 1);
            c.set(Calendar.DAY_OF_MONTH, 1);
            c.set(Calendar.HOUR_OF_DAY, 0);
            c.set(Calendar.MINUTE, 0);
            c.set(Calendar.SECOND, 0);
            c.set(Calendar.MILLISECOND, 0);
        }

        return c.getTime();
    }

    /**
     * 将传递进来的时间，格式化为年月日时分秒形式，如果日期为null，则获取当前时间格式化为年月日时分秒形式
     *
     * @param date
     * @return
     */
    public static String getAccurateTimeOfDate(Date date) {
        String strDate = DateUtils.format(date, DATE_TIME_PATTERN);
        String newDate = DateUtils.format(new Date(), DATE_TIME_PATTERN);

        if (StringUtils.isNotBlank(strDate)) {
            return strDate;
        } else {
            return newDate;
        }
    }


    /**
     * 通过银行流水导入的日期和字符串格式时分秒，得到准确的时间
     *
     * @param date
     * @param str
     * @return
     */
    public static Date getAccurateTime(Date date, String str) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime dateTime = LocalDateTime.ofInstant(date.toInstant(), zoneId);

        LocalDateTime localDateTime = LocalDateTime.of(
                dateTime.getYear(),
                dateTime.getMonth(),
                dateTime.getDayOfMonth(),
                Integer.valueOf(str.substring(0, 2)),
                Integer.valueOf(str.substring(2, 4)),
                Integer.valueOf(str.substring(4, 6))
        );

        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        Date accurateTime = Date.from(zdt.toInstant());
        return accurateTime;
    }

    /**
     * 将当前时间推到几个月前  比如2019-04-23  -->2019-01-23
     * @param month
     * @param flag  1 往前  2往后
     * @return
     */
    public static Date getNewDateByMonth(int  month,int flag) {
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(new Date());//把当前时间赋给日历
        if(flag == 1){
            calendar.add(Calendar.MONTH, -month);  //设置为前3月
        }if(flag == 2){
            calendar.add(Calendar.MONTH, +month);  //设置为后3月
        }
        dBefore = calendar.getTime();   //得到前3月的时间
        return dBefore;
    }


    /**
     * 将 2019-03  --->2019-02
     * @param yearMonth
     * @param month
     * @param flag 1前month个月  2后month个月
     * @return
     */
    public static String getNewYearMonth(String  yearMonth,int month,int flag) {

        String yearMonthNew = "";
        try {
            SimpleDateFormat  sd = new SimpleDateFormat("yyyy-MM");
            Calendar calendar= Calendar.getInstance();
            calendar.setTime(sd.parse(yearMonth));
            if(flag == 1){
                calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)-month);//设置为前month=1月 2019-03  --->2019-02
            }else if(flag == 2){
                calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)+month);//设置为后month=1月  2019-03  --->2019-04
            }
            yearMonthNew = sd.format(calendar.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return yearMonthNew;
    }

    //得到当前月最后一天
    public static Date getNewYearMonthPreLastDate(String  yearMonth) {

        SimpleDateFormat sdD = new SimpleDateFormat("yyyy-MM-dd");
        //前一日期
        String payoffYearMonthDayBefore = ""; //如2018-10-01 前一日期：2018-09-30
        Date payoffYearMonthDayBeforeDate = null;

        try {

            //得到次月
            String payoffYearMonthNext = getNewYearMonth(yearMonth,1,2);
            Calendar calendarBefore = Calendar.getInstance();
            calendarBefore.setTime(sdD.parse(payoffYearMonthNext + "-01"));
            calendarBefore.add(Calendar.DAY_OF_MONTH, -1);
            payoffYearMonthDayBefore = sdD.format(calendarBefore.getTime());
            payoffYearMonthDayBeforeDate = sdD.parse(payoffYearMonthDayBefore);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return payoffYearMonthDayBeforeDate;
    }


    //得到当前月最后一天
    public static Date getYearMonthLastDate(String  yearMonth) {

        SimpleDateFormat sdD = new SimpleDateFormat("yyyy-MM-dd");
        Date payoffYearMonthDayBeforeDate = null;
        try {

            SimpleDateFormat  sd = new SimpleDateFormat("yyyy-MM");
            Calendar calendar= Calendar.getInstance();
            calendar.setTime(sd.parse(yearMonth));
            int lastDay = calendar.getActualMaximum(Calendar.DATE);
            //设置日历中月份的最大天数
            calendar.set(Calendar.DAY_OF_MONTH, lastDay);
            payoffYearMonthDayBeforeDate =calendar.getTime();

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return payoffYearMonthDayBeforeDate;
    }
}
