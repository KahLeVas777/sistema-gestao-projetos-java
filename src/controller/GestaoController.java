package controller;
import model.Usuario;
import model.Projeto;
import repository.UsuarioRepository;
import repository.ProjetoRepository;
import view.SistemaView;

public class GestaoController {
    private UsuarioRepository usuarioRepo;
    private ProjetoRepository projetoRepo;
    private SistemaView view;

    public GestaoController() {
        this.usuarioRepo = new UsuarioRepository();
        this.projetoRepo = new ProjetoRepository();
        this.view = new SistemaView();
    }

    public Usuario registrarUsuario(String nome, String cpf, String perfil) {
        Usuario novoUser = new Usuario(nome, cpf, perfil);
        usuarioRepo.salvarNoBanco(novoUser);
        view.exibirMensagem("Usuário cadastrado: " + nome + " (" + perfil + ")");
        return novoUser;
    }

    public void registrarProjeto(String tituloInt, String tituloAbr, String tema, 
                                 String catFoco, String catAdicional, String email, Usuario gestor) {
        try {
            // Tenta criar o projeto (aqui a trava do Gestor Obrigatório é acionada)
            Projeto novoProjeto = new Projeto(tituloInt, tituloAbr, tema, catFoco, catAdicional, email, gestor);
            projetoRepo.salvarProjeto(novoProjeto);
            view.exibirMensagem("Projeto criado com sucesso!");
            view.exibirPainelProjeto(novoProjeto);
        } catch (IllegalArgumentException e) {
            // Captura o erro caso tentem criar sem gestor
            view.exibirAlerta("FALHA DE SEGURANÇA: " + e.getMessage());
        }
    }
}
