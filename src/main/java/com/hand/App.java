package com.hand;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.IFilm;
import com.hand.entity.Film;

/*
 * my test
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	IFilm iFilm = (IFilm)ac.getBean("filmMapper");
    	Film film =(Film) ac.getBean("film");
    	Scanner scanner = new Scanner(System.in) ;
    	
    	System.out.println("title:");
		String title = scanner.nextLine();
		film.setTitle(title);
		System.out.println("description:");
		String description = scanner.nextLine();
		film.setDescription(description);
		System.out.println("language_id:");
		int language_id = scanner.nextInt();
		film.setLanguage_id(language_id);
		scanner.close();
		
		iFilm.insertFilm(film);
		System.out.println("insert success!");
		
    }
}
