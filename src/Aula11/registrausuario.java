
package Aula11;

import Controllers.UsuarioController;
import Tools.Conexao;
import modelos.usuario;

public class registrausuario {
    
    public static void main(String[] args) {
        
        UsuarioController controller = new UsuarioController();
        
    usuario user1 = new usuario();
    user1.setId(1);
    user1.setNome("pedro");
    user1.setUsuario("pedro");
    user1.setSenha("121");
    user1.setTelefone("91234-1234");
        
    usuario user2 = new usuario();
    user2.setId(2);
    user2.setNome("juca");
    user2.setUsuario("juca");
    user2.setSenha("122");
    user2.setTelefone("91234-1234");
    
    usuario user3 = new usuario();
    user3.setId(3);
    user3.setNome("paulo");
    user3.setUsuario("paulo");
    user3.setSenha("123");
    user3.setTelefone("91234-1234");
    
    usuario user4 = new usuario();
    user4.setId(4);
    user4.setNome("joao");
    user4.setUsuario("joao");
    user4.setSenha("124");
    user4.setTelefone("91234-1234");
    
        usuario user5 = new usuario();
    user5.setId(5);
    user5.setNome("lucas");
    user5.setUsuario("lucas");
    user5.setSenha("125");
    user5.setTelefone("91234-1234");
   
        usuario user6 = new usuario();
    user6.setId(6);
    user6.setNome("mauro");
    user6.setUsuario("mauro");
    user6.setSenha("126");
    user6.setTelefone("91234-1234");
   
        usuario user7 = new usuario();
    user7.setId(7);
    user7.setNome("erik");
    user7.setUsuario("erik");
    user7.setSenha("127");
    user7.setTelefone("91234-1234");
    
        usuario user8 = new usuario();
    user8.setId(8);
    user8.setNome("hugo");
    user8.setUsuario("hugo");
    user8.setSenha("128");
    user8.setTelefone("91234-1234");
    
        usuario user9 = new usuario();
    user9.setId(9);
    user9.setNome("fabio");
    user9.setUsuario("fabio");
    user9.setSenha("129");
    user9.setTelefone("91234-1234");

        usuario user10 = new usuario();
    user10.setId(10);
    user10.setNome("wagner");
    user10.setUsuario("wagner");
    user10.setSenha("120");
    user10.setTelefone("91234-1234");

    controller.incluir(user1);
    controller.incluir(user2);
    controller.incluir(user3);
    controller.incluir(user4);
    controller.incluir(user5);
    controller.incluir(user6);
    controller.incluir(user7);
    controller.incluir(user8);
    controller.incluir(user9);
    controller.incluir(user10);

    }
}
