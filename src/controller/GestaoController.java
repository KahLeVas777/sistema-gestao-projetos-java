package controller;
import model.Usuario;
import repository.UsuarioRepository;
import view.SistemaView;

public class GestaoController {
    private UsuarioRepository repository;
    private SistemaView view;

    // Construtor conectando as camadas (MVC)
    public GestaoController() {
        this.repository = new UsuarioRepository();
        this.view = new SistemaView();
    }

    // Regra de negócio: Cadastrar e salvar no banco
    public void registrarNovoUsuario(String nome, String cpf, String perfil) {
        Usuario novoUser = new Usuario(nome, cpf, perfil);
        repository.salvarNoBanco(novoUser);
        view.exibirMensagem("Registro concluído com sucesso no Banco de Dados.");
        view.exibirPerfilUsuario(novoUser);
    }
}
