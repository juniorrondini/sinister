package com.sinister.api.controller;

import com.sinister.api.models.ProtectionClients;
import com.sinister.api.service.ProtectionClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ProtectionClientController {
    @Autowired
    private ProtectionClientService protectionClientService;

    @GetMapping
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(protectionClientService.get());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(protectionClientService.getById(id));
    }


    @PostMapping
    public ResponseEntity<?> post(@RequestBody ProtectionClients protectionClient){
        return  ResponseEntity.ok(protectionClientService.save(protectionClient));

        }
    @DeleteMapping("/{id}")
    public ResponseEntity <?> delete(@PathVariable Long id) {
        protectionClientService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable Long id, @RequestBody ProtectionClients updatedClient){
        protectionClientService.put(id, updatedClient);
        return ResponseEntity.ok().build();
    }


}


