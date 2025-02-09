package com.taller1.Controlador;

import com.taller1.Entidad.FormularioComprar;
import com.taller1.Entidad.FormularioContacto;
import com.taller1.Entidad.FormularioVender;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaginaControlador {

    @GetMapping("/contacto")
    public String mostrarPaginaContactos(Model model) {
        model.addAttribute("formularioContacto", new FormularioContacto());
        return "screens/contacto";
    }

    @PostMapping("/enviarFormulario")
    public String enviarFormulario(@Valid @ModelAttribute("formularioContacto") FormularioContacto formularioContacto,
                                   BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "screens/contacto";
        }
        return "screens/registroExitoso";
    }

    @GetMapping("/comprar")
    public String mostrarPaginaComprar(Model model) {
        model.addAttribute("formularioComprar", new FormularioComprar());
        return "screens/comprar";
    }

    @PostMapping("/enviarFormularioComprar")
    public String enviarFormularioComprar(
            @Valid @ModelAttribute("formularioComprar") FormularioComprar formularioComprar,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "screens/comprar";
        }
        return "screens/registroExitoso";
    }

    @GetMapping("/vender")
    public String mostrarPaginaVender(Model model) {
        model.addAttribute("formularioVender", new FormularioVender());
        return "screens/vender";
    }

    @PostMapping("/enviarFormularioVender")
    public String enviarFormularioVender(@Valid @ModelAttribute("formularioVender") FormularioVender formularioVender,
                                         BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "screens/vender";
        }
        return "screens/registroExitoso";
    }

    @GetMapping("/servicios")
    public String mostrarPaginaServicios() {
        return "screens/servicios";
    }

    @GetMapping("/productos")
    public String mostrarPaginaPropiedades() {
        return "screens/productos";
    }
}
