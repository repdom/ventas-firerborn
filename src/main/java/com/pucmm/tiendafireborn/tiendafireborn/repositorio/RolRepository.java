package com.pucmm.tiendafireborn.tiendafireborn.repositorio;

import com.pucmm.tiendafireborn.tiendafireborn.entidad.Rol;
import com.pucmm.tiendafireborn.tiendafireborn.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, String> {
    public Usuario findByUsuario(String usuario);
}
