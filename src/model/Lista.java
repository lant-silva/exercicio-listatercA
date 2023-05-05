package model;

public class Lista {

	No primeiro;
	
	public boolean isEmpty() {
		if(primeiro == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No auxiliar = primeiro;
			while(auxiliar!=null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	private No getNo(int pos) throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		No auxiliar = primeiro;
		int cont = 0;
		while(cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}
	
	public void addFirst(int valor) {
		
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}
	
	public void addLast(int valor) throws Exception{
		int tamanho = size();
		if(isEmpty()) {
			throw new Exception("Lista Vazia");			
		}
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null; // redundante
		No ultimo = getNo(tamanho-1);
		ultimo.proximo = elemento;
	}
	
	public void add(int valor, int pos) throws Exception {
		int tamanho = size();
		if(pos < 0 || pos > tamanho) {
			throw new Exception("Posição inválida");
		}
		if(pos == 0) {
			addFirst(valor);
		}else {
			if(pos == tamanho) {
				addLast(valor);
			}else {
				No elemento = new No();
				elemento.dado = valor;
				No anterior = getNo(pos - 1);
				elemento.proximo = anterior.proximo;
				anterior.proximo = elemento;
			}
		}
	}
	
	public void removeFirst() throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		primeiro = primeiro.proximo;
	}
	
	public void removeLast() throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(tamanho == 1) {
			removeFirst();
		}else {
			No penultimo = getNo(tamanho - 2);
			penultimo.proximo = null;
		}
	}
	
	public void remove(int pos) throws Exception{
		int tamanho = size();
		if(pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		if(pos == 0) {
			removeFirst();
		}else {
			if(pos == tamanho - 1) {
				removeLast();
			}else {
				No anterior = getNo(pos - 1);
				No atual = getNo(pos);
				anterior.proximo = atual.proximo;
			}
		}	
	}
	
	public int get(int pos) throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		int cont = 0;
		No auxiliar = primeiro;
		while(cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}
}
