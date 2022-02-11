package com.example.brendancode.demoTest;
import com.example.brendancode.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {
    private SakilaDbApplication sakilaDbApplication;

    @Mock
    private LanguageRepository languageRepository; //Creating a fake DB version of repos
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private ActorRepository actorRepository;

    @BeforeEach
    void Setup(){
        sakilaDbApplication = new SakilaDbApplication(languageRepository, actorRepository, filmRepository, categoryRepository);
    }

    @Test
    public void testAddLanguage(){
        Language saveLanguage = new Language("Test Language");
        String expected = "save";
        String actual = sakilaDbApplication.addLanguage(saveLanguage.getName());
        ArgumentCaptor<Language>languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(languageArgumentCaptor.capture());
        languageArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data has been created in mock DB");
    }

    @Test
    public void testAddActor(){
        Actor addActor = new Actor("First name", "Last name");
        String expected = "save";
        String actual = sakilaDbApplication.addActors(addActor.getFirst_name(), addActor.getLast_name());
        ArgumentCaptor<Actor>actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
        verify(actorRepository).save(actorArgumentCaptor.capture());
        actorArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual,"Actor data has been created in mock DB");
    }

    @Test
    public void testAddFilm(){
        Film addFilm = new Film("Title", "Release year", "rating");
        String expected = "save";
        String actual = sakilaDbApplication.addNewFilm(addFilm.getTitle(), addFilm.getRelease_year(), addFilm.getRating());
        ArgumentCaptor<Film>actorArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(actorArgumentCaptor.capture());
        actorArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual,"Film data has been created in mock DB");
    }

}
