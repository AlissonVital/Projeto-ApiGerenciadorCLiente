package matrix.develop.gerenciadorclientes.domain;

public class Usuario {

    private String name;
    private String parentesco;

    public Usuario() {
    }

    public Usuario(String name, String parentesco) {
        this.name = name;
        this.parentesco = parentesco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
