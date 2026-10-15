package tn.esprit.autoloc.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import tn.esprit.autoloc.entities.Contrat;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ContratRepositoryImpl implements ContratRepository{
    @Override
    public void flush() {

    }

    @Override
    public <S extends Contrat> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Contrat> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Contrat> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Contrat getOne(Long aLong) {
        return null;
    }

    @Override
    public Contrat getById(Long aLong) {
        return null;
    }

    @Override
    public Contrat getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Contrat> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Contrat> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Contrat> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Contrat> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Contrat> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Contrat> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Contrat, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Contrat> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Contrat> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Contrat> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Contrat> findAll() {
        return List.of();
    }

    @Override
    public List<Contrat> findAllById(Iterable<Long> longs) {
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
    public void delete(Contrat entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Contrat> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Contrat> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Contrat> findAll(Pageable pageable) {
        return null;
    }
}
