package org.sid.ebankbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankbackend.entities.BankAccount;


import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
