package com.sinister.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "protection_clients")
@AllArgsConstructor
@NoArgsConstructor
public class ProtectionClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "address")
    private String address;
    @Column(name = "pay_check")
    private BigDecimal payCheck;


}
