package cn.pq.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.pq.model.Person;

@Service
public interface TxService {

    @Transactional
    public void testTx(Person person);
    
}
