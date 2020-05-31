package com.mercenaries.EasyApi.dto;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractDto<T, D> extends EasyApiDto {
    private static final long serialVersionUID = 7510093243782192972L;

    @SneakyThrows
    public D converter(T entity, Function<T, D> constructor) {
        if (Objects.nonNull(entity))
            return constructor.apply(entity);

        return (D) getClass().newInstance();
    }

    public List<D> converter(List<T> lsEntity, Function<T, D> constructor) {
        if (Objects.nonNull(lsEntity)) {
            return lsEntity.stream().map(constructor).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
