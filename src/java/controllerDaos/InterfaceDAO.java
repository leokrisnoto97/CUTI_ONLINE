/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerDaos;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public interface InterfaceDAO {
    public boolean saveOrUpdate(Object object);
    public boolean delete(Object object);
    public List<Object> getAll();
    public List<Object> search(String category, Object key);
    public List<Object> RiwayatPermohonan(String category, Object key);
    public Object login(Object key);
    public Object getById(Object id);
    public Object getByName(Object name);
    public Object getLastId();
    public List<Object> getDataNonExpired(String category);
}
