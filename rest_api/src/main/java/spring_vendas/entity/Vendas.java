package spring_vendas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendas")
public class Vendas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="data_venda")
	private String data_venda;
	
	@Column(name="valor")
	private int valor;
	
	@Column(name="vendedor_id")
	private String vendedor_id;
	
	public Vendas() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getVendedor_id() {
		return vendedor_id;
	}

	public void setVendedor_id(String vendedor_id) {
		this.vendedor_id = vendedor_id;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", data_venda=" + data_venda + ", valor=" + valor + ", vendedor_id=" + vendedor_id
				+ "]";
	}
}
