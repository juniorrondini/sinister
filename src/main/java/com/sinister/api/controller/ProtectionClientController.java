package com.sinister.api.controller;

import com.sinister.api.models.ProtectionClients;
import com.sinister.api.service.ProtectionClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @PostMapping
    public ResponseEntity<?> post(@RequestBody ProtectionClients protectionClient){
        return  ResponseEntity.ok(protectionClientService.save(protectionClient));
    }
}

