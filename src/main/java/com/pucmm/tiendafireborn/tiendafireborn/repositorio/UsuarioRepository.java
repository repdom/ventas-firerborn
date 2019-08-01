package com.pucmm.tiendafireborn.tiendafireborn.repositorio;

import com.pucmm.tiendafireborn.tiendafireborn.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
