package com.example.brendancode.demoTest;
import com.example.brendancode.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    @Mock
    private UserReviewRepository userReviewRepository;
    private Object Film;

    @BeforeEach
    void Setup(){
        sakilaDbApplication = new SakilaDbApplication(languageRepository, actorRepository, filmRepository, categoryRepository, userReviewRepository);
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
    public void testAddFilm(){
        Film addFilm = new Film("Title", "Release year", "rating");
        String expected = "save";
        String actual = sakilaDbApplication.addNewFilm(addFilm.getTitle(), addFilm.getRelease_year(), addFilm.getRating(), addFilm.getDescription());
        ArgumentCaptor<Film>filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(filmArgumentCaptor.capture());
        filmArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual,"Film data has been created in mock DB");
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
    public void testAddCategory(){
        Category addCategory = new Category("TestAddCategory");
        String expected = "save";
        String actual = sakilaDbApplication.addCategory(addCategory.getName());
        ArgumentCaptor<Category>categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class);
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Category data has been created in mock DB");
    }

    @Test
    public void testGetCategory(){
        Category testCategory = new Category("Name");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(testCategory);
        when(sakilaDbApplication.getAllCategory()).thenReturn(categoryList);
        Assertions.assertEquals(categoryList, sakilaDbApplication.getAllCategory(), "This category failed");
    }

    @Test
    public void testAddReview(){
        UserReview addReview = new UserReview(1, "TestReview");
        String expected = "save";
        String actual = sakilaDbApplication.addReview(addReview.getFilm_film_id(), addReview.getUser_review());
        ArgumentCaptor<UserReview>userReviewArgumentCaptor = ArgumentCaptor.forClass(UserReview.class);
        verify(userReviewRepository).save(userReviewArgumentCaptor.capture());
        userReviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual,"UserReview data has been created in mock DB");
    }

    @Test
    public void test_GetAllLanguages(){
        Language testLang = new Language("German");
        List<Language> languageList = new ArrayList<>();
        languageList.add(testLang);

        when(sakilaDbApplication.getAllLanguages()).thenReturn(languageList);
        Assertions.assertEquals(languageList, sakilaDbApplication.getAllLanguages(), "Language data was not added to mock DB");
    }

    @Test
    public void test_GetAllFilms(){
        Film testFilming = new Film("TestFilm", 2000,"TestRating", 1, "TestDescription");
        List<Film> filmList = new ArrayList<>();
        filmList.add(testFilming);

        when(sakilaDbApplication.getAllFilms()).thenReturn(filmList);
        Assertions.assertEquals(filmList, sakilaDbApplication.getAllFilms(), "Film data was not added to the mock DB");
    }

    @Test
    public void test_GetAllActors(){
        Actor testActorCast = new Actor("TestFirstName", "TestLastName", 1);
        List<Actor> actorList = new ArrayList<>();
        actorList.add(testActorCast);

        when(sakilaDbApplication.getAllActors()).thenReturn(actorList);
        Assertions.assertEquals(actorList, sakilaDbApplication.getAllActors(), "Actor data was not added to the mock DB");
    }

    @Test
    public void test_GetAllCategories(){
        Category testCategories = new Category("TestCategory");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(testCategories);

        when(sakilaDbApplication.getAllCategory()).thenReturn(categoryList);
        Assertions.assertEquals(categoryList, sakilaDbApplication.getAllCategory(), "Category data was not added to mock DB");
    }

    @Test
    public void test_GetAllReviews(){
        UserReview testAllReviews = new UserReview(1, "TestReview");
        List<UserReview> userReviewList = new ArrayList<>();
        userReviewList.add(testAllReviews);

        when(sakilaDbApplication.getAllReviews()).thenReturn(userReviewList);
        Assertions.assertEquals(userReviewList, sakilaDbApplication.getAllReviews(), "Review data was not added to the mock DB");
    }

    @Test
    public void testGetLanguageBy_id(){
        Language testLanguage = new Language("TestLanguage");
        when(sakilaDbApplication.getLanguageByID(0)).thenReturn(Optional.of(testLanguage));
        Assertions.assertEquals(Optional.of(testLanguage), sakilaDbApplication.getLanguageByID(0), "The Language ID test has failed");
    }

    @Test
    public void testGetActorBy_id(){
        Actor testActor = new Actor("TestFirstName", "TestLastName", 1);
        when(sakilaDbApplication.getActorByID(0)).thenReturn(Optional.of(testActor));
        Assertions.assertEquals(Optional.of(testActor), sakilaDbApplication.getActorByID(0), "The Actor ID test has failed");
    }

    @Test
    public void testGetFilmBy_id(){
        Film testFilm = new Film("TestFilm", 2000, "TestRating", 1, "TestDescription");
        when(sakilaDbApplication.getFilmByID(0)).thenReturn(Optional.of(testFilm));
        Assertions.assertEquals(Optional.of(testFilm), sakilaDbApplication.getFilmByID(0), "The film ID test has failed");
    }

    @Test
    public void testGetCategoryBy_ID(){
        Category testCategory = new Category("TestCategory");
        when(sakilaDbApplication.getCategoryByID(1)).thenReturn(Optional.of(testCategory));
        Assertions.assertEquals(Optional.of(testCategory), sakilaDbApplication.getCategoryByID(1), "The category ID test has failed");
    }



}
