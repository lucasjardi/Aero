/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.util.List;

/**
 *
 * @author DTI
 */
public interface IPersistMetodos {
    public < T > void save(T objeto);
    public < T > T update(int id);
    public < T > void delete(T objeto);
    public < T > T findById(int id);
    public < T > List<T> listAllEntity(Class<T> entity);
    public < T > List<T> listAllEntityOrderBy(Class<T> entity, String fieldName);
}
