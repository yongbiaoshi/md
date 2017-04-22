package com.example.demo.mb;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.mb.model.po.StatsDeviceOnline;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    public static void main(String[] args) throws IOException {
        StatsDeviceOnline sdo = new StatsDeviceOnline();
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(sdo);
        System.out.println(s);
        
        String ss = "{\"deviceId\":null,\"recordDate\":null,\"onlineSeconds\":null,\"onlineStatus\":null,\"onlineDays\":null,\"offlineDays\":null,\"lastLoginTime\":null,\"lastLogoutTime\":null,\"lastUpdateTime\":null,\"createTime\":null}";
        sdo = om.readValue(ss, StatsDeviceOnline.class);
        System.out.println(sdo.getDeviceId() == null);
        
        String[] sss = {"a", "b", "c"};
        System.out.println(Arrays.asList(sss));
        
        Map<String, String[]> map = new HashMap<>();
        map.put("a", sss);
        System.out.println(map);
    }
}
