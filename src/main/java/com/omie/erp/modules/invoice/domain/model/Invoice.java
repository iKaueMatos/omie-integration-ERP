package com.omie.erp.modules.invoice.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento do ID
    private Long id;

    @OneToOne(cascade = CascadeType.ALL) // Assume que Complement é uma entidade
    @JoinColumn(name = "complement_id")
    private Complement complement;

    @OneToMany(cascade = CascadeType.ALL) // Assume que Detail é uma entidade
    @JoinColumn(name = "invoice_id")
    private List<Detail> details;

    @OneToOne(cascade = CascadeType.ALL) // Assume que Identification é uma entidade
    @JoinColumn(name = "identification_id")
    private Identification identification;

    @OneToOne(cascade = CascadeType.ALL) // Assume que Information é uma entidade
    @JoinColumn(name = "information_id")
    private Information information;

    @OneToOne(cascade = CascadeType.ALL) // Assume que NFDestinationInternal é uma entidade
    @JoinColumn(name = "nf_destination_internal_id")
    private NFDestinationInternal nfDestinationInternal;

    @OneToOne(cascade = CascadeType.ALL) // Assume que NFEmitterInternal é uma entidade
    @JoinColumn(name = "nf_emitter_internal_id")
    private NFEmitterInternal nfEmitterInternal;

    @OneToMany(cascade = CascadeType.ALL) // Assume que Title é uma entidade
    @JoinColumn(name = "invoice_id")
    private List<Title> titles;

    @OneToOne(cascade = CascadeType.ALL) // Assume que Total é uma entidade
    @JoinColumn(name = "total_id")
    private Total total;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Complement getComplement() {
        return complement;
    }

    public void setComplement(Complement complement) {
        this.complement = complement;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public NFDestinationInternal getNfDestinationInternal() {
        return nfDestinationInternal;
    }

    public void setNfDestinationInternal(NFDestinationInternal nfDestinationInternal) {
        this.nfDestinationInternal = nfDestinationInternal;
    }

    public NFEmitterInternal getNfEmitterInternal() {
        return nfEmitterInternal;
    }

    public void setNfEmitterInternal(NFEmitterInternal nfEmitterInternal) {
        this.nfEmitterInternal = nfEmitterInternal;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }
}