package com.portfolio.rs.Security.Service;

import com.portfolio.rs.Security.Entity.Usuario;
import com.portfolio.rs.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreusuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
     public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
     
     public void save(Usuario usuario){
         iusuarioRepository.save(usuario);
     }

    Object getByNombreUsuario(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
