package dio.my_first_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dio.my_first_web_api.model.User;
import dio.my_first_web_api.repository.UserRepository;

@RestController
public class UserController {
@Autowired
private UserRepository repository;

    @GetMapping("/users")
    public List<User> listAll() {
        return repository.listAll();
    }


    @GetMapping("/users/{id}")

    public User getOne(@PathVariable("id") Integer id) {
        return repository.finById(1);
    }
}
