package com.example.brendancode.demoTest;
import com.example.brendancode.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void testGetLanguageBy_id(){
        Language testLanguage = new Language("TestLanguage");
        when(sakilaDbApplication.getLanguageByID(0)).thenReturn(Optional.of(testLanguage));
        Assertions.assertEquals(Optional.of(testLanguage), sakilaDbApplication.getLanguageByID(0), "The Language ID test has failed");
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
    public void testGetActorBy_id(){
        Actor testActor = new Actor("TestFirstName", "TestLastName", 1);
        when(sakilaDbApplication.getActorByID(0)).thenReturn(Optional.of(testActor));
        Assertions.assertEquals(Optional.of(testActor), sakilaDbApplication.getActorByID(0), "The Actor ID test has failed");
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

    @Test
    public void testGetFilmBy_id(){
        Film testFilm = new Film("TestFilm", 2000, "TestRating", 1);
        when(sakilaDbApplication.getFilmByID(0)).thenReturn(Optional.of(testFilm));
        Assertions.assertEquals(Optional.of(testFilm), sakilaDbApplication.getFilmByID(0), "The film ID test has failed");
    }

}
