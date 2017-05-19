package com.example.demo.mb.controller;

import java.time.ZoneId;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mb.model.po.StatsDeviceOnline;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("rest")
@Slf4j
public class RestTestController {
    ZoneId zone = ZoneId.systemDefault();

    @RequestMapping(value = "sdo")
    public ResponseEntity<StatsDeviceOnline> re() {
        StatsDeviceOnline sdo = new StatsDeviceOnline();
        Date now = new Date();
        sdo.setCreateTime(now);
        sdo.setRecordDate(now);
        String rs = RandomStringUtils.randomNumeric(10);
        sdo.setDeviceId(rs);
        Marker marker = MarkerFactory.getMarker("SDO search " + rs);
        log.info(marker, "查询设备在线统计信息。");
        return ResponseEntity.ok().header("test", "a", "b", "c").body(sdo);
    }
}
