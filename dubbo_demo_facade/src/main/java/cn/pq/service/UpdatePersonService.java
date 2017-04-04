package cn.pq.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.pq.model.Person;

@Service
public interface UpdatePersonService {
    
    @Transactional
    public void update(Person person);
    
}
