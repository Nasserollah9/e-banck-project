package org.sid.ebankbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("CURR") //max 4 characheter
@Data @NoArgsConstructor
@AllArgsConstructor
public class CurrentAccount extends BankAccount {

    private double OverDraft;
}
