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
public interface IPersistMetodos<T,ID> {
    public < T > void save(T entity);
    public < T > void update(T entity);
    public < T > void delete(T entity);
    public < T > T findById(ID id);
    public < T > List<T> listAllEntity(Class<T> entity);
    public < T > List<T> listAllEntityOrderBy(Class<T> entity, String fieldName);
}
