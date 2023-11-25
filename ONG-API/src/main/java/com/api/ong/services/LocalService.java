package com.api.ong.services;
import java.util.List;
import com.api.ong.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ong.repository.LocalRepository;
@Service
public class LocalService {
	@Autowired
	private LocalRepository loc;
	public List<Local> listar(){
		return loc.findAll();
	}
	public void insertar(Local bean) {
		loc.save(bean);
	}
	public void actualizar(Local bean) {
		loc.save(bean);
	}
	public void eliminar(Integer id) {
		loc.deleteById(id);
	}
	public Local buscaId(Integer id){
		return loc.findById(id).orElse(null);
	}
}
