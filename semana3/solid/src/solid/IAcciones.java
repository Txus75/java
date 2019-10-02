package solid;

public interface IAcciones {
	void moverse();
	void atacar();
	void defenderse();
	// Se anula en esta interface puesto que es una acción especializada que no todas las clases usan
	//void usarMagia();
}
