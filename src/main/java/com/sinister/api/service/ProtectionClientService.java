package com.sinister.api.service;

import com.sinister.api.models.ProtectionClients;
import com.sinister.api.repository.ProtectionClientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProtectionClientService {
    @Autowired
    private  ProtectionClientRepository protectionClientRepository;
    public ProtectionClients save(ProtectionClients protectionClients){
        return protectionClientRepository.save(protectionClients);
    }

    public List<ProtectionClients> get(){
        return protectionClientRepository.findAll();
    }
}
