package com.hcsappmvvm.hcsappmvvm_springserver;

import com.hcsappmvvm.hcsappmvvm_springserver.model.Appeal;
import com.hcsappmvvm.hcsappmvvm_springserver.model.AppealDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HcSappMvvmSpringServerApplicationTests {

	@Autowired
	private AppealDao appealDao;

	@Test
	void addAppealTest() {
		Appeal appeal = new Appeal();
		appeal.setTitle("sdfgsdg");
		appeal.setDescription("This issdfgsdfgsdg works");
		appeal.setAddress("Moscsdfgsdfgow");
		appealDao.saveappeal(appeal);
	}
	//@Test
	void getAllAppealsAndDeleteThem(){
		List<Appeal> appeals = appealDao.getAllAppeals();
		for (Appeal appeal : appeals){
			appealDao.deleteappeal(appeal);
		}
		System.out.println(appeals);
	}


}
