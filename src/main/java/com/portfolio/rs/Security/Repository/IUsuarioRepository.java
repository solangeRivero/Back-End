package com.portfolio.rs.Security.Repository;

import com.portfolio.rs.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public boolean existsByNombreUsuario(String nombreUsuario);
}
