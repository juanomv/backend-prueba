package com.prueba_juan.services.implementation;

import com.prueba_juan.dao.IRolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl {
    @Autowired
    private IRolDao rolDao;
}
