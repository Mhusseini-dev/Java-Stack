package com.dojoninja.dn.services;

import com.dojoninja.dn.models.Dojo;
import com.dojoninja.dn.models.Ninja;
import com.dojoninja.dn.repositories.DojoRepo;
import com.dojoninja.dn.repositories.NinjaRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoNinjaServ {
    private final DojoRepo dojoRepo;
    private final NinjaRepo ninjaRepo;

    public DojoNinjaServ(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
        this.dojoRepo = dojoRepo;
        this.ninjaRepo = ninjaRepo;
    }

    public void addDojo(Dojo dojo) {
        dojoRepo.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepo.findAll();
    }

    public Dojo singleDojo(Long id) {
        Optional<Dojo> dojo = dojoRepo.findById(id);
        if(dojo.isPresent()) {
            return dojo.get();
        }
        else {
            return null;
        }
    }

    public void addNinja(Ninja ninja) {
        ninjaRepo.save(ninja);
    }
}
