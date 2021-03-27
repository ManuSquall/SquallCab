package org.squall.repository;

import org.squall.domain.Profil;

public interface IProfilRepository {
    Profil[] getAll();
    Profil getById(int id);
    
}
