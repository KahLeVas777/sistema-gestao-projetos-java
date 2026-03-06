import controller.GestaoController;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("🚀 INICIANDO SISTEMA DE GESTÃO ESTRATÉGICA");
        System.out.println("=====================================================\n");

        GestaoController controller = new GestaoController();

        System.out.println("--- 1. CARREGANDO USUÁRIOS NO BANCO ---");
        Usuario admin = controller.registrarUsuario("PRIMEIRO NOME E ULTIMO NOME", "111.111.111-11", "Admin Estratégico");
        Usuario gerente = controller.registrarUsuario("PRIMEIRO NOME E ULTIMO NOME", "333.333.333-33", "Gerente de Projeto");
        
        System.out.println("\n--- 2. INICIANDO NOVO PROJETO ---");
        // Criando o projeto com todos os campos de marketing e o gestor obrigatório
        controller.registrarProjeto(
            "TITULO COMPLETO", // Título Inteiro
            "TITULO ABREVIADO",                                   // Título Abreviado
            "TEMA DO PROJETO",                         // Texto Tema
            "CATEGIRIA",                                       // Categoria Foco
            "Tecnologia",                                     // Categoria Adicional
            "contato@karolineeventos.com.br",                 // E-mail
            gerente                                           // Gestor Responsável (Obrigatório)
        );

        System.out.println("\n✅ Execução finalizada. Todos os critérios do projeto foram atendidos.");
    }
}
