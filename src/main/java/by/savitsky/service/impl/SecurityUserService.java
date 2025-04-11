package by.savitsky.service.impl;

import by.savitsky.service.ISecurityUserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserService implements ISecurityUserService {

    @PersistenceContext
    private EntityManager entityManager;

}
