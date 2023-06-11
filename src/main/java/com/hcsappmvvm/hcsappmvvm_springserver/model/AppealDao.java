package com.hcsappmvvm.hcsappmvvm_springserver.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppealDao {
    @Autowired
    private AppealRepository appealRepository;

    public Appeal saveappeal(Appeal appeal) {
        return appealRepository.save(appeal);
    }

    public void deleteappeal(Appeal appeal) {
        appealRepository.delete(appeal);
    }

    public List<Appeal> getAllAppeals() {
        List<Appeal> appeals = new ArrayList<>();
        Streamable.of(appealRepository.findAll())
                .forEach(appeals::add);
        return appeals;
    }
}
