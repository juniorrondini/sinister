package com.sinister.api.repository;

import com.sinister.api.models.ProtectionClients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtectionClientRepository extends JpaRepository<ProtectionClients, Long> {

}
