package co.edu.utp.misiontic.g12g4.backend.taskhome.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "login_usuario")
    private String username; // user_name
    
    private String password;
    
    @Column(name = "nombre_usuario")
    private String name;

    @Column(name = "correo_electronico", unique = true)
    private String email;
    
    @Column(name = "estado")
    private Boolean active;
    
    private Boolean admin;
}
