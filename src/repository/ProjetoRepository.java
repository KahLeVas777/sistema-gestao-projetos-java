package repository;
import model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoRepository {
    // Simulação do Banco de Dados para Projetos
    private List<Projeto> bancoDeDadosProjetos = new ArrayList<>();

    public void salvarProjeto(Projeto projeto) {
        bancoDeDadosProjetos.add(projeto);
    }

    public List<Projeto> listarProjetos() {
        return bancoDeDadosProjetos;
    }
}
