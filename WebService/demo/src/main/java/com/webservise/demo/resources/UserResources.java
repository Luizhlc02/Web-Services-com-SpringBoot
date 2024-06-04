package com.webservise.demo.resources;
import com.webservise.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Flavia","annaflaviiaazevedo@gmail.com","86981632949","Flavia11");
        return ResponseEntity.ok().body(u);
    }
}
