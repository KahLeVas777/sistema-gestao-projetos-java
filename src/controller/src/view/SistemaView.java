package view;
import model.Usuario;

public class SistemaView {
    public void exibirMensagem(String mensagem) {
        System.out.println(">> " + mensagem);
    }

    public void exibirPerfilUsuario(Usuario u) {
        System.out.println("👤 Usuário: " + u.getNome() + " | 🔐 Acesso: " + u.getCategoriaPerfil());
    }
}
