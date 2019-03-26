package jpseclipselink.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the t_a database table.
 * 
 */
@Entity
@Table(name="t_a")
@NamedQuery(name="TA.findAll", query="SELECT t FROM TA t")
public class TA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	//bi-directional many-to-one association to TB
	@OneToMany(mappedBy="TA")
	private List<TB> TBs;

	public TA() {
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

	public List<TB> getTBs() {
		return this.TBs;
	}

	public void setTBs(List<TB> TBs) {
		this.TBs = TBs;
	}

	public TB addTB(TB TB) {
		getTBs().add(TB);
		TB.setTA(this);

		return TB;
	}

	public TB removeTB(TB TB) {
		getTBs().remove(TB);
		TB.setTA(null);

		return TB;
	}

}