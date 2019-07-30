package com.nelioalves.workshopmongo.resources;

import com.alibaba.fastjson.JSONObject;
import com.nelioalves.workshopmongo.domain.AllocateStat;
import com.nelioalves.workshopmongo.domain.FooStat;
import com.nelioalves.workshopmongo.repository.StatRepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/stat")
public class AllocateStatController {

    @Autowired
    private StatRepository statRepository;

    @RequestMapping(value="/allInfo", method= RequestMethod.GET)
    public ResponseEntity<List<FooStat>> findAllInfo()  {
        List<AllocateStat> statList = statRepository.findAll();
        List<FooStat> barList = Lists.newArrayList();
        statList
                .stream()
                .collect(Collectors.groupingBy(AllocateStat::getUpCenter,Collectors.toList()))
                .forEach((upCenter,fooListByName)->{
                    FooStat bar = new FooStat();
                    bar = fooListByName
                            .stream()
                            .reduce(bar,(u,t)->u.sum(t),(u,t)->u);
                    //System.out.println(bar);
                    barList.add(bar);
                });
           // barList.stream().skip(pageSize).limit(pageCount);
        System.out.println(JSONObject.toJSON(barList));

        return ResponseEntity.ok().body(barList);
    }


}
