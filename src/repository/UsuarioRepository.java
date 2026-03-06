package repository;
import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    // Simulação do Banco de Dados Relacional (MySQL) em memória
    private List<Usuario> bancoDeDadosUsuarios = new ArrayList<>();

    public void salvarNoBanco(Usuario usuario) {
        bancoDeDadosUsuarios.add(usuario);
        // Aqui, no futuro, entrará o código SQL: INSERT INTO usuarios...
    }

    public List<Usuario> listarTodos() {
        return bancoDeDadosUsuarios;
    }
}
