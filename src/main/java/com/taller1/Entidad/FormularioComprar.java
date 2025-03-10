package com.taller1.Entidad;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FormularioComprar {

    @NotBlank(message = "El nombre es obligatorio.")
    private String nombre;

    @Email(message = "Debe proporcionar un correo electrónico válido.")
    private String email;

    @NotBlank(message = "El teléfono es obligatorio.")
    private String telefono;

    @NotBlank(message = "El producto de interés es obligatorio.")
    private String interes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
}
