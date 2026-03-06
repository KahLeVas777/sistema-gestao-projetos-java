import controller.GestaoController;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("🚀 INICIANDO SISTEMA DE GESTÃO - KAROLINE EVENTOS");
        System.out.println("Servidor: AWS EC2 | Banco: MySQL | Status: ONLINE");
        System.out.println("=====================================================\n");

        GestaoController controller = new GestaoController();

        System.out.println("--- INICIALIZANDO PERFIS DE ACESSO ---");
        
        // 1. Diretoria e Gestão
        controller.registrarNovoUsuario("Karoline Vasconcelos", "111.111.111-11", "Admin Estratégico");
        controller.registrarNovoUsuario("Auditoria Interna", "222.222.222-22", "Admin Operacional");
        controller.registrarNovoUsuario("Marcos Silva", "333.333.333-33", "Gerente de Projeto");
        
        // 2. Operação
        controller.registrarNovoUsuario("Ana Souza", "444.444.444-44", "Executor/Colaborador");
        
        // 3. Equipe Técnica (TI)
        controller.registrarNovoUsuario("João HelpDesk", "555.555.555-55", "Apoio ao Usuário");
        controller.registrarNovoUsuario("Brenor Tech", "666.666.666-66", "Manutenção (Desenvolvedor)");
        controller.registrarNovoUsuario("Diego Infra", "777.777.777-77", "Analista de Sistema (Infraestrutura)");

        System.out.println("\n✅ Todos os componentes tecnológicos e usuários foram carregados com sucesso.");
    }
}
