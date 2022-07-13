package com.mlb.mlb_api.controllers;

import com.mlb.mlb_api.controllers.dto.PlayerDTO;
import com.mlb.mlb_api.repositories.entities.Player;
import com.mlb.mlb_api.repositories.PlayerRepository;
import com.mlb.mlb_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {

@Autowired
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {

        this.playerService = playerService;
    }


@PostMapping("/add")
    public Player createPlayer(@RequestBody PlayerDTO playerDTO){

        return playerService.save(playerDTO);

}


@GetMapping("/all")
   public  Iterable<Player> getAllPlayers(){
        return playerService.findAll();
}

//@GetMapping("/{id}")
//    public Player getPlayerById(@PathVariable("id") Integer playerId){
//        Optional<Player> optionalPlayer = playerRepository.findById(playerId);
//        if(optionalPlayer.isEmpty()){return null;}
//        Player player = optionalPlayer.get();
//        return player;
//}
//
//
//@PutMapping
//    public Player updatePlayer(@RequestBody Player incomingPlayer) {
// // find the player to update
//    Player playerToUpdate = getPlayerById(incomingPlayer.getId());
//
////    if (!incomingPlayer.getName().isEmpty() || incomingPlayer.getName() != null) {
////        playerToUpdate.setName(playerToUpdate.getName());
////    }
////update the players information
//    if (incomingPlayer.getName() == null) {
//        playerToUpdate.setName(playerToUpdate.getName());
//    } else if(incomingPlayer.getName().isEmpty()) {
//        playerToUpdate.setName(playerToUpdate.getName());
//    } else {
//        playerToUpdate.setName(incomingPlayer.getName());
//    }
//    playerToUpdate.setAge(incomingPlayer.getAge() != null && incomingPlayer.getAge() > 18 ? incomingPlayer.getAge() : playerToUpdate.getAge());
//    playerToUpdate.setRating(incomingPlayer.getRating() != null && incomingPlayer.getRating() > 18 ? incomingPlayer.getRating() : playerToUpdate.getRating());
//    playerToUpdate.setYearOfExperience(incomingPlayer.getYearOfExperience() != null && incomingPlayer.getYearOfExperience() > 18 ? incomingPlayer.getYearOfExperience() : playerToUpdate.getAge());
// //save the player back to the DB
// // Return the player to the client
//  return playerRepository.save(playerToUpdate);
//
//    }
//   @DeleteMapping("/{id}")
//
//   public void deletePlayer(@PathVariable Integer id){
//       Optional<Player> playerToDelete = playerRepository.findById(id);
//       if(playerToDelete.isPresent()){
//           playerRepository.deleteById(id);
//           throw new ResponseStatusException(HttpStatus.OK, "The player has been successfully deleted");
//       } else {
//           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The player was not found");
//       }

//
//   }




}
