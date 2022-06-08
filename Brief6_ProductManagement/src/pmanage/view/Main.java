package pmanage.view;

import pmanage.domain.User;
import pmanage.model.DAO.Implem.UserImpl;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		UserImpl studentDaoImp = new UserImpl();
		User user = new User(1, "ihoumm@orange.fr", "qwerty@1234", "Mustapha", "Mus", true,"now()","now()");
		try {
			if (UserImpl.create(user)) {
				System.out.print("User added Successfuly \r\n\r\n");
			} else {
				System.out.print("wakuk!");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
