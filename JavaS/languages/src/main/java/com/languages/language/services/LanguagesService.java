package com.languages.language.services;

import com.languages.language.models.Language;
import com.languages.language.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguagesService {
    private final LanguageRepository languageReposotriy;
    public LanguagesService(LanguageRepository repo) {
        languageReposotriy = repo;
    }

    public List<Language> allLanguages() {
        return languageReposotriy.findAll();
    }
    public Language findLanguage(Long id) {
        Optional<Language> optionalLang = languageReposotriy.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
    }
    public Language createLanguage(Language lang) {
        return languageReposotriy.save(lang);
    }

    public Language updateLanguage(Language lang) {
        return languageReposotriy.save(lang);
    }

    public void deleteLanguage(Long id) {
        languageReposotriy.deleteById(id);
    }
}