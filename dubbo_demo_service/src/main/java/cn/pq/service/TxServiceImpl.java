package cn.pq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.pq.model.Person;

public class TxServiceImpl implements TxService{

	@Override
	public void testTx(Person person) {
		// TODO Auto-generated method stub
		
	}
//    @Autowired
//    private AddPersonServiceImpl addPersonService;
//    @Autowired
//    private UpdatePersonServiceImpl updatePersonService;
//
//    @Transactional
//    public void testTx(Person person) {
//        updatePersonService.update(person);
//        addPersonService.save(person);
//        int i = 1/0;
//    }
}
