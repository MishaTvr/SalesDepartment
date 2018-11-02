package persistence.dao;

import persistence.entities.Client;

import java.util.Collections;
import java.util.List;

public class ClientDAO<T,U> implements AbstractDAO<Client, String> {

    public List<Client> findAll() {
        return Collections.emptyList();
    }
}
