package com.example.demo.mb.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mb.dao.mapper.StatsDeviceOnlineMapper;
import com.example.demo.mb.model.po.StatsDeviceOnline;
import com.example.demo.mb.model.po.StatsDeviceOnlineKey;

@RestController
@RequestMapping("db")
public class DbTest {

    @Resource
    StatsDeviceOnlineMapper sdoMapper;

    List<String> list = Arrays.asList("001020304050", "001122334455", "002592b53f79", "00301bba02db", "00ce39bbf86b",
            "00ce39bbf898", "00ce39bbf8c6", "00ce39bbf8cc", "00ce39bbf91f", "0af132d5f5d4", "12ae8f4883fb",
            "16a08284a1f3", "1afee09aaa59", "1acb0f1854ad", "1e4f422bb79e", "22706b42471f", "22a6e2455d14",
            "22eb4e8ae5e7", "2e002b7ca505", "2e3ab7a2e28b", "3e76de3bfb12", "3eafec0229d8", "427ecfb40baa",
            "52e090d650f9", "5e12d3c90e19", "60427f2b7fb7", "60427f2b7fbe", "60427f2b7fbf", "60427f2b7fc2",
            "60427f2b7fc3", "60427f2b7fc4", "60427f2b7fc5", "60427f2b7fc8", "60427f2b7fc9", "60427f2b7fca",
            "60427f2b7fcb", "60427f2b7fcc", "60427f2b7fcd", "60427f2b7fce", "60427f2b7fd1", "60427f2b7fd5",
            "60427f2b7fdd", "60427f2b7fde", "60427f2b7fdf", "60427f2b7fe1", "60427f2b7fe2", "60427f2b7fe7",
            "60427f2b7feb", "60427f2b7fee", "60427f2b7fef", "60427f2b7ff1", "60427f2b7ff6", "60427f2b7ff8",
            "60427f2b7fff", "60427f2b8002", "60427f2b8003", "60427f2b8005", "60427f2b8007", "60427f2b8008",
            "60427f2b8009", "60427f2b800a", "60427f2b800b", "60427f2b800d", "60427f2b8010", "60427f2b8011",
            "60427f2b8012", "60427f2b8015", "60427f2b8018", "60427f2b8019", "60427f2b801a", "60427f2b801d",
            "60427f2b801e", "60427f2b801f", "60427f2b8021", "60427f2b8022", "60427f2b8023", "60427f2b8024",
            "60427f2b8026", "60427f2b8027", "60427f2b8028", "60427f2b802b", "60427f2b802d", "60427f2b8030",
            "60427f2b8031", "60427f2b8033", "60427f2b8034", "60427f2b8035", "60427f2b8036", "60427f2b8037",
            "60427f2b8039", "60427f2b803a", "60427f2b803b", "60427f2b803d", "60427f2b803f", "60427f2b8040",
            "60427f2b8041", "60427f2b8042", "60427f2b8043", "60427f2b8046", "60427f2b804a");

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Vector<StatsDeviceOnline> test() throws ParseException {
        SimpleDateFormat ymdSdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d = ymdSdf.parse("2017-04-08");
        Vector<StatsDeviceOnline> vc = new Vector<>();
        list.parallelStream().forEach(id -> {
            StatsDeviceOnlineKey key = new StatsDeviceOnlineKey();
            key.setDeviceId(id);
            key.setRecordDate(d);
            vc.add(sdoMapper.selectByPrimaryKey(key));
        });
        return vc;
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert() throws ParseException {
        SimpleDateFormat ymdSdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ymdSdf.parse("2017-04-08");
        Date now = new Date();
        list.parallelStream().forEach(id -> {
            StatsDeviceOnline sdo = new StatsDeviceOnline();
            sdo.setDeviceId(id);
            sdo.setRecordDate(d);
            sdo.setOnlineSeconds(Long.parseLong("" + Math.round(86400)));
            sdo.setLastUpdateTime(now);
            sdo.setCreateTime(now);
            sdoMapper.insert(sdo);
        });
        return "success";
    }
}
