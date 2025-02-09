package com.taller1.Entidad;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FormularioVender {

    @NotBlank(message = "El tipo de producto es obligatorio.")
    private String tipo;

    @NotNull(message = "El precio es obligatorio.")
    private Double precio;

    @NotBlank(message = "La marca es obligatoria.")
    private String marca;

    @NotBlank(message = "El modelo es obligatorio.")
    private String modelo;

    @NotBlank(message = "El estado del producto es obligatorio.")
    private String estado;

    @NotBlank(message = "El propietario es obligatorio.")
    private String propietario;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
