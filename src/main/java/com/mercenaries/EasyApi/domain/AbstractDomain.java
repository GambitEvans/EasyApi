package com.mercenaries.EasyApi.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

import static java.lang.String.format;
import static java.time.LocalDateTime.now;

@MappedSuperclass
public abstract class AbstractDomain implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Column(name = "inclusion_dt", updatable = false)
    protected LocalDateTime inclusionDate;

    @Column(name = "change_dt")
    protected LocalDateTime changeDate;

    public abstract Long getId();

    public AbstractDomain() {
        super();
        this.inclusionDate = now();
        this.changeDate = now();
    }

    public LocalDateTime getInclusionDate() {
        return inclusionDate;
    }

    public void setInclusionDate(final LocalDateTime inclusionDate) {
        this.inclusionDate = inclusionDate;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(final LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public String toString() {
        return format("AbstractDomain [inclusionDate=%s, changeDate=%s]", inclusionDate, changeDate);
    }
}
