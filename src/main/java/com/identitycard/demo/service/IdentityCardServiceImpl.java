package com.identitycard.demo.service;

import com.identitycard.demo.entities.IdentityCard;
import com.identitycard.demo.repository.IdentityCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IdentityCardServiceImpl implements IdentityCardService {

    private final IdentityCardRepository repo;

    @Override
    public IdentityCard getIdentityCard(Integer id) {
        Optional<IdentityCard> optional = repo.findById(id);
        return optional.orElseThrow(()->new NullPointerException("There is no IdentityCard with this id!!!"));
    }

    @Override
    public IdentityCard addIdentityCard(IdentityCard identityCard) {
        return repo.save(identityCard);
    }
}
