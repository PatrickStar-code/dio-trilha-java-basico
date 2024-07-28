package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.my_first_web_api.model.User;

@Repository
public class UserRepository {
  public void save(User User){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void update(User User){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("gleyson","password"));
        usuarios.add(new User("frank","masterpass"));
        return usuarios;
    }
    public User finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson","password");
    }
}
