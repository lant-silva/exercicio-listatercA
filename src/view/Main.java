package view;

import model.Lista;

public class Main {

	public static void main(String[] args) {
		
		Lista Prim = new Lista();
		Lista Sec = new Lista();
		int tamanho = 0;
		try {
			Prim.add(1, 0);
			Prim.add(7, 1);
			Sec.add(3, 0);
			Sec.add(4, 1);
			Sec.add(8, 2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Lista Terc = new Lista();
		
		while(!Prim.isEmpty()) {
			try {
				Terc.add(Prim.get(0), tamanho);
				Prim.removeFirst();
				tamanho++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(!Sec.isEmpty()) {
			try {
				Terc.add(Sec.get(0), tamanho);
				Sec.removeFirst();
				tamanho++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		while(!Terc.isEmpty()) {
			try {
				System.out.println(Terc.get(0));
				Terc.removeFirst();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
