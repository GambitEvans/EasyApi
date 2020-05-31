package com.mercenaries.EasyApi.service;

import com.mercenaries.EasyApi.exception.NotFoundException;
import domain.AbstractDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.GenericTypeResolver;
import repository.AbstractRepository;

import java.util.Objects;

import static java.time.LocalDateTime.now;

@Slf4j
public abstract class AbstractService<T> {
    protected AbstractRepository<T> repository;

    public AbstractService(AbstractRepository<T> repository){
        this.repository = repository;
    }

    public Class<T> getServiceType() {
        return (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), AbstractService.class);
    }

    public T recover(Long id) {
        log.info("to recover {}", getServiceType().getSimpleName());
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Long id){
        log.info("to delete {}", getServiceType().getSimpleName());
        T entity = recover(id);
        try {
            repository.delete(entity);
        } catch (Exception e) {
            log.error(e.getMessage());
            //Don't forget to create an especific Exception to this validation error.
            throw new RuntimeException();
        }
    }

    public T save(T entity) {
        log.info("to save {}", getServiceType().getSimpleName());
        if (Objects.isNull(((AbstractDomain) entity).getId())) {
            ((AbstractDomain) entity).setInclusionDate(now());
        } else {
            ((AbstractDomain) entity).setChangeDate(now());
        }
        return repository.save(entity);
    }
}
