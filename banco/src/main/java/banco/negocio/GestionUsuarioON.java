package banco.negocio;

import javax.inject.Inject;

import banco.dao.ClienteDao;
import banco.dao.EmpleadoDao;
import banco.modelo.Cliente;

public class GestionUsuarioON {

	@Inject
	private ClienteDao daoCliente;
	@Inject
	private EmpleadoDao daoEmpleado;
}
