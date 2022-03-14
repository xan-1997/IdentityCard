package com.identitycard.demo.controller;

import com.identitycard.demo.entities.IdentityCard;
import com.identitycard.demo.service.IdentityCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class IdentityCardController {

    private final IdentityCardService service;

    @GetMapping("/identityCard/{id}")
    public ResponseEntity<?> getIdentityCardById(@PathVariable Integer id){
        IdentityCard identityCard = service.getIdentityCard(id);
        return new ResponseEntity<>(identityCard, HttpStatus.OK);
    }

    @PostMapping("/identityCard")
    public ResponseEntity<?> addIdentityCard(@RequestBody IdentityCard identityCard){
        IdentityCard result = service.addIdentityCard(identityCard);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<?> handleException(NullPointerException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
