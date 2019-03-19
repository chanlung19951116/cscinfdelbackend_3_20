package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.MenuRol;
import com.jo.cscinfdel.model.QBarrio;
import com.jo.cscinfdel.model.QUsuarios;
import com.jo.cscinfdel.model.Usuarios;
import com.jo.cscinfdel.repository.UsuariosRepository;
import com.jo.cscinfdel.security.JwtTokenUtil;
import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Auth")
public class AuthController {

    @Autowired
    JwtTokenUtil tokenUtil;

    @Autowired
    UsuariosRepository usuariosRepository;

    @Getter
    @Setter
    @AllArgsConstructor()
    @NoArgsConstructor
    private class AuthResponse {
        private Integer status;
        private String token;
        private List<MenuRol> menuRolList;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AuthResponse login(@RequestBody Usuarios usuarios) {


        QUsuarios qUsuarios = QUsuarios.usuarios;

        Predicate predicate = qUsuarios.usuarioNmbre.eq(usuarios.getUsuarioNmbre())
                .and(qUsuarios.usuarioContrasena.eq(usuarios.getUsuarioContrasena()));


        Optional<Usuarios> optionalUsuarios = usuariosRepository.findOne(predicate);

        if (!optionalUsuarios.isPresent()) {
            return new AuthResponse(0, "", null);
        }

        Usuarios foundUsuarios = optionalUsuarios.get();


        List<MenuRol> menuRolList = new ArrayList<>(foundUsuarios.getRol().getMenuRolList());
        menuRolList.forEach(menuRol -> {
            menuRol.setRol(null);
        });

        return new AuthResponse(1, "", menuRolList);

//        Usuarios foundUsuarios = usuariosRepository.findByUsuarioNmbre(usuarios.getUsuarioNmbre());
//
//        if (foundUsuarios != null && foundUsuarios.getUsuarioContrasena().equals(usuarios.getUsuarioContrasena())) {
//            return new AuthResponse(1, tokenUtil.generateToken(foundUsuarios));
//        }
//
//        return new AuthResponse(0, "");
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public AuthResponse signup(@RequestBody Usuarios usuarios) {


        return new AuthResponse(1, "", null);

//        Usuarios foundUsuarios = usuariosRepository.findByUsuarioNmbre(usuarios.getUsuarioNmbre());
//
//        if (foundUsuarios != null) {
//            return new AuthResponse(0, "");
//        }
//
//        usuarios.setUsuarioEstado("ACT");
//        usuariosRepository.save(usuarios);
//
//        return new AuthResponse(1, "");

    }
}
