package com.identitycard.demo.service;

import com.identitycard.demo.entities.IdentityCard;

public interface IdentityCardService {
    IdentityCard getIdentityCard(Integer id);
    IdentityCard addIdentityCard(IdentityCard identityCard);
}
