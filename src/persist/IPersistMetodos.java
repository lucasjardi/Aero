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
    public < T > void insert(T objeto);
    public < T > T find(int id);
    public < T > void merge(T objeto);
    public < T > void remove(T objeto);
    public List<?> list();
}
