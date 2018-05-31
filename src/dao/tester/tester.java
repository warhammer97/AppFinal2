package dao.tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import dao.PeliculaDAO;
import dto.Pelicula;

public class tester {
	
	public static void main(String[] args) {
		
		PeliculaDAO peliculaDao= new PeliculaDAO();
		List<Pelicula> peliculas=peliculaDao.recuperarPeliculas();
		
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula);
		}
		LocalDate n1=LocalDate.of(2018,05, 12);
		LocalDate n2=LocalDate.of(2018,07, 15);
		Pelicula p=new Pelicula("Titulo prueba","Sinopsis prueba",90,n1,n2);
		peliculaDao.addPelicula(p);
		System.out.println(p);
		
		peliculaDao.eliminarPelicula("Iron Man 7");
		
	}
	
}
