package com.chandu.oms.service;

import com.chandu.oms.entity.Security_master;
import com.chandu.oms.repository.Security_masterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Security_masterServiceImpl implements Security_masterService{

@Autowired
private Security_masterRepository SecurityMasterRepository;

    @Override
    public Iterable<Security_master> displaySecurityMaster() {
        return SecurityMasterRepository.findAll();
    }
}
