package org.generation.gestionUsuarios.controller;

import java.util.List;

import org.generation.gestionUsuarios.model.User;
import org.generation.gestionUsuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Para que esta clase llamada UserController tome el papel de Controlador, necesito inyectarle dependencias. Para ello, utilizamos la anotación @RestController para decirle que este controlador va a manejar la entidad de base de métodos HTTP (get, post, put, delete), con métodos que puedan soportar estas solicitudes, y además, podremos trabajar con el fetch de nuestro frontend*/


@RestController //Api RESTful
@RequestMapping(path = "/api/users") // localhost:8080/api/users... Contruir la ruta de nuestra api, definiendo endpoints
public class UserController {
	//Definir una instancia. Le digo a Spring que voy a conectar mi UserController con mi UserService, para que el controlador sepa lo mismo que sabe el service y no tengamos que estar preguntando a cada.
	//Para no instanciar objetos, utilizamos la anotación @Autowired
	
	private final UserService userService;
	
	//Crear un constructor que va a tomar el userService como argumento y luego ese objeto se va a almacenar en un campo this
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//Para consultar la información de mi BD, establezco un método de consulta con la anotación @GetMapping, que depende de una anotación @RequestMapping (que se colocar antes del inicio de clase)
	
	@GetMapping
	public List<User> getMappingUser(){
		return userService.getUsers();
	}
	
	
	
	
	
}
