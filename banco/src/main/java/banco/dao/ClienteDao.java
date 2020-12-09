package banco.dao;

import java.util.List;

import javax.persistence.EntityManager;

import banco.modelo.Cliente;

/**
  *  Esta clase  permite hacer las funciones basicas de la base de datos
  *  @author jonnathan simbaña  
  * **/
public class ClienteDao {

	
		private EntityManager em;
		
		/** 
		 * Metodo que permite registrar un cliente en la base de datos
		 
		 */
		public void insert(Cliente c) {
			em.persist(c);
		}
		
		/** 
		 * Metodo que permite actualizar un cliente en la base de datos
		 */
		public void update(Cliente c) {
			em.merge(c);
		} 
		
		/** 
		 * Metodo que permite obtener un cliente de la base de datos
		 * @param cedula   que se utilizara para mostrar  el cliente especifico 
		 * 
		 */
		public Cliente read(String cedula) {
			return em.find(Cliente.class, cedula);
		} 
		
		/** 
		 * Metodo que permite eliminar un cliente de la base de datos
		 * @param cedula  utilizaremos para poder eliminar el cliente
		 */
		public void delete(String cedula) {
			Cliente c = read(cedula);
			em.remove(c);
		}
		
		/** 
		 * Metodo que permite obtener todos los clientes que estan registrados en la base de datos
		 * 
		 
		public List<Cliente> getClientes() {
			String jpql = "SELECT c FROM Cliente c ";

			Query q = em.createQuery(jpql, Cliente.class);
			return q.getResultList();
		} 
		*/
		/** 
		 * Metodo que permite obtener un cliente de la base de datos en base a su usuario y contraseña 
		 * @param usuario obtener el usuario del cliente
		 * @param contra  obtener la contraseña del cliente
		 * @return retornara  usuario y contraseña en especifico del cliente . 
		 * @throws Exception
		 
		public Cliente obtenerClienteUsuarioContraseña(String usuario,String contra) throws Exception {
			try {
				String jpl = "select c from Cliente c Where c.usuario =:usu AND c.clave =:contr";
				Query q = em.createQuery(jpl, Cliente.class);
				q.setParameter("usu", usuario);
				q.setParameter("contr", contra);
				return (Cliente)q.getSingleResult();
				
			} catch (NoResultException e) {
				//System.out.println(e.getMessage());
				 throw new Exception("Credenciaales Inocorrectas"); 
			}
			//return null;
		}  
		*/
		/** 
		 * Metodo que permite obtener un cliente dependiendo de su correo y cotraseña 
		 * @param correo Variable de tipo String en donde se asigna el correo de la persona que se desea obtener
		 * @param contra Variable de tipo String en donde se asigna la contraseña de la persona que se desea obtener
		 * @return Cliente que tenga la el correo y contraseña que se han pasado como paramatro
		 * @throws Exception
		 */
/*
		public Cliente obtenerClienteCorreoContraseña(String correo,String contra) throws Exception {
			try {
				String jpl = "select c from Cliente c Where c.correo =:corr AND c.clave =:contr";
				Query q = em.createQuery(jpl, Cliente.class);
				q.setParameter("corr", correo);
				q.setParameter("contr", contra);
				return (Cliente)q.getSingleResult();
				
			} catch (NoResultException e) {
				//System.out.println(e.getMessage());
				 throw new Exception("Revisar datos de cambio"); 
			}
			//return null;
		}
	*/	

}
