package model;

public class Usuario {
    private String nome;
    private String cpf;
    private String categoriaPerfil; // Ex: Admin Estratégico, Gerente de Projeto, etc.

    public Usuario(String nome, String cpf, String categoriaPerfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.categoriaPerfil = categoriaPerfil;
    }

    public String getNome() { return nome; }
    public String getCategoriaPerfil() { return categoriaPerfil; }
}
