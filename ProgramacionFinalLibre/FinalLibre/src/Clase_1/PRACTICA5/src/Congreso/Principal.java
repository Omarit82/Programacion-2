package Congreso;

public class Principal {
    public static void main(String[] args) {
        Evaluador male = new Evaluador("Malena");
        Evaluador omar = new Evaluador("Omar");

        Trabajo proy1 = new Trabajo("TP1");
        Posters post = new Posters("TP2");
        post.agregarTag("lenguajes de programacion");
        post.agregarTag("algoritmos");
        proy1.agregarTag("algoritmos");
        proy1.agregarTag("Visualizacion");

        omar.agregarTema("visualizacion");
        omar.agregarTema("algoritmos");
        male.agregarTema("lenguajes de programacion");
        Congreso cong = new Congreso();

        cong.addTemaExperto("Visualizacion");
        cong.addTemaGenerales("algoritmos");
        cong.agregarEvaluador(omar);
        cong.agregarEvaluador(male);
        cong.agregarTrabajo(proy1);
        cong.agregarTrabajo(post);
        System.out.println(cong.puedeEvaluar(post));
        System.out.println(cong.puedeAsignar(omar));
        System.out.println(cong.esExperto(male));
        
    }
}
