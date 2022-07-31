/*
* To change this license header, choose License Headers n Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor
*/
package com.portfolio.rs.Security.Service;

import com.portfolio.rs.Security.Entity.Usuario;
import com.portfolio.rs.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreusuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
