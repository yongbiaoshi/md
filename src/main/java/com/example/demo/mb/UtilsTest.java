package com.example.demo.mb;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UtilsTest {
    final static ZoneId ZONE = ZoneId.systemDefault();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse("2017-04-05 18:30:11", dtf);
        System.out.println(date);
        Instant instant = date.atZone(ZONE).toInstant();
        Date.from(instant);
    }
}
