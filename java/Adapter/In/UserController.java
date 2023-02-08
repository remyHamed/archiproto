package Adapter.In;

import Domaine.User;
import com.example.restservice.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/user")
    User createUser(@RequestBody User user) {

    }


    @GetMapping("/user/{id}")
    User one(@PathVariable Long id) {

       // return repository.findById(id)
         //       .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
}
