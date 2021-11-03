package fr.univtln.lblanc797.DAO;

import fr.univtln.lblanc797.Entity.InterfaceEntity;

import java.util.List;
import java.util.Optional;

/**
 * this interface is the base of the DAO
 */


public interface InterfaceDAO <T extends InterfaceEntity>{

    public T persist(T t);

    public List<T> persistAll(List<T> l);

    public Optional<T> find(long id);

    public List<T> findAll();

    public void update(T t);

    public void remove(long id);

    public void clear();


}
