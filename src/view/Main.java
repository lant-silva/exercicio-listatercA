package view;

import model.Lista;

public class Main {

	public static void main(String[] args) {
		
		// Início do exercicio A
		
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
		
		// Fim do exercicio A
		
		
		// Inicio do exercicio B
		
		int[] auxiliar = new int[Terc.size()];
		tamanho=0;
		
		while(!Terc.isEmpty()) {
			try {
				auxiliar[tamanho] = Terc.get(0);
				Terc.removeFirst();
				tamanho++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int j = 0; j < auxiliar.length; j++) {
			for(int y = j+1; y < auxiliar.length; y++) {
				if(auxiliar[j] > auxiliar[y]) {
					int aux = auxiliar[y];
					auxiliar[y] = auxiliar[j];
					auxiliar[j] = aux;
				}	
			}
		}
		tamanho = 0;
		for(int index : auxiliar) {
			try {
				Terc.add(index, tamanho);
				tamanho++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Fim do exercicio B
		
		
		
		// Escrita da linha no console
		
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
