package jpseclipselink.demo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_b database table.
 * 
 */
@Entity
@Table(name="t_b")
@NamedQuery(name="TB.findAll", query="SELECT t FROM TB t")
public class TB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	//bi-directional many-to-one association to TA
	@ManyToOne
	@JoinColumn(name="id_a")
	private TA TA;

	public TB() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TA getTA() {
		return this.TA;
	}

	public void setTA(TA TA) {
		this.TA = TA;
	}

}