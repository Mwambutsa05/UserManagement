package org.springboot.usermanagement;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   private final UserRepository repository;

   public UserService(UserRepository repository) {
       this.repository = repository;
   }

   public Users createUser(Users user) {
       return repository.save(user);
   }

   public List<Users> selectAll() {
       return repository.findAll();
   }

    public Users updateTask(Long id , Users updatetask) {
        var user =  repository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
        user.setFirstName(updatetask.getFirstName());
        user.setLastName(updatetask.getLastName());
        user.setRole(updatetask.getRole());
        user.setEmail(updatetask.getEmail());
        user.setNumber(updatetask.getNumber());
        return repository.save(user);
    }

}
