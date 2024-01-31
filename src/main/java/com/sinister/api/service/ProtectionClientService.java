package com.sinister.api.service;

import com.sinister.api.models.ProtectionClients;
import com.sinister.api.repository.ProtectionClientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProtectionClientService {
    @Autowired
    private ProtectionClientRepository protectionClientRepository;

    public ProtectionClients save(ProtectionClients protectionClients) {
        return protectionClientRepository.save(protectionClients);
    }

    public List<ProtectionClients> get() {
        return protectionClientRepository.findAll();
    }

    public Optional<ProtectionClients> getById(Long id) {
        return protectionClientRepository.findById(id);
    }

    public Optional<ProtectionClients> put(Long id, ProtectionClients updatedClient) {
        return protectionClientRepository.findById(id).map(existingClient -> {
            existingClient.setTitle(updatedClient.getTitle());
            existingClient.setAddress(updatedClient.getAddress());
            existingClient.setPayCheck(updatedClient.getPayCheck());
            return protectionClientRepository.save(existingClient);
        });
    }

        public void delete (Long id){
            protectionClientRepository.deleteById(id);
        }

    }



