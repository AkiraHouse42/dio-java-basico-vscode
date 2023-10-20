import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioBancoController {
    private final UsuarioBancoRepository usuarioRepository;

    public UsuarioBancoController(UsuarioBancoRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public Iterable<UsuarioBanco> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}