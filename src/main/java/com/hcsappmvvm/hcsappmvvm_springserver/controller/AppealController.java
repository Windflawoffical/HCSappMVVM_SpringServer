package com.hcsappmvvm.hcsappmvvm_springserver.controller;

import com.hcsappmvvm.hcsappmvvm_springserver.model.Appeal;
import com.hcsappmvvm.hcsappmvvm_springserver.model.AppealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppealController {

    @Autowired
    private AppealDao appealDao;
    @GetMapping("/appeal/get-all")
    public List<Appeal> getAllAppeals() {
        return appealDao.getAllAppeals();
    }
    @PostMapping("/appeal/save-appeal")
    public Appeal saveappeal(@RequestBody Appeal appeal) {
        return appealDao.saveappeal(appeal);
    }
}
