package tn.esprit.autoloc.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AgenceRepositoryImpl implements AgenceRepository {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Agence> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Agence> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Agence> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Agence getOne(Long aLong) {
        return null;
    }

    @Override
    public Agence getById(Long aLong) {
        return null;
    }

    @Override
    public Agence getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Agence> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Agence> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Agence> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Agence> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Agence> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Agence> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Agence, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Agence> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Agence> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Agence> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Agence> findAll() {
        return List.of();
    }

    @Override
    public List<Agence> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Agence entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Agence> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Agence> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Agence> findAll(Pageable pageable) {
        return null;
    }
}
