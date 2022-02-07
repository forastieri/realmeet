package br.com.sw2you.realmeet;

import br.com.sw2you.realmeet.api.facade.RoomsApi;
import br.com.sw2you.realmeet.api.model.RoomDTO;
import br.com.sw2you.realmeet.service.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class RoomController implements RoomsApi {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }


    @Override
    public CompletableFuture<ResponseEntity<RoomDTO>> getRoom(Long id){
        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(this.roomService.getRoom(id)));
    }
}
