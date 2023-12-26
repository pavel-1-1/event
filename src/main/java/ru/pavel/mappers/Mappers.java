package ru.pavel.mappers;

import java.util.List;

public interface Mappers<E, D> {
    E toEntity(D dto);

    List<E> toListEntity(List<D> listDto);

    D toDto(E entity);

    List<D> toListDto(List<E> listEntity);
}
