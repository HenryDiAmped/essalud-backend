package com.reserva.citas.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reserva.citas.models.LoginRequest;
import com.reserva.citas.repositorys.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	@Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return usuarioRepository.findByNumDocumento(request.getUsername())
            .map(usuario -> {
            	if (usuario.getContrasena().equals(request.getPassword())) {
                    // Puedes devolver más datos según lo necesites
                    Map<String, Object> response = new HashMap<>();
                    response.put("idUsuario", usuario.getIdUsuario());
                    response.put("nombre", usuario.getNombre());
                    response.put("apellido", usuario.getApellido());
                    response.put("tipoUsuario", usuario.getTipoUsuario());
                    
                    return ResponseEntity.ok(response);
                } else {
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body("Contraseña incorrecta");
                }
            })
            .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuario no encontrado"));
    }
}
