package com.Juego.trivia;

import com.Juego.trivia.models.Categoria;
import com.Juego.trivia.models.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {
    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria){
        Pregunta pregunta=new Pregunta("Cultura","¿Qué ingredintes se necesitan para hacer una michelada?", new String[]{"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, sal, tabasco y lima/limón"},0,"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

        return pregunta;
    }
    @GetMapping("/categories")
    public Categoria[] getCategories(){
        Categoria[] categorias={new Categoria("Cultura","Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.")
        ,new Categoria("Deportes","Preguntas relacionadas con diversos deportes y eventos deportivos.")
        ,new Categoria("Arte","Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.")
        ,new Categoria("Cine","Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.")
        ,new Categoria("Historia","Preguntas relacionadas con eventos históricos, personajes y períodos importantes.")
        ,new Categoria("Ciencia","Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.")};
        return categorias;

    }

}
